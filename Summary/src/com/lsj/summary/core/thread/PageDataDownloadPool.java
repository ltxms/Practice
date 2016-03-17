package com.lsj.summary.core.thread;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.lsj.summary.core.application.ClientApplication;

import java.util.HashMap;
import java.util.Map;

/**
 * 只做http请求，接收参数url、params、listener、errorListener
 * 管理header
 * 1.需要连接池
 * 2.初始化
 * 3.封装请求
 * Created by lsj on 15/12/17.
 */
public class PageDataDownloadPool {
    private static PageDataDownloadPool pageDataDownloadPool = new PageDataDownloadPool();
    private static RequestQueue requestQueue = Volley.newRequestQueue(ClientApplication.getInstance().getApplicationContext());

    /**
     * 初始化请求队列
     */
    public static void init(){
        requestQueue.start();
    }

    public static PageDataDownloadPool getInstance(){
        return pageDataDownloadPool;
    }

    /**
     * http请求
     * 接收参数，构成自定义Request，add进requestQueue
     * @param url 接口地址
     * @param params post参数，get方式传null
     * @param listener 成功的回调
     * @param errorListener 失败的回调
     */
    public void getPostData(String url, final Map<String, String> params, Response.Listener<String> listener, Response.ErrorListener errorListener){
        int HTTPMETHOD;

        if (params == null){
            HTTPMETHOD = Request.Method.GET;
        }else {
            HTTPMETHOD = Request.Method.POST;
        }

        //自定义request，添加进队列
        EncodeRequest request = new EncodeRequest(HTTPMETHOD, url, listener, errorListener){

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> header = new HashMap<String, String>(){};
                header.put("header1","header1");
                return header;
            }

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                if (params == null) {
                    return super.getParams();
                }else {
                    return params;
                }
            }
        };

        requestQueue.add(request);
    }
}
