package com.angel.whatsapp.presentation.splashscreen.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.angel.whatsapp.R
import com.angel.whatsapp.presentation.splashscreen.navigation.Routes
import com.angel.whatsapp.presentation.splashscreen.registration.best1

@Composable

fun WelcomeScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize().padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {


        Image(
            painter = painterResource(id = R.drawable.abb),
            contentDescription = null,
            modifier = Modifier.size(300.dp)

            )

        Spacer(modifier = Modifier.height(90.dp))


        Text(
            text = "Welcome WhatsApp",
            fontWeight = FontWeight.Bold,fontFamily = best1,
            fontSize = 26.sp,
            color = colorResource(R.color.black)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            Text(text = "Read our ")

            Text(
                text = "Privacy Policy ",
                modifier = Modifier,
                color = colorResource(R.color.darkgreen),fontFamily = best1
            )

            Text(text = "Tap 'Agree and",fontFamily = best1)
        }
        Spacer(modifier = Modifier.height(4.dp))
        Row {
            Text(text = "Continue' to and accept ",fontFamily = best1)
            Text(
                text = "Terms of Service",
                modifier = Modifier,
                color = colorResource(R.color.darkgreen),fontFamily = best1
            )
        }

        Spacer(modifier = Modifier.height(48.dp))
        Button(
            onClick = {
                navController.navigate(Routes.RegistrationScreen){
                    popUpTo<Routes.WelcomeScreen> { inclusive = true }
                }
            },

            modifier = Modifier.size(250.dp, 37.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.darkgreen))
        ) {
            Text(text = "Agree and Continue",fontFamily = best1)
        }


    }


}


















