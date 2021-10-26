package com.idat.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.* // import components layout

class MainActivity : AppCompatActivity() {
    private var numUno : Double = 0.0
    private var numDos : Double = 0.0

    private var opc = true
    private var operacion = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSuma.setOnClickListener{
        }
        btnUno.setOnClickListener{
            btnClick("1")
        }
        btnDos.setOnClickListener{
            btnClick("2")
        }
       btnTres.setOnClickListener{
            btnClick("3")
        }
        btnCuatro.setOnClickListener{
            btnClick("4")
        }
        btnCinco.setOnClickListener{
            btnClick("5")
        }
       btnSeis.setOnClickListener{
            btnClick("6")
        }
        btnSiete.setOnClickListener{
            btnClick("7")
        }
        btnOcho.setOnClickListener{
            btnClick("8")
        }
        btnNueve.setOnClickListener{
            btnClick("9")
        }
    }

    private fun btnClick(num:String){
        if(opc){
            txtPrincipal.setText("")
        }
        opc = false
        txtPrincipal.text = "${txtPrincipal.text}$num"
    }

    private fun btnSuma(){
        numUno = txtPrincipal.text.toString().toDouble()
        Toast.makeText(applicationContext,"Esto es una suma",Toast.LENGTH_SHORT).show()
    }

}
