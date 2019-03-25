package com.eratart.viewrx

import android.view.View

fun View.setThrottledClickListener(throttle: Long, listener: () -> Unit) {
    var lastClickTime = 0L
    this.setOnClickListener {
        if (System.currentTimeMillis() - lastClickTime >= throttle) {
            lastClickTime = System.currentTimeMillis()
            listener.invoke()
        }
    }

}