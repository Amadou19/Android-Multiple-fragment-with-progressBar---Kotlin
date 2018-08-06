package training.androidkotlin.helloworld

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.amadoutirera.progressbar2.R

class Fragment1 : Fragment() {

    interface Fragment1Listner {
        fun onClickFragment1()
    }

    var a1: Fragment1Listner? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment1, container, false)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(activity, "Clicked", Toast.LENGTH_SHORT).show()
            a1?.onClickFragment1()
        }

        return view
    }
}