package com.angel.whatsapp.presentation.splashscreen.homescreen


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.navigation.Routes
import com.angel.whatsapp.presentation.splashscreen.registration.best1

@Composable


fun HomeScreen(navController: NavHostController) {
    var textfield by remember { mutableStateOf("") }
    var dropdowns by remember { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusRequesterManager = LocalFocusManager.current
    val chatData = listOf(
        DataModel(
            image = R.drawable.salmankhan,
            name = stringResource(R.string.Salman),
            time = stringResource(R.string.timet),
            message = stringResource(R.string.hii)

        ),
        DataModel(
            image = R.drawable.rashmika,
            name = stringResource(R.string.rashmika),
            time = stringResource(R.string.timett),
            message =stringResource(R.string.hii)

        ),
        DataModel(
            image = R.drawable.ajay_devgn,
            name = stringResource(R.string.Ajay),
            time = stringResource(R.string.t4t),
            message =stringResource(R.string.hello)

        ),
        DataModel(
            image = R.drawable.akshay_kumar,
            name = stringResource(R.string.akshay_kumar),
            time = stringResource(R.string.timet),
            message = stringResource(R.string.hello)

        ),
        DataModel(
            image = R.drawable.bhuvan_bam,
            name = stringResource(R.string.Bhuvan),
            time = stringResource(R.string.t5t),
            message = stringResource(R.string.hii)

        ),
        DataModel(
            image = R.drawable.sharadhakapoor,
            name = stringResource(R.string.Sharadha),
            time = stringResource(R.string.timet),
            message = stringResource(R.string.hello)
        ), DataModel(
            image = R.drawable.mrbeast,
            name = stringResource(R.string.Mrbeast),
            time = stringResource(R.string.timett),
            message = stringResource(R.string.hii)

        ),
        DataModel(
            image = R.drawable.sharadhakapoor,
            name = stringResource(R.string.Sharadha),
            time = stringResource(R.string.t4t),
            message = stringResource(R.string.hii)

        ), DataModel(
            image = R.drawable.tripti_dimri,
            name = stringResource(R.string.Tripti),
            time = stringResource(R.string.timet),
            message =stringResource(R.string.hii)

        ), DataModel(
            image = R.drawable.tripti_dimri,
            name = stringResource(R.string.Tripti),
            time = stringResource(R.string.timett),
            message = stringResource(R.string.hello)

        ), DataModel(
            image = R.drawable.rashmika,
            name = stringResource(R.string.rashmika),
            time = stringResource(R.string.t5t),
            message = stringResource(R.string.hii)

        ),
        DataModel(
            image = R.drawable.ajay_devgn,
            name = stringResource(R.string.Ajay),
            time = stringResource(R.string.timet),
            message =stringResource(R.string.hii)

        ),
        DataModel(
            image = R.drawable.akshay_kumar,
            name = stringResource(R.string.akshay_kumar),
            time = stringResource(R.string.t5t),
            message = stringResource(R.string.hello)

        ),
        DataModel(
            image = R.drawable.bhuvan_bam,
            name = stringResource(R.string.Bhuvan),
            time = stringResource(R.string.timett),
            message = stringResource(R.string.hii)

        ),
        DataModel(
            image = R.drawable.rashmika,
            name = stringResource(R.string.rashmika),
            time = stringResource(R.string.t4t),
            message = stringResource(R.string.hii)

        ), DataModel(
            image = R.drawable.carryminati,
            name = stringResource(R.string.Carryminati),
            time = stringResource(R.string.timet),
            message = stringResource(R.string.hii)
        )
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
                    painter = painterResource(R.drawable.add_chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )


            }


        },

        bottomBar = {
            BottomNavigation(navController)
        }


    )
    {
        Column(modifier = Modifier.padding(it)) {
            Spacer(modifier = Modifier.height(8.dp))
            Box(modifier = Modifier.fillMaxWidth()) {

                Text(
                    text = stringResource(R.string.whatsapp),
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .align(Alignment.CenterStart),
                    fontSize = 24.sp,
                    color = colorResource(R.color.litegreen),
                    fontWeight = FontWeight.Bold, fontFamily = best1
                )

                Row(modifier = Modifier.align(Alignment.CenterEnd)) {

                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.qrcode),
                            contentDescription = null,
                            modifier = Modifier.size(21.dp)
                        )

                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(21.dp)
                        )

                    }
                    IconButton(onClick = { dropdowns = true }) {
                        Icon(
                            painter = painterResource(R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(21.dp)
                        )
                        DropdownMenu(
                            expanded = dropdowns,
                            onDismissRequest = { dropdowns = false },
                            modifier = Modifier.size(width = 170.dp, height = 350.dp)
                        ) {
                            DropdownMenuItem(
                                text = { Text(text = stringResource(R.string.newgroup)) },
                                onClick = { dropdowns = false }
                            )
                            DropdownMenuItem(
                                text = { Text(text = stringResource(R.string.newcommunity)) },
                                onClick = { dropdowns = false }
                            )
                            DropdownMenuItem(
                                text = { Text(text = stringResource(R.string.newbroadcast)) },
                                onClick = {
                                    dropdowns = false
                                }
                            )
                            DropdownMenuItem(
                                text = { Text(text = stringResource(R.string.linkeddevices)) },
                                onClick = { dropdowns = false }
                            )
                            DropdownMenuItem(
                                text = { Text(text = stringResource(R.string.stareed)) },
                                onClick = { dropdowns = false }
                            )
                            DropdownMenuItem(
                                text = { Text(text = stringResource(R.string.payments)) },
                                onClick = { dropdowns = false }
                            )
                            DropdownMenuItem(
                                text = { Text(text = stringResource(R.string.setting)) },
                                onClick = { navController.navigate(Routes.SettingScreenHome)}
                            )


                        }

                    }


                }

            }
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                value = textfield,
                onValueChange = { textfield = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(66.dp)
                    .padding(8.dp),
                singleLine = true,
                shape = CircleShape,
                placeholder = { Text(text = stringResource(R.string.askai), fontFamily = best1) },
                leadingIcon = {
                    Icon(
                        painter = painterResource(R.drawable.search),
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )

                },

                keyboardActions = KeyboardActions(
                    onDone = {
                        focusRequesterManager.clearFocus()
                        keyboardController?.hide()

                    }
                )

            )

            LazyColumn {

                items(chatData) {

                    ChatDesign(dataModel = it)
                }
            }

        }

    }
}
