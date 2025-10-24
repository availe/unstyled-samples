package io.availe.unstyledsamples.samples

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

@Composable
fun TabGroupNoWarningEvenThoughMissingTab() {
    val tabs = listOf("Tab1", "Tab2", "Tab3", "Tab4", "Tab5")

    /*
    Even with attemptBreakingApp as true, this does not break the app or cause any warning/error message.
    Tab group simply ignores the missing requested tab ("Favorite") and proceeds as normal, which is not ideal for debugging.
     */
    val attemptBreakingApp = true
    val selectInitialTab = if (attemptBreakingApp) "Favorite" else "Tab1"

    val tabState = rememberTabGroupState(selectInitialTab, orderedTabs = tabs)

    TabGroup(state = tabState, Modifier.fillMaxSize().padding(16.dp)) {
        TabList(Modifier.fillMaxWidth()) {
            tabs.forEach { tab ->
                Box(Modifier.padding(4.dp).background(Color.LightGray)) {
                    Tab(key = tab) {
                        Text(tab)
                    }
                }
            }
        }

        tabs.forEach { tab ->
            TabPanel(key = tab) {
                Text("$tab Content")
            }
        }
    }
}