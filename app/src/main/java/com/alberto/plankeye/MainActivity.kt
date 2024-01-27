import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.alberto.plankeye.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            // Adicione a ação do botão aqui
        }
    }
}