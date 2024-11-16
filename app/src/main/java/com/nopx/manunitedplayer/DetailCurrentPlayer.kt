package com.nopx.manunitedplayer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nopx.manunitedplayer.data.DataPlayer
import com.nopx.manunitedplayer.model.Player
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.nopx.manunitedplayer.ui.theme.poppinsFamily

@Composable
fun DetailCurrentPlayer(
    modifier: Modifier = Modifier,
    navController: NavController,
    playerId: Int?
) {
    val detailCurrentPlayer = DataPlayer.currentPlayers.filter { player ->
        player.id == playerId
    }
    Column (
        modifier = modifier
    ){
        DetailContent(detailCurrentPlayer = detailCurrentPlayer)
    }
}
@Composable
fun DetailContent(
    detailCurrentPlayer: List<Player>,
    modifier: Modifier = Modifier
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = modifier
            .padding(16.dp)
    ){
        Surface(modifier = modifier
            .size(height = 180.dp, width = 130.dp),
            shape = RoundedCornerShape(10.dp),
            color = Color.Black
            ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(data = detailCurrentPlayer[0].photo)
                    .build(),
                contentScale = ContentScale.Crop,
                contentDescription = "Player"
            )}
            Spacer(modifier = Modifier
                .size(6.dp)
            )
            Column(modifier = Modifier
                .padding(4.dp)
            ) {
                Text(
                    text = detailCurrentPlayer[0].name,
                    fontSize = 25.sp,
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Bold
                )
                Row {
                    Text(
                        text = "Position : ",
                        fontSize = 13.sp,
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                    Text(
                        text = detailCurrentPlayer[0].position,
                        fontSize = 13.sp,
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Row {
                    Text(
                        text = "Date of Birth : ",
                        fontSize = 13.sp,
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                    Text(
                        text = detailCurrentPlayer[0].date,
                        fontSize = 13.sp,
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Row {
                    Text(
                        text = "Nationality : ",
                        fontSize = 13.sp,
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                    Text(
                        text = detailCurrentPlayer[0].nationality,
                        fontSize = 13.sp,
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
private fun DetailPlayerPrev() {
    DetailContent(detailCurrentPlayer = DataPlayer.currentPlayers)
}