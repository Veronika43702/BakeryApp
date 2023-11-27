package com.example.bakeryapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.sql.ResultSet
import com.example.bakeryapp.database.DBConnection
import com.example.bakeryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val db = DBConnection().getDBConnection()
        val table: ResultSet?
        if (db != null) {
            table = DBConnection().querySelect(db, "SELECT component_name, product_name FROM components where type = 'бисквит'")
            table?.let { DBConnection().printTable(it) }
        }
        else println("failed")
    }
}