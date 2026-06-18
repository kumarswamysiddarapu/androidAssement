# 🚁 Drone Telemetry Viewer

Drone Telemetry Viewer is an Android application developed using Kotlin and Jetpack Compose that simulates real-time drone telemetry monitoring. The application displays live telemetry information such as GPS coordinates, altitude, battery level, flight mode, and drone status through a clean and modern user interface.

## Features

- Real-time telemetry updates
- Simulated drone connection
- Live GPS coordinate tracking
- Altitude monitoring
- Battery status display
- Flight mode monitoring
- Arm and Disarm controls
- Takeoff simulation
- Return-To-Launch (RTL) simulation
- Modern UI using Jetpack Compose
- MVVM Architecture implementation

## Technologies Used

- Kotlin
- Android Studio
- Jetpack Compose
- Material Design 3
- ViewModel
- StateFlow
- Kotlin Coroutines
- MVVM Architecture

## Project Structure

app
├── data
│   └── TelemetryRepository.kt
├── model
│   └── TelemetryData.kt
├── ui
│   ├── ConnectionScreen.kt
│   └── DashboardScreen.kt
├── viewmodel
│   └── TelemetryViewModel.kt
└── MainActivity.kt

## Architecture

The project follows the MVVM (Model-View-ViewModel) architecture pattern.

### Model
Contains the telemetry data model used throughout the application.

### Repository
Handles telemetry data generation and updates.

### ViewModel
Manages application state and business logic.

### UI Layer
Built using Jetpack Compose and observes state changes from the ViewModel.

## Installation

1. Clone the repository.
2. Open the project in Android Studio.
3. Sync Gradle dependencies.
4. Run the application on an emulator or Android device.

## Building APK

### Debug APK
Build → Build APK(s)

### Release APK
Build → Generate Signed Bundle / APK

## Future Enhancements

- MAVLink integration
- Real drone communication
- Google Maps integration
- Flight path visualization
- Telemetry history tracking
- Mission planning support
- Live video streaming
- Cloud data synchronization

## Author

SIDDARAPU KUMARSWAMY

Bachelor of Engineering (2025)
Java Full Stack Developer
Android Developer


