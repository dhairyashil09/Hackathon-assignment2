import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    private lateinit var coWorkingTextView: TextView
    private lateinit var mobileMailTextView: TextView
    private lateinit var mobileMailEditText: EditText
    private lateinit var passwordTextView: TextView
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var createAccountTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        coWorkingTextView = findViewById(R.id.coworking)
        mobileMailTextView = findViewById(R.id.mobilemail)
        mobileMailEditText = findViewById(R.id.mobilemail1)
        passwordTextView = findViewById(R.id.password)
        passwordEditText = findViewById(R.id.password1)
        loginButton = findViewById(R.id.Login)
        createAccountTextView = findViewById(R.id.login)

        loginButton.setOnClickListener {
            // Handle login button click here
        }

        createAccountTextView.setOnClickListener {
            // Handle create account text view click here
        }
    }
}
