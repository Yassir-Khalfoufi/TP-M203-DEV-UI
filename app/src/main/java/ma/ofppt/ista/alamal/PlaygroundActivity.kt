package ma.ofppt.ista.alamal

import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.view.ActionMode
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
        /*
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
        val sp1 = findViewById<Spinner>(R.id.spPoste)
        val txtPoste = findViewById<TextView>(R.id.txtPostes)

        sp1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                txtPoste.text = p0?.getItemAtPosition(p2).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                txtPoste.text = "Aucun poste choisi"    // no poste selected anymore
            }
        }
        val btnVider = findViewById<Button>(R.id.btnVider)
        val postes = mutableListOf("Poste 01", "Poste", "Poste 03", "poste 04", "Poste 05")
        val adapterSp1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, postes)
        // lier l adapter au liste
        sp1.adapter = adapterSp1
        //vider la liste quand on la clique
        btnVider.setOnClickListener {
            adapterSp1.clear()
        }
    */
        val textRes = findViewById<TextView>(R.id.txtResa)
        textRes.setOnLongClickListener {
            startSupportActionMode(RapRes())
            true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.s02_menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val txtMenu = findViewById<TextView>(R.id.txtMenu)
        when (item.itemId) {
            R.id.menu_tarifs -> txtMenu.text = "Le tarif est : 10dh / h"
            R.id.menu_aide -> txtMenu.text = "Aide"
            R.id.menu_apropos -> txtMenu.text = "à propos"
        }
        return true
    }
    /*
    //Contextual Menu
    val txtPoste3 = findViewById<TextView>(R.id.txtPoste3)
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?)
    {
        menuInflater.inflate(R.menu.s02_menu_poste, menu)
        //registerForContextMenu(txtPoste3)
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        val txtContexte = findViewById<TextView>(R.id.txtContexte)
        when (item.itemId) {
            R.id.poste_prolonger -> txtContexte.text = "Prolonger de 30 min"
            R.id.poste_liberer -> txtContexte.text = "Libérer le poste"
        }
        return true
    }
    */
    // menu d'actions contextuelles
    class RapRes() : ActionMode.Callback {
        override fun onActionItemClicked(
            mode: ActionMode?,
            item: MenuItem?
        ): Boolean {
            return false
            // use find view by id in this section (you can't by default)
        }

        override fun onCreateActionMode(
            mode: ActionMode?,
            menu: Menu?
        ): Boolean {
            mode?.menuInflater?.inflate(R.menu.s02_menu_action, menu)
            mode?.title = "1 reservation"
            return true
        }

        override fun onDestroyActionMode(mode: ActionMode?) {
            return
        }

        override fun onPrepareActionMode(
            mode: ActionMode?,
            menu: Menu?
        ): Boolean {
            return false
        }
    }
}