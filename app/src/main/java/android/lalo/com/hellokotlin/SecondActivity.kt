package android.lalo.com.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val n = intent.getIntExtra("numero", -1)
        val texto = findViewById<TextView>(R.id.textView2)
        texto.setText(n.toString())
    }
}
