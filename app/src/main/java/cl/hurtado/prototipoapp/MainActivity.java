package cl.hurtado.prototipoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText E1,E2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        E1 = (EditText) findViewById(R.id.editTextTextPersonName);
        E2 = (EditText) findViewById(R.id.editTextTextPassword);
    }

    public void Ingresar(View view){
        String usu = E1.getText().toString();
        String pass = E2.getText().toString();

        if (usu.length() <= 3 ){
            Toast.makeText( this, "Ingrese Usuario Valido",Toast.LENGTH_LONG).show();
        }
        if (pass.length() <= 3 ){
            Toast.makeText( this, "Ingrese Password Valida",Toast.LENGTH_LONG).show();
        }
        if (usu.length() >= 4 && pass.length() >= 4){
            Toast.makeText( this, "Inciando Sesion...",Toast.LENGTH_LONG).show();

            Intent ingresar = new Intent( this, MenuActivity.class);
            startActivity(ingresar);

        }
    }
}