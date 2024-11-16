package com.nopx.manunitedplayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
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
import com.nopx.manunitedplayer.ui.theme.poppinsFamily

@Composable
fun AboutScreen(){
    Column (
        modifier = Modifier
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "About",
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp)

        Divider(
            color = Color(0xFFDA291C),
            thickness = 2.dp,
            modifier = Modifier
                .width(80.dp)
        )

        Surface(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .padding(top = 16.dp, bottom = 12.dp)
                .width(230.dp)
                .height(260.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.nopal),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )
        }
        Text(
            text = "Name",
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = Color.Gray
        )
        Text(
            text = "Naufal Radithya",
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 26.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Email",
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = Color.Gray
        )
        Text(
            text = "radithya710@gmail.com",
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 26.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "College",
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = Color.Gray
        )
        Text(
            text = "Politeknik Negeri Batam",
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 26.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Majoring",
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = Color.Gray
        )
        Text(
            text = "Teknologi Rekayasa Perangkat Lunak",
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(100.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen()
}