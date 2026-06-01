package com.angel.whatsapp.presentation.splashscreen.settingScreenCall


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.registration.best1

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun SettingProfile() {

    Column {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 8.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.bhuvan_bam),
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.align(Alignment.CenterVertically)) {
                Text(
                    text = stringResource(R.string.manish),
                    fontFamily = best1,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = stringResource(R.string.desciptionsetting),
                    color = Color.Gray,
                    fontFamily = best1,
                    fontSize = 12.sp
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Icon(
                painter = painterResource(R.drawable.qrcode),
                contentDescription = null,
                modifier = Modifier
                    .size(18.dp)
                    .align(Alignment.CenterVertically), tint = colorResource(R.color.litegreen)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                painter = painterResource(R.drawable.baseline_add_24),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .background(
                        color = colorResource(R.color.litegreen),
                        shape = RoundedCornerShape(12.dp)
                    ), tint = Color.White
            )
        }

        HorizontalDivider()
    }

}