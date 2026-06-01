package com.angel.whatsapp.presentation.splashscreen.callscreen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
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

fun CallScreen(navController: NavHostController) {
    val scrollstate = rememberScrollState()
    val favouritedata = listOf(

        Favourite(
            image = R.drawable.akshay_kumar, name = stringResource(R.string.akshay_kumar)
        ),
        Favourite(
            image = R.drawable.rashmika, name = stringResource(R.string.rashmika)
        ),
        Favourite(
            image = R.drawable.tripti_dimri, name = stringResource(R.string.Tripti)
        ),
        Favourite(
            image = R.drawable.disha_patani, name = stringResource(R.string.Disha)
        ),
        Favourite(
            image = R.drawable.mrbeast, name = stringResource(R.string.Mrbeast)
        ),
        Favourite(
            image = R.drawable.bhuvan_bam, name = stringResource(R.string.Bhuvan)
        ),
        Favourite(
            image = R.drawable.carryminati, name = stringResource(R.string.Carryminati)
        ),
        Favourite(
            image = R.drawable.sharadhakapoor, name = stringResource(R.string.Sharadha)
        ),


        )

    val calldata = listOf(
        Recentcalldata(
            image = R.drawable.mrbeast,
            name = stringResource(R.string.Mrbeast),
            ismissed = true,
            time = stringResource(R.string.timecall1)
        ),
        Recentcalldata(
            image = R.drawable.rashmika,
            name = stringResource(R.string.rashmika),
            ismissed = false,
            time = stringResource(R.string.timecall2)
        ),
        Recentcalldata(
            image = R.drawable.akshay_kumar,
            name = stringResource(R.string.akshay_kumar),
            ismissed = true,
            time = stringResource(R.string.timecall3)
        ),
        Recentcalldata(
            image = R.drawable.sharadhakapoor,
            name = stringResource(R.string.Sharadha),
            ismissed = false,
            time = stringResource(R.string.timecall4)
        ),
        Recentcalldata(
            image = R.drawable.carryminati,
            name = stringResource(R.string.Carryminati),
            ismissed = false,
            time = stringResource(R.string.timecall1)
        ),
        Recentcalldata(
            image = R.drawable.tripti_dimri,
            name = stringResource(R.string.Tripti),
            ismissed = true,
            time = stringResource(R.string.timecall4)
        ),
        Recentcalldata(
            image = R.drawable.disha_patani,
            name = stringResource(R.string.Disha),
            ismissed = false,
            time = stringResource(R.string.timecall3)
        ),
        Recentcalldata(
            image = R.drawable.bhuvan_bam,
            name = stringResource(R.string.Bhuvan),
            ismissed = false,
            time = stringResource(R.string.timecall2)
        ),
        Recentcalldata(
            image = R.drawable.akshay_kumar,
            name = stringResource(R.string.akshay_kumar),
            ismissed = false,
            time = stringResource(R.string.timecall1)
        ),
        Recentcalldata(
            image = R.drawable.mrbeast,
            name = stringResource(R.string.Mrbeast),
            ismissed = true,
            time = stringResource(R.string.timecall3)
        ),
        Recentcalldata(
            image = R.drawable.sharadhakapoor,
            name = stringResource(R.string.Sharadha),
            ismissed = false,
            time = stringResource(R.string.timecall4)
        ),
        Recentcalldata(
            image = R.drawable.salmankhan,
            name = stringResource(R.string.Salman),
            ismissed = false,
            time = stringResource(R.string.timecall2)
        ),


        )

    Scaffold(


        topBar = {
            TopBarCall(navController)
        },
        bottomBar = {
            BottomNavigation(navController)
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.litegreen),
                modifier = Modifier.size(55.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(R.drawable.add_call),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )

            }
        }
    ) {
        Column(modifier = Modifier.padding(it)) {

            Text(
                text = stringResource(R.string.favourite),
                fontFamily = best1,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(scrollstate)
            ) {
                favouritedata.forEach {
                    FavouriteScreen(favourite = it)
                }


            }
            HorizontalDivider()
            CallLink()
            Text(
                text = stringResource(R.string.recentcall),
                fontFamily = best1,
                fontSize = 15.sp,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp), color = Color.Gray
            )


            LazyColumn {
                items(calldata) { data ->
                    RecentCall(data)
                }

            }
        }
    }

}



