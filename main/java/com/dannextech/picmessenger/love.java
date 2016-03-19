package com.dannextech.picmessenger;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ShareActionProvider;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by DANNEX on 11-Mar-16.
 */
public class love extends Activity implements View.OnClickListener{
    ImageView image;
    LinearLayout liner;
    Button bt;
    int tophone;
    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.love);
        liner = (LinearLayout) findViewById(R.id.layout);
        image = (ImageView) findViewById(R.id.imageView1);
        tophone = R.drawable.cartoon14;
        ImageView image1 = (ImageView) findViewById(R.id.imageView2);
        ImageView image2 = (ImageView) findViewById(R.id.imageView3);
        ImageView image3 = (ImageView) findViewById(R.id.imageView4);
        ImageView image4 = (ImageView) findViewById(R.id.imageView5);
        ImageView image5 = (ImageView) findViewById(R.id.imageView6);
        ImageView image6 = (ImageView) findViewById(R.id.imageView7);
        ImageView image7 = (ImageView) findViewById(R.id.imageView17);
        ImageView image8 = (ImageView) findViewById(R.id.imageView9);
        ImageView image9 = (ImageView) findViewById(R.id.imageView10);
        ImageView image10 = (ImageView) findViewById(R.id.imageView11);
        ImageView image11 = (ImageView) findViewById(R.id.imageView12);
        ImageView image12 = (ImageView) findViewById(R.id.imageView13);
        ImageView image13 = (ImageView) findViewById(R.id.imageView14);
        ImageView image14 = (ImageView) findViewById(R.id.imageView15);
        ImageView image15 = (ImageView) findViewById(R.id.imageView16);



        bt = (Button) findViewById(R.id.button);
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);
        image9.setOnClickListener(this);
        image10.setOnClickListener(this);
        image11.setOnClickListener(this);
        image12.setOnClickListener(this);
        image13.setOnClickListener(this);
        image14.setOnClickListener(this);
        image15.setOnClickListener(this);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView14:
                image.setImageResource(R.drawable.cartoon);
                break;
            case R.id.imageView13:
                image.setImageResource(R.drawable.cartoon1);
                //tophone = R.drawable.images2;
                break;
            case R.id.imageView3:
                image.setImageResource(R.drawable.cartoon2);
                //tophone = R.drawable.images4;
                break;
            case R.id.imageView4:
                image.setImageResource(R.drawable.cartoon3);
                //tophone = R.drawable.images10;
                break;
            case R.id.imageView5:
                image.setImageResource(R.drawable.cartoon4);
                //tophone = R.drawable.images11;
                break;
            case R.id.imageView6:
                image.setImageResource(R.drawable.cartoon5);
                break;
            case R.id.imageView7:
                image.setImageResource(R.drawable.cartoon6);
                break;
            case R.id.imageView9:
                image.setImageResource(R.drawable.cartoon7);
                break;
            case R.id.imageView10:
                image.setImageResource(R.drawable.cartoon8);
                break;
            case R.id.imageView11:
                image.setImageResource(R.drawable.cartoon9);
                break;
            case R.id.imageView12:
                image.setImageResource(R.drawable.cartoon10);
                break;
            case R.id.imageView15:
                image.setImageResource(R.drawable.cartoon11);
                break;
            case R.id.imageView2:
                image.setImageResource(R.drawable.cartoon12);
                break;
            case R.id.imageView16:
                image.setImageResource(R.drawable.cartoon13);
                break;
            case R.id.imageView17:
                image.setImageResource(R.drawable.cartoon14);
                break;
            case R.id.button:
                InputStream a = getResources().openRawResource(tophone);
                Bitmap whatever = BitmapFactory.decodeStream(a);
                try{
                    getApplicationContext().setWallpaper(whatever);
                } catch (IOException e){
                    e.printStackTrace();
                }
                //liner.setBackgroundResource(r.);
                break;

        }
    }

}
