package com.example.guessanimal05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button dog,cat,squirrel;
    boolean isDog,isCat,isSquirrel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initClickers();
    }

    private void initClickers() {
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (isDog){
                   Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                   isCat=false;
                   isSquirrel=false;
               }else {

                   Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
               }
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isCat){
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                    isDog=false;
                    isSquirrel=false;
                }else {
                    Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();

                }
            }
        });
        squirrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSquirrel){
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                    isDog=false;
                    isCat=false;
                }else {
                    Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    private void initViews() {
        imageView = findViewById(R.id.image_animal);
        dog = findViewById(R.id.dog_btn);
        cat=findViewById(R.id.cat_btn);
        squirrel=findViewById(R.id.squirrel_btn);
    }

    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.change_image_btn1:
                imageView.setImageResource(R.drawable.dog);
                isDog=true;
                break;
            case R.id.change_image_btn2:
                imageView.setImageResource(R.drawable.cat);
                isCat=true;
                break;
            case R.id.change_image_btn3:
                imageView.setImageResource(R.drawable.squirrel);
                isSquirrel=true;
                break;
        }
    }
}