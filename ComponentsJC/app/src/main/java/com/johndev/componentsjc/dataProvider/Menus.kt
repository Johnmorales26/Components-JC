package com.johndev.componentsjc.dataProvider

import com.johndev.componentsjc.R
import com.johndev.componentsjc.entities.DetailsListMenuEntity
import com.johndev.componentsjc.entities.DetailsMenuEntity
import com.johndev.componentsjc.entities.MainMenuEntity

fun getMainManu(): List<MainMenuEntity> {
    return listOf(
        MainMenuEntity(
            imgPhoto = R.drawable.app_bars_bottom,
            title = "App bars: bottom",
            position = 0
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.app_bar_top,
            title = "App bars: top",
            position = 1
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.backdrop,
            title = "Backdrop",
            position = 2
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.ic_launcher_foreground,
            title = "Badge",
            position = 3
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.bottom_navigation,
            title = "Bottom navigation",
            position = 4
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.navigation_rail,
            title = "Navigation Rail",
            position = 5
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.buttons,
            title = "Buttons",
            position = 6
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.floating_action_button,
            title = "Floating action buttons",
            position = 7
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.card,
            title = "Cards",
            position = 8
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.checkboxes,
            title = "Checkboxes",
            position = 9
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.chips,
            title = "Chips",
            position = 10
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.dialogs,
            title = "Dialogs",
            position = 11
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.dividers,
            title = "Dividers",
            position = 12
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.lists,
            title = "Lists",
            position = 13
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.menus,
            title = "Menus",
            position = 14
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.navigation_drawe,
            title = "Navigation drawer",
            position = 15
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.progress_indicators,
            title = "Progress indicators",
            position = 16
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.radio_buttons,
            title = "Radio buttons",
            position = 17
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.sheets_bottom,
            title = "Sheets: bottom",
            position = 18
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.sliders,
            title = "Sliders",
            position = 19
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.snackbars,
            title = "Snackbar",
            position = 20
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.switches,
            title = "Switches",
            position = 21
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.tabs,
            title = "Tabs",
            position = 22
        ),
        MainMenuEntity(
            imgPhoto = R.drawable.text_fields,
            title = "Text fields",
            position = 23
        ),
    )
}

fun getDetails(): List<DetailsMenuEntity> {
    return listOf(
        DetailsMenuEntity(
            "A bottom app bar displays navigation and key actions at the bottom of mobile screens.",
            getDetailsAppBarBottom()
        ),
        DetailsMenuEntity(
            "The top app bar displays information and actions relating to the current screen.",
            getDetailsAppBarTop()
        ),
        DetailsMenuEntity(
            "A backdrop appears behind all other surfaces in an app, displaying contextual and actionable content.",
            getDetailsBackdrop()
        ),
        DetailsMenuEntity(
            "Null",
            getDetailsBadge()
        ),
        DetailsMenuEntity(
            "Bottom navigation bars allow movement between primary destinations in an app.",
            getDetailsBottomNavigation()
        ),
        DetailsMenuEntity(
            "Navigation rails provide ergonomic movement between primary destinations in apps.",
            getDetailsNavigationRail()
        ),
        DetailsMenuEntity(
            "Buttons allow users to take actions, and make choices, with a single tap.",
            getDetailsButtons()
        ),
        DetailsMenuEntity(
            "A floating action button (FAB) represents the primary action of a screen.",
            getDetailsFab()
        ),
        DetailsMenuEntity(
            "Cards contain content and actions about a single subject.",
            getDetailsCard()
        ),
        DetailsMenuEntity(
            "Checkboxes allow users to select one or more items from a set. Checkboxes can turn an option on or off.",
            getDetailsCheckboxes()
        ),
        DetailsMenuEntity(
            "Chips are compact elements that represent an input, attribute, or action.",
            getDetailsChips()
        ),
        DetailsMenuEntity(
            "Dialogs inform users about a task and can contain critical information, require decisions, or involve multiple tasks.",
            getDetailsDialogs()
        ),
        DetailsMenuEntity(
            "A divider is a thin line that groups content in lists and layouts.",
            null
        ),
        DetailsMenuEntity(
            "Lists are continuous, vertical indexes of text or images.",
            getDetailsLists()
        ),
        DetailsMenuEntity(
            "Menus display a list of choices on temporary surfaces.",
            getDetailsMenus()
        ),
        DetailsMenuEntity(
            "Navigation drawers provide access to destinations in your app.",
            getDetailsNavigationDrawer()
        ),
        DetailsMenuEntity(
            "Progress indicators express an unspecified wait time or display the length of a process.",
            getDetailsProgressIndicators()
        ),
        DetailsMenuEntity(
            "Radio buttons allow users to select one option from a set.",
            getDetailsRadioButtons()
        ),
        DetailsMenuEntity(
            "Bottom sheets are surfaces containing supplementary content that are anchored to the bottom of the screen.",
            getDetailsSheetsBottom()
        ),
        DetailsMenuEntity(
            "Sliders allow users to make selections from a range of values.",
            getDetailsSliders()
        ),
        DetailsMenuEntity(
            "Snackbars provide brief messages about app processes at the bottom of the screen.",
            getDetailsSanckbars()
        ),
        DetailsMenuEntity(
            "Switches toggle the state of a single item on or off.",
            getDetailsSwitches()
        ),
        DetailsMenuEntity(
            "Tabs organize content across different screens, data sets, and other interactions.",
            getDetailsTabs()
        ),
        DetailsMenuEntity(
            "Text fields let users enter and edit text.",
            getDetailsTextfields()
        ),
    )
}

