package com.nopx.manunitedplayer.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nopx.manunitedplayer.R
import com.nopx.manunitedplayer.model.Player
import com.nopx.manunitedplayer.ui.theme.ManUnitedPlayerTheme
import com.nopx.manunitedplayer.ui.theme.poppinsFamily

@Composable
fun HomeItem(
    player: Player,
    modifier: Modifier = Modifier,
    onItemClick: (Int) -> Unit
) {
    Column(
        horizontalAlignment =Alignment.CenterHorizontally,
        modifier = modifier
            .clickable { onItemClick(player.id) }
    ) {
        Surface(
            shape = RoundedCornerShape(6.dp),
            color = Color.Black,
            modifier = Modifier
                .padding(bottom = 4.dp)
                .width(130.dp)
                .height(180.dp),
            shadowElevation = 10.dp
        ) {
            Image(
                painter = painterResource(id = player.photo),
                contentDescription = player.name,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .fillMaxSize()
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(top = 8.dp)
        ) {
            Text(
                text = player.name,
                fontSize = 14.sp,
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = player.position,
                fontSize = 10.sp,
                color = Color.Gray,
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeItemPreview() {
    ManUnitedPlayerTheme {
        HomeItem(
            player = Player(1, "Rasmus Hojlund", "Centre-Forward", "4 February 2003", "Denmark", R.drawable.hojlund),
            onItemClick = {playerId ->
                println("Player Id: $playerId")
            }
            )
    }
}