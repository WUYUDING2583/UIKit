package com.yuyi.uikit.popup;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.ColorInt;

public class Popup {


    public interface OnClick{
        void onClick();
    }
    public interface OnClose{
        void onClose();
    }

    public static PopupType top(Context context,String title){
        PopupTop top = new PopupTop(context);
        top.setTitle(title);
        return top;
    }
}
