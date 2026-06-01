package com.angel.whatsapp.presentation.splashscreen.statusScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.registration.best1


@Composable


fun MyStatus() {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Box {

            Image(
                painter = painterResource(R.drawable.bhuvan_bam),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Icon(
                painter = painterResource(R.drawable.baseline_add_24),
                contentDescription = null,
                modifier = Modifier
                    .align(
                        Alignment.BottomEnd
                    )

                    .background(
                        color = colorResource(R.color.litegreen),
                        shape = RoundedCornerShape(12.dp)
                    ),
                tint = Color.White
            )


        }
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = stringResource(R.string.mystatus),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                fontFamily = best1
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = stringResource(R.string.disappear),
                fontWeight = FontWeight.Bold,
                fontFamily = best1,
                color = Color.Gray, fontSize = 12.sp
            )
        }
    }

}

data class StatusData(val image: Int,val  name: String,val time: String)
@Composable

fun Statusitem(statusData: StatusData) {

    Row(modifier = Modifier.padding(horizontal = 12.dp,vertical = 8.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(statusData.image),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .padding(4.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(text = statusData.name, fontSize = 16.sp, fontFamily = best1, fontWeight = FontWeight.Bold)
            Text(text = statusData.time, fontSize = 12.sp, fontFamily = best1, color = Color.Gray)
        }
    }

}