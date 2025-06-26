package so.digitalshield.app.wallet.lite.utils

import so.digitalshield.app.wallet.lite.digitalshieldLite.NfcConstant
import so.digitalshield.app.wallet.lite.LoggerManager

object LogUtil {
    @JvmStatic
    fun printLog(tag: String, msg: String) {
        if (NfcConstant.DEBUG) LoggerManager.getInstance()?.logInfo("$tag: $msg")
    }
}
