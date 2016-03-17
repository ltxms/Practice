package com.lsj.summary.modules.material;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.lsj.summary.BaseActivity;
import com.lsj.summary.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lsj on 16/1/13.
 */
public class MaterialActivity extends BaseActivity {

    private TabLayout tabLayout;
    private Toolbar toolbar;
    private ViewPager viewPager;
    private FloatingActionButton fab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.material_activity);

        toolbar = getView(R.id.toolbar);
        viewPager = getView(R.id.viewpager);
        tabLayout = getView(R.id.tablayout);
        fab = getView(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackbar();
            }
        });

        setToolbar(toolbar, R.string.material);
        setTabLayout();
    }

    private void setTabLayout() {
//        tabLayout.addTab(tabLayout.newTab().setText("aaa"));
//        tabLayout.addTab(tabLayout.newTab().setText("bbb"));
//        tabLayout.addTab(tabLayout.newTab().setText("ccc"));

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new SampleFragment());
        fragmentList.add(new SampleFragment());
//        fragmentList.add(new SampleFragment());
//        fragmentList.add(new SampleFragment());
        HomePagerAdapter adapter = new HomePagerAdapter(getSupportFragmentManager(),fragmentList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabsFromPagerAdapter(adapter);
        tabLayout.getTabAt(0).setText("aaa");
        tabLayout.getTabAt(1).setText("bbbbbbbbb");
//        tabLayout.getTabAt(2).setText("cccccccccccccccc").setIcon(R.drawable.ic_launcher);
//        tabLayout.getTabAt(3).setText("dddddddd").setIcon(R.drawable.ic_launcher);
//        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
//        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    private void showSnackbar(){
        Snackbar.make(viewPager, "this is snackbar.", Snackbar.LENGTH_LONG)
                .setAction("click", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showToast("click");
                    }
                })
                .setActionTextColor(getResources().getColor(R.color.colorPrimary))
                .show();
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
//                showToast("取消");
                showSnackbar();
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