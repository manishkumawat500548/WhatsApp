package com.angel.whatsapp.presentation.splashscreen.homescreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.navigation.Routes
import com.angel.whatsapp.presentation.splashscreen.registration.best1

@Composable
//@Preview(showBackground = true, showSystemUi = true)
fun BottomNavigation(navController: NavController) {

    BottomAppBar(tonalElevation = 12.dp, containerColor = Color.Transparent) {


        Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){

            Column(modifier = Modifier.padding(horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally) {

                Icon(
                    painter = painterResource(R.drawable.chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp).clickable{navController.navigate(Routes.HomeScreen)}


                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = stringResource(R.string.chats), fontWeight = FontWeight.Bold, fontFamily = best1, fontSize = 12.sp)

            }
            Column(modifier = Modifier.padding(horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally) {

                Icon(
                    painter = painterResource(R.drawable.update_icon),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp).clickable{navController.navigate(Routes.UpdateScreen)}
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = stringResource(R.string.updates), fontWeight = FontWeight.Bold, fontFamily = best1, fontSize = 12.sp)

            }
            Column(modifier = Modifier.padding(horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally) {

                Icon(
                    painter = painterResource(R.drawable.communities_icon),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp).clickable{navController.navigate(Routes.CommunitiesScreen)}
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = stringResource(R.string.communitues), fontWeight = FontWeight.Bold, fontFamily = best1, fontSize = 12.sp
                )

            }
            Column(modifier = Modifier.padding(horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally) {

                Icon(
                    painter = painterResource(R.drawable.add_call),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp).clickable{navController.navigate(Routes.CallScreen)}
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = stringResource(R.string.calls), fontWeight = FontWeight.Bold, fontFamily = best1, fontSize = 12.sp
                )

            }
        }


    }


}