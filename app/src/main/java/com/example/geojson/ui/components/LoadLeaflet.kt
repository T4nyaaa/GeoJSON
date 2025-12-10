package com.example.geojson.ui.components

import android.util.Log
import android.webkit.WebView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun LoadLeaflet(modifier: Modifier) {
    AndroidView(
        modifier = modifier,
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                settings.domStorageEnabled = true
                settings.allowFileAccess = true
                loadUrl("file:///android_asset/leaflet/dist/index.html")
            }
        }
    )
}

@Preview
@Composable
fun LoadLeafletPreview() {
    LoadLeaflet(modifier = Modifier.fillMaxSize())
}