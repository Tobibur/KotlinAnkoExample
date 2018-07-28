package rahman.tobibur.com.kotlinpractise

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast("Hello Guys!")
        longToast("Welcome to Anko tutorial..")

        verticalLayout {
            val name = editText()
            button("Say Hello").setOnClickListener {
                toast("Hello, ${name.text}!")
            }
        }
    }
}
