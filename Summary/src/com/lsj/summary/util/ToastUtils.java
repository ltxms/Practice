package com.lsj.summary.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by lsj on 16/1/18.
 */
public class ToastUtils {
    private static Toast toast = null; //Toast的对象！

    public static void showToast(Context context, String id) {
        if (toast == null) {
            toast = Toast.makeText(context, id, Toast.LENGTH_SHORT);
        }
        else {
            toast.setText(id);
        }
        toast.show();
    }

    public static void showToast(Context context, int id) {
        if (toast == null) {
            toast = Toast.makeText(context, context.getString(id), Toast.LENGTH_SHORT);
        }
        else {
            toast.setText(id);
        }
        toast.show();
    }

}
