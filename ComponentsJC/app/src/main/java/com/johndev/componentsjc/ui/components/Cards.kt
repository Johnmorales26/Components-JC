package com.johndev.componentsjc.ui.components

import android.content.Intent
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.johndev.componentsjc.DetailActivity
import com.johndev.componentsjc.dataProvider.getMainManu
import com.johndev.componentsjc.entities.MainMenuEntity

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
                    }
                    onItemSelected(intent)
                }
            }
        })
}