package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.ui.theme.RockPaperScissorsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RockPaperScissorsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UnitConverter() {
    // 열
    Column {
        // Cloumn에는 UI 요소들이 하나씩 쌓인다.
        // 행
        Text(text = "Unit Converter")
        OutlinedTextField(value = " ", onValueChange = {
            // Here goes what should happen, when the value of our outlinedTextField changes
        })

        Row {
            // Here all the UI elements will be stacked next to each other

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RockPaperScissorsTheme {
        UnitConverter()
    }
}