package android.study.fcm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.study.fcm.ui.theme.Kotlin_AndroidTheme
import android.widget.TextView
import com.google.firebase.messaging.FirebaseMessaging


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlin_AndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    initFirebase()?.let { TvResult(it, modifier = Modifier) }
                }
            }
        }
    }

    private fun initFirebase() : String? {
        var result = ""
        FirebaseMessaging.getInstance().token
            .addOnCompleteListener {task ->
                if(task.isSuccessful){
                    result = task.result
                }

            }
        return result
    }
}

@Composable
fun TvResult(text : String, modifier: Modifier ) {
    Text(
        text =text,
        modifier = modifier
    )
}



@Preview(showBackground = true)
@Composable
fun MainPreview() {
    Kotlin_AndroidTheme {
        TvResult("hi", Modifier)
    }
}