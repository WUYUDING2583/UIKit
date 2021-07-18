package com.yuyi.uikit.popup;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;

import androidx.annotation.ColorInt;

public class Popup {
    public static void topSuccess(Context context, String title) {
        PopupTop popup = new PopupTop(context);
        popup.setTitle(title);
        popup.success(((Activity) context).getWindow().getDecorView(), Gravity.TOP);
    }

    public static void topInfo(Context context, String title) {
        PopupTop popup = new PopupTop(context, title);
        popup.info(((Activity) context).getWindow().getDecorView(), Gravity.TOP);
    }

    public static void topError(Context context, String title) {
        PopupTop popup = new PopupTop(context);
        popup.setTitle(title);
        popup.error(((Activity) context).getWindow().getDecorView(), Gravity.TOP);
    }

    public static void topWarning(Context context, String title) {
        PopupTop popup = new PopupTop(context);
        popup.setTitle(title);
        popup.warning(((Activity) context).getWindow().getDecorView(), Gravity.TOP);
    }
    public static void top(Context context, String title, @ColorInt int color){
        PopupTop popup = new PopupTop(context,title);
        popup.show(((Activity) context).getWindow().getDecorView(), Gravity.TOP,color);
    }
}
