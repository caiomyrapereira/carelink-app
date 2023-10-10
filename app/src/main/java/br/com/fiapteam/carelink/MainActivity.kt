package br.com.fiapteam.carelink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webview: WebView = this.findViewById(R.id.webview);

        webview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                url?.let {
                    view?.loadUrl(it)
                    return true
                }
                return false
            }
        }

        webview!!.getSettings().setJavaScriptEnabled(true)
        webview!!.loadUrl("https://carelink-frontend.vercel.app/")
    }


}