package com.fenil.calculator

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var button5:Button
    lateinit var button6:Button
    lateinit var button7:Button
    lateinit var button9:Button
    lateinit var button10:Button
    lateinit var button11:Button
    lateinit var button13:Button
    lateinit var button14:Button
    lateinit var button15:Button
    lateinit var equalbutton:Button
    lateinit var addbutton:Button
    lateinit var clearbutton:Button
    lateinit var minusbutton:Button
    lateinit var percentagebutton:Button
    lateinit var dividebutton:Button
    lateinit var multiplybutton:Button
    val data:values= values()
    lateinit var textview:TextView
    var evalutedata:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        givetext()

        addbutton=findViewById(R.id.b8)
        clearbutton=findViewById(R.id.b1)
        minusbutton=findViewById(R.id.b12)
        percentagebutton=findViewById(R.id.b2)
        dividebutton=findViewById(R.id.b3)
        multiplybutton=findViewById(R.id.b4)
        setonclick()

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
        equalbutton=findViewById(R.id.b16)
        textview=findViewById(R.id.textView)
        button5.text = data.b5.toString()
        button6.text=data.b6.toString()
        button7.text=data.b7.toString()
        button9.text=data.b9.toString()
        button10.text=data.b10.toString()
        button11.text=data.b11.toString()
        button13.text=data.b13.toString()
        button14.text=data.b14.toString()
        button15.text=data.b15.toString()
        equalbutton.text=data.b16


    }

    override fun onClick(v: View?) {

        if (v != null) {
            when(v.id){
                R.id.b5 -> {
                    evalutedata="7"
                    textview.append(evalutedata)
                }
                R.id.b6 -> {
                    evalutedata="8"
                    textview.append(evalutedata)
                }

                R.id.b7 -> {
                    evalutedata="9"
                    textview.append(evalutedata)
                }

                R.id.b8 -> {
                    evalutedata="+"
                    textview.append(evalutedata)
                }

                R.id.b9 -> {
                    evalutedata="4"
                    textview.append(evalutedata)
                }

                R.id.b10 ->{
                    evalutedata="5"
                    textview.append(evalutedata)
                }

                R.id.b11 -> {
                    evalutedata="6"
                    textview.append(evalutedata)
                }

                R.id.b12 ->{
                    evalutedata="-"
                    textview.append(evalutedata)
                }

                R.id.b13 ->{
                    evalutedata="1"
                    textview.append(evalutedata)
                }

                R.id.b14 -> {
                    evalutedata="2"
                    textview.append(evalutedata)
                }

                R.id.b15 ->{
                    evalutedata="3"
                    textview.append(evalutedata)
                }

                R.id.b16 ->{
                    val calculatedata:String=textview.text.toString()
                 var result=ExpressionBuilder(calculatedata).build().evaluate().toString()
                    textview.text=""
                    textview.append(result)

                }




                R.id.b1 -> {
                    textview.text=""
                }

                R.id.b2 ->{
                    evalutedata="%"
                    textview.append(evalutedata)
                }

                R.id.b3 ->{
                    evalutedata="/"
                    textview.append(evalutedata)
                }

                R.id.b4 -> {
                    evalutedata="*"
                    textview.append(evalutedata)



                }




            }
        }
    }

    fun setonclick(){
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        addbutton.setOnClickListener(this)
        button9.setOnClickListener(this)
        button10.setOnClickListener(this)
        button11.setOnClickListener(this)
        minusbutton.setOnClickListener(this)
        button13.setOnClickListener(this)
        button14.setOnClickListener(this)
        button15.setOnClickListener(this)
        clearbutton.setOnClickListener(this)
        percentagebutton.setOnClickListener(this)
        dividebutton.setOnClickListener(this)
        multiplybutton.setOnClickListener(this)
        equalbutton.setOnClickListener(this)

    }


}