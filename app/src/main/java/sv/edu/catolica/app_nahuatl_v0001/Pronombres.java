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

public class Pronombres extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //Declaracion de variables

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolBar;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ppronombres_act);

        /*---------- Anclajes por ID ----------*/

        drawerLayout = findViewById(R.id.pronom_layout);
        navigationView = findViewById(R.id.nav_view);
        toolBar = findViewById(R.id.toolbar_pronom);

        /*---------- Toolbar ----------*/

        setSupportActionBar(toolBar);

        /*---------- Navbar menu ----------*/

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.navopen, R.string.navclose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        //---------Botones_Audio------------------//
        imageButton = findViewById(R.id.btnMis);
        MediaPlayer mediaPlayer1 = MediaPlayer.create( this, R.raw.nupro);
        imageButton.setOnClickListener(v -> mediaPlayer1.start());
        imageButton = findViewById(R.id.btnTu);
        MediaPlayer mediaPlayer2 = MediaPlayer.create( this, R.raw.mupro);
        imageButton.setOnClickListener(v -> mediaPlayer2.start());
        imageButton = findViewById(R.id.btnSu);
        MediaPlayer mediaPlayer3 = MediaPlayer.create( this, R.raw.ipro);
        imageButton.setOnClickListener(v -> mediaPlayer3.start());
        imageButton = findViewById(R.id.btnMe);
        MediaPlayer mediaPlayer4 = MediaPlayer.create( this, R.raw.nechpro);
        imageButton.setOnClickListener(v -> mediaPlayer4.start());
        imageButton = findViewById(R.id.btnTe);
        MediaPlayer mediaPlayer5 = MediaPlayer.create( this, R.raw.mechpro);
        imageButton.setOnClickListener(v -> mediaPlayer5.start());
        imageButton = findViewById(R.id.btnNos);
        MediaPlayer mediaPlayer6 = MediaPlayer.create( this, R.raw.tehpro);
        imageButton.setOnClickListener(v -> mediaPlayer6.start());
        imageButton = findViewById(R.id.btnYo);
        MediaPlayer mediaPlayer7 = MediaPlayer.create( this, R.raw.navocal);
        imageButton.setOnClickListener(v -> mediaPlayer7.start());
        imageButton = findViewById(R.id.btnVos);
        MediaPlayer mediaPlayer8 = MediaPlayer.create( this, R.raw.tavocal);
        imageButton.setOnClickListener(v -> mediaPlayer8.start());
        imageButton = findViewById(R.id.btnElla);
        MediaPlayer mediaPlayer9 = MediaPlayer.create( this, R.raw.yavocal);
        imageButton.setOnClickListener(v -> mediaPlayer9.start());
        imageButton = findViewById(R.id.btnUstedes);
        MediaPlayer mediaPlayer10 = MediaPlayer.create( this, R.raw.tehpro);
        imageButton.setOnClickListener(v -> mediaPlayer10.start());
        imageButton = findViewById(R.id.btnNosotros);
        MediaPlayer mediaPlayer11 = MediaPlayer.create( this, R.raw.alvocal);
        imageButton.setOnClickListener(v -> mediaPlayer11.start());
        imageButton = findViewById(R.id.btnEllos);
        MediaPlayer mediaPlayer12 = MediaPlayer.create( this, R.raw.brvocal);
        imageButton.setOnClickListener(v -> mediaPlayer12.start());
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
                Intent intentS = new Intent(Pronombres.this, MainActivity.class);
                startActivity(intentS);
                finish();
                break;
            case R.id.nav_numeros:
                Intent intentN = new Intent(Pronombres.this, Numeros.class);
                startActivity(intentN);
                finish();
                break;
            case R.id.nav_saludos:
                Intent intentP = new Intent(Pronombres.this, Saludos.class);
                startActivity(intentP);
                finish();
                break;
            case R.id.nav_pronombres:
                finish();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}