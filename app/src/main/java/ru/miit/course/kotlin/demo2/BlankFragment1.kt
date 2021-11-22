package ru.miit.course.kotlin.demo2

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class BlankFragment1 : Fragment() {
    val TAG: String = "Fragment1 lifecycle"
    val ESENIN_TAG: String = "Esenin"

    var wasVisible = false

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(ESENIN_TAG, "Одинокий и пьяный, один.")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(ESENIN_TAG, " \n")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if (!wasVisible) {
            Log.i(ESENIN_TAG, "А хорошего в жизни мало,")
        }

        return inflater.inflate(R.layout.fragment_blank1, container, false)
    }

    override fun onStart() {
        super.onStart()
        if (!wasVisible) {
            Log.i(ESENIN_TAG, "Боль не тонет в проклятом вине,")
        }

    }

    override fun onResume() {
        super.onResume()
        if (!wasVisible)
            Log.i(ESENIN_TAG, "Даже та, что любил, перестала")
    }

    override fun onPause() {
        super.onPause()
        if (!wasVisible)
            Log.i(ESENIN_TAG, "Улыбаться при встрече мне.")
    }

    override fun onStop() {
        super.onStop()
        if (!wasVisible)
            Log.i(ESENIN_TAG, " \n")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        if (!wasVisible)
            Log.i(ESENIN_TAG, " \n")

        wasVisible = true;
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment BlankFragment1.
         */
        @JvmStatic
        fun newInstance() = BlankFragment1()
    }
}
