package com.johndev.componentsjc.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.johndev.componentsjc.R

@Composable
fun ToolbarMain() {
    TopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) },
        actions = {
            IconButton(onClick = {  }) {
                Icon(painter = painterResource(id = R.drawable.ic_edit), contentDescription = null)
            }
            IconButton(onClick = {  }) {
                Icon(painter = painterResource(id = R.drawable.ic_more_vert), contentDescription = null)
            }
        }
    )
}

@Composable
fun ToolbarWithReturn(title:String, onButtonPress: () -> Unit) {
    TopAppBar(
        title = { Text(text = title) },
        navigationIcon = {
                         IconButton(onClick = { onButtonPress() }) {
                             Icon(painter = painterResource(id = R.drawable.ic_arrow_back), contentDescription = null)
                         }
        },
        actions = {
            IconButton(onClick = {  }) {
                Icon(painter = painterResource(id = R.drawable.ic_edit), contentDescription = null)
            }
            IconButton(onClick = {  }) {
                Icon(painter = painterResource(id = R.drawable.ic_more_vert), contentDescription = null)
            }
        }
    )
}