package com.angel.whatsapp.presentation.splashscreen.communitiescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.angel.whatsapp.presentation.splashscreen.homescreen.BottomNavigation

@Composable

fun CommunitieScreen(navController: NavHostController) {

    Scaffold(
        bottomBar = {
            BottomNavigation(navController)
        },
        topBar = {
            CTopBar(navController)
        }

    )
    {

        Column (modifier = Modifier.padding(it)){

            CommunitieItem()
        }
    }

}