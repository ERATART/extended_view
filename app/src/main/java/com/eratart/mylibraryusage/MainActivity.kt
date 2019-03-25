package com.eratart.mylibraryusage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.eratart.viewrx.setThrottledClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click.setThrottledClickListener(3000) {
            Toast.makeText(this, "Я сосал меня ебали ${System.currentTimeMillis()}", Toast.LENGTH_LONG).show()
        }
    }
}
