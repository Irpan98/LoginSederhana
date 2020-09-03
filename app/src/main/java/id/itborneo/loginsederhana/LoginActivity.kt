package id.itborneo.loginsederhana

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.itborneo.loginsederhana.HomeActivity.Companion.EXTRA_USER
import id.itborneo.task2login.User
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        //real user
        val realUser = User("irpan", "itBorneo")

        btn_login.setOnClickListener {
            loginValidation(realUser)
        }

    }

    private fun loginValidation(realUser: User) {
        val inputedUser = User(
            edUsername.text.toString(),
            edPassword.text.toString()
        )

        if (realUser.username == inputedUser.username &&
            realUser.password == inputedUser.password
        ) {

            moveActivity(inputedUser)

        } else {
            "Username / Password Salah".showToast()
        }


    }

    private fun moveActivity(user: User) {
        val intent = Intent(this, HomeActivity::class.java)
        intent.putExtra(EXTRA_USER, user)
        startActivity(intent)
    }

    private fun String.showToast() {
        Toast
            .makeText(applicationContext, this, Toast.LENGTH_LONG)
            .show()
    }
}
