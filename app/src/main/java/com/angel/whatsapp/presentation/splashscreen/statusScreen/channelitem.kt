package com.angel.whatsapp.presentation.splashscreen.statusScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.registration.best1

@Composable

fun ChannelItem(channels: Channels) {
    var isFollowing by remember { mutableStateOf(false) }


    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp, vertical = 8.dp)) {

        Image(
            painter = painterResource(channels.image),
            contentDescription = null,
            modifier = Modifier.size(50.dp).clip(shape = CircleShape), contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column (modifier = Modifier.align(Alignment.CenterVertically)){
            Text(
                text = channels.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = best1
            )
            Text(
                text = channels.des,
                fontSize = 12.sp, color = Color.Gray,
                fontWeight = FontWeight.Bold,
                fontFamily = best1
            )
        }
        Spacer(modifier = Modifier.weight(1f))

        Button(onClick = { isFollowing = ! isFollowing}, colors = ButtonDefaults.buttonColors(
            containerColor = if (isFollowing){
                Color.LightGray
            }
            else{
                colorResource(R.color.litegreen)
            }
        ), modifier = Modifier.padding(8.dp).height(36.dp).align(Alignment.CenterVertically)) {

            Text(text = if (isFollowing){"Following"}else{"Follow"}, fontFamily = best1, color = if (isFollowing){Color.Black}else{
                Color.White})


        }


    }

}
data class Channels(var image: Int,var name: String,var des: String)