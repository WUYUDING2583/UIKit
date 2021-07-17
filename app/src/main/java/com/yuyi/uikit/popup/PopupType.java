package com.yuyi.uikit.popup;

import android.view.View;

public interface PopupType {
    void error(View parent, int gravity);
    void success(View parent, int gravity);
    void warning(View parent, int gravity);
    void info(View parent, int gravity);
}
