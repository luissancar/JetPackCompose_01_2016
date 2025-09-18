package com.example.uno.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyColumn(modifier: Modifier = Modifier){
    //, verticalArrangement = Arrangement.SpaceAround
    Column(modifier=modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
        Text("Uno", modifier=Modifier.background(Color.Blue).weight(1f).fillMaxWidth())
        Text("Dos", modifier=Modifier.background(Color.Yellow).weight(2f))
        Text("Tres", modifier=Modifier.background(Color.Black).weight(3f))
        Text("Cuatro", modifier=Modifier.background(Color.Cyan).weight(0.5f))
    }
}