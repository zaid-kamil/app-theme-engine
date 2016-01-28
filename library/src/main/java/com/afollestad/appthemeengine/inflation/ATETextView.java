package com.afollestad.appthemeengine.inflation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import com.afollestad.appthemeengine.ATEActivity;
import com.afollestad.appthemeengine.tagprocessors.TextColorTagProcessor;

/**
 * @author Aidan Follestad (afollestad)
 */
class ATETextView extends TextView implements ViewInterface {

    public ATETextView(Context context) {
        super(context);
        init(context, null);
    }

    public ATETextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, null);
    }

    public ATETextView(Context context, AttributeSet attrs, @Nullable ATEActivity keyContext) {
        super(context, attrs);
        init(context, keyContext);
    }

    private void init(Context context, @Nullable ATEActivity keyContext) {
        if (getTag() == null)
            setTag(String.format("%s|accent_color,%s|primary_text",
                    TextColorTagProcessor.LINK_PREFIX, TextColorTagProcessor.PREFIX));
        try {
            ATEViewUtil.init(keyContext, this, context);
        } catch (Throwable t) {
            throw new RuntimeException(t.getMessage(), t);
        }
    }

    @Override
    public boolean setsStatusBarColor() {
        return false;
    }

    @Override
    public boolean setsToolbarColor() {
        return false;
    }
}