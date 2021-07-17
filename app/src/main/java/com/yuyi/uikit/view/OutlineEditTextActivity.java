package com.yuyi.uikit.view;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.yuyi.uikit.R;
import com.yuyi.uikit.outlineedittext.OutlineEditText;

public class OutlineEditTextActivity extends AppCompatActivity {

    private OutlineEditText oetInput;
    private int tipCount=0;
    private int titleCount=0;
    private int hintCount=0;
    private boolean changeInputBackground=false;
    private boolean changeTitleBackground=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outline_edit_text);
        init();
    }

    private void init(){
        oetInput=(OutlineEditText)findViewById(R.id.oet_input);
    }

    public void updateTip(View view) {
        oetInput.setTip("Tip"+ ++tipCount);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void updateTipColor(View view) {
        oetInput.setTipColor(getColor(R.color.error));
    }

    public void resetTipColor(View view) {
        oetInput.setTipColor();
    }

    public void updateTitle(View view) {
        oetInput.setTitle("Title "+ ++titleCount);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void updateTitleColor(View view) {
        oetInput.setTitleColor(getColor(R.color.error));
    }

    public void resetTitleColor(View view) {
        oetInput.setTitleColor();
    }

    public void tipGone(View view) {
        oetInput.setTipVisibility(View.GONE);
    }

    public void tipInvisible(View view) {
        oetInput.setTipVisibility(View.INVISIBLE);
    }

    public void showTip(View view) {
        oetInput.setTipVisibility(View.VISIBLE);
    }

    public void hideTitle(View view) {
        oetInput.setTitleVisibility(View.GONE);
    }

    public void showTitle(View view) {
        oetInput.setTitleVisibility(View.VISIBLE);
    }

    public void updateHint(View view) {
        oetInput.setHint("Hint " + ++hintCount);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void updateHintColor(View view) {
        oetInput.setHintColor(getColor(R.color.error));
    }

    public void changeInputBackground(View view) {
        if(!changeInputBackground) {
            oetInput.setEditTextBackground(getDrawable(R.drawable.bg_red_radius10));
        }else{
            oetInput.setEditTextBackground(getDrawable(R.drawable.bg_gray_radius10));
        }
        changeInputBackground=!changeInputBackground;
    }

    public void changeTitleBackground(View view){
        if(!changeTitleBackground) {
            oetInput.setTitleBackground(getDrawable(R.drawable.bg_gray_radius10_no_padding));
        }else{
            oetInput.setTitleBackground(getDrawable(R.color.white));
        }
        changeTitleBackground=!changeTitleBackground;
    }
}