package com.nopx.manunitedplayer.data

import com.nopx.manunitedplayer.R
import com.nopx.manunitedplayer.model.Gallery
import com.nopx.manunitedplayer.model.OldPlayer
import com.nopx.manunitedplayer.model.Player

object DataPlayer {
    val currentPlayers = listOf(
        Player(
            id = 1,
            name = "Rasmus Hojlund",
            position = "Centre-Forward",
            date = "4 February 2003",
            nationality = "Denmark",
            photo = R.drawable.hojlund,
        ),
        Player(
            id = 2,
            name = "Alejandro Garnacho",
            position = "Left-Winger",
            date = "1 July 2004",
            nationality = "Argentina",
            photo = R.drawable.garnacho,
        ),
        Player(
            id = 3,
            name = "Bruno Fernandes",
            position = "Attacking-Midfield",
            date = "8 September 1994",
            nationality = "Portugal",
            photo = R.drawable.bruno,
        ),
        Player(
            id = 4,
            name = "Antony",
            position = "Right-Winger",
            date = "24 February 2000",
            nationality = "Brazil",
            photo = R.drawable.antony,
        ),
        Player(
            id = 5,
            name = "Marcus Rashford",
            position = "Left-Winger",
            date = "31 October 1997",
            nationality = "England",
            photo = R.drawable.rashford,
        ),
        Player(
            id = 6,
            name = "Casemiro",
            position = "Defensive-Midfield",
            date = "23 February 1992",
            nationality = "Brazil",
            photo = R.drawable.casemiro,
        ),
        Player(
            id = 7,
            name = "Amad Diallo",
            position = "Righ-Winger",
            date = "11 July 2002",
            nationality = "Ivory Coast",
            photo = R.drawable.dialo,
        ),
        Player(
            id = 8,
            name = "Diogo Dalot",
            position = "Right-Back",
            date = "18 March 1999",
            nationality = "Portugal",
            photo = R.drawable.dalot,
        ),
        Player(
            id = 9,
            name = "Harry Maguire",
            position = "Centre-Back",
            date = "5 March 1993",
            nationality = "England",
            photo = R.drawable.maguire,
        ),
        Player(
            id = 10,
            name = "Andre Onana",
            position = "Goalkeeper",
            date = "2 April 1996",
            nationality = "Cameroon",
            photo = R.drawable.onana,
        ),
    )

    val oldPlayers = listOf(
        OldPlayer(
            id = 1,
            name = "Cristiano Ronaldo",
            joined = "2003, 2021",
            position = "Centre-Forward",
            photo = R.drawable.ronaldo,
        ),
        OldPlayer(
            id = 2,
            name = "Wayne Rooney",
            joined = "2004",
            position = "Centre-Forward",
            photo = R.drawable.rooney,
        ),
        OldPlayer(
            id = 3,
            name = "Ruud Van Nistelrooy",
            joined = "2001",
            position = "Centre-Forward",
            photo = R.drawable.nistelroy,
        ),
        OldPlayer(
            id = 4,
            name = "David Beckham",
            joined = "1993",
            position = "Centre-Midfield",
            photo = R.drawable.david,
        ),
        OldPlayer(
            id = 5,
            name = "David De Gea",
            joined = "2011",
            position = "Goalkeeper",
            photo = R.drawable.degea,
        ),
        OldPlayer(
            id = 6,
            name = "Park Ji-Sung",
            joined = "2005",
            position = "Attacking-Midfield",
            photo = R.drawable.jisung,
        ),
        OldPlayer(
            id = 7,
            name = "Paul Scholes",
            joined = "1993, 2012",
            position = "Centre-Midfield",
            photo = R.drawable.paul,
        ),
        OldPlayer(
            id = 8,
            name = "Rio Ferdinand",
            joined = "2002",
            position = "Centre-Back",
            photo = R.drawable.rio,
        ),
        OldPlayer(
            id = 9,
            name = "Ryan Gigs",
            joined = "1990",
            position = "Left-Midfield",
            photo = R.drawable.ryan,
        ),
        OldPlayer(
            id = 10,
            name = "Robin Van Persie",
            joined = "2012",
            position = "Centre-Forward",
            photo = R.drawable.vanpersie,
        ),

    )

    val manUtdGallery = listOf(
        Gallery(
            id = 1,
            photo = R.drawable.satu,
        ),
        Gallery(
            id = 2,
            photo = R.drawable.dua,
        ),
        Gallery(
            id = 3,
            photo = R.drawable.tiga,
        ),
        Gallery(
            id = 4,
            photo = R.drawable.empt,
        ),
        Gallery(
            id = 5,
            photo = R.drawable.lima,
        ),
        Gallery(
            id = 6,
            photo = R.drawable.enam,
        ),
        Gallery(
            id = 7,
            photo = R.drawable.tujuh,
        ),
        Gallery(
            id = 8,
            photo = R.drawable.delpn,
        ),
        Gallery(
            id = 9,
            photo = R.drawable.sembln,
        ),
        Gallery(
            id = 10,
            photo = R.drawable.spuluh,
        ),
        Gallery(
            id = 11,
            photo = R.drawable.sblas,
        ),
    )
}