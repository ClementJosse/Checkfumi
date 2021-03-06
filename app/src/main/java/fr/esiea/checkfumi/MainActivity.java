package fr.esiea.checkfumi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView choix;
    private Button choix2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.choix = (ImageView) findViewById(R.id.jouer);
        this.choix2 = (Button) findViewById(R.id.button);

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