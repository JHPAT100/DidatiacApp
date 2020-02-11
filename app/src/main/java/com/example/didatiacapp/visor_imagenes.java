package com.example.didatiacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class visor_imagenes extends AppCompatActivity {
    Button b1,b2;
    int contador=0;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagenes);
        b1=findViewById(R.id.btn_1);
        b2=findViewById(R.id.btn_2);
        image=findViewById(R.id.img_3);
    }
    public void onClick_2(View v) {
        switch(v.getId()) {
            case R.id.btn_1:
                //Contador1
                if (contador > 0) {
                    contador = contador - 1;
                    if (contador == 0) {
                        contador = contador + 19;
                    }
                } else if (contador == 0) {
                    contador = contador + 19;
                }
                //Contador1
                //switch
                switch (contador) {
                    case 1:
                        image.setImageResource(R.drawable.foto_1);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.foto_2);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.foto_3);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.foto_4);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.foto_5);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.foto_6);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.foto_7);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.foto_8);
                        break;
                    case 9:
                        image.setImageResource(R.drawable.foto_9);
                        break;
                    case 10:
                        image.setImageResource(R.drawable.foto_10);
                        break;
                    case 11:
                        image.setImageResource(R.drawable.foto_11);
                        break;
                    case 12:
                        image.setImageResource(R.drawable.foto_12);
                        break;
                    case 13:
                        image.setImageResource(R.drawable.foto_13);
                        break;
                    case 14:
                        image.setImageResource(R.drawable.foto_14);
                        break;
                    case 15:
                        image.setImageResource(R.drawable.foto_15);
                        break;
                    case 16:
                        image.setImageResource(R.drawable.foto_16);
                        break;
                    case 17:
                        image.setImageResource(R.drawable.foto_17);
                        break;
                    case 18:
                        image.setImageResource(R.drawable.foto_18);
                        break;
                    case 19:
                        image.setImageResource(R.drawable.foto_19);
                        break;


                }
                //switch
                break;

            case R.id.btn_2:
                //Contador
                 if(contador==0){
                    contador=contador+2;
                    }
                else if (contador <20 ) {
                    contador = contador + 1;
                    if (contador == 20) {
                        contador = 1;
                    }
                }
                else if (contador ==20){
                    contador=1;
                }
                //Contador2
                //switch
                switch (contador){
                    case 1:
                        image.setImageResource(R.drawable.foto_1);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.foto_2);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.foto_3);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.foto_4);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.foto_5);
                        break;
                    case 6:
                        image.setImageResource(R.drawable.foto_6);
                        break;
                    case 7:
                        image.setImageResource(R.drawable.foto_7);
                        break;
                    case 8:
                        image.setImageResource(R.drawable.foto_8);
                        break;
                    case 9:
                        image.setImageResource(R.drawable.foto_9);
                        break;
                    case 10:
                        image.setImageResource(R.drawable.foto_10);
                        break;
                    case 11:
                        image.setImageResource(R.drawable.foto_11);
                        break;
                    case 12:
                        image.setImageResource(R.drawable.foto_12);
                        break;
                    case 13:
                        image.setImageResource(R.drawable.foto_13);
                        break;
                    case 14:
                        image.setImageResource(R.drawable.foto_14);
                        break;
                    case 15:
                        image.setImageResource(R.drawable.foto_15);
                        break;
                    case 16:
                        image.setImageResource(R.drawable.foto_16);
                        break;
                    case 17:
                        image.setImageResource(R.drawable.foto_17);
                        break;
                    case 18:
                        image.setImageResource(R.drawable.foto_18);
                        break;
                    case 19:
                        image.setImageResource(R.drawable.foto_19);
                        break;

                }
                //switch
                break;
        }
    }
}
