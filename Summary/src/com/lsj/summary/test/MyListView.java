package com.lsj.summary.test;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ListView;

/**
 * Created by lsj on 15/12/22.
 */
public class MyListView extends ListView {
    private static final int MAX_Y_OVERSCROLL_DISTANCE = 200;
    private Context context;
    private int mMaxYOverscrollDistance;

    public MyListView(Context context) {
        super(context);
        this.context = context;
        initBounceLisvtView();
    }

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initBounceLisvtView();
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initBounceLisvtView();
    }

    private void initBounceLisvtView(){
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        float density = metrics.density;

        mMaxYOverscrollDistance = (int) (density * MAX_Y_OVERSCROLL_DISTANCE)
        ;
    }

    @Override
    protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        return super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, mMaxYOverscrollDistance, isTouchEvent);
    }
}
