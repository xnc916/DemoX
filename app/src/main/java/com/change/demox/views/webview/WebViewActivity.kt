package com.change.demox.views.webview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.change.demox.R
import kotlinx.android.synthetic.main.activity_web_view.*


class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        initView()
    }

    private fun initView() {
        btn_term.setOnClickListener {
            val intent = Intent(this, TermActivity::class.java)
            startActivity(intent)
        }
        btn_js_webview.setOnClickListener {
            val intent = Intent(this, WebViewJsActivity::class.java)
            startActivity(intent)
        }
    }
}