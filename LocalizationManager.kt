// LocalizationManager.kt

// This class handles localization for Arabic and English language support.

class LocalizationManager {

    private val translations = mapOf(
        "en" to mapOf(
            "greeting" to "Hello",
            "farewell" to "Goodbye"
        ),
        "ar" to mapOf(
            "greeting" to "مرحبا",
            "farewell" to "وداعا"
        )
    )

    fun getTranslation(locale: String, key: String): String {
        return translations[locale]?.get(key) ?: key
    }
}

// Example usage of LocalizationManager:
fun main() {
    val localizationManager = LocalizationManager()
    println(localizationManager.getTranslation("en", "greeting"))  // Output: Hello
    println(localizationManager.getTranslation("ar", "greeting"))  // Output: مرحبا
}