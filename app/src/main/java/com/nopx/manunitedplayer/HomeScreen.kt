package com.nopx.manunitedplayer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nopx.manunitedplayer.component.HomeItem
import com.nopx.manunitedplayer.component.RowItem
import com.nopx.manunitedplayer.data.DataPlayer
import com.nopx.manunitedplayer.model.OldPlayer
import com.nopx.manunitedplayer.model.Player
import com.nopx.manunitedplayer.navigation.Screen1
import com.nopx.manunitedplayer.ui.theme.poppinsFamily

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    player: List<Player> = DataPlayer.currentPlayers,
    oldPlayer: List<OldPlayer> = DataPlayer.oldPlayers
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ) {
        item {
            Text(
                modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp),
                text = "Current Manchester United Players",
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Divider(
                color = Color(0xFFDA291C),
                thickness = 2.dp,
                modifier = modifier
                    .width(340.dp)
                    .padding(start = 16.dp)
            )
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(30.dp),
            ) {
                items(player, key = { it.id }) {
                    HomeItem(player = it) { playerId ->
                        navController.navigate(Screen1.Detail.route +"$playerId")
                    }
                }
            }
            Text(
                modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp),
                text = "Best Man Utd players of the 21st century",
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Divider(
                color = Color(0xFFDA291C),
                thickness = 2.dp,
                modifier = modifier
                    .width(380.dp)
                    .padding(start = 16.dp)
            )
        }
                items(oldPlayer, key = { it.id }) {
                    RowItem(
                        oldPlayer = it) { oldPlayerId ->
                        navController.navigate(Screen1.DetailOldPlayer.route + "$oldPlayerId")
                    }
                }
        }
    }

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = NavController(LocalContext.current))
}