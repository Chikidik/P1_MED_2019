package com.example.chik.p1astudio;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;


public class PopDiagram extends Activity {
    public static ScaleGestureDetector sgd;
    public static float sf = 1.0f;
    public static ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popdiagram);

        mImageView=(ImageView)findViewById(R.id.iv_diagram);
        sgd = new ScaleGestureDetector(this, new ScaleListener());

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width),(int)(400));



    }
    public boolean onTouchEvent(MotionEvent motionEvent) {
        sgd.onTouchEvent(motionEvent);
        return true;
    }

}
class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    @Override
    public boolean onScale(ScaleGestureDetector scaleGestureDetector){
        PopDiagram.sf *= scaleGestureDetector.getScaleFactor();
        PopDiagram.sf = Math.max(0.1f,
                Math.min(PopDiagram.sf, 10.0f));
        PopDiagram.mImageView.setScaleX(PopDiagram.sf);
        PopDiagram.mImageView.setScaleY(PopDiagram.sf);
        return true;
    }
}