fun getDetailsAppBarBottom(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("SimpleBottomAppBar", "App bars: bottom examples")
    )
}

fun getDetailsAppBarTop(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("SimpleTopAppBar", "App bars: top examples")
    )
}

fun getDetailsBackdrop(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("BackdropScaffoldSample", "Backdrop examples")
    )
}

fun getDetailsBadge(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("BottomNavigationItemWithBadge", "Badge examples")
    )
}

fun getDetailsBottomNavigation(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("BottomNavigationSample", "Bottom Navigation examples"),
        DetailsListMenuEntity("BottomNavigationWithOnlySelectedLabelsSample", "Bottom Navigation examples"),
    )
}

fun getDetailsNavigationRail(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("NavigationRailSample", "Navigation Rail examples"),
        DetailsListMenuEntity("NavigationRailWithOnlySelectedLabelsSample", "Navigation Rail examples"),
        DetailsListMenuEntity("CompactNavigationRailSample", "Navigation Rail examples"),
        DetailsListMenuEntity("NavigationRailBottomAlignSample", "Navigation Rail examples"),
    )
}

fun getDetailsButtons(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("ButtonSample", "Buttons examples"),
        DetailsListMenuEntity("OutlinedButtonSample", "Buttons examples"),
        DetailsListMenuEntity("TextButtonSample", "Buttons examples"),
        DetailsListMenuEntity("ButtonWithIconSample", "Buttons examples"),
    )
}

fun getDetailsFab(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("SimpleFab", "Floating action button examples"),
        DetailsListMenuEntity("SimpleExtendedFabNoIcon", "Floating action button examples"),
        DetailsListMenuEntity("SimpleExtendedFabWithIcon", "Floating action button examples"),
        DetailsListMenuEntity("FluidExtendedFab", "Floating action button examples"),
    )
}

fun getDetailsCard(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("CardSample", "Cards examples"),
        DetailsListMenuEntity("ClickableCardSample", "Cards examples"),
    )
}

fun getDetailsCheckboxes(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("CheckboxSample", "Checkboxes examples"),
        DetailsListMenuEntity("TriStateCheckboxSample", "Checkboxes examples"),
    )
}

fun getDetailsChips(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("ChipSample", "Chips examples"),
        DetailsListMenuEntity("OutlinedChipWithIconSample", "Chips examples"),
        DetailsListMenuEntity("ChipGroupSingleLineSample", "Chips examples"),
    )
}

fun getDetailsDialogs(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("AlertDialogSample", "Dialogs examples"),
        DetailsListMenuEntity("CustomAlertDialogSample", "Dialogs examples"),
    )
}

