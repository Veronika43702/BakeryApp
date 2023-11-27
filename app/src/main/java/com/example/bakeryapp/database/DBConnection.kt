package com.example.bakeryapp.database

import android.os.StrictMode
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

class DBConnection(
) {
    fun getDBConnection(): Connection? {
        var db: Connection? = null
        try {
            //Class.forName("org.postgresql.Driver")
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)
            db = DriverManager.getConnection(
                "jdbc:postgresql://$host:$port/$database",
                user,
                password
            )
            println("connection success")
            return db
        } catch (e: Exception) {
            println("connection failed")
            e.printStackTrace()
        }
        return db
    }

    fun querySelect(db: Connection, query: String): ResultSet? {
        val statement: Statement
        var result: ResultSet? = null
        try {
            statement = db.createStatement()
            result = statement.executeQuery(query)
            return result

        } catch (e: Exception) {
            println(e.stackTrace);
        }
        return result
    }

    fun printTable(table: ResultSet) {
        val columns = table.getMetaData().getColumnCount()
        while (table.next()) {
            for (i in 1..columns) {
                print(table.getString(i) + "\t")
            }
            println()
        }
    }
}


