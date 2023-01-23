package com.johndev.componentsjc

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.johndev.componentsjc.dataProvider.getDetails
import com.johndev.componentsjc.entities.DetailsMenuEntity
import com.johndev.componentsjc.ui.components.CardDetails
import com.johndev.componentsjc.ui.components.ToolbarWithReturn
import com.johndev.componentsjc.ui.theme.ComponentsJCTheme

class DetailActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentsJCTheme {
                var titleValue by remember { mutableStateOf("") }
                var imgPhotoValue by remember { mutableStateOf(0) }
                var positionValue by remember { mutableStateOf(0) }
                titleValue = intent.getStringExtra("titleComponent").toString()
                imgPhotoValue = intent.getIntExtra("imgPhoto", 0)
                positionValue = intent.getIntExtra("position", 0)
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        ToolbarWithReturn(title = titleValue) {
                            finish()
                        }
                    },
                    modifier = Modifier.fillMaxSize(),
                    backgroundColor = MaterialTheme.colors.background,
                    content = {
                        when (titleValue) {
                            "App bars: bottom" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "App bars: top" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Backdrop" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Badge" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Bottom navigation" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Navigation Rail" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Buttons" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Floating action buttons" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Cards" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Checkboxes" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Chips" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Dialogs" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Dividers" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Lists" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Menus" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Navigation drawer" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Progress indicators" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Radio buttons" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Sheets: bottom" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Sliders" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Snackbar" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Switches" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Tabs" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                            "Text fields" -> ContentDetail(
                                imgPhotoValue,
                                getDetails()[positionValue]
                            )
                        }
                    }
                )
            }
        }
    }

    @Composable
    fun ContentDetail(imgPhoto: Int, details: DetailsMenuEntity) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = imgPhoto),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.padding(16.dp),
            ) {
                Text(
                    text = "Description",
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp),
                    style = MaterialTheme.typography.h6
                )
                Text(
                    text = details.description,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp),
                    style = MaterialTheme.typography.body1
                )
                Text(
                    text = "Examples",
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp),
                    style = MaterialTheme.typography.h6
                )
                if (details.details != null) {
                    CardDetails(details.details) {

                    }
                } else {
                    Text(
                        text = "No Examples",
                        modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp),
                        style = MaterialTheme.typography.body1
                    )
                }
            }
        }
    }

}