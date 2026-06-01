package com.angel.whatsapp.presentation.splashscreen.settingScreenCall


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.angel.whatsapp.R

@Composable

fun SettingScreenCall(navController: NavHostController) {
    val scroll  = rememberScrollState()
    val settingitemlist = listOf(
        Settingllistitem(
            icon = R.drawable.outline_key_24,
            name = stringResource(R.string.account),
            description = stringResource(R.string.security)
        ),
        Settingllistitem(
            icon = R.drawable.outline_lock_24,
            name = stringResource(R.string.privacy),
            description = stringResource(R.string.block)
        ),
        Settingllistitem(
            icon = R.drawable.man,
            name = stringResource(R.string.avatar),
            description = stringResource(R.string.create)
        ),
        Settingllistitem(
            icon = R.drawable.outline_chat_24,
            name = stringResource(R.string.chats),
            description = stringResource(R.string.theme)
        ),
        Settingllistitem(
            icon = R.drawable.baseline_notifications_none_24,
            name = stringResource(R.string.notification),
            description = stringResource(R.string.message)
        ),
        Settingllistitem(
            icon = R.drawable.baseline_data_usage_24,
            name = stringResource(R.string.storage),
            description = stringResource(R.string.network)
        ),
        Settingllistitem(
            icon = R.drawable.accessibility,
            name = stringResource(R.string.accessibilit),
            description = stringResource(R.string.animation)
        ),
        Settingllistitem(
            icon = R.drawable.internet,
            name = stringResource(R.string.applanguage),
            description = stringResource(R.string.english)
        ),
        Settingllistitem(
            icon = R.drawable.baseline_help_outline_24,
            name = stringResource(R.string.help),
            description = stringResource(R.string.helpcenter)
        ),
        Settingllistitem(
            icon = R.drawable.outline_people_24,
            name = stringResource(R.string.invite),
            description = ""
        ),
    )

    Scaffold(

        topBar = {

            TopSetting(navController)

        }
    ) {

        Column(modifier = Modifier.padding(it).fillMaxSize().verticalScroll(scroll)) {

            SettingProfile()

            settingitemlist.forEach {
                SettingItem(settingllistitem = it)
            }

        }
    }

}