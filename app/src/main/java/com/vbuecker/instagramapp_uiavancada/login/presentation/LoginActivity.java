package com.vbuecker.instagramapp_uiavancada.login.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;
import com.vbuecker.instagramapp_uiavancada.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //teste

        TextInputLayout inputPassword = findViewById(R.id.login_edit_text_password_input);
        inputPassword.setError("password inválido!");

        EditText editTextPassword = findViewById(R.id.login_edit_text_password);
        editTextPassword.setBackground(ContextCompat.getDrawable(LoginActivity.this, R.drawable.edit_text_background_error));

        TextInputLayout inputEmail = findViewById(R.id.login_edit_text_email_input);
        inputEmail.setError("Email inválido");

        EditText editTextEmail = findViewById(R.id.login_edit_text_email);
        editTextEmail.setBackground(ContextCompat.getDrawable(LoginActivity.this, R.drawable.edit_text_background_error));







    }
}