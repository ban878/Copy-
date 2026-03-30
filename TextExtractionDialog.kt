import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class TextExtractionDialog(private val context: Context) {

    fun showDialog(selectedText: String) {
        val dialogBuilder = AlertDialog.Builder(context)
        dialogBuilder.setTitle("Extracted Text")

        val layout = LinearLayout(context)
        layout.orientation = LinearLayout.VERTICAL

        // Text display
        val textView = TextView(context)
        textView.text = selectedText
        layout.addView(textView)

        // Copy button
        val copyButton = Button(context)
        copyButton.text = "Copy"
        copyButton.setOnClickListener { 
            // Handle copy action here
        }
        layout.addView(copyButton)

        // Translate button
        val translateButton = Button(context)
        translateButton.text = "Translate"
        translateButton.setOnClickListener { 
            // Handle translate action here
        }
        layout.addView(translateButton)

        // Magic Wand button
        val magicWandButton = Button(context)
        magicWandButton.text = "Magic Wand"
        magicWandButton.setOnClickListener { 
            // Handle magic wand action here
        }
        layout.addView(magicWandButton)

        dialogBuilder.setView(layout)
        dialogBuilder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })
        dialogBuilder.show()
    }
}