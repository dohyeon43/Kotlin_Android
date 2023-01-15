package com.example.compose_example

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.style.MetricAffectingSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_example.ui.theme.Android_kotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_kotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {
                    ColumnText("Android","text")
                    RowText("Android","text")
                }
            }
        }
    }
}

@Composable
fun (name: String) {
    Android_kotlinTheme() {
        Text(text = "Hello $name!")
    }

}

@Composable
fun ColumnText(name : String, content : String){
     Column() {
         Text(text = name)
         Text(text = content)
     }
}

@Composable
fun RowText(name : String, content : String){
    Row() {
        Text(text = name)
        Text(text = content)
    }
}

@Composable
fun BoxText(name : String, content : String){
    Box() {
        Text(text = name)
        Text(text = content)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Android_kotlinTheme {
        Column() {
            ColumnText("Android","text.....")
            RowText("Android","text.....")
            BoxText("Android","text.....")
        }
    }
}