package com.lsj.summary.modules.listview;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.AbsListView;
import android.widget.ListView;

import com.lsj.summary.BaseActivity;
import com.lsj.summary.R;
import com.lsj.summary.core.util.LogUtil;
import com.lsj.summary.test.MyAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lsj on 16/1/13.
 */
public class ListViewActivity extends BaseActivity {
    private ListView listView;
    //    private ImageView emptyView;
    private Class mClazz = ListViewActivity.class;
    int lastVisibleItem;
    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_activity);

        toolbar = getView(R.id.toolbar);
        setToolbar(toolbar, R.string.listview);

        final List<String> list = new ArrayList<>();
        for (int i=0; i<100;i++){
            list.add(i + "");
        }
        listView = (ListView) findViewById(R.id.listview);
        final MyAdapter adapter = new MyAdapter(this,list);
        listView.setAdapter(adapter);

//        Button action = (Button) findViewById(R.id.action);
//        emptyView = (ImageView) findViewById(R.id.empty_view);
//        listView.setEmptyView(emptyView);

        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                switch (scrollState) {
                    case AbsListView.OnScrollListener.SCROLL_STATE_IDLE:
                        LogUtil.info(mClazz, "滑动停止");
                        break;
                    case AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL:
                        LogUtil.info(mClazz, "正在滑动");
                        break;
                    case AbsListView.OnScrollListener.SCROLL_STATE_FLING:
                        LogUtil.info(mClazz, "惯性滑动");
                        break;
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
//                LogUtil.info(mClazz, "第一个可见：" + firstVisibleItem);
//                LogUtil.info(mClazz, "可见数：" + visibleItemCount);
//                LogUtil.info(mClazz, "总数：" + totalItemCount);
                if (firstVisibleItem + visibleItemCount == totalItemCount && totalItemCount > 0) {
                    LogUtil.info(mClazz, "last");
                }

                if (firstVisibleItem > lastVisibleItem) {
                    LogUtil.info(mClazz, "up");
                } else if (firstVisibleItem < lastVisibleItem) {
                    LogUtil.info(mClazz, "down");
                }
                lastVisibleItem = firstVisibleItem;
            }
        });



//        action.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                listView.smoothScrollToPosition(list.size()); //有动画的滑动
////                listView.smoothScrollToPosition(list.size(),50); //滑动边界不超过50，如现在在3，只能滑动到50
////                listView.smoothScrollByOffset(-10); //正数：向下滑的位数，负数：向上滑得位数
////                listView.smoothScrollBy(1000,200); //滑动pixel，滑动时间（pixel似乎有问题，设置1000只滑动很小的距离）
////                listView.setSelection(50);// 快速到，无动画
//
//                if (list.size() > 0) {
//                    list.clear();
//                    emptyView.setVisibility(View.VISIBLE);
//                    adapter.notifyDataSetChanged();
//                } else {
//                    list.add("ff");
//                    emptyView.setVisibility(View.INVISIBLE);
//                    adapter.notifyDataSetChanged();
//                }
//            }
//        });
    }
}