package com.example.didatiacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_juegos extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_juegos);
    }
    public void onClick_3(View v) {

        switch(v.getId()){
            case R.id.m_1:
                intent= new Intent(this, memorama.class);
                this.startActivity(intent);
                break;

            case R.id.m_2:
                intent= new Intent(this, arrastrar_soltar.class);
                this.startActivity(intent);
                break;
        }
    }

}
