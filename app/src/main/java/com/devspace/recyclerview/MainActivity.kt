package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvlist = findViewById<RecyclerView>(R.id.rv_list)
        val adapter = ContactListAdapter()

        rvlist.adapter = adapter
        rvlist.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)
    }
}

val contacts = listOf(
    Contact(
        name = "Maira",
        phone = "(+353)830865122",
        icon = R.drawable.sample1
),
    Contact(
        name = "Gio",
        phone = "(+353)830865123",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Ana",
        phone = "(+353)830865142",
        icon = R.drawable.sample4
    ),
    Contact(
        name = "Paula",
        phone = "(+353)830865182",
        icon = R.drawable.sample5
    ),
    Contact(
        name = "Rob",
        phone = "(+353)830865722",
        icon = R.drawable.sample11
    ),
    Contact(
        name = "Marta",
        phone = "(+353)830865422",
        icon = R.drawable.sample16
    ),
    Contact(
        name = "Nil",
        phone = "(+353)830868722",
        icon = R.drawable.sample12
    ),
    Contact(
        name = "Val",
        phone = "(+353)830867822",
        icon = R.drawable.sample11
    ),
    Contact(
        name = "Marcos",
        phone = "(+353)830865722",
        icon = R.drawable.sample13
    ),

    )