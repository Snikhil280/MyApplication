package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application, "8c42ab45-faa9-44d0-b59e-cd64f68f4cd1",
            Analytics::class.java, Crashes::class.java
        )

        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
    }
}
