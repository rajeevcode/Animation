package com.rajeevkumar.animation;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView shaun = (ImageView) findViewById(R.id.shaun);
//
//        shaun.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        //shaun.animate().rotation(1800f).setDuration(2000);

        //shaun.animate().translationXBy(1800f).setDuration(2000);

        ImageView motu = (ImageView) findViewById(R.id.motu);

        shaun.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(3600)
                .setDuration(3600);

//        motu.animate().rotation(1800f).setDuration(2000);
//        motu.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

       // motu.animate().scaleX(1f).scaleY(1f).setDuration(2000);

        //motu.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        //motu.animate().translationXBy(-1000f).setDuration(2000);

        motu.animate().scaleXBy(0.2f).scaleY(0.2f).setDuration(2000);

        //shaun.animate().alpha(0.5f).setDuration(2000);

        //motu.animate().alpha(1f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageView shaun = (ImageView) findViewById(R.id.shaun);
//
//        shaun.animate().translationXBy(-1000f);
//    chech
        ImageView shaun = (ImageView) findViewById(R.id.shaun);
        shaun.setTranslationX(-1000f);
        shaun.setTranslationY(-1000f);
//        motu.animate().translationXBy(1000f).setDuration(2000);
    }
}
