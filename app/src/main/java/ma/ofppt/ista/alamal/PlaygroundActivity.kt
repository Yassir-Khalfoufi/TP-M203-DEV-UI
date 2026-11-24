package ma.ofppt.ista.alamal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

        // Votre code ici
        val imp = findViewById<CheckBox>(R.id.chkImpression)
        val csq = findViewById<CheckBox>(R.id.chkCasque)
        val scn = findViewById<CheckBox>(R.id.chkScanner)
        val calc = findViewById<Button>(R.id.prix)
        val totalText = findViewById<TextView>(R.id.total)

        calc.setOnClickListener {
            var total = 0
            var optChoisis = 0

            if (imp.isChecked) {
                total += 2
                optChoisis++
            }
            if (csq.isChecked) {
                total += 2
                optChoisis++
            }
            if (scn.isChecked) {
                total += 2
                optChoisis++
            }
            totalText.text = "Le prix totoal est : $total ($optChoisis Otpions)"
        }

    }
}
