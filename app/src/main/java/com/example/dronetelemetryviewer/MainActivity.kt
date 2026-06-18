package com.example.dronetelemetryviewer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dronetelemetryviewer.ui.ConnectionScreen
import com.example.dronetelemetryviewer.ui.DashboardScreen
import com.example.dronetelemetryviewer.viewmodel.TelemetryViewModel


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {

            val vm: TelemetryViewModel = viewModel()

            val telemetry by vm.telemetry.collectAsState()

            var connected by remember {
                mutableStateOf(false)
            }

            if (!connected) {

                ConnectionScreen { _, _ ->

                    vm.connect()

                    connected = true
                }

            } else {

                DashboardScreen(
                    telemetry = telemetry,
                    onArm = { vm.arm() },
                    onDisarm = { vm.disarm() },
                    onTakeoff = { vm.takeoff() },
                    onRTL = { vm.rtl() }
                )
            }
        }
    }


}