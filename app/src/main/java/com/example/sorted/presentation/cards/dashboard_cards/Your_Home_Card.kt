package com.example.sorted.presentation.cards.dashboard_cards

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.sorted.R
import com.example.sorted.ui.theme.Poppins

@Composable
fun Your_Home_Card() {
    val navController = rememberNavController()
    OutlinedButton(
        modifier = Modifier
            .fillMaxWidth(9f)
            .padding(8.dp)
            .size(80.dp),
        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.surface),
        shape = MaterialTheme.shapes.small,
        onClick = { navController.navigate("Your_Home_screen") }
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_cottage),
            contentDescription = "Uploads-icon-card",
            modifier = Modifier
                .size(40.dp),
            tint = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Your Homes",
            fontSize = MaterialTheme.typography.headlineSmall.fontSize,
            fontWeight = FontWeight.SemiBold,
            fontFamily = Poppins,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center
        )

    }
}

@Preview(showBackground = true)
@Composable
fun Uploads_Card_Preview() {
    Your_Home_Card()
}