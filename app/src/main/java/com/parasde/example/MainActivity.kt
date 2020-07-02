package com.parasde.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.parasde.example.adapter.UserAdapter
import com.parasde.example.db.UserDB
import com.parasde.example.db.entity.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test: Int
        val tes2: String

        userAdapter = UserAdapter(ArrayList())
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = RecyclerView.VERTICAL
        userList.apply {
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }

        insert.setOnClickListener {
            Thread {
                UserDB.getInstance(this)!!.userDao()
                    .insert(User(USER_NAME = name.text.toString()))
                viewUpdate(UserDB.getInstance(this)!!.userDao().select() as ArrayList<User>)
            }.start()
        }

        delete.setOnClickListener {
            Thread {
                UserDB.getInstance(this)!!.userDao().deleteAll()
                viewUpdate(UserDB.getInstance(this)!!.userDao().select() as ArrayList<User>)
            }.start()
        }

        search.setOnClickListener {
            Thread {
                viewUpdate(UserDB.getInstance(this)!!.userDao().search(name = "%${name.text}%") as ArrayList<User>)
            }.start()
        }
    }

    private fun viewUpdate(list: ArrayList<User>) {
        Handler(Looper.getMainLooper()).post {
            userAdapter.update(list)
        }
    }
}