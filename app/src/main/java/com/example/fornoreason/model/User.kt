package com.example.fornoreason.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int,
    val name: String,
    val league_id: Int,
    val points: Int,
    val created_at: String
) 