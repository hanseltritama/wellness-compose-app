package com.example.wellnesscomposeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(16.dp)) {
        var count by remember { mutableIntStateOf(0) }

        Text(
            text = "You've had $count glasses.",
            modifier = modifier.padding(16.dp)
        )

        Button(
            modifier = Modifier.padding(top = 8.dp),
            onClick = { count++ }
        ) {
            Text(text = "Add One")
        }
    }
}
