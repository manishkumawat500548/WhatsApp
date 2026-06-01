package com.angel.whatsapp.presentation.splashscreen.communitiescreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.registration.best1

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun CommunitieItem() {

    Row(modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)) {
        Box {
            Image(
                painter = painterResource(R.drawable.rashmika),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = RoundedCornerShape(12.dp)), contentScale = ContentScale.Crop
            )
            Icon(
                painter = painterResource(R.drawable.baseline_add_24),
                contentDescription = null,
                modifier = Modifier
                    .align(
                        Alignment.BottomEnd
                    )
                    .background(
                        colorResource(R.color.litegreen),
                        shape = RoundedCornerShape(12.dp)
                    ), tint = Color.White
            )

        }
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = "New Community",
            fontFamily = best1,
            fontWeight = FontWeight.Bold, fontSize = 14.sp,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }

}