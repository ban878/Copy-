import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.Log;

public class ClipboardManagerHelper {
    private ClipboardManager clipboardManager;

    public ClipboardManagerHelper(Context context) {
        clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
    }

    public void copyToClipboard(String label, String text) {
        ClipData data = ClipData.newPlainText(label, text);
        clipboardManager.setPrimaryClip(data);
        Log.d("ClipboardManagerHelper", "Copied to clipboard: " + text);
    }

    public String getCopiedText() {
        if (clipboardManager.hasPrimaryClip() && 
            clipboardManager.getPrimaryClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
            ClipData.Item item = clipboardManager.getPrimaryClip().getItemAt(0);
            return item.getText().toString();
        }
        return null;
    }
}