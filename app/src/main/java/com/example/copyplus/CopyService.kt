import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class CopyService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "CopyService started")
        // Implement your copy logic here
        // For example, you might use a thread to perform the copying operation

        // Return START_STICKY if you want the service to be restarted if it gets terminated
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        // Not used in this case
        return null
    }

    override fun onDestroy() {
        Log.d(TAG, "CopyService destroyed")
        super.onDestroy()
    }

    companion object {
        private const val TAG = "CopyService"
    }
}