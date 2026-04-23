package com.example.projet;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        String name = getIntent().getStringExtra("name");
        TextView txt = findViewById(R.id.welcomeText);
        txt.setText("Welcome " + name);

        Button italianBtn = findViewById(R.id.btn1);
        Button tunisianBtn = findViewById(R.id.btn2);
        Button healthyBtn = findViewById(R.id.btn3);
        Button sweetsBtn = findViewById(R.id.btn4);


        italianBtn.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity4.this, ItalianActivity.class));
        });

        tunisianBtn.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity4.this, TunisianActivity.class));
        });

        healthyBtn.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity4.this, HealthyActivity.class));
        });

        sweetsBtn.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity4.this, SweetsActivity.class));
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}