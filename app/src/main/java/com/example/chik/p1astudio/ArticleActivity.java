package com.example.chik.p1astudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.ScrollView;

public class ArticleActivity extends AppCompatActivity {
    private ImageButton button;
    private ImageButton statistik;
    private ImageButton diagram;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ScrollView sV = (ScrollView) findViewById(R.id.sV);
        sV.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public void onScrollChanged() {
                int scrollY = sV.getScrollY();

            }
        });

        button = (ImageButton) findViewById(R.id.button);

        statistik = (ImageButton) findViewById(R.id.statistik);

        diagram = (ImageButton) findViewById(R.id.diagram);

        statistik.setImageResource(R.drawable.billed2);

        statistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticleActivity.this,
                              PopStatistik.class));
                statistik.setImageResource(R.drawable.billede1);
            }
        });

        /* statistik.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                statistik.setImageResource(R.drawable.billede1);
            }
        }); */


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
