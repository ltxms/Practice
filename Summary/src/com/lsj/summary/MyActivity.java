package com.lsj.summary;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.lsj.summary.modules.listview.ListViewActivity;
import com.lsj.summary.modules.material.CoordinatiorActivity;
import com.lsj.summary.modules.material.CoordinatiorDemoActivity;
import com.lsj.summary.modules.material.CoordinatorLayoutActivity;
import com.lsj.summary.modules.material.MaterialActivity;
import com.lsj.summary.modules.material.NavigationActivity;
import com.lsj.summary.modules.material.TranslucentActivity;
import com.lsj.summary.modules.tablayout.TabLayoutActivity;

public class MyActivity extends BaseActivity implements OnClickListener{


    private Button a;
    private Button b;
    private Toolbar toolbar;
    private Button c;
    private Button d;
    private Button e;
    private Button f;
    private Button g;
    private Button h;
    private Button i;
    private Button j;
    private Button k;
    private Button l;
    private Button m;
    private Button n;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        toolbar = getView(R.id.toolbar);
        setToolbar(toolbar, R.string.app_name);
        toolbar.setSubtitle("subtitle: this is");
        toolbar.setSubtitleTextColor(getResources().getColor(R.color.white));

        a = getView(R.id.a);
        b = getView(R.id.b);
        c = getView(R.id.c);
        d = getView(R.id.d);
        e = getView(R.id.e);
        f = getView(R.id.f);
        g = getView(R.id.g);
        h = getView(R.id.h);
        i = getView(R.id.i);
        j = getView(R.id.j);
        k = getView(R.id.k);
        l = getView(R.id.l);
        m = getView(R.id.m);
        n = getView(R.id.n);


        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.a:
                toActivity(ListViewActivity.class);
                break;
            case R.id.b:
                toActivity(MaterialActivity.class);
                break;
            case R.id.c:
                toActivity(NavigationActivity.class);
                break;
            case R.id.d:
                toActivity(CoordinatorLayoutActivity.class);
                break;
            case R.id.e:
                toActivity(CoordinatiorActivity.class);
                break;
            case R.id.f:
                toActivity(CoordinatiorDemoActivity.class);
                break;
            case R.id.g:
                toActivity(TabLayoutActivity.class);
                break;
            case R.id.h:
                toActivity(TranslucentActivity.class);
                break;
            case R.id.i:
                break;
            case R.id.j:
                break;
            case R.id.k:
                break;
            case R.id.m:
                break;
            case R.id.n:
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.collect:
//                showToast("收藏");
                break;
            case R.id.download:
                showToast("下载");
                break;
            case R.id.update:
                showToast("更新");
                break;
//            case R.id.download_1:
//                showToast("下载");
//                break;
//            case R.id.update_1:
//                showToast("更新");
//                break;
            case R.id.download_2:
                showToast("下载");
                break;
            case R.id.update_2:
                showToast("更新");
                break;
            case R.id.share:
                showToast("分享");
                break;
            case R.id.cancel:
                showToast("取消");
                break;
            case R.id.order:
                showToast("订单");
                break;
            case R.id.open:
                showToast("打开");
                break;
            case R.id.option_1:
                showToast("option 1");
                break;
            case R.id.option_2:
                showToast("option 2");
                break;
            case R.id.option_3:
                showToast("option 3");
                break;
            case R.id.option_4:
                showToast("option 4");
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
