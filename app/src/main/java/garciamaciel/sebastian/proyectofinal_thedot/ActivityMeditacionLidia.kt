package garciamaciel.sebastian.proyectofinal_thedot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityMeditacionLidia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditacion_lidia)
        supportActionBar?.hide()
    }
}