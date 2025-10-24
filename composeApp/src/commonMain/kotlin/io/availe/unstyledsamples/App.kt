package io.availe.unstyledsamples

import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview

enum class Sample {
    TabGroupNoWarningEvenThoughMissingTab
}

@Composable
@Preview
fun App() {
    // Select the sample to utilize in the app.
    val selectedSample = Sample.TabGroupNoWarningEvenThoughMissingTab

    when (selectedSample) {
        Sample.TabGroupNoWarningEvenThoughMissingTab -> TabGroupNoWarningEvenThoughMissingTab()
    }
}