package com.lsj.summary.modules.material.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lsj.summary.R;
import com.lsj.summary.modules.data.Person;

import java.util.List;

/**
 * Created by lsj on 16/3/15.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private Context context;
    private List<Person> list;
    private Resources resources;
    private OnItemClickListener listener;

    //构造函数，传入数据源
    public RecyclerAdapter(Context context, List<Person> list) {
        this.context = context;
        this.list = list;
        this.resources = context.getResources();
    }

    /**
     * inflate item.xml 生成ViewHolder
     * @param viewGroup
     * @param i
     * @return
     */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    /**
     * 给ViewHolder设置数据
     * @param myViewHolder
     * @param i
     */
    @Override
    public void onBindViewHolder(final MyViewHolder myViewHolder, final int i) {
        final Person person = list.get(i);
        myViewHolder.name.setText(person.getName());

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != listener) {
                    listener.onItemClick(i, person);
                }
            }
        });
    }

    public interface OnItemClickListener {
        void onItemClick(int position, Person person);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }


    /**
     * 继承RecyclerView.ViewHolder
     */
    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.text);
        }
    }
}
