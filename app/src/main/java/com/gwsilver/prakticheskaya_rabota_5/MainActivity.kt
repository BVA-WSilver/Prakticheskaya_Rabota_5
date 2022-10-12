package com.gwsilver.prakticheskaya_rabota_5
/*
Стих:
     Если разобраться - всё возможно
      Испытать, достигнуть и понять.
     В этом мире всё совсем не сложно,
        Если самому не усложнять.

Всё должно быть изложено так просто, как только возможно, но не проще.
Автор афоризма: Эйнштейн А.
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Poem", "Если разобраться - всё возможно")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Poem", "Испытать, достигнуть и понять.")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Poem", "В этом мире всё совсем не сложно,")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Poem", "Если самому не усложнять.")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Aphorism", "Всё должно быть изложено так просто, как только возможно, но не проще.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Aphorism", "Автор афоризма: Эйнштейн А.")
    }
}