package id.ac.unp.ft.elektronika1.jobseheet1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText:EditText
    private lateinit var buttonButton: Button
    private lateinit var buttonTextView: TextView

    private fun initComponent() {
        nameEditText = findViewById(R.id.nameEditText)
        buttonButton = findViewById(R.id.buttonButton)
        buttonTextView= findViewById(R.id.buttonTextView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        initComponent()

        buttonTextView.text = resources.getString(R.string.app_name)

        buttonButton.setOnClickListener{
          val name = nameEditText.text.toString()
          buttonTextView.text = "halo tiara"

            resources.getStringArray(R.array.names).forEach {
                Log.i("PZN",it )
            }
       }
   }
}