package com.yuyi.uikit.popup;

import android.view.View;

import androidx.annotation.ColorInt;

public interface PopupType {
    void error();
    void success();
    void warning();
    void info();
    void show(@ColorInt int color);
    PopupType duration(long millis);
    PopupType onClick(Popup.OnClick onClick);
    PopupType onClose(Popup.OnClose onClose);

}
