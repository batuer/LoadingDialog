package com.gusi.loadingdialog;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * @Author ylw  2018-04-18 12:07
 */
public class LoadingDialogView extends LinearLayout {
  public LoadingDialogView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    int max = Math.max(getMeasuredHeight(), getMeasuredWidth());
    setMeasuredDimension(max,max);
  }
}
