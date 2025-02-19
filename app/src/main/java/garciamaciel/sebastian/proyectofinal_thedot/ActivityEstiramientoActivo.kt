package garciamaciel.sebastian.proyectofinal_thedot

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ActivityEstiramientoActivo : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estiramiento_activo)

        /*Oculta la action bar*/
        supportActionBar?.hide()

        val botonRegresar:ImageButton = findViewById<ImageButton>(R.id.boton_regresar_estiramiento_activo)

        botonRegresar.setOnClickListener() {
            var intent: Intent = Intent(this, ActivityEstiramiento::class.java)
            startActivity(intent)
        }
    }
}