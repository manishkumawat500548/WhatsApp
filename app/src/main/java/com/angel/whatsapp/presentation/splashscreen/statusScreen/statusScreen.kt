package com.angel.whatsapp.presentation.splashscreen.statusScreen


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.homescreen.BottomNavigation
import com.angel.whatsapp.presentation.splashscreen.registration.best1


@Composable

fun StatusScreen(navController: NavHostController) {
    val scrollstate = rememberScrollState()
    val data = listOf(
        StatusData(
            image = R.drawable.rashmika,
            name = stringResource(R.string.rashmika),
            time = stringResource(R.string.just)
        ),
        StatusData(
            image = R.drawable.bhuvan_bam,
            name = stringResource(R.string.Bhuvan),
            time = stringResource(R.string.yesterday)
        ),
        StatusData(
            image = R.drawable.mrbeast,
            name = stringResource(R.string.Mrbeast),
            time = stringResource(R.string.time)
        ),
        StatusData(
            image = R.drawable.tripti_dimri,
            name = stringResource(R.string.Tripti),
            time = stringResource(R.string.timet)
        ),
        StatusData(
            image = R.drawable.akshay_kumar,
            name = stringResource(R.string.akshay_kumar),
            time = stringResource(R.string.timett)
        ),
        StatusData(
            image = R.drawable.sharadhakapoor,
            name = stringResource(R.string.Sharadha),
            time = stringResource(R.string.t4t)
        ),
        StatusData(
            image = R.drawable.salmankhan,
            name = stringResource(R.string.Salman),
            time = stringResource(R.string.t5t)
        ),
        StatusData(
            image = R.drawable.disha_patani,
            name = stringResource(R.string.Disha),
            time = stringResource(R.string.yesterday)
        ),
        StatusData(
            image = R.drawable.carryminati,
            name = stringResource(R.string.Carryminati),
            time = stringResource(R.string.timett)

        ),
        StatusData(
            image = R.drawable.bhuvan_bam,
            name = stringResource(R.string.Bhuvan),
            time = stringResource(R.string.yesterday)
        ),
        StatusData(
            image = R.drawable.mrbeast,
            name = stringResource(R.string.Mrbeast),
            time = stringResource(R.string.time)
        ),
        StatusData(
            image = R.drawable.tripti_dimri,
            name = stringResource(R.string.Tripti),
            time = stringResource(R.string.timet)
        ),
        StatusData(
            image = R.drawable.akshay_kumar,
            name = stringResource(R.string.akshay_kumar),
            time = stringResource(R.string.timett)
        ),
        StatusData(
            image = R.drawable.sharadhakapoor,
            name = stringResource(R.string.Sharadha),
            time = stringResource(R.string.t4t)
        ),
        StatusData(
            image = R.drawable.salmankhan,
            name = stringResource(R.string.Salman),
            time = stringResource(R.string.t5t)
        ),
        StatusData(
            image = R.drawable.disha_patani,
            name = stringResource(R.string.Disha),
            time = stringResource(R.string.yesterday)
        ),
        StatusData(
            image = R.drawable.carryminati,
            name = stringResource(R.string.Carryminati),
            time = stringResource(R.string.timett)
        )


    )
    val channeldata = listOf(
        Channels(
            image = R.drawable.img,
            name = stringResource(R.string.food),
            des = stringResource(R.string.MFollowing)
        ),
        Channels(
            image = R.drawable.rashmika,
            name = stringResource(R.string.rashmika),
            des = stringResource(R.string.m1following)
        ),
        Channels(
            image = R.drawable.mrbeast,
            name = stringResource(R.string.Mrbeast),
            des = stringResource(R.string.m2following)
        ),
        Channels(
            image = R.drawable.carryminati,
            name = stringResource(R.string.Carryminati),
            des = stringResource(R.string.m3following)
        ),
        Channels(
            image = R.drawable.tripti_dimri,
            name = stringResource(R.string.Tripti),
            des = stringResource(R.string.m4following)
        ),
        Channels(
            image = R.drawable.disha_patani,
            name = stringResource(R.string.Disha),
            des = stringResource(R.string.m3following)
        ),


        )
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.litegreen),
                modifier = Modifier.size(55.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(R.drawable.camera),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )


            }
        },
        bottomBar = {
            BottomNavigation(navController)
        },

        topBar = {
            TopBar(navController)
        }

    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(scrollstate)
        ) {


            Text(
                text = stringResource(R.string.status),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = best1,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )
            MyStatus()
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = stringResource(R.string.recentupdates),
                fontFamily = best1, fontSize = 12.sp,
                modifier = Modifier.padding(start = 12.dp)
            )


            data.forEach {
                Statusitem(statusData = it)
            }
            Spacer(modifier = Modifier.height(4.dp))
            HorizontalDivider(color = Color.Green)


            Text(
                text = stringResource(R.string.channels), fontFamily = best1,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            Text(
                text = stringResource(R.string.stayupdate),
                fontSize = 12.sp, fontFamily = best1,
                fontWeight = FontWeight.Bold, color = Color.Gray,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            Text(
                text = stringResource(R.string.findchannels),
                fontSize = 12.sp, color = Color.Gray,
                fontWeight = FontWeight.Bold, fontFamily = best1,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 16.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            channeldata.forEach {
                ChannelItem(channels = it)
            }

        }


    }
}

