package com.dakam.tablelayouttest

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var version = findViewById<EditText>(R.id.version)
        var codename = findViewById<EditText>(R.id.codename)
        var btnAdd = findViewById<Button>(R.id.btn_add)
        var table = findViewById<TableLayout>(R.id.table)
        btnAdd.setOnClickListener{_->
            val tableRow = TableRow(getApplicationContext())

            val layoutParams = TableRow.LayoutParams()
            tableRow.setLayoutParams(layoutParams)
            val textViewVersion = TextView(getApplicationContext())
            textViewVersion.setText(version.text)

            tableRow.addView(textViewVersion,0)


            val textViewCodeName = TextView(getApplicationContext())
            textViewCodeName.setText(codename.text)
            tableRow.addView(textViewCodeName,1)
            tableRow.setBackgroundResource(R.color.pink_bg)


            val divider = View(this)
            divider.setLayoutParams(TableRow.LayoutParams(3, 15))
            divider.setBackgroundResource(R.color.white)
            table.addView(divider)
            table.addView(tableRow)

        }
    }
}