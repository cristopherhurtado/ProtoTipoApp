package cl.hurtado.prototipoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cl.hurtado.prototipoapp.R;
import cl.hurtado.prototipoapp.MenuActivity;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void Volver(View view) {

        Intent volver = new Intent(this, MenuActivity.class);
        startActivity(volver);
    }
}