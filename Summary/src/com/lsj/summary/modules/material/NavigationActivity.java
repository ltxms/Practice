package com.lsj.summary.modules.material;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.lsj.summary.BaseActivity;
import com.lsj.summary.R;
import com.lsj.summary.modules.material.adapter.ItemAdapter;

/**
 * Created by lsj on 16/3/1.
 */
public class NavigationActivity extends BaseActivity {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private FrameLayout frameLayout;
    private Toolbar toolbar;
    private ListView listView;
    private ActionBarDrawerToggle toggle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_activity);

        navigationView = getView(R.id.navigation_view);
        drawerLayout = getView(R.id.drawer_layout);
//        frameLayout = getView(R.id.frame_layout);
        toolbar = getView(R.id.toolbar);
        listView = getView(R.id.listview);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.setDrawerListener(toggle);

        ItemAdapter adapter = new ItemAdapter(getContext());
        listView.setAdapter(adapter);

        setToolbar(toolbar, "Summary");

        drawerLayout.setScrimColor(getResources().getColor(R.color.colorPrimary));

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_1:
                        showToast(menuItem.getTitle().toString());
                        break;
                    case R.id.item_2:
                        showToast(menuItem.getTitle().toString());
                        break;
                    case R.id.menu_1:
                        showToast(menuItem.getTitle().toString());
                        break;
                    case R.id.menu_2:
                        showToast(menuItem.getTitle().toString());
                        break;
                    case R.id.setting_1:
                        showToast(menuItem.getTitle().toString());
                        break;
                    case R.id.setting_2:
                        showToast(menuItem.getTitle().toString());
                        break;
                    default:
                        break;
                }
                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }
}