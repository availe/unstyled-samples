package io.availe.unstyledsamples

import androidx.compose.runtime.Composable
import com.composeunstyled.*
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val categories = listOf("Tab1", "Tab2", "Tab3", "Tab4", "Tab5")

    val state = rememberTabGroupState(categories.first(), orderedTabs = categories)

    TabGroup(state = state) {
        TabList {
            categories.forEach { category ->
                Tab(key = category) {
                    Text(category)
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