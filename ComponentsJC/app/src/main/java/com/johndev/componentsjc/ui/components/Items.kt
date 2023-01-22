package com.johndev.componentsjc.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.johndev.componentsjc.entities.MainMenuEntity

@Composable
fun ItemMainMenu(mainMenu: MainMenuEntity, onItemSelected: (MainMenuEntity) -> Unit) {
    Card(
        border = BorderStroke(1.dp, Color.LightGray),
        modifier = Modifier
            //.width(164.dp)
            .fillMaxWidth()
            .clickable { onItemSelected(mainMenu) }
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = mainMenu.imgPhoto),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = mainMenu.title,
                modifier = Modifier.align(Alignment.Start)
            )
        }
    }
}