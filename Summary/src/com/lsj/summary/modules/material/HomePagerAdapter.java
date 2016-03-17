package com.lsj.summary.modules.material;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;

import java.util.List;

/**
 * Created by lsj on 2015/6/2.
 */
public class HomePagerAdapter extends FragmentPagerAdapter{
    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;
    private List<Fragment> fragmentList;

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public HomePagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
        this.fragmentManager = fm;
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList == null ? 0 : fragmentList.size();
    }


//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//        if (fragmentTransaction == null){
//            fragmentTransaction = fragmentManager.beginTransaction();
//        }
//        fragmentTransaction.detach((Fragment)object);
//    }
}
