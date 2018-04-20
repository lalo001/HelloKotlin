package android.lalo.com.hellokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var randomValue: Int = 0;

    fun random(view: View) {
        val r = Random()
        randomValue = r.nextInt(100)
        val text = findViewById<TextView>(R.id.textView)
        text.setText(randomValue.toString())

    }

    fun next(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("numero", randomValue)
        startActivity(intent)
    }
}
