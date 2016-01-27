package com.afollestad.appthemeengine.views;

import android.content.Context;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;

import com.afollestad.appthemeengine.ATE;
import com.afollestad.appthemeengine.R;

/**
 * @author Aidan Follestad (afollestad)
 */
public class ATECheckBox extends AppCompatCheckBox implements ATEViewInterface {

    public ATECheckBox(Context context) {
        super(context);
        init(context, null);
    }

    public ATECheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ATECheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        setTag("tint_accent_color,text_primary");
        ATEViewUtil.init(this, context, attrs, R.styleable.ATECheckBox, R.styleable.ATECheckBox_ateKey_checkBox);
    }

    public void setKey(String key) {
        ATE.apply(getContext(), this, key);
    }

    @Override
    public boolean setsStatusBarColor() {
        return false;
    }
}
