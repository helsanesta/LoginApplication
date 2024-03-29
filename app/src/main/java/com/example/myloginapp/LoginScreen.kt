package com.example.myloginapp

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.loginimage),
            contentDescription = "Login Image",
            modifier = Modifier.size(200.dp)
        )

        Text(text = "Welcome Back", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Email Address")
        })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("credentials", "Email: $email Password: $password")
        }) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Forgot Password?", modifier = Modifier.clickable { })

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Or sign in with")

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(id = R.drawable.instagram),
                contentDescription = "Instagram Login",
                modifier = Modifier
                    .size(40.dp)
                    .clickable { }
            )

            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Google Login",
                modifier = Modifier
                    .size(40.dp)
                    .clickable { }
            )

            Image(
                painter = painterResource(id = R.drawable.twitter),
                contentDescription = "Twitter Login",
                modifier = Modifier
                    .size(40.dp)
                    .clickable { }
            )
        }
    }
}