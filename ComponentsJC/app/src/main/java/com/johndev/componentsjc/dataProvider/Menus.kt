package com.johndev.componentsjc.dataProvider

import com.johndev.componentsjc.R
import com.johndev.componentsjc.entities.MainMenuEntity

fun getMainManu(): List<MainMenuEntity> {
    return listOf(
        MainMenuEntity(
            imgPhoto = R.drawable.app_bars_bottom,
            title = "App bars: bottom"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.app_bar_top,
            title = "App bars: top"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.backdrop,
            title = "Backdrop"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.ic_launcher_foreground,
            title = "Badge"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.bottom_navigation,
            title = "Bottom navigation"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.navigation_rail,
            title = "Navigation Rail"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.buttons,
            title = "Buttons"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.floating_action_button,
            title = "Floating action buttons"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.card,
            title = "Cards"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.checkboxes,
            title = "Checkboxes"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.chips,
            title = "Chips"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.dialogs,
            title = "Dialogs"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.dividers,
            title = "Dividers"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.lists,
            title = "Lists"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.menus,
            title = "Menus"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.navigation_drawe,
            title = "Navigation drawer"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.progress_indicators,
            title = "Progress indicators"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.radio_buttons,
            title = "Radio buttons"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.sheets_bottom,
            title = "Sheets: bottom"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.sliders,
            title = "Sliders"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.snackbars,
            title = "Snackbar"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.switches,
            title = "Switches"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.tabs,
            title = "Tabs"
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.text_fields,
            title = "Text fields"
        ),
    )
}