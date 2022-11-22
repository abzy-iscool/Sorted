package com.example.sorted.presentation.screens.login_signup_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sorted.R
import com.example.sorted.ui.theme.Poppins

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .size(0.dp, 150.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Sign Up",
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.displayMedium.fontSize,
            )
        }
        Card(
            modifier = Modifier
                .fillMaxSize(9f)
                .padding(9.dp)
                .clip(RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp)),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onBackground
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                var firstName by remember { mutableStateOf("") }
                var lastName by remember { mutableStateOf("") }

                OutlinedTextField(
                    modifier = Modifier
                        .padding(0.dp, 10.dp),
                    value = firstName,
                    onValueChange = { newText -> firstName = newText },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    label = {
                        Text(text = "FirstName", color = MaterialTheme.colorScheme.background)
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = MaterialTheme.colorScheme.outline,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline,
                        textColor = MaterialTheme.colorScheme.background,
                        cursorColor = MaterialTheme.colorScheme.background
                    ),
                )

                OutlinedTextField(
                    modifier = Modifier
                        .padding(0.dp, 0.dp),
                    value = lastName,
                    onValueChange = { newText -> lastName = newText },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    label = {
                        Text(text = "LastName", color = MaterialTheme.colorScheme.background)
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = MaterialTheme.colorScheme.outline,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline,
                        textColor = MaterialTheme.colorScheme.background,
                        cursorColor = MaterialTheme.colorScheme.background
                    ),
                )


                var email by remember { mutableStateOf("") }

                OutlinedTextField(
                    modifier = Modifier
                        .padding(0.dp, 10.dp),
                    value = email,
                    onValueChange = { newText -> email = newText },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email
                    ),
                    label = {
                        Text(text = "Username", color = MaterialTheme.colorScheme.background)
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = MaterialTheme.colorScheme.outline,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline,
                        textColor = MaterialTheme.colorScheme.background,
                        cursorColor = MaterialTheme.colorScheme.background
                    ),
                )

                var password by rememberSaveable { mutableStateOf("") }
                var passwordVisibility by remember { mutableStateOf(false) }

                val icon = if (passwordVisibility)
                    painterResource(id = R.drawable.visible)
                else
                    painterResource(id = R.drawable.visible_off)

                OutlinedTextField(
                    value = password,
                    onValueChange = { newText -> password = newText },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password
                    ),
                    label = {
                        Text(text = "Password", color = MaterialTheme.colorScheme.background)
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = MaterialTheme.colorScheme.outline,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline,
                        textColor = MaterialTheme.colorScheme.background,
                        cursorColor = MaterialTheme.colorScheme.background
                    ),
                    trailingIcon = {
                        IconButton(onClick = {
                            passwordVisibility = !passwordVisibility
                        }) {
                            Icon(
                                painter = icon,
                                contentDescription = "visibility icon",
                                tint = MaterialTheme.colorScheme.background
                            )
                        }
                    },
                    visualTransformation = if (passwordVisibility) VisualTransformation.None
                    else PasswordVisualTransformation()
                )

                Spacer(modifier = Modifier.size(0.dp , 10.dp))

                ElevatedButton(
                    modifier = Modifier
                        .size(250.dp , 80.dp),
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.elevatedButtonColors(
                        containerColor = MaterialTheme.colorScheme.surface
                    ),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        modifier = Modifier
                            .size(30.dp),
                        painter = painterResource(id = R.drawable.google_icon),
                        contentDescription = "Login with Google",
                        tint = Color.Unspecified
                    )
                    Spacer(modifier = Modifier.size(13.dp, 0.dp))
                    Text(
                        text = "login with google",
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.onBackground,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    )
                }

                Spacer(modifier = Modifier.size(0.dp , 10.dp))

                Text(
                    text = "Already have an Account?",
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.background,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                )

                FilledTonalButton(
                    modifier = Modifier
                        .size(150.dp , 60.dp),
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.filledTonalButtonColors(
                        containerColor = MaterialTheme.colorScheme.surface
                    ),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "Login",
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.onBackground,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    )
                }

                Spacer(modifier = Modifier.size(0.dp , 15.dp))

                FilledIconButton(
                    modifier = Modifier
                        .size(100.dp),
                    colors = IconButtonDefaults.filledIconButtonColors(
                        containerColor = MaterialTheme.colorScheme.primary
                    ),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        modifier = Modifier
                            .size(50.dp),
                        painter = painterResource(id = R.drawable.baseline_done) ,
                        contentDescription = "submit login",
                        tint = MaterialTheme.colorScheme.background
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()
}