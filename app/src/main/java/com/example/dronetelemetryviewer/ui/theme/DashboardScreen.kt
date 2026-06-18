package com.example.dronetelemetryviewer.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dronetelemetryviewer.model.TelemetryData

@Composable
fun DashboardScreen(
    telemetry: TelemetryData,
    onArm: () -> Unit,
    onDisarm: () -> Unit,
    onTakeoff: () -> Unit,
    onRTL: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text("Latitude: ${telemetry.latitude}")
        Text("Longitude: ${telemetry.longitude}")
        Text("Altitude: ${telemetry.altitude}")
        Text("Battery: ${telemetry.battery}%")
        Text("Flight Mode: ${telemetry.flightMode}")

        Text(
            if (telemetry.armed)
                "Status: ARMED"
            else
                "Status: DISARMED"
        )

        Text("Connection: ${telemetry.status}")

        Spacer(modifier = Modifier.height(20.dp))

        Row {

            Button(onClick = onArm) {
                Text("ARM")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = onDisarm) {
                Text("DISARM")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row {

            Button(onClick = onTakeoff) {
                Text("TAKEOFF")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = onRTL) {
                Text("RTL")
            }
        }
    }
}