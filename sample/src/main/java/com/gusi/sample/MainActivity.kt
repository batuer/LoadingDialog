package com.gusi.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gusi.loadingdialog.LoadingDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_show.setOnClickListener { v ->
            var loadingDialog = LoadingDialog(MainActivity@ this)
            loadingDialog.show("测试", false)
            v.postDelayed({ loadingDialog.dismiss() }, 3000)
        }
    }
}
