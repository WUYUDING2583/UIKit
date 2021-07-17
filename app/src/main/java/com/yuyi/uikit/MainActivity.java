package com.yuyi.uikit;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yuyi.uikit.outlineedittext.OutlineEditText;
import com.yuyi.uikit.popup.Popup;

public class MainActivity extends AppCompatActivity {

    private OutlineEditText editText;
    private Button popup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(OutlineEditText)findViewById(R.id.oet_email);
        popup=(Button)findViewById(R.id.bt_popup_top);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void popupTop(View view) {
        String email = editText.getText();
        if(email==null||email.length()==0){
            editText.setTitleColor(getColor(R.color.error));
            Popup.topWarning(this,"please enter somthing");
        }else{
            editText.setTitleColor();
            Popup.topSuccess(this,"your input is "+email);
        }
    }
}