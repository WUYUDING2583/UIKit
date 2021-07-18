package com.yuyi.uikit.outlineedittext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.InputType;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

import com.yuyi.uikit.R;


public class OutlineEditText extends LinearLayout {

    private TextView tvTitle;
    private EditText edInput;
    private TextView tvTip;
    private int defaultTitleColor = Color.parseColor("#999999");
    private int defaultTipColor = Color.parseColor("#888888");
    private Drawable defaultInputBackground;
    private String TAG="OutlineEditText";

    public OutlineEditText(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.outline_edit_text, this);
        init();
    }

    public OutlineEditText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.outline_edit_text, this);
        init();
        setAttrs(context, attrs);
    }


    public OutlineEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.outline_edit_text, this);
        init();
        setAttrs(context, attrs);
    }

    public OutlineEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        LayoutInflater.from(context).inflate(R.layout.outline_edit_text, this);
        init();
        setAttrs(context, attrs);
    }

    private void init() {
        tvTitle = (TextView) findViewById(R.id.tv_title);
        edInput = (EditText) findViewById(R.id.et_input);
        tvTip = (TextView) findViewById(R.id.tv_tip);
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    private void setAttrs(Context context, AttributeSet attrs) {

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.OutlineEditText);
        final int N = a.getIndexCount();
        for (int i = 0; i < N; i++) {
            int attr = a.getIndex(i);
            switch (attr) {
                case R.styleable.OutlineEditText_hint:
                    setHint(a.getString(attr));
                    break;
                case R.styleable.OutlineEditText_title:
                    setTitle(a.getString(attr));
                    break;
                case R.styleable.OutlineEditText_tip:
                    setTip(a.getString(attr));
                    break;
                case R.styleable.OutlineEditText_titleTextColor:
                    defaultTitleColor = a.getColor(attr, Color.parseColor("#999999"));
                    setTitleColor(defaultTitleColor);
                    break;
                case R.styleable.OutlineEditText_tipTextColor:
                    defaultTipColor = a.getColor(attr, Color.parseColor("#888888"));
                    setTipColor(defaultTipColor);
                    break;
                case R.styleable.OutlineEditText_tipVisibility:
                    setTipVisibility(a.getInt(attr, GONE));
                    break;
                case R.styleable.OutlineEditText_titleVisibility:
                    setTitleVisibility(a.getInt(attr, VISIBLE));
                case R.styleable.OutlineEditText_android_inputType:
                    setInputType(a.getInt(attr, InputType.TYPE_CLASS_TEXT));
                    break;
                case R.styleable.OutlineEditText_titleBackground:
                    Drawable titleBackground = a.getDrawable(attr);
                    setTitleBackground(titleBackground);
                    break;
                case R.styleable.OutlineEditText_inputBackground:
                    defaultInputBackground = a.getDrawable(attr);
                    if (defaultInputBackground == null)
                        defaultInputBackground = context.getDrawable(R.drawable.bg_gray_radius10);
                    setInputBackground(defaultInputBackground);
                    break;
            }
        }
        a.recycle();
    }

    /**
     * set title's background
     * @param background
     */
    public void setTitleBackground(Drawable background) {
        if (background != null) {
            tvTitle.setBackground(background);
        }
    }

    /**
     * set EditText' background
     * @param background if null, set the background as default one
     */
    public void setInputBackground(Drawable background) {
        Log.e(TAG, "setAttrs: "+background);
        if (background != null)
            edInput.setBackground(background);
        else
            edInput.setBackground(defaultInputBackground);
    }

    /**
     * set EditText' background as the default background
     */
    public void setInputBackground(){
        setInputBackground(null);
    }

    /**
     * set title visibility
     *
     * @param visibility values - VIEW.VISIBILE, VIEW.GONE, VIEW.INVISIBILE
     */
    public void setTitleVisibility(int visibility) {
        tvTitle.setVisibility(visibility);
    }


    public void setInputType(int inputType) {
        edInput.setInputType(inputType);
    }

    /**
     * set tip visibility
     *
     * @param visibility values - VIEW.VISIBILE, VIEW.GONE, VIEW.INVISIBILE
     */
    public void setTipVisibility(int visibility) {
        tvTip.setVisibility(visibility);
    }

    /**
     * set the tip text below edit text
     *
     * @param tip
     */
    public void setTip(String tip) {
        tvTip.setText(tip);
        if (!TextUtils.isEmpty(tip))
            tvTip.setVisibility(VISIBLE);
    }

    /**
     * set the text color of tip below edit box
     *
     * @param color A color value in the form 0xAARRGGBB. Do not pass a resource ID. To get a color value from a resource ID, call getColor.
     */
    public void setTipColor(@ColorInt int color) {
        tvTip.setTextColor(color);
    }

    /**
     * set default color which declared in layout,
     * default value #888888
     */
    public void setTipColor() {
        tvTip.setTextColor(defaultTipColor);
    }

    /**
     * set the text color of title
     *
     * @param color A color value in the form 0xAARRGGBB. Do not pass a resource ID. To get a color value from a resource ID, call getColor.
     */
    public void setTitleColor(@ColorInt int color) {
        tvTitle.setTextColor(color);
    }

    /**
     * set default color which declared in layout,
     * default value #999999
     */
    public void setTitleColor() {
        tvTitle.setTextColor(defaultTitleColor);
    }


    /**
     * set the outline title of edit text
     *
     * @param title
     */
    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    /**
     * set the hint of edit text
     *
     * @param hint
     */
    public void setHint(String hint) {
        edInput.setHint(hint);
    }

    /**
     * get the text user input
     *
     * @return
     */
    public String getText() {
        return edInput.getText().toString();
    }

    /**
     * Sets the color of the hint text for all the states (disabled, focussed, selected...) .
     *
     * @param color A color value in the form 0xAARRGGBB. Do not pass a resource ID. To get a color value from a resource ID, call getColor.
     */
    public void setHintColor(@ColorInt int color) {
        edInput.setHintTextColor(color);
    }
}
