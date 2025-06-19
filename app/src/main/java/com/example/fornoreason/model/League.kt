package com.example.fornoreason.model

import kotlinx.serialization.Serializable

@Serializable
data class League(
    val id: Int,
    val name: String,
    val description: String,
    val created_at: String
)