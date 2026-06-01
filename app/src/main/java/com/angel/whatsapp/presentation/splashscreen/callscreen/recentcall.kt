package com.angel.whatsapp.presentation.splashscreen.callscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.registration.best1


@Composable


fun RecentCall(recentcalldata: Recentcalldata) {
    val ismissed by remember { mutableStateOf(true) }

    Row(modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)) {
        Image(
            painter = painterResource(recentcalldata.image),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text(text =recentcalldata.name, fontFamily = best1, fontSize = 15.sp)

            Spacer(modifier = Modifier.width(4.dp))

            Row {
                Icon(
                    painter = painterResource(R.drawable.baseline_call_missed_24),
                    contentDescription = null,
                    modifier = Modifier.size(16.dp), tint = if (recentcalldata.ismissed) Color.Red else {
                        colorResource(R.color.litegreen)
                    }
                )
                Spacer(modifier = Modifier.width(4.dp))

                Text(text = recentcalldata.time, fontFamily = best1, fontSize = 12.sp)
            }
        }
        Spacer(modifier = Modifier.weight(1f))

        Icon(
            painter = painterResource(R.drawable.telephone),
            contentDescription = null,
            modifier = Modifier.size(21.dp).align(Alignment.CenterVertically)
        )
    }

}
data class Recentcalldata (val image: Int,val name: String,val ismissed: Boolean,val time: String)