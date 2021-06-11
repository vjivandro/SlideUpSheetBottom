package com.vassa.floatbottomsheet

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.vassa.sheetbottomslideup.view.SlideUpBottomsheet
import com.vassa.sheetbottomslideup.view.SlideUpLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val slide_conten = findViewById<SlideUpLayout>(R.id.slide_conten)
        val container_floating_menu = findViewById<LinearLayout>(R.id.container_floating_menu)
        val content_expand_container = findViewById<LinearLayout>(R.id.content_expand_container)


        SlideUpBottomsheet(this, slide_conten)
            .setFloatingMenuRadiusInDp(100)
            .setFloatingMenuColor(android.R.color.white)
            .setFloatingMenu(container_floating_menu)
            .setPanel(content_expand_container)
            .build()
    }
}