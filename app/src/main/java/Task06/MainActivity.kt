package Task06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.linearlayout.R

private lateinit var Botonlayout1: Button
private lateinit var Botonlayout2: Button
private lateinit var tablelayout1: Button
private lateinit var tablelayout2: Button
private lateinit var constraintlayout1: Button
private lateinit var constraintlayout2: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Botonlayout1 = findViewById(R.id.layout01_button)
        Botonlayout2 = findViewById(R.id.layout02_button)
        tablelayout1 = findViewById(R.id.table01_button)
        tablelayout2 = findViewById(R.id.table02_button)
        constraintlayout1 = findViewById(R.id.constraint01_button)
        constraintlayout2 = findViewById(R.id.constraint02_button)


        Botonlayout1.setOnClickListener {
            val intent = Intent(this, linear_layout01::class.java)
            startActivity(intent)
        }

        Botonlayout2.setOnClickListener {
            val intent = Intent(this, linear_layout02::class.java)
            startActivity(intent)
        }

        tablelayout1.setOnClickListener {
            val intent = Intent(this, table_layout01::class.java)
            startActivity(intent)
        }

        tablelayout2.setOnClickListener {
            val intent = Intent(this, table_layout02::class.java)
            startActivity(intent)
        }

        constraintlayout1.setOnClickListener {
            val intent = Intent(this, constraint_layout01::class.java)
            startActivity(intent)
        }

        constraintlayout2.setOnClickListener {
            val intent = Intent(this, constraint_layout02::class.java)
            startActivity(intent)
        }



    }

}



