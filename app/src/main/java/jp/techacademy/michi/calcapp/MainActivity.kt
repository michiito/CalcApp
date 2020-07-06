package jp.techacademy.michi.calcapp


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.design.widget.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)

        val command1 = editText1.text.toString()
        val command2 = editText2.text.toString()

            if (command1 == "" || command2 == "") {

                    Snackbar.make(v, "数字を入力してください。", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action") {
                        }.show()


            }else{

                val number1 = command1.toDouble()
                val number2 = command2.toDouble()

                when (v.id) {
                    R.id.button1 -> intent.putExtra("VALUE1", number1 + number2)

                    R.id.button2 -> intent.putExtra("VALUE1", number1 - number2)

                    R.id.button3 -> intent.putExtra("VALUE1", number1 * number2)

                    R.id.button4 -> intent.putExtra("VALUE1", number1 / number2)

            }


                    startActivity (intent)
        }
    }
}

