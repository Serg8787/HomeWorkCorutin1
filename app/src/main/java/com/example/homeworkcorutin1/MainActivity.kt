package com.example.homeworkcorutin1

import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {


    @DelicateCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            // Можно получать данные по какой то фунции от сервера
            tvExample.text = "Кнопка нажата"
            CoroutineScope(Dispatchers.Main).launch {
                // Обновляем данные
                delay(500)
                tvExample.text = "Кнопка разблокирована"
            }

        }
    }
}


