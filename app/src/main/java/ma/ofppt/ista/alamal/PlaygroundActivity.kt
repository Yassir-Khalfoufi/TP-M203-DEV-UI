package ma.ofppt.ista.alamal

import android.os.Bundle
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.materialswitch.MaterialSwitch

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)
        // Votre code ici

        val tgl = findViewById<ToggleButton>(R.id.tglClim)
        val mtSwitch = findViewById<MaterialSwitch>(R.id.swSilence)
        val txt = findViewById<TextView>(R.id.txtEtat)

        tgl.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                txt.text = "Clim : On"
            else
                txt.text = "Clim : Off"
        }

        mtSwitch.setOnCheckedChangeListener { _ /*(group isn't used)*/, i ->
            if (mtSwitch.isChecked)
                txt.text = "Mode Silenciexux"
            else
                txt.text = "Mode Vibrante"

        }
    }
}
