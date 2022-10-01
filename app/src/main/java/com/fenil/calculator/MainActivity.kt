package com.fenil.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button5:Button
    lateinit var button6:Button
    lateinit var button7:Button
    lateinit var button9:Button
    lateinit var button10:Button
    lateinit var button11:Button
    lateinit var button13:Button
    lateinit var button14:Button
    lateinit var button15:Button
    lateinit var button16:Button
    val data:values= values()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        givetext()

    }


    fun givetext(){
        button5=findViewById(R.id.b5)
        button6=findViewById(R.id.b6)
        button7=findViewById(R.id.b7)
        button9=findViewById(R.id.b9)
        button10=findViewById(R.id.b10)
        button11=findViewById(R.id.b11)
        button13=findViewById(R.id.b13)
        button14=findViewById(R.id.b14)
        button15=findViewById(R.id.b15)
        button16=findViewById(R.id.b16)
        button5.text = data.b5.toString()
        button6.text=data.b6.toString()
        button7.text=data.b7.toString()
        button9.text=data.b9.toString()
        button10.text=data.b10.toString()
        button11.text=data.b11.toString()
        button13.text=data.b13.toString()
        button14.text=data.b14.toString()
        button15.text=data.b15.toString()
        button16.text=data.b16.toString()

    }
}