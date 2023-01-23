package com.johndev.componentsjc

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.johndev.componentsjc.ui.components.CardMainMenu
import com.johndev.componentsjc.ui.components.ItemDetails
import com.johndev.componentsjc.ui.components.ToolbarMain
import com.johndev.componentsjc.ui.theme.ComponentsJCTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentsJCTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = { ToolbarMain() },
                    modifier = Modifier.fillMaxSize(),
                    backgroundColor = MaterialTheme.colors.background,
                    content = {
                        CardMainMenu {
                            startActivity(it)
                        }
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComponentsJCTheme {

    }
}