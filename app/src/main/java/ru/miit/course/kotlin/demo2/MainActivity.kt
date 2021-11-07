package ru.miit.course.kotlin.demo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {
    val TAG : String = "Activity lifecycle"
    val ES : String = "Esenin"
    val fm: FragmentManager = supportFragmentManager



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate")
        Handler().postDelayed({}, 1000)
        Log.i(ES, "Месяц рожу полощет в луже,")

        var check: Boolean = true
        val fragment1: Fragment = BlankFragment1.newInstance("", "")
        val fragment2: Fragment = BlankFragment2.newInstance("", "")

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val ft: FragmentTransaction = fm.beginTransaction()

            if(check){
                ft.replace(R.id.fragment, fragment1)
                ft.addToBackStack(null)
                check = false

            }
            else{
                ft.replace(R.id.fragment, fragment2)
                ft.addToBackStack(null)
                check = true

            }
            ft.commit()

        }


    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume")
        Handler().postDelayed({}, 1000)
        Log.i(ES, "Я стою никому не нужен,")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart")
        Handler().postDelayed({}, 1000)
        Log.i(ES, "С неба светит лиловый сатин.")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause")
//        Log.i(ES, "Месяц рожу полощет в луже,")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop")
//        Log.i(ES, "Месяц рожу полощет в луже,")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy")
//        Log.i(ES, "Месяц рожу полощет в луже,")
    }
}




