package com.example.chik.p1astudio;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    Toolbar mToolbar;
    ImageView mItem;
    TextView mDescription;
    TextView mPrice;
    private ImageButton button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mToolbar = findViewById(R.id.toolbar);
        mItem = findViewById(R.id.ivImage);
        mDescription = findViewById(R.id.tvDescription);
        mPrice = findViewById(R.id.tvPrice);

        button2 = (ImageButton) findViewById(R.id.buttonVideo);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailActivity.this, PopVideo.class));

            }
        });


        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null){
            mToolbar.setTitle(mBundle.getString("Title"));
            mItem.setImageResource(mBundle.getInt("Image"));
            mDescription.setText(mBundle.getString("Description"));
            mPrice.setText(mBundle.getString("Price"));
        }

    }

}
