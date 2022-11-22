package com.example.sorted.presentation.screens.search_screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.sorted.R


@Composable
fun SearchBar() {

    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth(9f)
            .padding(8.dp),
        value = text,
        onValueChange = { newText -> text = newText },
        label = {
            Text(
                text = "Search",
                 color = MaterialTheme.colorScheme.primary
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = MaterialTheme.colorScheme.outline,
            unfocusedBorderColor = MaterialTheme.colorScheme.outline,
            textColor = MaterialTheme.colorScheme.onBackground,
            cursorColor = MaterialTheme.colorScheme.onBackground
        ),
        shape = MaterialTheme.shapes.small,
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.baseline_search),
                contentDescription = "Search Bar Icon",
                tint = MaterialTheme.colorScheme.primary
            )
        }
    )

}