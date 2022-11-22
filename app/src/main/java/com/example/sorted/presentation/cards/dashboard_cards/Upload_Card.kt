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
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.sorted.R
import com.example.sorted.ui.theme.Poppins

@Composable
fun Upload_card() {
    val navController = rememberNavController()
    OutlinedButton(
        modifier = Modifier
            .fillMaxWidth(9f)
            .padding(8.dp)
            .size(80.dp),
        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.surface),
        shape = MaterialTheme.shapes.small,
        onClick = {
            navController.navigate("Upload_Home_Screen")
        },
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_publish),
            contentDescription = "Uploads-icon-card",
            modifier = Modifier
                .size(40.dp),
            tint = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Upload Home",
            fontSize = MaterialTheme.typography.headlineSmall.fontSize,
            fontWeight = FontWeight.SemiBold,
            fontFamily = Poppins,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center
        )

    }
}