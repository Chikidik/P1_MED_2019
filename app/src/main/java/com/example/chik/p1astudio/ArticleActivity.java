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
    private Button button;
    private ImageButton statistik;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.seekTo(1);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        button = (Button) findViewById(R.id.button);

        statistik = (ImageButton) findViewById(R.id.statistik);

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

    }



    public void openActivity2(){
        Intent intent = new Intent (this, ShopActivity.class);
        startActivity(intent);

    }


}
