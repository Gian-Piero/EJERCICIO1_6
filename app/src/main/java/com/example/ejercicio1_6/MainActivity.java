package com.example.ejercicio1_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch switch_camara1;
    private Switch switch_luz1;
    private ToggleButton btn_camara2;
    private ToggleButton btn_luz2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch_camara1 = findViewById(R.id.switch_camara_1);
        switch_luz1 = findViewById(R.id.switch_luz_1);
        btn_camara2 = findViewById(R.id.toggleButton_camara_2);
        btn_luz2 = findViewById(R.id.toggleButton_luz_2);
    }

    public void comprobarEstados(View view) {
        switch(view.getId())
        {
            case R.id.switch_camara_1:
                if (switch_camara1.isChecked()){
                    findViewById(R.id.imageCamara_1).setVisibility(View.VISIBLE);
                }
                else {
                    findViewById(R.id.imageCamara_1).setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.switch_luz_1:
                final ImageView img_Bombilla1 = findViewById(R.id.imageBombilla_1);
                if (switch_luz1.isChecked())
                    img_Bombilla1.setImageResource(R.drawable.bombilla_encendida);
                else
                    img_Bombilla1.setImageResource(R.drawable.bombilla_apagada);
                break;
            case R.id.toggleButton_camara_2:
                if (btn_camara2.isChecked())
                    findViewById(R.id.imageCamara_2).setVisibility(View.VISIBLE);
                else
                    findViewById(R.id.imageCamara_2).setVisibility(View.INVISIBLE);
                break;
            case R.id.toggleButton_luz_2:
                final ImageView img_Bombilla2 = findViewById(R.id.imageBombilla_2);
                if (btn_luz2.isChecked())
                    img_Bombilla2.setImageResource(R.drawable.bombilla_encendida);
                else
                    img_Bombilla2.setImageResource(R.drawable.bombilla_apagada);
                break;
            default:
        }
    }
}
