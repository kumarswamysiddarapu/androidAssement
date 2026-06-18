package com.example.dronetelemetryviewer.data

import com.example.dronetelemetryviewer.model.TelemetryData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class TelemetryRepository {

    fun connect(): Flow<TelemetryData> = flow {

        var battery = 100

        while (true) {

            emit(
                TelemetryData(
                    latitude = 13.0827 + Math.random(),
                    longitude = 80.2707 + Math.random(),
                    altitude = 50 + (Math.random() * 100),
                    battery = battery,
                    flightMode = "GUIDED",
                    armed = battery % 2 == 0,
                    connected = true,
                    status = "Connected"
                )
            )

            battery--

            if (battery <= 0) {
                battery = 100
            }

            delay(1000)
        }
    }
}