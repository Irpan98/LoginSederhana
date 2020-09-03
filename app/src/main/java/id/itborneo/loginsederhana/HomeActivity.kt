package id.itborneo.loginsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.itborneo.loginsederhana.R
import id.itborneo.task2login.User
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val user = intent.getParcelableExtra<User>(EXTRA_USER)

        tvUser.text = user?.username


    }


}