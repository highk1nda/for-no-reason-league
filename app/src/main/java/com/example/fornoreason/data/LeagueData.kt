package com.example.fornoreason.data

import com.example.fornoreason.model.League
import com.example.fornoreason.model.User

object LeagueData {
    val leagues = listOf(
        League(1, "Platina", "Top league", ""),
        League(2, "Palladium", "Second league", ""),
        League(3, "Gold", "Third league", "")
    )

    val users = listOf(
        User(1, "AlexTheGreat", 1, 1000, ""),
        User(2, "MasterMind", 1, 950, ""),
        User(3, "ProGamer", 2, 900, ""),
        User(4, "ChampionX", 2, 850, ""),
        User(5, "ElitePlayer", 3, 800, "")
    )
} 