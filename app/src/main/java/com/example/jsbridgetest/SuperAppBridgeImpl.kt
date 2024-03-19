package com.example.jsbridgetest

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

// Interface Implementation
class SuperAppBridgeImpl(private val context: Context) : SuperAppBridge {

    @JavascriptInterface
    override fun showToast(param: String) {
        Toast.makeText(context,param,Toast.LENGTH_SHORT).show()
    }

    @JavascriptInterface
    override fun invokeSuperPower() {
        // Unleash the ultimate Super Power!
    }
    // Let your creativity soar with more implementations!
}
