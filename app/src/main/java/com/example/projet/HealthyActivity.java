package com.example.projet;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.activity.EdgeToEdge;

public class HealthyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_healthy);


        findViewById(R.id.quinoa_salad).setOnClickListener(v ->
                startActivity(new Intent(this, QuinoaSalad.class)));

        findViewById(R.id.lentil_soup).setOnClickListener(v ->
                startActivity(new Intent(this, LentilSoup.class)));

        findViewById(R.id.veggie_wraps).setOnClickListener(v ->
                startActivity(new Intent(this, VeggieWraps.class)));

        findViewById(R.id.Grilled_Chicken_Salad).setOnClickListener(v ->
                startActivity(new Intent(this, GrilledChickenSalad.class)));

        findViewById(R.id.Baked_falafel).setOnClickListener(v ->
                startActivity(new Intent(this, Falafel.class)));

        findViewById(R.id.Stuffed_BellPeppers).setOnClickListener(v ->
                startActivity(new Intent(this, peppers.class)));



        findViewById(R.id.smoothie_Bowls).setOnClickListener(v ->
                startActivity(new Intent(this, SmoothieBowl.class)));

        findViewById(R.id.granola).setOnClickListener(v ->
                startActivity(new Intent(this, Granola.class)));

        findViewById(R.id.peanut_butter_cookies).setOnClickListener(v ->
                startActivity(new Intent(this, PeanutCookies.class)));

        findViewById(R.id.Mango_Chia_Pudding).setOnClickListener(v ->
                startActivity(new Intent(this, MangoChia.class)));

        findViewById(R.id.Avocado_Chocolate_Mousse).setOnClickListener(v ->
                startActivity(new Intent(this, mousse.class)));

        findViewById(R.id.Banana_Ice_Cream).setOnClickListener(v ->
                startActivity(new Intent(this, banana_ice.class)));


        findViewById(R.id.back).setOnClickListener(v -> finish());


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}