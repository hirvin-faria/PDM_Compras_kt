package com.example.android.compras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var chkArroz: CheckBox = findViewById(R.id.chkArroz)
        var chkLeite: CheckBox = findViewById(R.id.chkLeite)
        var chkCarne: CheckBox = findViewById(R.id.chkCarne)
        var chkFeijao: CheckBox = findViewById(R.id.chkFeijao)
        var btnTotal: Button = findViewById(R.id.btnTotal)

        btnTotal.setOnClickListener {
            var total: Float = 0F
            if (chkArroz.isChecked)
                total += 2.69F
            if (chkLeite.isChecked)
                total += 5.00F
            if (chkCarne.isChecked)
                total += 9.70F
            if (chkFeijao.isChecked)
                total += 2.30F

            val alertDialogBuilder = AlertDialog.Builder(this)
                alertDialogBuilder.setTitle("Valor Total das Compras")
                alertDialogBuilder.setMessage(total.toString())
                alertDialogBuilder.setPositiveButton(android.R.string.yes) { dialog, which ->
                    Toast.makeText(applicationContext,
                        android.R.string.yes, Toast.LENGTH_SHORT).show()
                }
                alertDialogBuilder.show()
        }

    }
}
