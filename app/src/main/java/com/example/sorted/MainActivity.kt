package com.example.sorted

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.text.InternalTextApi
import androidx.compose.ui.unit.ExperimentalUnitApi
import com.example.sorted.presentation.MainScreen
import com.example.sorted.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class, InternalTextApi::class, ExperimentalUnitApi::class)
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBar?.hide()
        setContent {
            AppTheme {
                MainScreen()
            }
        }
    }
}