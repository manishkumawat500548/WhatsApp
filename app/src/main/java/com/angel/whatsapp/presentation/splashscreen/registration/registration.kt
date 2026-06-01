package com.angel.whatsapp.presentation.splashscreen.registration


import android.app.Activity
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.navigation.Routes
import com.angel.whatsapp.presentation.splashscreen.viewmodel.AuthState
import com.angel.whatsapp.presentation.splashscreen.viewmodel.PhoneAuth


val best1 = FontFamily(Font(R.font.roboro))

@Composable

fun RegistrationScreen(navController: NavController, phoneAuth: PhoneAuth = hiltViewModel()) {
    val authState by phoneAuth.authState.collectAsState()
    val context = LocalContext.current
    val activity = LocalActivity.current as Activity

    var expend by remember { mutableStateOf(false) }
    var selectCountry by remember { mutableStateOf("India") }
    var countryCode by remember { mutableStateOf("+91") }
    var phoneNo by remember { mutableStateOf("") }
    var otp by remember { mutableStateOf("") }
    var verificationId: String? by remember { mutableStateOf(null) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(160.dp))
        Text(
            text = stringResource(R.string.enteryourphoneno),
            fontWeight = FontWeight.Bold, fontSize = 20.sp,
            color = colorResource(id = R.color.darkgreen), fontFamily = best1
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = stringResource(R.string.verifyno),
            fontWeight = FontWeight.Bold,
            color = Color.Black, fontFamily = best1, fontSize = 13.sp
        )


        Text(
            text = "What's is my Phone number?",
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.litegreen),
            fontFamily = best1,

            )

        Spacer(modifier = Modifier.height(20.dp))
        TextButton(onClick = { expend = true }) {
            Box(modifier = Modifier.width(230.dp)) {
                Text(
                    text = selectCountry, modifier = Modifier, fontFamily = best1,
                    fontSize = 16.sp, color = Color.Black
                )

                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    modifier = Modifier.align(Alignment.CenterEnd),
                    tint = colorResource(R.color.litegreen)
                )
            }

        }
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 66.dp), thickness = 1.dp,
            color = colorResource(R.color.litegreen)
        )


        DropdownMenu(
            expanded = expend, onDismissRequest = { expend = false }, modifier = Modifier.align(
                Alignment.CenterHorizontally
            )
        ) {
            listOf(
                "India",
                "Argentina",
                "Japan",
                "Brazil",
                "Canada",
                "Germany",
                "France",
                "America"
            ).forEach { country ->
                DropdownMenuItem(text = { Text(text = country) }, onClick = {
                    selectCountry = country
                    expend = false

                })
            }
        }

        when (authState) {
            is AuthState.Ideal, is AuthState.Loading, is AuthState.CodeSend -> {
                if (authState is AuthState.CodeSend) {
                    verificationId = (authState as AuthState.CodeSend).verificationId
                }

                if (verificationId == null) {
                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        TextField(
                            value = countryCode,
                            onValueChange = { countryCode = it },
                            modifier = Modifier.width(70.dp),
                            singleLine = true,
                            colors = TextFieldDefaults.colors(

                                unfocusedIndicatorColor = colorResource(R.color.litegreen),
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent,
                                focusedIndicatorColor = colorResource(R.color.litegreen)
                            )

                        )


                        Spacer(modifier = Modifier.width(8.dp))

                        TextField(
                            value = phoneNo,
                            onValueChange = { phoneNo = it },
                            placeholder = {
                                Text(
                                    text = stringResource(R.string.phoneno),
                                    color = Color.Black
                                )
                            },
                            singleLine = true,
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent,
                                unfocusedIndicatorColor = colorResource(R.color.litegreen),
                                focusedIndicatorColor = colorResource(R.color.litegreen)
                            )
                        )

                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            if (phoneNo.isNotEmpty()) {

                                val fullPhoneNumber = "$countryCode$phoneNo"
                                phoneAuth.sendVerificationCode(fullPhoneNumber, activity)
                            } else {
                                Toast.makeText(
                                    context,
                                    "Please enter a valid phone no",
                                    Toast.LENGTH_LONG
                                ).show()
                            }

                        },
                        shape = RoundedCornerShape(6.dp), colors = ButtonDefaults.buttonColors(
                            colorResource(R.color.darkgreen)
                        )
                    ) {
                        Text(text = "Send OTP", color = Color.Black)

                    }
                    if (authState is AuthState.Loading) {
                        Spacer(modifier = Modifier.height(16.dp))
                        CircularProgressIndicator()
                    }

                } else {
                    Spacer(modifier = Modifier.height(40.dp))

                    Text(
                        text = "Enter OTP", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                        color = colorResource(R.color.darkgreen)
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    TextField(
                        value = otp, onValueChange = { otp = it },
                        placeholder = { Text(text = "OTP") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        singleLine = true,
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            focusedIndicatorColor = colorResource(R.color.litegreen),
                            unfocusedIndicatorColor = colorResource(R.color.litegreen)

                        )
                    )


                    Spacer(modifier = Modifier.height(32.dp))
                    Button(
                        onClick = {
                            if (otp.isNotEmpty() && verificationId != null) {
                                phoneAuth.verifyCode(otp, context)
                            } else {
                                Toast.makeText(
                                    context,
                                    "Please enter a valid OTP",
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                        },
                        shape = RoundedCornerShape(6.dp), colors = ButtonDefaults.buttonColors(
                            colorResource(R.color.darkgreen)
                        )
                    ) {

                        Text(text = "Verify OTP")
                    }
                    if (authState is AuthState.Loading) {
                        Spacer(modifier = Modifier.height(16.dp))
                        CircularProgressIndicator()
                    }
                }


            }

            is AuthState.Success -> {
                Log.d("phoneAuth", "LoginSuccessful")
                phoneAuth.resetAuthState()

                navController.navigate(Routes.HomeScreen) {
                    popUpTo<Routes.RegistrationScreen> { inclusive = true }
                }
            }

            is AuthState.Error -> {
                Toast.makeText(context, (authState as AuthState.Error).message, Toast.LENGTH_LONG)
                    .show()

            }
        }

    }


}


