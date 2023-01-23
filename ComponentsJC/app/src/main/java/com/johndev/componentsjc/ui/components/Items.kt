package com.johndev.componentsjc.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.johndev.componentsjc.R
import com.johndev.componentsjc.entities.DetailsListMenuEntity
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
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = mainMenu.title,
                modifier = Modifier.align(Alignment.Start)
            )
        }
    }
}

@Composable
fun ItemDetails(detailsMenu: DetailsListMenuEntity, onItemSelected: (DetailsListMenuEntity) -> Unit) {
    Card(
        border = BorderStroke(1.dp, Color.LightGray),
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 0.dp, 0.dp, 16.dp)
            .clickable { onItemSelected(detailsMenu) }
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .weight(8f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = detailsMenu.title,
                    style = MaterialTheme.typography.subtitle1
                )
                Text(
                    text = detailsMenu.description,
                    style = MaterialTheme.typography.caption
                )
            }
            Column(
                modifier = Modifier.weight(2f),
                verticalArrangement = Arrangement.Center
            ) {
                IconButton(onClick = {  }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_arrow_forward),
                        contentDescription = null
                    )
                }
            }
        }
    }
}