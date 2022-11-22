package com.example.sorted.presentation.screens.login_signup_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sorted.R
import com.example.sorted.ui.theme.Pacifico
import com.example.sorted.ui.theme.Poppins

@Composable
fun HeroScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier
                    .size(300.dp, 300.dp),
                painter = painterResource(R.drawable.house_ill),
                contentDescription = "Image",
            )
        }

        Text(
            text = "Sorted",
            fontSize = MaterialTheme.typography.displayLarge.fontSize,
            fontFamily = Poppins,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            modifier = Modifier
                .padding(0.dp, 50.dp),
            text = "your needs for everything",
            fontSize = MaterialTheme.typography.headlineSmall.fontSize,
            fontWeight = FontWeight.ExtraLight,
            fontFamily = Pacifico,
            color = MaterialTheme.colorScheme.onBackground
        )
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                FilledTonalButton(
                    modifier = Modifier
                        .fillMaxWidth(9f)
                        .padding(8.dp)
                        .size(0.dp, 60.dp),
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.filledTonalButtonColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer,
                        contentColor = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    onClick = { /*TODO*/ }

                ) {
                    Text(
                        text = "Login",
                        fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                        fontWeight = FontWeight.Light,
                        fontFamily = Poppins
                    )
                }

                FilledTonalButton(
                    modifier = Modifier
                        .fillMaxWidth(9f)
                        .padding(8.dp)
                        .size(0.dp, 60.dp),
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.filledTonalButtonColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer,
                        contentColor = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    onClick = { /*TODO*/ }

                ) {
                    Text(
                        text = "Sign up",
                        fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                        fontWeight = FontWeight.Light,
                        fontFamily = Poppins
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    HeroScreen()
}