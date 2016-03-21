package com.lsj.summary.modules.tablayout;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.lsj.summary.BaseActivity;
import com.lsj.summary.R;

/**
 * Created by lsj on 16/3/16.
 */
public class TabLayoutActivity extends BaseActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablayout_activity);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white));
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }

        tabLayout = getView(R.id.tablayout);
        viewPager = getView(R.id.viewpager);
        toolbar = getView(R.id.toolbar);

        setToolbar(toolbar, "TabLayout");

//        List<Fragment> fragmentList = new ArrayList<Fragment>();
//        fragmentList.add(PageFragment.newInstance(1));
//        fragmentList.add(PageFragment.newInstance(2));
//        fragmentList.add(PageFragment.newInstance(3));
//        fragmentList.add(PageFragment.newInstance(4));
        HomePagerAdapter adapter = new HomePagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setTabTextColors(R.color.white, R.color.colorPrimary);
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorPrimary));
        tabLayout.getTabAt(0).setText("tab one");
        tabLayout.getTabAt(1).setText("tab two");
        tabLayout.getTabAt(2).setText("tab three");
        tabLayout.getTabAt(3).setText("tab four");

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
//                showToast(tab.getPosition() + "");
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                showToast("unselected" + tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                showToast("reselected" + tab.getPosition());
            }
        });
    }
}