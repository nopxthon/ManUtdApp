package com.nopx.manunitedplayer.navigation

sealed class Screen1(val route: String) {
    data object Home : Screen1("home")
    data object Gallery : Screen1("gallery")
    data object About : Screen1("about")
    data object Detail : Screen1("detail")
    data object DetailOldPlayer: Screen1("detailOldPlayer")
}