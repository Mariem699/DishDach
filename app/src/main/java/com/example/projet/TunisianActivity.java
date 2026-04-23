package com.example.projet;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TunisianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tunisian);

        findViewById(R.id.lablebi).setOnClickListener(v ->
                startActivity(new Intent(this, lablebi.class)));

        findViewById(R.id.danouni).setOnClickListener(v ->
                startActivity(new Intent(this, danouni.class)));

        findViewById(R.id.frikasey).setOnClickListener(v ->
                startActivity(new Intent(this, frikasey.class)));

        findViewById(R.id.tajin).setOnClickListener(v ->
                startActivity(new Intent(this, tajin.class)));

        findViewById(R.id.couscous).setOnClickListener(v ->
                startActivity(new Intent(this, couscous.class)));

        findViewById(R.id.mloukhiya).setOnClickListener(v ->
                startActivity(new Intent(this, mloukhiya.class)));

        findViewById(R.id.yoyo).setOnClickListener(v ->
                startActivity(new Intent(this, yoyo.class)));

        findViewById(R.id.jaljleniya).setOnClickListener(v ->
                startActivity(new Intent(this, jaljleniya.class)));

        findViewById(R.id.samsa).setOnClickListener(v ->
                startActivity(new Intent(this, samsa.class)));

        findViewById(R.id.libanai).setOnClickListener(v ->
                startActivity(new Intent(this, libanai.class)));

        findViewById(R.id.homsiya).setOnClickListener(v ->
                startActivity(new Intent(this, homsiya.class)));

        findViewById(R.id.bachkoutou).setOnClickListener(v ->
                startActivity(new Intent(this, bachkoutou.class)));

        findViewById(R.id.back).setOnClickListener(v ->
                startActivity(new Intent(this, MainActivity4.class)));


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}