package ru.miit.course.kotlin.demo2

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class BlankFragment2 : Fragment() {
    val TAG: String = "Fragment2 lifecycle"
    val ESENIN_TAG: String = "Esenin"

    var wasVisible = false
    var showed19 = false

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(ESENIN_TAG, "А за что? А за то, что пью я,")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(ESENIN_TAG, "Разве можно за это ругать,")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (!wasVisible) {
            Log.i(ESENIN_TAG, "Коль на этой на пьяной планете")
        } else {
            if (!showed19)
                Log.i(ESENIN_TAG, "С неба светит лиловый сатин.")
            showed19 = true
        }

        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onStart() {
        super.onStart()
        if (!wasVisible)
            Log.i(ESENIN_TAG, "Родила меня бедная мать.")
    }

    override fun onResume() {
        super.onResume()
        if (!wasVisible)
            Log.i(ESENIN_TAG, "Я стою никому не нужен,")
    }

    override fun onPause() {
        super.onPause()
        if (!wasVisible)
            Log.i(ESENIN_TAG, "Одинокий и пьяный, один.")
    }

    override fun onStop() {
        super.onStop()
        if (!wasVisible)
            Log.i(ESENIN_TAG, "Месяц рожу полощет в луже,")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        wasVisible = true;
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment BlankFragment2.
         */
        @JvmStatic
        fun newInstance() = BlankFragment2()
    }
}
