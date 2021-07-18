package com.yuyi.uikit.view;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.yuyi.uikit.R;
import com.yuyi.uikit.popup.Popup;

public class PopupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
    }

    public void success(View view) {
        Popup.topSuccess(this,"Success");
    }

    public void error(View view) {
        Popup.topError(this,"Error");
    }

    public void warning(View view) {
        Popup.topWarning(this,"Warning");
    }

    public void info(View view) {
        Popup.topInfo(this,"Info");
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void customizeColor(View view) {
        Popup.top(this,"Customize Color", getColor(R.color.gray));
    }
}