package garciamaciel.sebastian.proyectofinal_thedot

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ActivityEstiramiento : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estiramiento)

        /*Oculta la action bar*/
        supportActionBar?.hide()

        val botonRegresar:ImageButton = findViewById<ImageButton>(R.id.boton_regresar_de_estriamiento)
        val botonEstiramientoPasivo:android.widget.Button = findViewById<android.widget.Button>(R.id.boton_estiramiento_pasivo)
        val botonEstiramientoActivo:android.widget.Button = findViewById<android.widget.Button>(R.id.boton_estiramiento_activo)
        val botonEstiramientoEstatico:android.widget.Button = findViewById<android.widget.Button>(R.id. boton_estiramiento_estatico)

        botonRegresar.setOnClickListener() {
            var intent: Intent = Intent(this, Inicio1::class.java)
            startActivity(intent)
        }

        botonEstiramientoPasivo.setOnClickListener() {
            var intent: Intent = Intent(this,  EstiramientoPasivo::class.java)
            startActivity(intent)
        }
        botonEstiramientoActivo.setOnClickListener() {
            var intent: Intent = Intent(this, ActivityEstiramientoActivo::class.java)
            startActivity(intent)
        }

        botonEstiramientoEstatico.setOnClickListener() {
            var intent: Intent = Intent(this, ActivyEstiramientoEstatico::class.java)
            startActivity(intent)
        }
    }
}