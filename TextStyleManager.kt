// TextStyleManager.kt

// This class manages multiple text design and styling templates for the magic wand feature.

class TextStyleManager {

    // List of text styles
    private val textStyles: MutableList<TextStyle> = mutableListOf()

    init {
        loadDefaultStyles()
    }

    // Load default text styles
    private fun loadDefaultStyles() {
        textStyles.add(TextStyle("Bold", "font-weight: bold;"))
        textStyles.add(TextStyle("Italic", "font-style: italic;"))
        textStyles.add(TextStyle("Underline", "text-decoration: underline;"))
        textStyles.add(TextStyle("Strike Through", "text-decoration: line-through;"))
        textStyles.add(TextStyle("Highlight", "background-color: yellow;"))
        // Add more styles as needed
    }

    // Apply a text style by name
    fun applyStyle(styleName: String, text: String): String {
        val style = textStyles.find { it.name == styleName }
        return style?.let { "<span style='${it.style}'>${text}</span>" } ?: text
    }

    // Get all available text styles
    fun getAvailableStyles(): List<String> {
        return textStyles.map { it.name }
    }
}

// Data class to represent a text style
data class TextStyle(val name: String, val style: String)