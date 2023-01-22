package com.johndev.componentsjc.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = primary_light_color,
    primaryVariant = primary_color,
    secondary = secondary_light_color,
    secondaryVariant = secondary_color,
    background = background_dark_color,
    surface = surface_dark_color,
    onPrimary = primary_text_color,
    onSecondary = secondary_text_color,
    onBackground = on_background_dark_color,
    onSurface = on_surface_dark_color,
)

private val LightColorPalette = lightColors(
    primary = primary_color,
    primaryVariant = primary_dark_color,
    secondary = secondary_color,
    secondaryVariant = secondary_dark_color,
    background = background_light_color,
    surface = surface_light_color,
    onPrimary = primary_text_color,
    onSecondary = secondary_text_color,
    onBackground = on_background_light_color,
    onSurface = on_surface_light_color,
)

@Composable
fun ComponentsJCTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}