import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var createAccountTextView: TextView? = null
    private var fullNameTextView: TextView? = null
    private var usernameEditText: EditText? = null
    private var mobileNumberTextView: TextView? = null
    private var mobileEditText: EditText? = null
    private var emailTextView: TextView? = null
    private var emailEditText: EditText? = null
    private var createAccountButton: Button? = null
    private var existingUserTextView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views by finding them using their IDs
        createAccountTextView = findViewById<TextView>(R.id.createaccount)
        fullNameTextView = findViewById<TextView>(R.id.name)
        usernameEditText = findViewById<EditText>(R.id.username)
        mobileNumberTextView = findViewById<TextView>(R.id.number)
        mobileEditText = findViewById<EditText>(R.id.mobile)
        emailTextView = findViewById<TextView>(R.id.email)
        emailEditText = findViewById<EditText>(R.id.id)
        createAccountButton = findViewById<Button>(R.id.buttonLogin)
        existingUserTextView = findViewById<TextView>(R.id.login)

        // Set click listener for the "Create an Account" button
        createAccountButton.setOnClickListener(View.OnClickListener {
            // Handle the button click event here
        })

        // Set click listener for the "Existing User? Log in" text view
        existingUserTextView.setOnClickListener(View.OnClickListener {
            // Handle the text view click event here
        })
    }
}