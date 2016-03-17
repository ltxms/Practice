package com.lsj.summary.modules.material;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.lsj.summary.BaseActivity;
import com.lsj.summary.R;

/**
 * Created by lsj on 16/3/2.
 */
public class CoordinatorLayoutActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinatorlayout_activity);

//        ListView listView = getView(R.id.listview);
//        ItemAdapter adapter = new ItemAdapter(getContext());
//        listView.setAdapter(adapter);

        Toolbar toolbar = getView(R.id.toolbar);
        setToolbar(toolbar, "CoordinatorLayout");
    }
}