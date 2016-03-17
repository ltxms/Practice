package com.lsj.summary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.lsj.summary.core.util.LogUtil;
import com.lsj.summary.util.ToastUtils;

/**
 * Created by lsj on 16/1/13.
 */
public class BaseActivity extends AppCompatActivity {
    private Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.context = this;
    }

    public Context getContext(){
        return context;
    }

    public void toActivity(Class activity){
        Intent intent = new Intent(this,activity);
        startActivity(intent);
    }

    public final <E extends View> E getView(int id){
        try{
            return (E)findViewById(id);
        } catch (Exception e){
            LogUtil.info(BaseActivity.class, "view cast error");
            throw e;
        }
    }

    public void setToolbar(Toolbar toolbar,int res) {
        String title = getResources().getString(res);
        setToolbar(toolbar,title);
    }

    public void setToolbar(Toolbar toolbar,String title) {
        if (toolbar != null) {
            toolbar.setTitle(title);
            toolbar.setTitleTextColor(getResources().getColor(R.color.white));
            setSupportActionBar(toolbar);
            toolbar.setNavigationIcon(R.drawable.back);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }

    public void showToast(String content){
        ToastUtils.showToast(context,content);
    }

    public void showToast(int id){
        ToastUtils.showToast(context,id);
    }
}