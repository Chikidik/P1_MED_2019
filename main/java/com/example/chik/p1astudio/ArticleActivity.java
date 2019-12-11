package com.example.chik.p1astudio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class ArticleActivity extends AppCompatActivity {
    private ImageButton button;
    private ImageButton statistik;
    private ImageButton diagram;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (ImageButton) findViewById(R.id.button);

        statistik = (ImageButton) findViewById(R.id.statistik);

        diagram = (ImageButton) findViewById(R.id.diagram);

        statistik.setImageResource(R.drawable.billed2);

        statistik.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                statistik.setImageResource(R.drawable.billede1);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        diagram = (ImageButton) findViewById(R.id.diagram);
        diagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticleActivity.this, PopDiagram.class));
            }
        });
    }


    public void openActivity2(){
        Intent intent = new Intent (this, ShopActivity.class);
        startActivity(intent);

    }


}
