package com.example.fornoreason.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fornoreason.R
import com.example.fornoreason.model.League
import com.example.fornoreason.model.User

class UserAdapter(
    private var users: List<User>,
    private var leagues: List<League>
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
        val leagueTextView: TextView = view.findViewById(R.id.leagueTextView)
        val profileImageView: ImageView = view.findViewById(R.id.profileImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        val league = leagues.find { it.id == user.league_id }

        holder.nameTextView.text = user.name
        holder.leagueTextView.text = league?.name ?: "Unknown League"
        // Set default profile picture
        holder.profileImageView.setImageResource(R.drawable.dummy_profile)
    }

    override fun getItemCount() = users.size

    fun updateData(newUsers: List<User>, newLeagues: List<League>) {
        users = newUsers
        leagues = newLeagues
        notifyDataSetChanged()
    }
} 