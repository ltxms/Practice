package com.lsj.summary.modules.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by lsj on 2015/6/2.
 */
public class HomePagerAdapter extends FragmentPagerAdapter{
    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;
    private final int PAGE_COUNT = 4;
//    private List<Fragment> fragmentList;

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
//        this.fragmentList = fragmentList;
        this.fragmentManager = fm;
    }

    @Override
    public Fragment getItem(int i) {
        return PageFragment.newInstance(i + 1);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//        if (fragmentTransaction == null){
//            fragmentTransaction = fragmentManager.beginTransaction();
//        }
//        fragmentTransaction.detach((Fragment)object);
//    }
}
