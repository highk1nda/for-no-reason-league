package com.example.fornoreason

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fornoreason.adapter.UserAdapter
import com.example.fornoreason.model.League
import com.example.fornoreason.model.User
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set current date
        val dateTextView = findViewById<TextView>(R.id.dateTextView)
        val dateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault())
        dateTextView.text = "Last updated: ${dateFormat.format(Date())}"

        // Setup RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.usersRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Example static data
        val leagues = listOf(
            League(1, "Platina", "", ""),
            League(2, "Palladium", "", ""),
            League(3, "Gold", "", "")
        )
        val users = listOf(
            User(1, "AlexTheGreat", 1, 0, ""),
            User(2, "MasterMind", 1, 0, ""),
            User(3, "ProGamer", 2, 0, "")
        )
        userAdapter = UserAdapter(users, leagues)
        recyclerView.adapter = userAdapter
    }
}