package com.angel.whatsapp.presentation.splashscreen.callscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable

fun FavouriteScreen(favourite: Favourite) {

    Column (modifier = Modifier.padding(horizontal = 12.dp, vertical = 12.dp)){
        Image(
            painter = painterResource(favourite.image),
            contentDescription = null,
            modifier = Modifier.size(50.dp).clip(shape = CircleShape).align(Alignment.CenterHorizontally), contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = favourite.name)



    }



}
data class Favourite(val image: Int,val name: String)