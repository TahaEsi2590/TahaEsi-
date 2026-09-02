package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = NeonCyan,
    onPrimary = Color(0xFF00363D),
    primaryContainer = Color(0xFF004F58),
    onPrimaryContainer = Color(0xFF8FF2FF),
    secondary = NeonEmerald,
    onSecondary = Color(0xFF003822),
    secondaryContainer = Color(0xFF005234),
    onSecondaryContainer = Color(0xFF86F8BF),
    tertiary = NeonOrange,
    onTertiary = Color(0xFF492900),
    tertiaryContainer = Color(0xFF693C00),
    onTertiaryContainer = Color(0xFFFFDCC1),
    background = DarkBackground,
    onBackground = TextPrimary,
    surface = DarkSurface,
    onSurface = TextPrimary,
    surfaceVariant = DarkCard,
    onSurfaceVariant = TextSecondary,
    outline = DarkCardBorder,
    error = NeonRed,
    onError = Color.White
)

private val LightColorScheme = androidx.compose.material3.lightColorScheme(
    primary = ElectricBlue,
    onPrimary = Color.White,
    secondary = NeonEmerald,
    onSecondary = Color.White,
    tertiary = NeonOrange,
    onTertiary = Color.White,
    background = Color.White,
    onBackground = Color(0xFF111827),
    surface = Color(0xFFF5F7FA),
    onSurface = Color(0xFF111827),
    surfaceVariant = Color(0xFFEFF2F6),
    onSurfaceVariant = Color(0xFF475569),
    outline = Color(0xFFD1D5DB),
    error = NeonRed,
    onError = Color.White
)

@Composable
fun JumpVpnTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}
