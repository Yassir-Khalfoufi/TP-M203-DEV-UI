package ma.ofppt.ista.alamal

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.gestures.snapping.SnapPosition.Center.position
import com.google.android.material.materialswitch.MaterialSwitch

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)
        // Votre code ici

        /*val tgl = findViewById<ToggleButton>(R.id.tglClim)
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

        }*/
        val sp1 = findViewById<Spinner>(R.id.spPoste)
        val txtPoste = findViewById<TextView>(R.id.txtPostes)

        sp1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                txtPoste.text = p0?.getItemAtPosition(p2).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        val btnVider = findViewById<Button>(R.id.btnVider)
        val postes = mutableListOf("Poste 01", "Poste", "Poste 03", "poste 04", "Poste 05")
        val adapterSp1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, postes)
        // lier l adapter au liste
        sp1.adapter = adapterSp1
        //vider la liste quand on la clique
        btnVider.setOnClickListener {  }
    }
}
