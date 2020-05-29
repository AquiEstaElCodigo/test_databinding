package cl.aquilotienes.test_databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvNombre, tvEdad, tvEmail, tvAltura, tvPeso;
    private Button btnCambiarActividad;
    private Usuario usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configView();
    }

    private void configView() {

        tvNombre = (TextView) findViewById(R.id.tv_nombre);
        tvEdad = (TextView) findViewById(R.id.tv_edad);
        tvEmail = (TextView) findViewById(R.id.tv_email);
        tvAltura = (TextView) findViewById(R.id.tv_altura);
        tvPeso = (TextView) findViewById(R.id.tv_peso);
        btnCambiarActividad = (Button) findViewById(R.id.btn_cambiar_actividad);

        usuario = new Usuario("aaaa", "33", "aaaa@aa.aa",
                "160", "60");

        tvNombre.setText(usuario.getNombre());
        tvEdad.setText(usuario.getEdad());
        tvEmail.setText(usuario.getEmail());
        tvAltura.setText(usuario.getAltura());
        tvPeso.setText(usuario.getPeso());

        btnCambiarActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), DataBindingActivity.class));

            }
        });

    }
}
