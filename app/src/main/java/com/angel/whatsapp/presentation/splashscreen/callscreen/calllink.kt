package com.angel.whatsapp.presentation.splashscreen.callscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.geometry.Size
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
@Preview(showBackground = true, showSystemUi = true)
fun CallLink() {

    Row (modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)){
        Image(
            painter = painterResource(R.drawable.outline_link_24),
            contentDescription = null,
            modifier = Modifier.size(50.dp)
                .background(
                    color = colorResource(R.color.litegreen), shape = CircleShape
                ),contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text(text = stringResource(R.string.createcalllink), fontSize = 16.sp, fontFamily = best1)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = stringResource(R.string.sharelinkcall), fontSize = 12.sp, color = Color.Gray)
        }
    }

}