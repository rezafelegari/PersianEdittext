package com.example.persianlibrary;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.EditText;

import java.util.Locale;

public class ExtendedEditText extends EditText {

    public ExtendedEditText(Context context) {
        super(context);
        init();
    }

    public ExtendedEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ExtendedEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ExtendedEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public static CharSequence getFarsiCharNumber(String number) {
        return number.replace("1", "۱").replace("2", "۲").replace("3", "۳").replace("4", "۴").replace("5", "۵").replace("6", "۶").replace("7", "۷").replace("8", "۸").replace("9", "۹")
                .replace("0", "۰");
    }
    public static CharSequence getEnglishCharNumber(String number) {
        return number.replace("۱", "1").replace("۲", "2").replace("۳", "3").replace("۴", "4").replace("۵", "5").replace("۶", "6").replace("۷", "7").replace("۸", "8").replace("۹", "9")
                .replace("۰", "0");
    }


    private void init() {
        setTypeface(getTypeFace());
    }

    private Typeface getTypeFace() {
        return Typeface.createFromAsset(getContext().getAssets(), "fonts/iran_yekan_mob_reg_fa_num.ttf");
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        Locale current = getResources().getConfiguration().locale;
//        if (current.getLanguage().equals("en")) {
//            super.setText(text, type);
//            return;
//        }

        try {
            String txt = (String) text;
            super.setText(getFarsiCharNumber(txt), type);
        } catch (Exception e) {
            super.setText(text, type);
            e.printStackTrace();
        }

    }





}
