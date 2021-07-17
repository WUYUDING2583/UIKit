package com.yuyi.uikit;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yuyi.uikit.outlineedittext.OutlineEditText;
import com.yuyi.uikit.popup.Popup;
import com.yuyi.uikit.view.OutlineEditTextActivity;
import com.yuyi.uikit.view.PopupActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button popup, outlineEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        outlineEditText=(Button)findViewById(R.id.bt_outline_edittext);
        popup=(Button)findViewById(R.id.bt_popup);

        outlineEditText.setOnClickListener(this);
        popup.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_outline_edittext:
                Intent outlineEditTextIntent = new Intent(this, OutlineEditTextActivity.class);
                outlineEditTextIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(outlineEditTextIntent);
                break;
            case R.id.bt_popup:
                Intent popupIntent = new Intent(this, PopupActivity.class);
                popupIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(popupIntent);
                break;
        }
    }
}