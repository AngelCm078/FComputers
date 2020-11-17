package com.angelcm.fcomputers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.core.widget.TextViewCompat;

import com.angelcm.fcomputers.R;
import com.angelcm.fcomputers.models.ComputerModel;

import java.util.ArrayList;

public class ComputerAdapter extends BaseAdapter {
    
    private Context context;
    private ArrayList<ComputerModel> modelArrayList;

    public ComputerAdapter(Context context, ArrayList<ComputerModel> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @Override
    public int getCount() {
        return modelArrayList.size();
    }

    @Override
    public ComputerModel getItem(int i) {
        return modelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            view = layoutInflater.inflate(R.layout.computer_list_item, viewGroup, false);
        }
        TextView tv_computer_list_item_description = view.findViewById(R.id.tv_computer_list_item_description);
        TextView tv_computer_list_item_serial = view.findViewById(R.id.tv_computer_list_item_serial);

        tv_computer_list_item_description.setText(getItem(i).getDescription());
        tv_computer_list_item_serial.setText(getItem(i).getSerial());

        return view;
    }
}
