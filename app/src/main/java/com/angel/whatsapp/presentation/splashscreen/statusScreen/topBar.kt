package com.angel.whatsapp.presentation.splashscreen.statusScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun TopBar(navController: NavController) {

    var issearching by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    var dropdown by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxWidth()) {

        Column() {
            Spacer(modifier = Modifier.height(48.dp))

            Row() {

                if (issearching) {

                    TextField(
                        value = search, onValueChange = { search = it },
                        placeholder = {

                            Text(text = stringResource(R.string.search), fontFamily = best1)

                        },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        modifier = Modifier.padding(start = 12.dp), singleLine = true
                    )


                } else {

                    Text(
                        text = stringResource(R.string.update),
                        fontSize = 20.sp, fontFamily = best1,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 12.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                if (issearching) {

                    IconButton(onClick = {
                        issearching = false;
                        search = ""
                    }) {
                        Icon(
                            painter = painterResource(com.angel.whatsapp.R.drawable.cross),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)
                        )
                    }
                } else {


                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(com.angel.whatsapp.R.drawable.qrcode),
                            contentDescription = null,
                            modifier = Modifier
                                .size(21.dp)
                                .align(Alignment.CenterVertically)
                        )
                    }
                    IconButton(onClick = { issearching = true }) {
                        Icon(
                            painter = painterResource(com.angel.whatsapp.R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier
                                .size(21.dp)
                                .align(Alignment.CenterVertically)
                        )
                    }
                    IconButton(onClick = { dropdown = true }) {
                        Icon(
                            painter = painterResource(com.angel.whatsapp.R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier
                                .size(21.dp)
                                .align(Alignment.CenterVertically)
                        )
                        DropdownMenu(
                            expanded = dropdown,
                            onDismissRequest = { dropdown = false },
                            modifier = Modifier.size(width = 170.dp, height = 210.dp)
                        ) {

                            DropdownMenuItem(
                                text = { Text(text = stringResource(R.string.profile)) },
                                onClick = { dropdown = false })
                            DropdownMenuItem(
                                text = { Text(text = stringResource(R.string.creeatechannels)) },
                                onClick = { dropdown = false })
                            DropdownMenuItem(
                                text = { Text(text = stringResource(R.string.statusprivacy)) },
                                onClick = { dropdown = false })
                            DropdownMenuItem(
                                text = { Text(text = stringResource(R.string.setting)) },
                                onClick = { navController.navigate(Routes.SettingScreenStatus)})

                        }
                    }
                }

            }
            HorizontalDivider()
        }
    }

}

