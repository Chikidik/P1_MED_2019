package com.example.chik.p1astudio;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

public class PopVideo extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_video_activity);
        showVideo();
    }

    private void showVideo() {

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" +
                            getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.seekTo(1); //søger 1 millisekundt fremad i videon. Blev brugt så thumbnail af videoen ikke var sort, dog skal ikke bruges mere, da videoen starter med det samme
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                startActivity(new Intent(PopVideo.this,
                                ArticleActivity.class));
            }
        });
        {


            DisplayMetrics dm = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(dm);

            int width = dm.widthPixels;
            int height = dm.heightPixels;

            videoView.start();

            getWindow().setLayout((int) (1440), (int) (760));

        }
    }
}

