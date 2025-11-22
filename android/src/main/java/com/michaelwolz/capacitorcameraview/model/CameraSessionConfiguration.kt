package com.michaelwolz.capacitorcameraview.model

/** Configuration for a camera session. */
data class CameraSessionConfiguration(
    val deviceId: String? = null,
    val enableBarcodeDetection: Boolean = false,
    val position: String = "back",
    val zoomFactor: Float = 1.0f,
    val x: Int? = null,
    val y: Int? = null,
    val width: Int? = null,
    val height: Int? = null
)

