package io.availe.unstyledsamples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.composeunstyled.*
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val categories = listOf("Tab1", "Tab2", "Tab3", "Tab4", "Tab5")

    val state = rememberTabGroupState(categories.first(), orderedTabs = categories)

    TabGroup(state = state, Modifier.fillMaxSize().padding(16.dp)) {
        TabList(Modifier.fillMaxWidth()) {
            categories.forEach { category ->
                Box(Modifier.padding(4.dp).background(Color.LightGray)) {
                    Tab(key = category) {
                        Text(category)
                    }
                }
            }
        }

        categories.forEach { category ->
            TabPanel(key = category) {
                Text("$category Content")
            }
        }
    }
}