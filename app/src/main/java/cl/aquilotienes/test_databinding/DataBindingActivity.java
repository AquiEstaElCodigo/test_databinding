package cl.aquilotienes.test_databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cl.aquilotienes.test_databinding.databinding.ActivityDataBindingBinding;

public class DataBindingActivity extends AppCompatActivity {

    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Se elimina este método
        //setContentView(R.layout.activity_data_binding);
        //y se añade...
        ActivityDataBindingBinding activityDataBindingBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        usuario = new Usuario("bbbb", "44", "bbbb@bb.bb",
                "170", "70");


        activityDataBindingBinding.setUsuario(usuario);

    }

    public void cambiarActivity(View view){
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

}
