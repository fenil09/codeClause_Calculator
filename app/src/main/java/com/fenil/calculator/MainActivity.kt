package com.fenil.calculator

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity(),View.OnTouchListener {
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
    lateinit var button1:Button
    lateinit var minusbutton:Button
    lateinit var clearbutton:Button
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
        button1=findViewById(R.id.b1)
        minusbutton=findViewById(R.id.b12)
        clearbutton=findViewById(R.id.b2)
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


    @SuppressLint("ClickableViewAccessibility")
    fun setonclick(){
        button5.setOnTouchListener(this)
        button6.setOnTouchListener(this)
        button7.setOnTouchListener(this)
        addbutton.setOnTouchListener(this)
        button9.setOnTouchListener(this)
        button10.setOnTouchListener(this)
        button11.setOnTouchListener(this)
        minusbutton.setOnTouchListener(this)
        button13.setOnTouchListener(this)
        button14.setOnTouchListener(this)
        button15.setOnTouchListener(this)
        button1.setOnTouchListener(this)
        clearbutton.setOnTouchListener(this)
        dividebutton.setOnTouchListener(this)
        multiplybutton.setOnTouchListener(this)
        equalbutton.setOnTouchListener(this)


    }


    fun check(){
       val data=textview.text.toString()
        if(data.isNotEmpty()){
            val result=ExpressionBuilder(data).build().evaluate().toString()
            textview.setText("")
            textview.append(result)
        }
        else{
            Toast.makeText(this,"Please enter valid data to perform operations",Toast.LENGTH_LONG).show()
        }

    }


    fun vibrateonclick(){
        val vibrator=this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(VibrationEffect.createOneShot(150,VibrationEffect.DEFAULT_AMPLITUDE))
    }

    @SuppressLint("ClickableViewAccessibility", "ResourceAsColor", "PrivateResource")
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (v != null) {
            when(v.id){
                R.id.b5 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_UP ->{
                               button5.setBackgroundResource(R.drawable.roundbutton)
                                button5.setTextColor(Color.parseColor("#ffffff"))
                            }
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="7"
                                textview.append(evalutedata)
                                button5.setBackgroundResource(R.drawable.roundbutton2)
                                button5.setTextColor(R.color.black)
                                vibrateonclick()
                            }                        }
                    }
                }

                R.id.b6 -> {
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="8"
                                textview.append(evalutedata)
                                button6.setBackgroundResource(R.drawable.roundbutton2)
                                button6.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                button6.setBackgroundResource(R.drawable.roundbutton)
                                button6.setTextColor(Color.parseColor("#ffffff"))
                            }
                        }
                    }
                }

                R.id.b7 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="9"
                                textview.append(evalutedata)
                                button7.setBackgroundResource(R.drawable.roundbutton2)
                                button7.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                button7.setBackgroundResource(R.drawable.roundbutton)
                                button7.setTextColor(Color.parseColor("#ffffff"))
                            }
                        }
                    }

                }

                R.id.b8 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="+"
                                textview.append(evalutedata)
                                addbutton.setBackgroundResource(R.drawable.roundbutton2)
                                addbutton.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                addbutton.setBackgroundResource(R.drawable.roundbutton)
                                addbutton.setTextColor(Color.parseColor("#3DE306"))
                            }
                        }
                    }
                }

                R.id.b9 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="4"
                                textview.append(evalutedata)
                                button9.setBackgroundResource(R.drawable.roundbutton2)
                                button9.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                button9.setBackgroundResource(R.drawable.roundbutton)
                                button9.setTextColor(Color.parseColor("#ffffff"))
                            }
                        }
                    }
                }
                R.id.b10 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="5"
                                textview.append(evalutedata)
                                button10.setBackgroundResource(R.drawable.roundbutton2)
                                button10.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                button10.setBackgroundResource(R.drawable.roundbutton)
                                button10.setTextColor(Color.parseColor("#ffffff"))
                            }
                        }
                    }
                }
                R.id.b11 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="6"
                                textview.append(evalutedata)
                                button11.setBackgroundResource(R.drawable.roundbutton2)
                                button11.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                button11.setBackgroundResource(R.drawable.roundbutton)
                                button11.setTextColor(Color.parseColor("#ffffff"))
                            }
                        }
                    }
                }
                R.id.b12 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="-"
                                textview.append(evalutedata)
                                minusbutton.setBackgroundResource(R.drawable.roundbutton2)
                                minusbutton.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                minusbutton.setBackgroundResource(R.drawable.roundbutton)
                                minusbutton.setTextColor(Color.parseColor("#3DE306"))
                            }
                        }
                    }
                }

                R.id.b13 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="1"
                                textview.append(evalutedata)
                                button13.setBackgroundResource(R.drawable.roundbutton2)
                                button13.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                button13.setBackgroundResource(R.drawable.roundbutton)
                                button13.setTextColor(Color.parseColor("#ffffff"))
                            }
                        }
                    }
                }
                R.id.b14 -> {
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="2"
                                textview.append(evalutedata)
                                button14.setBackgroundResource(R.drawable.roundbutton2)
                                button14.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                button14.setBackgroundResource(R.drawable.roundbutton)
                                button14.setTextColor(Color.parseColor("#ffffff"))
                            }
                        }
                    }
                }
                R.id.b15 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="3"
                                textview.append(evalutedata)
                                button15.setBackgroundResource(R.drawable.roundbutton2)
                                button15.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                button15.setBackgroundResource(R.drawable.roundbutton)
                                button15.setTextColor(Color.parseColor("#ffffff"))
                            }
                        }
                    }
                }

                R.id.b16 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                              check()
                                equalbutton.setBackgroundResource(R.drawable.roundbutton2)
                                equalbutton.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                equalbutton.setBackgroundResource(R.drawable.equalbuttonstyle)
                                equalbutton.setTextColor(Color.parseColor("#ffffff"))
                            }
                        }
                    }
                }

                R.id.b1 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="0"
                                textview.append(evalutedata)
                                button1.setBackgroundResource(R.drawable.roundbutton2)
                                button1.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                button1.setBackgroundResource(R.drawable.roundbutton)
                                button1.setTextColor(Color.parseColor("#ffffff"))
                            }
                        }
                    }
                }

                R.id.b2 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                textview.text=""
                                clearbutton.setBackgroundResource(R.drawable.roundbutton2)
                                clearbutton.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                clearbutton.setBackgroundResource(R.drawable.roundbutton)
                                clearbutton.setTextColor(Color.parseColor("#ff0000"))
                            }
                        }
                    }
                }

                R.id.b3 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="/"
                                textview.append(evalutedata)
                                dividebutton.setBackgroundResource(R.drawable.roundbutton2)
                                dividebutton.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                dividebutton.setBackgroundResource(R.drawable.roundbutton)
                                dividebutton.setTextColor(Color.parseColor("#3DE306"))
                            }
                        }
                    }
                }
                R.id.b4 ->{
                    if (event != null) {
                        when(event.action){
                            MotionEvent.ACTION_DOWN ->{
                                evalutedata="*"
                                textview.append(evalutedata)
                                multiplybutton.setBackgroundResource(R.drawable.roundbutton2)
                                multiplybutton.setTextColor(R.color.black)
                                vibrateonclick()
                            }
                            MotionEvent.ACTION_UP ->{
                                multiplybutton.setBackgroundResource(R.drawable.roundbutton)
                                multiplybutton.setTextColor(Color.parseColor("#3DE306"))
                            }
                        }
                    }
                }
            }
        }
      return true
    }


}