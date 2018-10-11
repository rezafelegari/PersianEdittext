package com.example.persianlibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class PersianEdittext extends LinearLayout {


    ExtendedEditText edittxt;
    ImageView icon;
    String hint;
    Integer iconid;

    public PersianEdittext(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        inflate(context, R.layout.component_dittext, this);
        if (attrs != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomEdittext, 0, 0);
            hint = typedArray.getString(R.styleable.CustomEdittext_hint);
            iconid = typedArray.getResourceId(R.styleable.CustomEdittext_icon_tv, 0);
            typedArray.recycle();
        }
        initComponents();
        setIcon(iconid);
        setEdittxt(hint);
    }

    private void initComponents() {
        edittxt = (ExtendedEditText) findViewById(R.id.edittext_tv);
        icon = (ImageView) findViewById(R.id.icon_tv);
    }


    public void setEdittxt(String txt) {
        this.edittxt.setHint(txt);
    }

    public void setIcon(int resid) {
        this.icon.setImageResource(resid);
    }
}
