package com.example.simple_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnPlus:Button
    lateinit var btnMinus:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var etNumber1:EditText
    lateinit var etNumber2: EditText
    lateinit var tvCalculate:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus=findViewById(R.id.btnPlus)
        btnMinus=findViewById(R.id.btnMinus)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        etNumber1=findViewById(R.id.etNumber1)
        etNumber2=findViewById(R.id.etNumber2)
        tvCalculate=findViewById(R.id.tvCalculate)

        btnPlus.setOnClickListener {
            val number1=etNumber1.text.toString()
            val number2=etNumber2.text.toString()
            if (number1.isBlank()){
                etNumber1.setError("Enter the first number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("Enter the second number")
                return@setOnClickListener
            }
            addition(number1.toDouble(),number2.toDouble())
        }
        btnMinus.setOnClickListener {
            val number1=etNumber1.text.toString()
            val number2=etNumber2.text.toString()
            if (number1.isBlank()){
                etNumber1.setError("Enter the first number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("Enter the second number")
                return@setOnClickListener
            }
            minus(number1.toDouble(),number2.toDouble())
        }
        btnMultiply.setOnClickListener {
            val number1=etNumber1.text.toString()
            val number2=etNumber2.text.toString()
            if (number1.isBlank()){
                etNumber1.setError("Enter the first number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("Enter the second number")
                return@setOnClickListener
            }
            multiply(number1.toDouble(),number2.toDouble())
        }

        btnModulus.setOnClickListener {
            val number1=etNumber1.text.toString()
            val number2=etNumber2.text.toString()
            if (number1.isBlank()){
                etNumber1.setError("Enter the first number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                etNumber2.setError("Enter the second number")
                return@setOnClickListener
            }
            modulus(number1.toDouble(),number2.toDouble())
        }


    }
    fun addition(number1:Double, number2:Double){
        var add=number1+number2
        tvCalculate.text=add.toString()
    }
    fun minus(number1:Double, number2:Double){
        var add=number1-number2
        tvCalculate.text=add.toString()
    }
    fun multiply(number1:Double, number2:Double){
        var add=number1*number2
        tvCalculate.text=add.toString()
    }
    fun modulus(number1:Double, number2:Double){
        var add=number1%number2
        tvCalculate.text=add.toString()
    }

}