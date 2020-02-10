package com.example.didatiacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class arrastrar_soltar extends AppCompatActivity {

    //
    ImageView img_1,img_2,base_1,img_3;
    Intent intent;
    int comprobar=0,gano=0;
    public int nivel=1;
    Button b_1;
    ProgressDialog progreso;

    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrastrar_soltar);
        img_1 = findViewById(R.id.i_1);
        img_2 = findViewById(R.id.i_2);
        img_3 = findViewById(R.id.i_3);
        b_1 = findViewById(R.id.siguiente);
        base_1 = findViewById(R.id.base);
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
            img_1.setImageResource(R.drawable.c1);
            img_2.setImageResource(R.drawable.c2);
            img_3.setImageResource(R.drawable.c3);

        }else if(nivel==2)

        {
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
                            break;

                        case R.id.i_2:
                            comprobar = 0;
                            gano=0;

                            break;

                        case R.id.i_3:
                            comprobar = 0;
                            gano=0;

                            break;
                    }
                }else if (nivel==2){
                    switch (v.getId()) {
                        case R.id.i_1:

                            comprobar = 0;
                            gano=0;
                            break;

                        case R.id.i_2:
                            comprobar = 1;
                            gano=1;

                            break;

                        case R.id.i_3:
                            comprobar = 0;
                            gano=0;

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
                        }
                    }else if (nivel==2){
                        if(comprobar==1){
                            comprobar=0;
                            ImageView view =(ImageView) event.getLocalState();
                            ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.c6));
                            ((ImageView)view).setImageDrawable(null);//remp
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
