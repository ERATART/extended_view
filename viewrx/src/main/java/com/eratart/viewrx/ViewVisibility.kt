package com.eratart.viewrx

import android.os.Handler
import android.view.View

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun View.visibleWithAlpha(duration: Long) {
    this.visibility = View.VISIBLE
    this.animate().alpha(1f).setDuration(duration).start()
}

fun View.goneWithAlpha(duration: Long) {
    Handler().postDelayed({
        this.visibility = View.GONE
    }, duration)
    this.animate().alpha(0f).setDuration(duration).start()
}

fun View.invisibleWithAlpha(duration: Long) {
    Handler().postDelayed({
        this.visibility = View.INVISIBLE
    }, duration)
    this.animate().alpha(0f).setDuration(duration).start()
}