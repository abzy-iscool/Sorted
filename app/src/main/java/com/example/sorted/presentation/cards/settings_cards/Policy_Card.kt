package com.example.sorted.presentation.cards.settings_cards

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sorted.R
import com.example.sorted.ui.theme.Poppins


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Policy_Card() {

    Card(
        modifier = Modifier
            .fillMaxWidth(9f)
            .padding(8.dp)
            .size(0.dp, 150.dp),
        onClick = { /*TODO*/ },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        shape = MaterialTheme.shapes.medium,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_policy),
                contentDescription = "Policy",
                modifier = Modifier
                    .padding(10.dp, 4.dp)
                    .size(50.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Text(
                modifier = Modifier
                    .padding(0.dp , 5.dp),
                text = "Policy",
                fontFamily = Poppins,
                fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface,
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                modifier = Modifier
                    .padding(5.dp , 5.dp),
                text = "Our legal statement that proves and involves " +
                        "fairness for all of our users regardless of age/ethnicity/sex.",
                fontFamily = Poppins,
                fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Start,
                color = MaterialTheme.colorScheme.onSurface,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Policy_Card_Preview() {
    Policy_Card()
}