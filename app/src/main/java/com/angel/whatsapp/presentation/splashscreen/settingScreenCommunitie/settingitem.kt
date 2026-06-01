package com.angel.whatsapp.presentation.splashscreen.settingScreenCommunitie

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angel.whatsapp.presentation.splashscreen.registration.best1

@Composable

fun SettingItem(settingllistitem: Settingllistitem) {

    Row(modifier = Modifier.padding(horizontal = 12.dp, vertical = 14.dp)) {
        Image(
            painter = painterResource(settingllistitem.icon),
            contentDescription = null,
            modifier = Modifier
                .size(26.dp)
                .clip(shape = CircleShape), colorFilter = ColorFilter.tint(Color.Gray),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text(text = settingllistitem.name, fontFamily = best1, fontSize = 16.sp)

            Text(
                text = settingllistitem.description,
                fontFamily = best1,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }

}

data class Settingllistitem(var icon: Int, var name: String, var description: String)