package ru.miit.course.kotlin.demo2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {
    val TAG: String = "Activity lifecycle"
    val ESENIN_TAG: String = "Esenin"
    val fragmentManager: FragmentManager = supportFragmentManager

    lateinit var fragment1: Fragment
    lateinit var fragment2: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(ESENIN_TAG, "Месяц рожу полощет в луже,")

        var isFirstFragmentVisible = true
        fragment1 = BlankFragment1.newInstance()
        fragment2 = BlankFragment2.newInstance()

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

            if (isFirstFragmentVisible) {
                fragmentTransaction.replace(R.id.frameLayout, fragment1)
                fragmentTransaction.addToBackStack(null)
                isFirstFragmentVisible = false
            } else {
                fragmentTransaction.replace(R.id.frameLayout, fragment2)
                fragmentTransaction.addToBackStack(null)
                isFirstFragmentVisible = true
            }
            fragmentTransaction.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(ESENIN_TAG, "С неба светит лиловый сатин.")
    }

    override fun onResume() {
        super.onResume()
        Log.i(ESENIN_TAG, "Я стою никому не нужен,")
    }
}




