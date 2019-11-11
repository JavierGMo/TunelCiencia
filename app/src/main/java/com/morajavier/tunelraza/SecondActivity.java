package com.morajavier.tunelraza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TintableImageSourceView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Bundle bundle;
    ImageView imageView;
    TextView textTitulo;
    int idImg;
    String titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView = findViewById(R.id.imageViewCont);
        textTitulo = findViewById(R.id.textViewTitulo);
        bundle = getIntent().getExtras();
        if(bundle==null){
            throw new Error("*+*++++Error extras");
        }
        try{
            idImg = bundle.getInt("imagen");
            titulo = bundle.getString("titulo");
            imageView.setImageResource(idImg);
            textTitulo.setText(titulo);
        }catch (Exception e){
            System.out.println("*****" +e + "*****");
        }

    }
}
