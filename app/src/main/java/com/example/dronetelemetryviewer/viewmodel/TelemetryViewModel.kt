package com.example.dronetelemetryviewer.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dronetelemetryviewer.data.TelemetryRepository
import com.example.dronetelemetryviewer.model.TelemetryData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TelemetryViewModel : ViewModel() {

    private val repository = TelemetryRepository()

    private val _telemetry =
        MutableStateFlow(TelemetryData())

    val telemetry: StateFlow<TelemetryData>
            = _telemetry

    fun connect() {

        viewModelScope.launch {

            repository.connect().collect {

                _telemetry.value = it
            }
        }
    }

    fun arm() {
        _telemetry.value =
            _telemetry.value.copy(armed = true)
    }

    fun disarm() {
        _telemetry.value =
            _telemetry.value.copy(armed = false)
    }

    fun takeoff() {
        _telemetry.value =
            _telemetry.value.copy(
                flightMode = "TAKEOFF"
            )
    }

    fun rtl() {
        _telemetry.value =
            _telemetry.value.copy(
                flightMode = "RTL"
            )
    }
}