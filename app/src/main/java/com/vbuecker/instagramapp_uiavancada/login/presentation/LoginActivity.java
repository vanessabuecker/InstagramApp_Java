package com.vbuecker.instagramapp_uiavancada.login.presentation;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.textfield.TextInputLayout;
import com.vbuecker.instagramapp_uiavancada.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText editTextPassword = findViewById(R.id.login_edit_text_password);
        EditText editTextEmail = findViewById(R.id.login_edit_text_email);

        editTextEmail.addTextChangedListener(watcher);
        editTextPassword.addTextChangedListener(watcher);

        Button buttonEnter = findViewById(R.id.login_button_enter);
        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputLayout inputEmail = findViewById(R.id.login_edit_text_email_input);
                inputEmail.setError("Email inválido");
                EditText editTextEmail = findViewById(R.id.login_edit_text_email);
                editTextEmail.setBackground(ContextCompat.getDrawable(LoginActivity.this, R.drawable.edit_text_background_error));

                TextInputLayout inputPassword = findViewById(R.id.login_edit_text_password_input);
                inputPassword.setError("password inválido!");

                EditText editTextPassword = findViewById(R.id.login_edit_text_password);
                editTextPassword.setBackground(ContextCompat.getDrawable(LoginActivity.this, R.drawable.edit_text_background_error));
            }
        });
    }

    private TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (!s.toString().isEmpty())
                findViewById(R.id.login_button_enter).setEnabled(true);
            else
                findViewById(R.id.login_button_enter).setEnabled(false);
        }

        @Override
        public void afterTextChanged(Editable s) {
        }
    };

}