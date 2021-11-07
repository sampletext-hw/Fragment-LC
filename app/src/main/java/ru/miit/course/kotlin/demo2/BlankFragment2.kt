package ru.miit.course.kotlin.demo2

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment2 : Fragment() {
    val TAG: String = "Fragment2 lifecycle"
    val ES : String = "Esenin"

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(TAG, "onAttach")
        Handler().postDelayed({}, 1000)
        Log.i(ES, " \n")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG, "onCreate")
        Handler().postDelayed({}, 1000)
        Log.i(ES, "А за что? А за то, что пью я,")
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.e(TAG, "onCreateView")
        Handler().postDelayed({}, 1000)
        Log.i(ES, " \n")
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(TAG, "onActivityCreated")
        Handler().postDelayed({}, 1000)
        Log.i(ES, "Я стою никому не нужен,")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart")
        Handler().postDelayed({}, 1000)
        Log.i(ES, "Одинокий и пьяный, один.")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume")
        Handler().postDelayed({}, 1000)
        Log.i(ES, "Месяц рожу полощет в луже,")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause")
        Handler().postDelayed({}, 1000)
        Log.i(ES, "С неба светит лиловый сатин.")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop")
        Handler().postDelayed({}, 1000)
//        Log.i(ES, "А хорошего в жизни мало,")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(TAG, "onDestroyView")
        Handler().postDelayed({}, 1000)
//        Log.i(ES, "А хорошего в жизни мало,")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e(TAG, "onDetach")
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment2.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
