package com.example.projet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        EditText nameEditText = findViewById(R.id.name);
        EditText emailEditText = findViewById(R.id.email);
        EditText psdEditText = findViewById(R.id.psd);

        Button btnSingup = findViewById(R.id.signup);
        btnSingup.setOnClickListener(v -> {

            String name = nameEditText.getText().toString().trim();
            String email = emailEditText.getText().toString().trim();
            String psd = psdEditText.getText().toString().trim();

            if (name.isEmpty() || email.isEmpty() || psd.isEmpty()) {
                Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show();

            } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Invalid email", Toast.LENGTH_SHORT).show();

            } else if (!psd.matches("\\d+")) {
                Toast.makeText(this, "Password must be numbers only", Toast.LENGTH_SHORT).show();

            } else if (psd.length() < 6) {
                Toast.makeText(this, "Password must be at least 6 digits", Toast.LENGTH_SHORT).show();

            } else {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}