package com.songeun.demo_kotlin.bootstrap

/**
 * Demonstrates Kotlin features:
 * - Data class that automatically generates:
 *   equals(), hashCode(), toString(), component functions, and copy()
 * - Immutable properties (val)
 * - Nullable types (String?): The text property can hold null,
 *   unlike regular String which cannot
 */
data class CreateMessageRequest(val id: String, val text: String?)
