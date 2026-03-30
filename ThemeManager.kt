package com.example.theme

class ThemeManager {
    var isDarkMode: Boolean = false

    fun toggleTheme() {
        isDarkMode = !isDarkMode
    }

    fun applyTheme() {
        if (isDarkMode) {
            // Apply dark mode theme
            println("Dark mode applied")
        } else {
            // Apply light mode theme
            println("Light mode applied")
        }
    }
}