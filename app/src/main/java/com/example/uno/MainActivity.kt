package com.example.uno

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.uno.componentes.MyBox
import com.example.uno.componentes.MyColumn
import com.example.uno.componentes.MyCoplexLayout
import com.example.uno.componentes.MyRow
import com.example.uno.ui.theme.UnoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //MyBox(modifier)
    //MyColumn(modifier)
    //MyRow(modifier)
    MyCoplexLayout(modifier)
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UnoTheme {
        Greeting("Android")
    }
}