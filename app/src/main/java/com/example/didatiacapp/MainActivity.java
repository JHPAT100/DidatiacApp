package com.example.didatiacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView i1,i2;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=findViewById(R.id.img_1);
        i2=findViewById(R.id.img_2);


    }
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.img_1:
                intent= new Intent(this, memorama.class);
                this.startActivity(intent);
                break;

            case R.id.img_2:
                intent= new Intent(this, visor_imagenes.class);
                this.startActivity(intent);
                break;
        }
    }

}