fun getDetailsLists(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("ClickableSample", "Lists examples"),
        DetailsListMenuEntity("OneLineListItems", "Lists examples"),
        DetailsListMenuEntity("TwoLineListItems", "Lists examples"),
        DetailsListMenuEntity("ThreeLineListItems", "Lists examples"),
        DetailsListMenuEntity("OneLineRtlLtrListItems", "Lists examples"),
        DetailsListMenuEntity("TwoLineRtlLtrListItems", "Lists examples"),
        DetailsListMenuEntity("ThreeLineRtlLtrListItems", "Lists examples"),
    )
}

fun getDetailsMenus(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("MenuSample", "Menus examples"),
        DetailsListMenuEntity("ExposedDropdownMenuSample", "Menus examples"),
    )
}

fun getDetailsNavigationDrawer(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("ModalDrawerSample", "Navigation drawer examples"),
        DetailsListMenuEntity("BottomDrawerSAMPLE", "Navigation drawer examples"),
    )
}

fun getDetailsProgressIndicators(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("LinearProgressIndicatorSample", "Porgress indicators examples"),
        DetailsListMenuEntity("CircularProgressIndicatorSample", "Porgress indicators examples"),
    )
}

fun getDetailsRadioButtons(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("RadioButtonSample", "Radio buttons examples"),
        DetailsListMenuEntity("RadioGroupSample", "Radio buttons examples"),
    )
}

fun getDetailsSheetsBottom(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("BottomSheetScaffoldSample", "Sheets: bottom examples"),
        DetailsListMenuEntity("ModalBottomSheetSample", "Sheets: bottom examples"),
    )
}

fun getDetailsSliders(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("SliderSample", "Sliders examples"),
        DetailsListMenuEntity("StepsSliderSample", "Sliders examples"),
        DetailsListMenuEntity("RangeSliderSample", "Sliders examples"),
        DetailsListMenuEntity("StepRangeSliderSample", "Sliders examples"),
    )
}

fun getDetailsSanckbars(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("ScaffoldWithSimpleSnackbar", "Snackbars examples"),
        DetailsListMenuEntity("ScaffoldWithCustomSnackbar", "Snackbars examples"),
        DetailsListMenuEntity("ScaffoldWithCoroutinesSnackbar", "Snackbars examples"),
    )
}

fun getDetailsSwitches(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("SwitchSample", "Switched examples"),
    )
}

fun getDetailsTabs(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("TextTabs", "Tabs examples"),
        DetailsListMenuEntity("IconTabs", "Tabs examples"),
        DetailsListMenuEntity("TextAndIconTabs", "Tabs examples"),
        DetailsListMenuEntity("LeadinIconTabs", "Tabs examples"),
        DetailsListMenuEntity("ScrollingTextTabs", "Tabs examples"),
        DetailsListMenuEntity("FancyTabs", "Tabs examples"),
        DetailsListMenuEntity("FancyIndicatorsTabs", "Tabs examples"),
        DetailsListMenuEntity("FancyIndicatorContainerTabs", "Tabs examples"),
        DetailsListMenuEntity("ScrollingFancyIndicatorContainerTabs", "Tabs examples"),
    )
}

fun getDetailsTextfields(): List<DetailsListMenuEntity> {
    return listOf(
        DetailsListMenuEntity("SimpleTextFieldsSample", "Text fields examples"),
        DetailsListMenuEntity("TextFieldsSample", "Text fields examples"),
        DetailsListMenuEntity("SimpleOutlinedTextFieldsSample", "Text fields examples"),
        DetailsListMenuEntity("OutlinedTextFieldsSample", "Text fields examples"),
        DetailsListMenuEntity("TextFieldWithIcons", "Text fields examples"),
        DetailsListMenuEntity("TextFieldsWithPlaceHolder", "Text fields examples"),
        DetailsListMenuEntity("TextFieldsWithErrorState", "Text fields examples"),
        DetailsListMenuEntity("TextFieldsWithHelperMessage", "Text fields examples"),
        DetailsListMenuEntity("PasswordTextFields", "Text fields examples"),
        DetailsListMenuEntity("TextFieldWithhideKeyboardOnImeAction", "Text fields examples"),
        DetailsListMenuEntity("TextArea", "Text fields examples"),
    )
}