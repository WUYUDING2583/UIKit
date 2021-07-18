package com.yuyi.uikit.view;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yuyi.uikit.R;
import com.yuyi.uikit.popup.Popup;

public class PopupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
    }

    public void success(View view) {
        Popup.top(this, "Success").success();
    }

    public void error(View view) {
        Popup.top(this, "Error").error();
    }

    public void warning(View view) {
        Popup.top(this, "Warning").warning();
    }

    public void info(View view) {
        Popup.top(this, "Info").info();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void customizeColor(View view) {
        Popup.top(this, "Customize Color").show(getColor(R.color.gray));
    }

    public void addDuration(View view) {
        Popup.top(this, "duration is 40000 millis")
                .duration(4000)
                .success();
    }

    public void setOnClick(View view){
        Popup.top(this,"set on click event")
                .onClick(()-> Toast.makeText(this,"onclick event",Toast.LENGTH_SHORT).show())
                .success();
    }

    public void setOnClose(View view) {
        Popup.top(this,"set on close event")
                .onClose(()->Toast.makeText(this,"onclose event",Toast.LENGTH_SHORT).show())
                .info();
    }
}