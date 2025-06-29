package so.digitalshield.app.wallet.lite

import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import so.digitalshield.app.wallet.lite.utils.sendEvent

class LoggerManager(private val context: ReactApplicationContext) :
    ReactContextBaseJavaModule(context) {

    companion object {
        private val TAG = LoggerManager::class.simpleName.toString()

        private const val LOG_EVENT_INFO = "native_log_info"

        private var instance: LoggerManager? = null

        fun getInstance(): LoggerManager? {
            return instance
        }
    }

    init {
        instance = this
    }

    override fun getName(): String = TAG

    @ReactMethod
    public fun logInfo(message: String) {
        Log.d(TAG, message)
        sendEvent(context, LOG_EVENT_INFO, message)
    }
}
