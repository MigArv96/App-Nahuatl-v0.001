package sv.edu.catolica.app_nahuatl_v0001;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

public class AboutAct extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    //Declaracion de variables

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolBar;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pabout_act);

        /*---------- Anclajes por ID ----------*/

        drawerLayout = findViewById(R.id.about_layout);
        navigationView = findViewById(R.id.nav_view);
        toolBar = findViewById(R.id.toolbar_about);

        /*---------- Toolbar ----------*/

        setSupportActionBar(toolBar);

        /*---------- Navbar menu ----------*/

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.navopen, R.string.navclose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
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
                Intent intentH = new Intent(AboutAct.this, MainActivity.class);
                startActivity(intentH);
                finish();
                break;
            case R.id.nav_numeros:
                Intent intentN = new Intent(AboutAct.this, Numeros.class);
                startActivity(intentN);
                finish();
                break;
            case R.id.nav_saludos:
                Intent intentS = new Intent(AboutAct.this, Saludos.class);
                startActivity(intentS);
                finish();
                break;
            case R.id.nav_pronombres:
                Intent intentP = new Intent(AboutAct.this, Pronombres.class);
                startActivity(intentP);
                finish();
                break;
                case R.id.nav_about:
                    break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}