package com.yuyi.uikit.outlineedittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.InputType;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.yuyi.uikit.R;


public class OutlineEditText extends LinearLayout {

    private TextView tvTitle;
    private EditText edInput;
    private TextView tvTip;
    private int defaultTitleColor=Color.parseColor("#999999");
    private int defaultTipColor=Color.parseColor("#888888");

    public OutlineEditText(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.outline_edit_text,this);
        init();
    }

    public OutlineEditText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.outline_edit_text,this);
        init();
        setAttrs(context,attrs);
    }


    public OutlineEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.outline_edit_text,this);
        init();
        setAttrs(context,attrs);
    }

    public OutlineEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        LayoutInflater.from(context).inflate(R.layout.outline_edit_text,this);
        init();
        setAttrs(context,attrs);
    }

    private void init(){
        tvTitle=(TextView)findViewById(R.id.tv_title);
        edInput=(EditText)findViewById(R.id.et_input);
        tvTip=(TextView)findViewById(R.id.tv_tip);
    }


    private void setAttrs(Context context,AttributeSet attrs) {

        TypedArray typedArray=context.obtainStyledAttributes(attrs, R.styleable.OutlineEditText);
        final int N=typedArray.getIndexCount();
        for(int i=0;i<N;i++){
            int attr = typedArray.getIndex(i);
            if (attr == R.styleable.OutlineEditText_hint) {
                setHint(typedArray.getString(attr));
            } else if (attr == R.styleable.OutlineEditText_title) {
                setTitle(typedArray.getString(attr));
            } else if (attr == R.styleable.OutlineEditText_tip) {
                setTip(typedArray.getString(attr));
            } else if (attr == R.styleable.OutlineEditText_titleTextColor) {
                defaultTitleColor = typedArray.getColor(attr, Color.parseColor("#999999"));
                setTitleColor(defaultTitleColor);
            } else if (attr == R.styleable.OutlineEditText_tipTextColor) {
                defaultTipColor = typedArray.getColor(attr, Color.parseColor("#888888"));
                setTipColor(defaultTipColor);
            } else if (attr == R.styleable.OutlineEditText_tipVisibility) {
                setTipVisibility(typedArray.getInt(attr, GONE));
            } else if (attr == R.styleable.OutlineEditText_android_inputType) {
                setInputType(typedArray.getInt(attr, InputType.TYPE_CLASS_TEXT));
            }
        }
        typedArray.recycle();
    }

    public void setInputType(int inputType) {
        edInput.setInputType(inputType);
    }

    /**
     * set tip visibility
     * @param visibility values - VIEW.VISIBILE, VIEW.GONE, VIEW.INVISIBILE
     */
    public void setTipVisibility(int visibility) {
        tvTip.setVisibility(visibility);
    }

    public void setTip(String tip) {
        tvTip.setText(tip);
        if(!TextUtils.isEmpty(tip))
            tvTip.setVisibility(VISIBLE);
    }

    /**
     * set the text color of tip below edit box
     * @param color A color value in the form 0xAARRGGBB. Do not pass a resource ID. To get a color value from a resource ID, call getColor.
     */
    public void setTipColor(int color) {
        tvTip.setTextColor(color);
    }

    /**
     * set the text color of title
     * @param color A color value in the form 0xAARRGGBB. Do not pass a resource ID. To get a color value from a resource ID, call getColor.
     */
    public void setTitleColor(int color) {
        tvTitle.setTextColor(color);
    }

    /**
     * set default color which declared in layout
     */
    public void setTitleColor() {
        tvTitle.setTextColor(defaultTitleColor);
    }


    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setHint(String hint) {
        edInput.setHint(hint);
    }

    public String getText(){
        return edInput.getText().toString();
    }
}
