package com.example.ultimatelukproyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
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


class clientes : AppCompatActivity() {
    private lateinit var analytics: FirebaseAnalytics
    // private lateinit var auth: FirebaseAuth

    private lateinit var txtIdentificacion: EditText
    private lateinit var txtCodiperf: EditText
    private lateinit var txtNombres: EditText
    private lateinit var txtApelli: EditText
    private lateinit var txtDirecc: EditText
    private lateinit var txtCell: EditText
    private lateinit var txtCorreo: EditText
    private lateinit var txtFechanacimi: EditText
    private lateinit var txtFechaIngr: EditText
    private lateinit var txtSubscripcion: EditText
    private lateinit var txtTipologin: EditText
    private lateinit var txtTipoperfil: EditText
    private lateinit var txtTarjeta: EditText

    private lateinit var RegisterButton: Button

    private lateinit var dbRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clientes)
/*
// llamar botones y textos y insertar
        txtIdentificacion = findViewById(R.id.txtidentificacion)
        txtCodiperf = findViewById(R.id.txtcodperfil)
        txtNombres = findViewById(R.id.txtnombres)
        txtApelli = findViewById(R.id.txtapellidos)
        txtDirecc = findViewById(R.id.txtdireccion)
        txtCell = findViewById(R.id.txtcel)
        txtCorreo = findViewById(R.id.txtcorreo)
        txtFechanacimi = findViewById(R.id.txtfechadenac)
        txtFechaIngr = findViewById(R.id.txtfechadeing)
        txtSubscripcion = findViewById(R.id.txtsuscrpcion)
        txtTipologin = findViewById(R.id.txttipodeloging)
        txtTipoperfil= findViewById(R.id.txtPerfil)
        txtTarjeta= findViewById(R.id.txttarjeta)

        RegisterButton = findViewById(R.id.btnregistrar)

        dbRef = FirebaseDatabase.getInstance().getReference("Clientes")

        RegisterButton.setOnClickListener{
            saveClientes()
        }
        */
        /*
    }
    private fun saveClientes() {
        //obtener valores

        val CodIdent = txtCodigo.text.toString()
        val CodCodiperfil = txtDescripcion.text.toString()
        val CodNombres = txtSecuencia.text.toString()
        val CodApellid = txtCodmenu.text.toString()
        val CodDirecc= txtCodigo.text.toString()
        val CodCell = txtDescripcion.text.toString()
        val CodCorreo = txtSecuencia.text.toString()
        val CodFechanac = txtCodmenu.text.toString()
        val CodFechaIngre = txtCodigo.text.toString()
        val CodSubs = txtDescripcion.text.toString()
        val Cod = txtSecuencia.text.toString()
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
    */

    }
}