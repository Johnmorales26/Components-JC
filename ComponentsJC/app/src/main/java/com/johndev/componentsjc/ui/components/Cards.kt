package com.johndev.componentsjc.ui.components

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.johndev.componentsjc.DetailActivity
import com.johndev.componentsjc.dataProvider.getMainManu
import com.johndev.componentsjc.entities.DetailsListMenuEntity

@Composable
fun CardMainMenu(onItemSelected: (Intent) -> Unit) {
    val contex = LocalContext.current
    LazyVerticalGrid(
        columns = GridCells.Adaptive(180.dp),
        content = {
            items(getMainManu()) { mainMenu ->
                ItemMainMenu(mainMenu) {
                    val intent = Intent(contex, DetailActivity::class.java).apply {
                        putExtra("titleComponent", it.title)
                        putExtra("imgPhoto", it.imgPhoto)
                        putExtra("position", it.position)
                    }
                    onItemSelected(intent)
                }
            }
        })
}

@Composable
fun CardDetails(detailsMenu: List<DetailsListMenuEntity>, onItemSelected: (Intent) -> Unit) {
    val contex = LocalContext.current
    LazyColumn(
        content = {
            items(detailsMenu) { detailsMenu ->
                ItemDetails(detailsMenu) {
                    Toast.makeText(contex, it.title, Toast.LENGTH_SHORT).show()
                }
            }
        })
}