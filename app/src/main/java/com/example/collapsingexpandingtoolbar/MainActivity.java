package com.example.collapsingexpandingtoolbar;

import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.CollapsingToolbarLayout);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            collapsingToolbarLayout.setCollapsedTitleGravity(View.TEXT_ALIGNMENT_TEXT_START);
        }
        collapsingToolbarLayout.setContentScrimColor(Color.TRANSPARENT);

        setSupportActionBar(toolbar);

        //If you want just to include the Toolbar without any scrolling effects you can use Toolbar.
        // But if you want to make some scrolling effects, you need to use AppBarLayout.

        collapsingToolbarLayout.setTitle("Collapsing Toolbar");
        //collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.colorPrimary));



    }
}
