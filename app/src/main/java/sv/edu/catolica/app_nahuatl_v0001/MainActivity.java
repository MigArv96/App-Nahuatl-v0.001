package sv.edu.catolica.app_nahuatl_v0001;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //Declaracion de variables

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolBar;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /*---------- Anclajes por ID ----------*/

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolBar = findViewById(R.id.toolbar);

        /*---------- Toolbar ----------*/

        setSupportActionBar(toolBar);

        /*---------- Navbar menu ----------*/

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.navopen, R.string.navclose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        //---------Botones_Audio------------------//

                imageButton = findViewById(R.id.btnA);
        MediaPlayer mediaPlayer = MediaPlayer.create( this, R.raw.a);
        imageButton.setOnClickListener(v -> mediaPlayer.start());
        imageButton = findViewById(R.id.btnCH);
        MediaPlayer mediaPlayer1 = MediaPlayer.create( this, R.raw.ch);
        imageButton.setOnClickListener(v -> mediaPlayer1.start());
        imageButton = findViewById(R.id.btnE);
        MediaPlayer mediaPlayer2 = MediaPlayer.create( this, R.raw.e);
        imageButton.setOnClickListener(v -> mediaPlayer2.start());
        imageButton = findViewById(R.id.btnI);
        MediaPlayer mediaPlayer3 = MediaPlayer.create( this, R.raw.i);
        imageButton.setOnClickListener(v -> mediaPlayer3.start());
        imageButton = findViewById(R.id.btnJ);
        MediaPlayer mediaPlayer4 = MediaPlayer.create( this, R.raw.j);
        imageButton.setOnClickListener(v -> mediaPlayer4.start());
        imageButton = findViewById(R.id.btnK);
        MediaPlayer mediaPlayer5 = MediaPlayer.create( this, R.raw.k);
        imageButton.setOnClickListener(v -> mediaPlayer5.start());
        imageButton = findViewById(R.id.btnKW);
        MediaPlayer mediaPlayer6 = MediaPlayer.create( this, R.raw.kw);
        imageButton.setOnClickListener(v -> mediaPlayer6.start());
        imageButton = findViewById(R.id.btnL);
        MediaPlayer mediaPlayer7 = MediaPlayer.create( this, R.raw.l);
        imageButton.setOnClickListener(v -> mediaPlayer7.start());
        imageButton = findViewById(R.id.btnM);
        MediaPlayer mediaPlayer8 = MediaPlayer.create( this, R.raw.m);
        imageButton.setOnClickListener(v -> mediaPlayer8.start());
        imageButton = findViewById(R.id.btnN);
        MediaPlayer mediaPlayer9 = MediaPlayer.create( this, R.raw.n);
        imageButton.setOnClickListener(v -> mediaPlayer9.start());
        imageButton = findViewById(R.id.btnO);
        MediaPlayer mediaPlayer10 = MediaPlayer.create( this, R.raw.o);
        imageButton.setOnClickListener(v -> mediaPlayer10.start());
        imageButton = findViewById(R.id.btnP);
        MediaPlayer mediaPlayer11 = MediaPlayer.create( this, R.raw.p);
        imageButton.setOnClickListener(v -> mediaPlayer11.start());
        imageButton = findViewById(R.id.btnS);
        MediaPlayer mediaPlayer12 = MediaPlayer.create( this, R.raw.s);
        imageButton.setOnClickListener(v -> mediaPlayer12.start());
        imageButton = findViewById(R.id.btnT);
        MediaPlayer mediaPlayer13 = MediaPlayer.create( this, R.raw.t);
        imageButton.setOnClickListener(v -> mediaPlayer13.start());
        imageButton = findViewById(R.id.btnTL);
        MediaPlayer mediaPlayer14 = MediaPlayer.create( this, R.raw.nh);
        imageButton.setOnClickListener(v -> mediaPlayer14.start());
        imageButton = findViewById(R.id.btnTS);
        MediaPlayer mediaPlayer15 = MediaPlayer.create( this, R.raw.tz);
        imageButton.setOnClickListener(v -> mediaPlayer15.start());
        imageButton = findViewById(R.id.btnW);
        MediaPlayer mediaPlayer16 = MediaPlayer.create( this, R.raw.w);
        imageButton.setOnClickListener(v -> mediaPlayer16.start());
        imageButton = findViewById(R.id.btnY);
        MediaPlayer mediaPlayer17 = MediaPlayer.create( this, R.raw.y);
        imageButton.setOnClickListener(v -> mediaPlayer17.start());
        MediaPlayer mediaPlayer18 = MediaPlayer.create( this, R.raw.u);
        imageButton.setOnClickListener(v -> mediaPlayer18.start());
        MediaPlayer mediaPlayer19 = MediaPlayer.create( this, R.raw.h);
        imageButton.setOnClickListener(v -> mediaPlayer19.start());

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                break;
            case R.id.nav_numeros:
                Intent intentN = new Intent(MainActivity.this, Numeros.class);
                startActivity(intentN);
                break;
            case R.id.nav_saludos:
                Intent intentS = new Intent(MainActivity.this, Saludos.class);
                startActivity(intentS);
                break;
            case R.id.nav_pronombres:
                Intent intentP = new Intent(MainActivity.this, Pronombres.class);
                startActivity(intentP);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}

