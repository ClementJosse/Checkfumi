package fr.esiea.checkfumi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView choix;
    private ImageView choix2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.choix2 = (ImageView) findViewById(R.id.tuto);
        this.choix = (ImageView) findViewById(R.id.jouer);


        choix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), Jeu.class);
                startActivity(otherActivity);
                finish();
            }
        });

        choix2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), Tutoriel.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}