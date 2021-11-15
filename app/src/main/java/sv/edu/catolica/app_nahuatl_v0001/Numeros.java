package sv.edu.catolica.app_nahuatl_v0001;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class Numeros extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    //Declaracion de variables
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolBar;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_numeros);

        /*---------- Anclajes por ID ----------*/

        drawerLayout = findViewById(R.id.numeros_layout);
        navigationView = findViewById(R.id.nav_view);
        toolBar = findViewById(R.id.toolbar_numeros);

        /*---------- Toolbar ----------*/

        setSupportActionBar(toolBar);

        /*---------- Navbar menu ----------*/

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.navopen, R.string.navclose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        //---------Botones_Audio------------------//

        imageButton = findViewById(R.id.btnUno);
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.uno);
        imageButton.setOnClickListener(v -> mediaPlayer1.start());
        imageButton = findViewById(R.id.btnDos);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.dos);
        imageButton.setOnClickListener(v -> mediaPlayer2.start());
        imageButton = findViewById(R.id.btnTres);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.tres);
        imageButton.setOnClickListener(v -> mediaPlayer3.start());
        imageButton = findViewById(R.id.btnCuatro);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.cuatro);
        imageButton.setOnClickListener(v -> mediaPlayer4.start());
        imageButton = findViewById(R.id.btnCinco);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.cinco);
        imageButton.setOnClickListener(v -> mediaPlayer5.start());
        imageButton = findViewById(R.id.btnSeis);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.seis);
        imageButton.setOnClickListener(v -> mediaPlayer6.start());
        imageButton = findViewById(R.id.btnSiete);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.siete);
        imageButton.setOnClickListener(v -> mediaPlayer7.start());
        imageButton = findViewById(R.id.btnOcho);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.ocho);
        imageButton.setOnClickListener(v -> mediaPlayer8.start());
        imageButton = findViewById(R.id.btnNueve);
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.nueve);
        imageButton.setOnClickListener(v -> mediaPlayer9.start());
        imageButton = findViewById(R.id.btnDiez);
        MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.dies);
        imageButton.setOnClickListener(v -> mediaPlayer10.start());
        imageButton = findViewById(R.id.btnOnce);
        MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.once);
        imageButton.setOnClickListener(v -> mediaPlayer11.start());
        imageButton = findViewById(R.id.btnDoce);
        MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.doce);
        imageButton.setOnClickListener(v -> mediaPlayer12.start());
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
            case R.id.nav_abcdario:
                Intent intentN = new Intent(Numeros.this, MainActivity.class);
                startActivity(intentN);
                finish();
                break;
            case R.id.nav_numeros:
                finish();
                break;
            case R.id.nav_saludos:
                Intent intentS = new Intent(Numeros.this, Saludos.class);
                startActivity(intentS);
                finish();
                break;
            case R.id.nav_pronombres:
                Intent intentP = new Intent(Numeros.this, Pronombres.class);
                startActivity(intentP);
                finish();
                break;
            case R.id.about_layout:
                Intent intentA = new Intent(Numeros.this, AboutAct.class);
                startActivity(intentA);
                finish();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}