package sg.edu.rp.c346.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            val userDOB = etDOB.text.toString()
            if(userDOB.isNotEmpty()) {
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDOB.toInt()
                var string = ""
 /*               if(age < 18){
                    string = "Underage"
                }else if (age in 18..65){
                    string = "Young People"
                }else if (age in 66..79){
                    string = "Middle Aged"
                }else if (age in 80..99){
                    string = "Elderly"
                }else{
                    string = "Long Lived Elderly"
                }*/
                when (age){
                    in 0..17 -> string = "Underage"
                    in 18..65 -> string = "Young People"
                    in 66..79 -> string = "Middle Aged"
                    in 80..99 -> string = "Elderly"
                    else -> {
                        string = "Long Lived Elderly"
                    }
                }
                tvShowAge.text = "Your Age is $age \n $string"
            }else{
                Toast.makeText(this, "Please Enter Your Birth Year", Toast.LENGTH_SHORT).show()
            }
        }
    }
}