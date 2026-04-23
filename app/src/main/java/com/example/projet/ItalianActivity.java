package com.example.projet;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.activity.EdgeToEdge;

public class ItalianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_italian);


        findViewById(R.id.lasagna).setOnClickListener(v ->
                startActivity(new Intent(this, lasagna.class)));

        findViewById(R.id.pasta).setOnClickListener(v ->
                startActivity(new Intent(this, pasta.class)));

        findViewById(R.id.pizza).setOnClickListener(v ->
                startActivity(new Intent(this, pizza.class)));

        findViewById(R.id.Risotto_mushroom_seafood).setOnClickListener(v ->
                startActivity(new Intent(this, risotto.class)));

        findViewById(R.id.tiramisu).setOnClickListener(v ->
                startActivity(new Intent(this, tiramisu.class)));

        findViewById(R.id.panna_cotta).setOnClickListener(v ->
                startActivity(new Intent(this, panna_cotta.class)));

        findViewById(R.id.cannoli).setOnClickListener(v ->
                startActivity(new Intent(this, cannoli.class)));

        findViewById(R.id.Bombolone).setOnClickListener(v ->
                startActivity(new Intent(this, bombolone.class)));


        findViewById(R.id.amaretti).setOnClickListener(v ->
                startActivity(new Intent(this, amaretti.class)));

        findViewById(R.id.granita).setOnClickListener(v ->
                startActivity(new Intent(this, granita.class)));

        findViewById(R.id.eggplant_parmigiana).setOnClickListener(v ->
                startActivity(new Intent(this, eggplant_parmigiana.class)));

        findViewById(R.id.osso_buco).setOnClickListener(v ->
                startActivity(new Intent(this, osso_buco.class)));


        findViewById(R.id.back).setOnClickListener(v -> finish());


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}