package com.angel.whatsapp.presentation.splashscreen.settingScreenCall

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.navigation.Routes
import com.angel.whatsapp.presentation.splashscreen.registration.best1

@Composable

fun TopSetting(navController: NavController) {
    Column {
        Spacer(modifier = Modifier.height(48.dp))

        Row(
            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 8.dp)
                .align(Alignment.CenterHorizontally)
        ) {

            Icon(
                painter = painterResource(R.drawable.baseline_arrow_back_24),
                contentDescription = null,modifier = Modifier.size(24.dp).clickable{

                    navController.navigate(Routes.CallScreen)
                }
            )
            Spacer(modifier = Modifier.width(25.dp))

            Text(
                text = stringResource(R.string.settingsett),
                fontFamily = best1,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.weight(1f))

            Icon(painter = painterResource(R.drawable.search), contentDescription = null, modifier = Modifier.size(21.dp))
        }
        HorizontalDivider()
    }

}