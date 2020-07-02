package com.parasde.example.adapter

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.user_item.view.*

class UserHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val no: AppCompatTextView = itemView.userNo
    val name: AppCompatTextView = itemView.userName
    val regDt: AppCompatTextView = itemView.userRegDt
}