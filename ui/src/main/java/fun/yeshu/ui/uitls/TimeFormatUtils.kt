package `fun`.yeshu.ui.uitls

import java.text.SimpleDateFormat
import java.util.*

object TimeFormatUtils {
    fun formatTime(time: Long): String {
        val format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        return format.format(Date(time))
    }
}