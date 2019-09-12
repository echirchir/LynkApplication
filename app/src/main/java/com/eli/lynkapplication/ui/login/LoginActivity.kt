package com.eli.lynkapplication.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eli.lynkapplication.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val user_name: String = "Lynk"
    val user_password: String = "Lynk"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login.setOnClickListener {

            if (username.text.toString() == user_name && password.text.toString() == user_password){
                //go to list of numbers;
                val intent = Intent(this, ListActivity::class.java)
                startActivity(intent)
            }else if (username.text.toString() != user_name){
                username.error = "Enter a valid username"
            }else{
                password.error = "Enter a valid password"
            }
        }
    }

}
