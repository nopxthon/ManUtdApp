package com.nopx.manunitedplayer.model

data class  Player(
    val id: Int,
    val name: String,
    val position: String,
    val date: String,
    val nationality: String,
    val photo: Int,
)

data class OldPlayer(
    val id: Int,
    val name: String,
    val joined: String,
    val position: String,
    val photo: Int,
)
