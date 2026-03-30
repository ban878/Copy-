import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toggleButton: Button = findViewById(R.id.toggle_button)
        toggleButton.setOnClickListener { toggleNotificationBar() }
    }

    private fun toggleNotificationBar() {
        val intent = Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS)
        startActivity(intent)
    }

    private fun openAppSettings() {
        val intent = Intent(Settings.ACTION_APPLICATION_SETTINGS)
        startActivity(intent)
    }
}