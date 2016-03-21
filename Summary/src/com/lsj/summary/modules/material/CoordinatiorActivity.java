package com.lsj.summary.modules.material;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.lsj.summary.BaseActivity;
import com.lsj.summary.R;

/**
 * Created by lsj on 16/3/2.
 */
public class CoordinatiorActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinatior_activity);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white));
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }

        CollapsingToolbarLayout collapsingToolbarLayout = getView(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("This is a Toolbar");
        collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.white));
        Toolbar toolbar = getView(R.id.toolbar);
        setToolbar(toolbar,"");
        toolbar.setOverflowIcon(getResources().getDrawable(R.drawable.ic_launcher));

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.collect:
////                showToast("收藏");
//                break;
//            case R.id.download:
//                showToast("下载");
//                break;
//            case R.id.update:
//                showToast("更新");
//                break;
////            case R.id.download_1:
////                showToast("下载");
////                break;
////            case R.id.update_1:
////                showToast("更新");
////                break;
//            case R.id.download_2:
//                showToast("下载");
//                break;
//            case R.id.update_2:
//                showToast("更新");
//                break;
//            case R.id.share:
//                showToast("分享");
//                break;
//            case R.id.cancel:
//                showToast("取消");
//                break;
//            case R.id.order:
//                showToast("订单");
//                break;
//            case R.id.open:
//                showToast("打开");
//                break;
//            case R.id.option_1:
//                showToast("option 1");
//                break;
//            case R.id.option_2:
//                showToast("option 2");
//                break;
//            case R.id.option_3:
//                showToast("option 3");
//                break;
//            case R.id.option_4:
//                showToast("option 4");
//                break;
//            default:
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}