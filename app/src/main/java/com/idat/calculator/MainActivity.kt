package com.idat.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.* // import components layout

class MainActivity : AppCompatActivity() {
    private var numUno : Double = 0.0
    private var numDos : Double = 0.0
    private var resultado : Double = 0.0

    val signo:String = "."

    private var opc = true
    private var sig = true
    private var op = true
    private var opera = ""

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

        btnBorrar.setOnClickListener{
            btnClear()
        }
        btnPunto.setOnClickListener{
            btnDecimal()
        }
        btnCero.setOnClickListener{
            btnClick("0")
        }
        btnSuma.setOnClickListener{
            operacion()
            opera = "+"
        }
        btnResta.setOnClickListener{
            operacion()
            opera = "-"
        }
        btnMultiplicar.setOnClickListener{
            operacion()
            opera = "*"
        }
        btnDividir.setOnClickListener{
            operacion()
            opera = "/"
        }

        btnIgual.setOnClickListener{
            resultado(opera,numUno)
        }
    }

    private fun btnClick(num:String){
        if(opc){
            txtPrincipal.setText("")
        }
        opc = false
        txtPrincipal.text = "${txtPrincipal.text}${num}"
    }


    private fun operacion(): Double {
        numUno = txtPrincipal.text.toString().toDouble()
        txtPrincipal.setText("0")
        return numUno
    }
    private fun resultado(op:String,num:Double) {
        numDos = txtPrincipal.text.toString().toDouble()

        when(op){
            "+"->{
                resultado = num + numDos
                txtPrincipal.setText(resultado.toString())
            }
            "-"->{
                resultado = num - numDos
                txtPrincipal.setText(resultado.toString())
            }
            "*"->{
                resultado = num * numDos
                txtPrincipal.setText(resultado.toString())
            }
            "/"->{
                resultado = num / numDos
                txtPrincipal.setText(resultado.toString())
            }
            ""->{
                Toast.makeText(applicationContext,"Seleccionar operaci??n }",Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun btnClear(){
        txtPrincipal.setText("0")
        opc = true
        sig = true
        op = true
    }

    private fun btnDecimal(){
        if(sig){
            txtPrincipal.text  = "${txtPrincipal.text}${signo}"
        }
        sig = false
    }

}
