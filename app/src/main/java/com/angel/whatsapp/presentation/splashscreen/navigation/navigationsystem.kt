package com.angel.whatsapp.presentation.splashscreen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.angel.whatsapp.presentation.splashscreen.settingScreenCall.SettingScreenCall
import com.angel.whatsapp.presentation.splashscreen.SplashScreen
import com.angel.whatsapp.presentation.splashscreen.callscreen.CallScreen
import com.angel.whatsapp.presentation.splashscreen.communitiescreen.CommunitieScreen
import com.angel.whatsapp.presentation.splashscreen.homescreen.HomeScreen
import com.angel.whatsapp.presentation.splashscreen.registration.RegistrationScreen
import com.angel.whatsapp.presentation.splashscreen.settingScreenCommunitie.SettingScreenCommunities
import com.angel.whatsapp.presentation.splashscreen.settingScreenHome.SettingScreenHome
import com.angel.whatsapp.presentation.splashscreen.settingScreenStatus.SettingScreenStatus
import com.angel.whatsapp.presentation.splashscreen.statusScreen.StatusScreen
import com.angel.whatsapp.presentation.splashscreen.welcomescreen.WelcomeScreen

@Composable
fun NavigationSystem() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.SplashScreen) {
        composable<Routes.SplashScreen> {
            SplashScreen(navController)
        }
        composable<Routes.WelcomeScreen> {
            WelcomeScreen(navController)
        }
        composable<Routes.RegistrationScreen> {
            RegistrationScreen(navController)
        }
        composable<Routes.HomeScreen> {
            HomeScreen(navController)

        }
        composable<Routes.UpdateScreen> {
            StatusScreen(navController)

        }
        composable<Routes.CommunitiesScreen> {
            CommunitieScreen(navController)


        }
        composable<Routes.CallScreen> {
            CallScreen(navController)

        }

        composable<Routes.SettingScreenHome> {
            SettingScreenHome(navController)

        }

        composable<Routes.SettingScreenStatus> {
            SettingScreenStatus(navController)

        }
        composable<Routes.SettingScreenCommunities> {
            SettingScreenCommunities(navController)

        }
        composable<Routes.SettingScreenCall> {
            SettingScreenCall(navController)

        }




    }

}