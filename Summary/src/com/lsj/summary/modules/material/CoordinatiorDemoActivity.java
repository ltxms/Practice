package com.lsj.summary.modules.material;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.lsj.summary.BaseActivity;
import com.lsj.summary.R;
import com.lsj.summary.modules.data.Person;
import com.lsj.summary.modules.material.adapter.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lsj on 16/3/15.
 */
public class CoordinatiorDemoActivity extends BaseActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinatior_demo_activity);

        CollapsingToolbarLayout collapsingToolbarLayout = getView(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("This is a Toolbar");
        collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.white));
        Toolbar toolbar = getView(R.id.toolbar);
        setToolbar(toolbar, "");

        List<Person> list = new ArrayList<>();
        for(int i=0;i<99;i++){
            Person person = new Person("name" + i);
            list.add(person);
        }

        recyclerView = getView(R.id.recyclerview);
        adapter = new RecyclerAdapter(getContext(), list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new RecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position, Person person) {
                showToast(person.getName());
            }
        });

        FloatingActionButton floatingActionButton = getView(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.notifyItemInserted(8);
            }
        });
    }
}