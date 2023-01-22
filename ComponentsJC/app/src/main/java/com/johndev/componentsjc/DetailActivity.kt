package com.johndev.componentsjc

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.johndev.componentsjc.ui.components.ToolbarWithReturn
import com.johndev.componentsjc.ui.theme.ComponentsJCTheme

class DetailActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentsJCTheme {
                var passedValue by remember { mutableStateOf("") }
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        ToolbarWithReturn(title = passedValue) {
                            finish()
                        }
                    },
                    modifier = Modifier.fillMaxSize(),
                    backgroundColor = MaterialTheme.colors.background,
                    content = {
                        passedValue = intent.getStringExtra("titleComponent").toString()
                    }
                )
            }
        }
    }
}