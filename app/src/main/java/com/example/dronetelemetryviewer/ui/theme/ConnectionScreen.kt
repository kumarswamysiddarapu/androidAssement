package com.example.dronetelemetryviewer.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ConnectionScreen(
    onConnect: (String, String) -> Unit
) {

    var ip by remember {
        mutableStateOf("192.168.1.12")
    }

    var port by remember {
        mutableStateOf("14550")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text(
            text = "Drone Telemetry Viewer",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = ip,
            onValueChange = { ip = it },
            label = { Text("IP Address") }
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = port,
            onValueChange = { port = it },
            label = { Text("Port") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                onConnect(ip, port)
            }
        ) {
            Text("Connect")
        }
    }
}