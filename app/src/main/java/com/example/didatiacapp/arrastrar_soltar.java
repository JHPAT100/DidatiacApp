package com.example.didatiacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class arrastrar_soltar extends AppCompatActivity {

    //
    ImageView img_1,img_2,base_1,img_3;
    Intent intent;
    int comprobar=0,gano=0;
    public int nivel=1;
    Button b_1;
    TextView txt;
    ProgressDialog progreso;
    MediaPlayer a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,victori;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrastrar_soltar);
        img_1 = findViewById(R.id.i_1);
        img_2 = findViewById(R.id.i_2);
        img_3 = findViewById(R.id.i_3);
        txt = findViewById(R.id.texto_datos);
        b_1 = findViewById(R.id.siguiente);
        base_1 = findViewById(R.id.base);
        //audios
        a1= MediaPlayer.create(this, R.raw.cerebro);
        a2= MediaPlayer.create(this, R.raw.corazon);
        a3= MediaPlayer.create(this, R.raw.estomago);
        a4= MediaPlayer.create(this, R.raw.higado);
        a5= MediaPlayer.create(this, R.raw.intestino);
        a6= MediaPlayer.create(this, R.raw.rinones);
        a7= MediaPlayer.create(this, R.raw.traquea);
        a8= MediaPlayer.create(this, R.raw.pancreas);


        victori= MediaPlayer.create(this, R.raw.victoria);
        //audios
        progreso=new ProgressDialog(this);
        compruebo();

        img_1.setOnTouchListener(new ChoiceTouchListener());
        img_2.setOnTouchListener(new ChoiceTouchListener());
        img_3.setOnTouchListener(new ChoiceTouchListener());


        base_1.setOnDragListener(new ChoiceDragListener());

        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gano == 1) {
                    gano=0;
                    nivel = nivel + 1;
                    progreso.setMessage("Comprobando....");
                    progreso.show();
                    compruebo();
                }else if(gano==0){
                    progreso.setMessage("Comprobando....");
                    progreso.show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            progreso.cancel();
                        }
                        //Coloco el tiempo en milisegundos
                    },500);
                }
            }
        });




        }


    private void compruebo() {
        if(nivel==1)

        {
            base_1.setImageResource(R.drawable.c1_e);
            txt.setText("Organo responsable del pensamiento \n y el buen funcionanmiento del cuerpo");
            img_1.setImageResource(R.drawable.c1);
            img_2.setImageResource(R.drawable.c2);
            img_3.setImageResource(R.drawable.c3);


        }else if(nivel==2) {
            base_1.setImageResource(R.drawable.c6_e);
            txt.setText("Organo responsable de la limpieza \n y la eliminacion de toxinas del cuerpo");
            img_1.setImageResource(R.drawable.c3);
            img_2.setImageResource(R.drawable.c6);
            img_3.setImageResource(R.drawable.c8);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                   progreso.cancel();
                }
                //Coloco el tiempo en milisegundos
            },500);
        }else if(nivel==3) {
            base_1.setImageResource(R.drawable.c8_e);
            txt.setText("Organo responsable de la limpieza \n y la eliminacion de toxinas del cuerpo");
            img_1.setImageResource(R.drawable.c4);
            img_2.setImageResource(R.drawable.c5);
            img_3.setImageResource(R.drawable.c8);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    progreso.cancel();
                }
                //Coloco el tiempo en milisegundos
            },500);
        }else if(nivel==4) {
            base_1.setImageResource(R.drawable.c7_e);
            txt.setText("Organo responsable de la limpieza \n y la eliminacion de toxinas del cuerpo");
            img_1.setImageResource(R.drawable.c2);
            img_2.setImageResource(R.drawable.c7);
            img_3.setImageResource(R.drawable.c3);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    progreso.cancel();
                }
                //Coloco el tiempo en milisegundos
            },500);
        }else if(nivel==5) {
            base_1.setImageResource(R.drawable.c4_e);
            txt.setText("Organo responsable de la limpieza \n y la eliminacion de toxinas del cuerpo");
            img_1.setImageResource(R.drawable.c4);
            img_2.setImageResource(R.drawable.c3);
            img_3.setImageResource(R.drawable.c1);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    progreso.cancel();
                }
                //Coloco el tiempo en milisegundos
            },500);
        }else if(nivel==6) {
            base_1.setImageResource(R.drawable.c5_e);
            txt.setText("Organo responsable de la limpieza \n y la eliminacion de toxinas del cuerpo");
            img_1.setImageResource(R.drawable.c3);
            img_2.setImageResource(R.drawable.c6);
            img_3.setImageResource(R.drawable.c5);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    progreso.cancel();
                }
                //Coloco el tiempo en milisegundos
            },500);
        }else if(nivel==7) {
            base_1.setImageResource(R.drawable.c2_e);
            txt.setText("Organo responsable de la limpieza \n y la eliminacion de toxinas del cuerpo");
            img_1.setImageResource(R.drawable.c3);
            img_2.setImageResource(R.drawable.c2);
            img_3.setImageResource(R.drawable.c4);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    progreso.cancel();
                }
                //Coloco el tiempo en milisegundos
            },500);
        }
    }


    //Permite gravar vista
    private final class ChoiceTouchListener implements View.OnTouchListener{

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if((event.getAction()== MotionEvent.ACTION_DOWN) && ((ImageView)v).getDrawable()!=null){
                ClipData data = ClipData.newPlainText("","");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDrag(data,shadowBuilder,v,0);

                //compruebo cual se toco
                if(nivel==1) {
                    switch (v.getId()) {
                        case R.id.i_1:

                            comprobar = 1;
                            gano=1;
                            a1.start();
                            break;

                        case R.id.i_2:
                            comprobar = 0;
                            gano=0;
                            a2.start();

                            break;

                        case R.id.i_3:
                            comprobar = 0;
                            gano=0;
                            a3.start();

                            break;
                    }
                }else if (nivel==2){
                    switch (v.getId()) {
                        case R.id.i_1:

                            comprobar = 0;
                            gano=0;
                            a3.start();
                            break;

                        case R.id.i_2:
                            comprobar = 1;
                            gano=1;
                            a7.start();

                            break;

                        case R.id.i_3:
                            comprobar = 0;
                            gano=0;
                            a6.start();

                            break;
                    }
                }else if (nivel==3){
                    switch (v.getId()) {
                        case R.id.i_1:

                            comprobar = 0;
                            gano=0;
                            a4.start();
                            break;

                        case R.id.i_2:
                            comprobar = 0;
                            gano=0;
                            a5.start();

                            break;

                        case R.id.i_3:
                            comprobar = 1;
                            gano=1;
                            a8.start();

                            break;
                    }
                }else if (nivel==4){
                    switch (v.getId()) {
                        case R.id.i_1:

                            comprobar = 0;
                            gano=0;
                            a2.start();
                            break;

                        case R.id.i_2:
                            comprobar = 1;
                            gano=1;
                            a7.start();

                            break;

                        case R.id.i_3:
                            comprobar = 0;
                            gano=0;
                            a3.start();

                            break;
                    }
                }else if (nivel==5){
                    switch (v.getId()) {
                        case R.id.i_1:

                            comprobar = 1;
                            gano=1;
                            a4.start();
                            break;

                        case R.id.i_2:
                            comprobar = 0;
                            gano=0;
                            a3.start();

                            break;

                        case R.id.i_3:
                            comprobar = 0;
                            gano=0;
                            a1.start();

                            break;
                    }
                }else if (nivel==6){
                    switch (v.getId()) {
                        case R.id.i_1:

                            comprobar = 0;
                            gano=0;
                            a3.start();
                            break;

                        case R.id.i_2:
                            comprobar = 0;
                            gano=0;
                            a6.start();

                            break;

                        case R.id.i_3:
                            comprobar = 1;
                            gano=1;
                            a5.start();

                            break;
                    }
                }else if (nivel==7){
                    switch (v.getId()) {
                        case R.id.i_1:

                            comprobar = 0;
                            gano=0;
                            a3.start();
                            break;

                        case R.id.i_2:
                            comprobar = 1;
                            gano=1;
                            a2.start();

                            break;

                        case R.id.i_3:
                            comprobar = 0;
                            gano=0;
                            a4.start();

                            break;
                    }
                }
                //compruebo cual se toco
                return  true;

            }else { return false;}
        }
    }
    //gravar vista
   private class ChoiceDragListener implements View.OnDragListener{

        @Override
        public boolean onDrag(View v, DragEvent event) {
            //
            switch(event.getAction()){
                case DragEvent.ACTION_DRAG_STARTED:
                    //accion no nesesaria
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                        //accion no nesesaria
                        break;
                case DragEvent.ACTION_DRAG_EXITED:
                        //accion no nesesaria
                        break;
                case DragEvent.ACTION_DROP:
                    //compruebo si es el correcto
                    if(nivel==1){
                        if(comprobar==1){
                            comprobar=0;
                            ImageView view =(ImageView) event.getLocalState();
                            ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.c1));
                            ((ImageView)view).setImageDrawable(null);//remp
                            victori.start();
                        }
                    }else if (nivel==2){
                        if(comprobar==1){
                            comprobar=0;
                            ImageView view =(ImageView) event.getLocalState();
                            ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.c6));
                            ((ImageView)view).setImageDrawable(null);//remp
                            victori.start();

                        }
                    }
                    else if (nivel==3){
                        if(comprobar==1){
                            comprobar=0;
                            ImageView view =(ImageView) event.getLocalState();
                            ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.c8));
                            ((ImageView)view).setImageDrawable(null);//remp
                            victori.start();

                        }
                    }
                    else if (nivel==4){
                        if(comprobar==1){
                            comprobar=0;
                            ImageView view =(ImageView) event.getLocalState();
                            ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.c7));
                            ((ImageView)view).setImageDrawable(null);//remp
                            victori.start();

                        }
                    }
                    else if (nivel==5){
                        if(comprobar==1){
                            comprobar=0;
                            ImageView view =(ImageView) event.getLocalState();
                            ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.c4));
                            ((ImageView)view).setImageDrawable(null);//remp
                            victori.start();

                        }
                    }
                    else if (nivel==6){
                        if(comprobar==1){
                            comprobar=0;
                            ImageView view =(ImageView) event.getLocalState();
                            ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.c5));
                            ((ImageView)view).setImageDrawable(null);//remp
                            victori.start();

                        }
                    }
                    else if (nivel==7){
                        if(comprobar==1){
                            comprobar=0;
                            ImageView view =(ImageView) event.getLocalState();
                            ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.c2));
                            ((ImageView)view).setImageDrawable(null);//remp
                            victori.start();

                        }
                    }

                    //compruebo si es el correcto
                        break;
                case DragEvent.ACTION_DRAG_ENDED:
                    //accion no nesesaria
                    break;
            }
            //
            return true;
        }
    }





    //
}
