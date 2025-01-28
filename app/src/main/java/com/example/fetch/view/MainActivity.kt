package com.example.fetch.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.fetch.view.ui.theme.FetchTheme
import com.example.fetch.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FetchTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    MainScreen(viewModel = MainViewModel())
                }
            }
        }
    }
}
