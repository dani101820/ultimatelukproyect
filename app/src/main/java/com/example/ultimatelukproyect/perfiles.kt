package com.example.ultimatelukproyect


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.ultimatelukproyect.Employeemodel
import com.example.ultimatelukproyect.R
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class perfiles : AppCompatActivity() {

    private lateinit var analytics: FirebaseAnalytics
    // private lateinit var auth: FirebaseAuth

    private lateinit var txtCodigo: EditText
    private lateinit var txtDescripcion: EditText
    private lateinit var txtSecuencia: EditText
    private lateinit var txtCodmenu: EditText
    private lateinit var loginButton: Button

    private lateinit var  dbRef: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfiles)
        //bundle
        analytics = Firebase.analytics
        val bundle = Bundle()
        bundle.putString("message", "Integracion de firebase completa ")
        analytics.logEvent("InitScreen",bundle)
        // insertar datos


        txtCodigo = findViewById(R.id.txtcodigo)
        txtDescripcion = findViewById(R.id.txtdescripcion)
        txtSecuencia = findViewById(R.id.txtsecuencia)
        txtCodmenu = findViewById(R.id.txtcodmenu)
        loginButton = findViewById(R.id.loginButton)

        dbRef = FirebaseDatabase.getInstance().getReference("Perfiles")

        loginButton.setOnClickListener{
            saveEmployeeData()
        }

    }


    private fun saveEmployeeData() {
        //obtener valores

        val perfCod = txtCodigo.text.toString()
        val perfDes = txtDescripcion.text.toString()
        val perSecu = txtSecuencia.text.toString()
        val perfCodM = txtCodmenu.text.toString()


        //val  empName = emailText.text.toString()
        //val empPassa = passaworText.text.toString()

        if(perfCod.isEmpty()){
            txtCodigo.error = "porfavor escriba algo"
        }
        else if(perfDes.isEmpty()){
            txtDescripcion.error = "porfavor escriba algo"
        }
        else if(perSecu.isEmpty()){
            txtSecuencia.error = "porfavor escriba algo"
        }
        else if(perfCodM.isEmpty()){
            txtCodmenu.error = "porfavor escriba algo"
        }
        //nombrar datos
        val empId = dbRef.push().key!!
        val employee = Employeemodel(empId,perfCod,perfDes,perSecu,perfCodM,)
        //val employee = Employeemodel(empId,empName,empPassa)

        dbRef.child(empId).setValue(employee)
            .addOnCompleteListener{
                Toast.makeText(this,"Data inserted completamente " , Toast.LENGTH_LONG).show()
                val intentReg = Intent(
                    this@perfiles,
                    clientes::class.java
                )
                this@perfiles.startActivity(intentReg)
            }.addOnFailureListener{err ->
                Toast.makeText(this,"Error ${err.message} " , Toast.LENGTH_LONG).show()
            }
    }



}