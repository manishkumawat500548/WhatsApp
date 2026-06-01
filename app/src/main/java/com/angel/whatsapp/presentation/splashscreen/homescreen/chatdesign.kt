package com.angel.whatsapp.presentation.splashscreen.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.registration.best1

@Composable

fun ChatDesign(
    dataModel: DataModel) {

    Row(modifier = Modifier.padding(start = 8.dp, top = 29.dp, bottom = 2.dp, end = 8.dp), verticalAlignment = Alignment.CenterVertically) {

        Image(
            painter = painterResource(dataModel.image),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(18.dp))

        Column {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {

                Text(dataModel.name, fontSize = 16.sp, fontWeight = FontWeight.Bold, fontFamily = best1)
                Text(dataModel.time, color = Color.Gray, fontFamily = best1, fontSize = 12.sp)
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(dataModel.message, fontSize = 12.sp, fontWeight = FontWeight.SemiBold, fontFamily = best1)
        }

    }

}