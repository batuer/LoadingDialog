package com.gusi.loadingdialog;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * 作者：${ylw} on 2017-12-16 12:02
 */
public class LoadingDialog extends Dialog {

  private TextView mTvMsg;

  public LoadingDialog(Context context) {
    this(context, R.style.LoadingDialog);
  }

  public LoadingDialog(Context context, int themeResId) {
    super(context, themeResId);
    initDialogWidth();
  }

  private void initDialogWidth() {
    Window window = getWindow();
    if (window != null) {
      WindowManager.LayoutParams wmLp = window.getAttributes();
      wmLp.width = ViewGroup.LayoutParams.MATCH_PARENT;
      window.setAttributes(wmLp);
    }
    View view = getLayoutInflater().inflate(R.layout.dialog_loading, null);
    mTvMsg = view.findViewById(R.id.tv_loading_msg);
    setContentView(view);
  }

  public void show(String msg, boolean canCancel) {
    if (TextUtils.isEmpty(msg)) {
      msg = getContext().getString(R.string.loading_note);
    }
    mTvMsg.setText(msg);
    setCanceledOnTouchOutside(canCancel);
    setCancelable(canCancel);
    super.show();
  }
}
