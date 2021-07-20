package com.santriptmehta.peekpoke.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.santriptmehta.peekpoke.R

class AuthenticationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)


        // Show login fragment
        supportFragmentManager.beginTransaction()
                .replace(R.id.auth_fragment_container, login_fragment())
                .commit()
    }
}