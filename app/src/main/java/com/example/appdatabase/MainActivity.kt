

package com.example.appdatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appdatabase.ui.theme.AppDatabaseTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppDatabaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(8.dp),
        Arrangement.Center
    ) {
        Row(
            Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
        }
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(text = "App DataBase")
        }
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            LabelAndPlaceHolder(
                Name = "Nome"
            )
        }
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            LabelAndPlaceHolder(
                Name = "Idade"
            )
        }
        Row(
            Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
        }
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = {  /*TODO*/  }

            ) {
                Text(text = "Cadastrar")
            }
        }

    }
}

@Composable
fun LabelAndPlaceHolder(Name: String) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        label = { Text(text = Name) },
        placeholder = { Text(text = " ") },
    )
}