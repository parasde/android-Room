package com.parasde.example.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.parasde.example.R
import com.parasde.example.db.entity.User

class UserAdapter(private var userList: ArrayList<User>): RecyclerView.Adapter<UserHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        return UserHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.user_item,
                    parent,
                    false)
        )
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.no.text = "${userList[holder.adapterPosition].USER_NO}"
        holder.name.text = userList[holder.adapterPosition].USER_NAME
        holder.regDt.text = userList[holder.adapterPosition].REG_DT
    }

    fun update(list: ArrayList<User>) {
        userList = list
        notifyDataSetChanged()
    }
}