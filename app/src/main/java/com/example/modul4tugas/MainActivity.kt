package com.example.modul4tugas

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Tampil(view: View) {

        val radio = findViewById<RadioGroup>(R.id.radioGroup)
        val radiopil = radio.checkedRadioButtonId
        val radiobut = findViewById<RadioButton>(radiopil)
        val radioview = radiobut.text

        val nama = findViewById<EditText>(R.id.editNama)
        val namaview = nama.text
        val tampil = Toast.makeText(applicationContext,"nama :" + namaview + " Gender :" + radioview, Toast.LENGTH_SHORT)
        tampil.show()

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)


    }

    fun coding(view: View) {
        val cbcd = cbCoding.isChecked
        val isic = findViewById<CheckBox>(R.id.cbCoding)
        if (cbcd==true)
        {
            printHobi("Tampil","Hobi " + isic.text)
        }
        if (cbcd==false){
            printHobi("Batal","Hobi " + isic.text)
        }

    }

    fun reading(view: View) {
        val cbr = cbReading.isChecked
        val isir = findViewById<CheckBox>(R.id.cbReading)
        if (cbr==true)
        {
            printHobi("Tampil","Hobi " + isir.text)
        }
        if (cbr==false){
            printHobi("Batal","Hobi " + isir.text)
        }
    }

    fun travelling(view: View) {
        val cbt = cbTraveling.isChecked
        val isit = findViewById<CheckBox>(R.id.cbTraveling)
        if (cbt==true)
        {
            printHobi("Tampil","Hobi " + isit.text)
        }
        if (cbt==false){
            printHobi("Batal","Hobi " + isit.text)
        }
    }

    fun printHobi(hasil:String,isi:String){
        if (hasil=="Tampil"){
            Toast.makeText(this@MainActivity,"Anda memilih "+isi,Toast.LENGTH_SHORT).show()
        }
        else if (hasil=="Batal"){
            Toast.makeText(this@MainActivity,"Anda Membatalkan Pilihan "+isi,Toast.LENGTH_SHORT).show()
        }
    }

    fun Batal(view: View) {
        editNama.text.clear()
        radioGroup.clearCheck()
        val hapus = Toast.makeText(applicationContext,"Data Berhasil di Hapus", Toast.LENGTH_SHORT)
        hapus.show()
    }
}
