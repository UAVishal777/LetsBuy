package com.example.buyit.ui.screens.Login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
//import androidx.compose.material.icons.filled.Visibility
//import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.Email
//import androidx.compose.material.icons.outlined.Key
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buyit.R


@Composable
@Preview(showBackground = true)
fun LoginScreen() {
    var emailUsername by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    Box(
        Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color.Magenta.copy(alpha = 0.4f),
                        Color.Red.copy(alpha = 0.5f),
                        Color.Gray.copy(alpha = 0.5f),
                        Color.Yellow.copy(alpha = 0.4f)
                    )
                )
            )
            .scrollable(rememberScrollState(), orientation = Orientation.Vertical),
        contentAlignment = Alignment.BottomCenter
    ){
        val icon = if (passwordVisible)
//        Icons.Filled.Visibility
            Icons.Outlined.Email
        else
//            Icons.Filled.VisibilityOff
        Icons.Outlined.Email
        Column(
            Modifier
                .clip(RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp))
                .fillMaxWidth()
                .fillMaxHeight(0.7f)
                .background(Color.White.copy(0.3f)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.padding(8.dp))
            Text(
                text = "Welcome Back!",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            )
            Spacer(modifier = Modifier.padding(2.dp))
            Text(
                text = "Welcome Back we missed you",
                fontSize = 10.sp,
                fontStyle = FontStyle.Italic
            )
            Spacer(modifier = Modifier.padding(20.dp))
            OutlinedTextField(
                value = emailUsername,
                maxLines = 1,
                onValueChange = { emailUsername = it},
                label = { Text(text = "Email/Username")},
                leadingIcon = { Icon(imageVector = Icons.Outlined.Email, contentDescription = "Email Icon") },
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors().copy(
                        focusedIndicatorColor = Color.Magenta.copy(0.25f),
                        focusedLeadingIconColor = Color.Magenta.copy(0.25f),
                        focusedLabelColor = Color.Magenta.copy(0.25f),
                        unfocusedLeadingIconColor = Color.Gray,
                        unfocusedLabelColor = Color.Gray,
                        unfocusedIndicatorColor = Color.Gray,
                        focusedTextColor = Color.Gray
                    )
            )
            Spacer(modifier = Modifier.padding(20.dp))
            OutlinedTextField(
                value = password,
                maxLines = 1,
                onValueChange = { password = it},
                label = { Text(text = "Password")},
                leadingIcon = { Icon(imageVector = Icons.Outlined.Add, contentDescription = "Password Icon") },
                shape = RoundedCornerShape(12.dp),
                isError = password.length in 2..4 && password.isNotBlank(),
                trailingIcon = {
                    IconButton(onClick = { passwordVisible = !passwordVisible }){
                        Icon(
                            imageVector = icon,
                            contentDescription = if (passwordVisible) "Hide password" else "Show password",
                        )
                    }
                },
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = OutlinedTextFieldDefaults.colors().copy(
                    focusedIndicatorColor = Color.Magenta.copy(0.25f),
                    cursorColor = Color.Magenta.copy(0.25f),
                    focusedLeadingIconColor = Color.Magenta.copy(0.25f),
                    focusedTrailingIconColor = Color.Magenta.copy(0.25f),
                    focusedLabelColor = Color.Magenta.copy(0.25f),
                    errorIndicatorColor = Color.Red.copy(0.25f),
                    errorLeadingIconColor =  Color.Red.copy(0.25f),
                    errorTrailingIconColor =  Color.Red.copy(0.25f),
                    errorLabelColor =  Color.Red.copy(0.25f),
                    errorCursorColor = Color.Red.copy(0.25f),
                    unfocusedLeadingIconColor = Color.Gray,
                    unfocusedLabelColor = Color.Gray,
                    unfocusedIndicatorColor = Color.Gray,
                    unfocusedTrailingIconColor = Color.Gray,
                    focusedTextColor = Color.Gray
                )
            )
            Spacer(modifier = Modifier.padding(6.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Text(
                    modifier = Modifier.clickable {  },
                    text = "Don't have an account?",
                    fontSize = 10.sp,
                    fontStyle = FontStyle.Italic
                )
                Spacer(modifier = Modifier.padding(4.dp))
                Text(
                    modifier = Modifier
                        .padding(end = 60.dp)
                        .clickable { },
                    text = "Forgot Password?",
                    fontSize = 10.sp,
                    fontStyle = FontStyle.Italic
                )
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Box(
                modifier = Modifier
                    .size(width = 180.dp, height = 50.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.Magenta.copy(0.4f))
                    .clickable { },
                contentAlignment = Alignment.Center
            ){
                Text(text = "Sign", fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.padding(10.dp))
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                HorizontalDivider(
                    Modifier.fillMaxWidth(0.23f)
                )
                Text(
                    modifier = Modifier.padding(horizontal = 15.dp),
                    text = "Or continue with",
                    fontSize = 10.sp,
                    fontStyle = FontStyle.Italic
                )
                HorizontalDivider(Modifier.fillMaxWidth(0.4f))
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Row(Modifier.fillMaxWidth(), Arrangement.Absolute.Center, Alignment.CenterVertically) {
                IconButton(onClick = { /*TODO*/ }) {
                    Image(
                        painter = painterResource(id = R.mipmap.google_ic_xxxhdpi),
                        contentDescription = "Google Icon",
                        modifier = Modifier.size(25.dp)
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Image(
                        painter = painterResource(id = R.mipmap.facebook_ic),
                        contentDescription = "Google Icon",
                        modifier = Modifier.size(25.dp)
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Image(
                        painter = painterResource(id = R.mipmap.google_ic_xxxhdpi),
                        contentDescription = "Google Icon",
                        modifier = Modifier.size(25.dp)
                    )
                }
            }
        }
    }
}


