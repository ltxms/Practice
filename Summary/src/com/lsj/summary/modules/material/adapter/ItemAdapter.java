package com.lsj.summary.modules.material.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by lsj on 16/3/2.
 */
public class ItemAdapter extends BaseAdapter {
    private Context context;

    public ItemAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 40;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view = new TextView(context);
        view.setText("1");
        return view;
    }
}
