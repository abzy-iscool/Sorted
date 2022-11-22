package com.example.sorted.presentation.screens.dashboard_screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.sorted.presentation.cards.dashboard_cards.Upload_card
import com.example.sorted.presentation.cards.dashboard_cards.Your_Home_Card
import com.example.sorted.ui.theme.Poppins
import kotlin.random.Random

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(0.dp, 0.dp, 0.dp, 80.dp),
        verticalArrangement = Arrangement.Top,
    ) {
        FilledIconButton(
            modifier = Modifier
                .fillMaxWidth(9f)
                .padding(8.dp)
                .size(0.dp, 300.dp),
            shape = MaterialTheme.shapes.large,
            onClick = { /*TODO*/ }
        ) {
            Icon(
                painter = rememberAsyncImagePainter(
                    model = "https://picsum.photos/seed/${Random.nextInt()}/300/300"
                ),
                contentDescription = "profile picture",
                tint = Color.Unspecified,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = MaterialTheme.shapes.large)
                    .aspectRatio(3f / 3f)
            )

        }
        Text(
            modifier = Modifier
                .padding(15.dp , 0.dp),
            text = "User Profile Name",
            fontFamily = Poppins,
            fontSize = MaterialTheme.typography.displaySmall.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colorScheme.onSurface,
        )
        
        Text(
            modifier = Modifier
                .padding(15.dp , 0.dp),
            text = "Bacon ipsum dolor amet pork shankle beef andouille ball tip. Meatball corned beef swine, strip steak bacon jerky doner tongue biltong pork loin drumstick sausage hamburger burgdoggen.",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurface
        )
        Spacer(modifier = Modifier.size(0.dp , 25.dp))
        Upload_card()
        Spacer(modifier = Modifier.size(0.dp , 15.dp))
        Your_Home_Card()
    }
}

@Composable
@Preview(showBackground = true)
fun DashBoardScreenPreview() {
    DashboardScreen()
}