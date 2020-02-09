package com.example.didatiacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class arrastrar_soltar extends AppCompatActivity {

    //
    ImageView img_1,img_2;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrastrar_soltar);
        img_1=findViewById(R.id.i_1);
        img_2=findViewById(R.id.i_2);
        img_1.setOnTouchListener(new ChoiceTouchListener());
        img_1.setOnDragListener(new ChoiceDragListener());
        img_2.setOnTouchListener(new ChoiceTouchListener());
        img_2.setOnDragListener(new ChoiceDragListener());
    }
    //Permite gravar vista
    private final class ChoiceTouchListener implements View.OnTouchListener{

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if((event.getAction()== MotionEvent.ACTION_DOWN) && ((ImageView)v).getDrawable()!=null){
                ClipData data = ClipData.newPlainText("","");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDrag(data,shadowBuilder,v,0);
                return  true;
            }else { return false;}
        }
    }
    //gravar vista
    //
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
                        ImageView view =(ImageView) event.getLocalState();
                        ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.logo));
                        ((ImageView)view).setImageDrawable(null);//remp
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
