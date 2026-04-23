package com.example.projet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class SweetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sweets);

        findViewById(R.id.fondon).setOnClickListener(v ->
                startActivity(new Intent(this, fondon.class)));

        findViewById(R.id.brownies).setOnClickListener(v ->
                startActivity(new Intent(this, brownies.class)));

        findViewById(R.id.Coupes).setOnClickListener(v ->
                startActivity(new Intent(this,Coupes.class)));

        findViewById(R.id.Cheesecake).setOnClickListener(v ->
                startActivity(new Intent(this, Cheesecake.class)));

         findViewById(R.id.crepe).setOnClickListener(v ->
                startActivity(new Intent(this, crepe.class)));

        findViewById(R.id.cookies).setOnClickListener(v ->
                startActivity(new Intent(this, couscous.class)));

        findViewById(R.id.mug).setOnClickListener(v ->
                startActivity(new Intent(this, mugcake.class)));

        findViewById(R.id.truffel).setOnClickListener(v ->
                startActivity(new Intent(this, truffel.class)));

        findViewById(R.id.tartelettes).setOnClickListener(v ->
                startActivity(new Intent(this, tartelettes.class)));

        findViewById(R.id.fcake).setOnClickListener(v ->
                startActivity(new Intent(this, fruitcake.class)));




        findViewById(R.id.jellycake).setOnClickListener(v ->
                startActivity(new Intent(this,jellycake.class)));

        findViewById(R.id.fruit).setOnClickListener(v ->
                startActivity(new Intent(this, fruit.class)));

        findViewById(R.id.back).setOnClickListener(v ->
                startActivity(new Intent(this, MainActivity4.class)));


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}