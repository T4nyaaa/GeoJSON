package com.example.geojson.ui.components

import android.webkit.WebView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun LoadLeaflet(modifier: Modifier) {
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                settings.domStorageEnabled = true
                loadUrl("file:///android_asset/leaflet/index.html")
            }
        }
    )
}

@Preview
@Composable
fun LoadLeafletPreview() {
    LoadLeaflet(modifier = Modifier)
}