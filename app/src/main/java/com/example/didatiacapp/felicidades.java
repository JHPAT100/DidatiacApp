package com.example.didatiacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class felicidades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felicidades);
    }
    public void onClick_4(View v) {

        switch(v.getId()){
            case R.id.salir_f:
              if(MainActivity.comprueba==1){
                Intent intent= new Intent(this, escojer_niveles.class);
                this.startActivity(intent);
              }else  if (MainActivity.comprueba==2){
                  Intent intent= new Intent(this, menu_juegos.class);
                  this.startActivity(intent);
              }
                break;

        }
    }
}
