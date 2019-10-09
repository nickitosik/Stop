package com.example.stop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var truelogin:String="nikitos"
    var truePass:String="privet"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun DANCE(v: View){
        var LOGIN : EditText=findViewById(R.id.s)
        var PAROL : EditText = findViewById(R.id.a)
        var res : TextView = findViewById(R.id.a)
        if (truelogin == LOGIN.text.toString() && truePass == PAROL.text. toString() ) {
            var next  = Intent (this, Main2Activity::class.java)
            startActivity(next)
        }
        else{
           finish()
        }
    }

}
