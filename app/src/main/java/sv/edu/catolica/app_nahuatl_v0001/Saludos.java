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
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

public class Saludos extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //Declaracion de variables

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolBar;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.psaludos_act);



        /*---------- Anclajes por ID ----------*/

        drawerLayout = findViewById(R.id.saludos_layout);
        navigationView = findViewById(R.id.nav_view);
        toolBar = findViewById(R.id.toolbar_saludos);

        /*---------- Toolbar ----------*/

        setSupportActionBar(toolBar);

        /*---------- Navbar menu ----------*/

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.navopen, R.string.navclose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        //---------Botones_Audio------------------//

        imageButton = findViewById(R.id.btnYektunal);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.buenodias);
        imageButton.setOnClickListener(v -> mediaPlayer.start());
        imageButton = findViewById(R.id.btnTiutak);
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.buenastardes);
        imageButton.setOnClickListener(v -> mediaPlayer1.start());
        imageButton = findViewById(R.id.btnTayua);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.buenasnoches);
        imageButton.setOnClickListener(v -> mediaPlayer2.start());
        imageButton = findViewById(R.id.btnTaysan);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.hola);
        imageButton.setOnClickListener(v -> mediaPlayer3.start());
        imageButton = findViewById(R.id.btnPeyna);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.yeksaludo);
        imageButton.setOnClickListener(v -> mediaPlayer4.start());
        imageButton = findViewById(R.id.btnAzul);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.azul);
        imageButton.setOnClickListener(v -> mediaPlayer5.start());
        imageButton = findViewById(R.id.btnRojo);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.rojo);
        imageButton.setOnClickListener(v -> mediaPlayer6.start());
        imageButton = findViewById(R.id.btnAmarillo);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.amarillo);
        imageButton.setOnClickListener(v -> mediaPlayer7.start());
        imageButton = findViewById(R.id.btnVerde);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.verde);
        imageButton.setOnClickListener(v -> mediaPlayer8.start());
        imageButton = findViewById(R.id.btnNaranja);
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.naranja);
        imageButton.setOnClickListener(v -> mediaPlayer9.start());
        imageButton = findViewById(R.id.btnBlanco);
        MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.blanco);
        imageButton.setOnClickListener(v -> mediaPlayer10.start());
        imageButton = findViewById(R.id.btnNegro);
        MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.negro);
        imageButton.setOnClickListener(v -> mediaPlayer11.start());
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
            case R.id.nav_abcdario:
                Intent intentS = new Intent(Saludos.this, MainActivity.class);
                startActivity(intentS);
                finish();
                break;
            case R.id.nav_numeros:
                Intent intentN = new Intent(Saludos.this, Numeros.class);
                startActivity(intentN);
                finish();
                break;
            case R.id.nav_saludos:
                finish();
                break;
            case R.id.nav_pronombres:
                Intent intentP = new Intent(Saludos.this, Pronombres.class);
                startActivity(intentP);
                finish();
                break;
            case R.id.about_layout:
                Intent intentA = new Intent(Saludos.this, AboutAct.class);
                startActivity(intentA);
                finish();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}