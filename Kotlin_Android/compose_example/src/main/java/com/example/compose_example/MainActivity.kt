package com.example.compose_example

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.text.style.MetricAffectingSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    DefaultPreview()
                }
            }
        }
    }
}

data class Message(
    val author : String,
    val text : String
)

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
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Android_kotlinTheme {
        Column() {
            MessageCard(Message("나다","그렇다"))
        }
    }
}

@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(androidx.core.R.drawable.notify_panel_notification_icon_bg),
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(
                text = "author",
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )

            Spacer(modifier = Modifier.height(4.dp))

            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(
                    text = "body",
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}
