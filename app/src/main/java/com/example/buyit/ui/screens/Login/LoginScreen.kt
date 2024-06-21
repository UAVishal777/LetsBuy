package com.example.buyit.ui.screens.Login

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class, ExperimentalComposeUiApi::class)
@Composable
@Preview(showSystemUi = true, showBackground = true)
fun LoginScreen() {
    var emailUsername by remember { mutableStateOf("") }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login to GoBazaar", modifier = Modifier.padding(40.dp))
        OutlinedTextField(
            value = emailUsername,
            onValueChange = { input -> emailUsername = input },
            label = { Text(text = "Email") },
        )
        OutlinedTextField(
            modifier = Modifier.padding(40.dp),
            value = password,
            onValueChange = { input -> password = input },
            label = { Text(text = "Password") },
        )

        Row(
            Modifier.fillMaxWidth(0.8f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            OutlinedButton(onClick = {  }) {
                Text("Login")
            }

        }

        Row(
            Modifier.fillMaxWidth(0.8f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Forgot Password?", modifier = Modifier.clickable {  }
                .padding(PaddingValues(start = 40.dp, top = 40.dp)))
        }
        Text(text = "Don't have a account?", modifier = Modifier.clickable {  }
            .padding(PaddingValues(start = 40.dp, top = 40.dp, bottom = 40.dp)))
        Text(text = "Signup", modifier = Modifier.clickable {  })

    }
}


