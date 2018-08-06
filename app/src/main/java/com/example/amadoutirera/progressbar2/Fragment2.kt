package training.androidkotlin.helloworld

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.amadoutirera.progressbar2.R

class Fragment2 : Fragment() {

    interface Fragment2Listner {
        fun onClickFragment2()
    }

    var a2: Fragment2Listner? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)

        view.findViewById<Button>(R.id.button2).setOnClickListener {
            Toast.makeText(activity, "Clicked", Toast.LENGTH_SHORT).show()
            a2?.onClickFragment2()
        }

        return view    }

}