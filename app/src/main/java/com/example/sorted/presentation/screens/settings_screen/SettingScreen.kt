package com.example.sorted.presentation.screens.settings_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sorted.presentation.cards.settings_cards.LogOut_Card
import com.example.sorted.presentation.cards.settings_cards.Policy_Card
import com.example.sorted.presentation.cards.settings_cards.Terms_Conditions_Card
import com.example.sorted.ui.theme.Poppins

@Composable
fun SettingsScreen() {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(0.dp, 0.dp, 0.dp, 70.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(20.dp),
                text = "Settings",
                fontSize = MaterialTheme.typography.displaySmall.fontSize,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
            )
            Terms_Conditions_Card()
            Policy_Card()
            LogOut_Card()
        }

}

@Composable
@Preview(showBackground = true)
fun SettingScreenPreview(){
    SettingsScreen()
}

