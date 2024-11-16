package com.nopx.manunitedplayer.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nopx.manunitedplayer.R
import com.nopx.manunitedplayer.model.OldPlayer
import com.nopx.manunitedplayer.ui.theme.ManUnitedPlayerTheme

@Composable
fun RowItem(
    oldPlayer: OldPlayer,
    modifier: Modifier = Modifier,
    onItemClick: (Int) -> Unit
){
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = modifier
            .clickable { onItemClick(oldPlayer.id) }
    ) {
        Surface(
            shape = RoundedCornerShape(16.dp),
            modifier = modifier
                .padding(start = 16.dp)
                .width(360.dp)
                .height(150.dp)
        ) {
            Image(
                painter = painterResource(id = oldPlayer.photo),
                contentDescription = oldPlayer.name,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RowItemPreview() {
    ManUnitedPlayerTheme {
        RowItem(
            oldPlayer = OldPlayer(1, "Wayne Rooney", "2004", "Centre-Forward", R.drawable.rooney),
            onItemClick = { playerId ->
                println("Player Id: $playerId")
            })
    }
}