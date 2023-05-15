package com.example.cookingapp

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cookingapp.ui.theme.CookingAppTheme

class MainActivity() : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout) {

            //reference to all views
            val username = findViewById<EditText>(R.id.username)
            val password = findViewById<EditText>(R.id.password)
            var loginbtn = findViewById<Button>(R.id.loginbtn)

            // set on-click listener
            // set on-click listener
            loginbtn.setOnClickListener {
                val user_name = username.text;
                val password = password.text;
                Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()

                // your code to validate the user_name and password combination
                // and verify the same
            }
        }
    }
}

    private fun setContentView(layout: Int, function: () -> Unit) {

    }




@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CookingAppTheme {
        Greeting("Android")
    }
}









