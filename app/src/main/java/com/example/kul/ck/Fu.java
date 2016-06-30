package com.example.kul.ck;

import android.opengl.Visibility;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class Fu extends AppCompatActivity {

    private ImageView y1, y2, y3, y4;
    private FrameLayout x1, x2, x3, x4;

    private int currentVisible = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.billing_view);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        x1 = (FrameLayout) findViewById(R.id.f01);
        x2 = (FrameLayout) findViewById(R.id.f02);
        x3 = (FrameLayout) findViewById(R.id.f03);
        x4 = (FrameLayout) findViewById(R.id.f04);

        y1 = (ImageView) findViewById(R.id.i1);
        y2 = (ImageView) findViewById(R.id.i2);
        y3 = (ImageView) findViewById(R.id.i3);
        y4 = (ImageView) findViewById(R.id.i4);

        setListeners();
    }

    private void setListeners() {
        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVisibility(1);
            }
        });

        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVisibility(2);
            }
        });

        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVisibility(3);

            }
        });

        x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVisibility(4);
            }
        });
    }

    private void setVisibility(int position) {
        if (currentVisible != -1) {
            switch (currentVisible) {
                case 1:
                    y1.setVisibility(View.GONE);
                    break;
                case 2:
                    y2.setVisibility(View.GONE);
                    break;
                case 3:
                    y3.setVisibility(View.GONE);
                    break;
                case 4:
                    y4.setVisibility(View.GONE);
                    break;
            }
        }

        switch (position) {
            case 1:
                currentVisible = 1;
                y1.setVisibility(View.VISIBLE);
                break;
            case 2:
                currentVisible = 2;
                y2.setVisibility(View.VISIBLE);
                break;
            case 3:
                currentVisible = 3;
                y3.setVisibility(View.VISIBLE);
                break;
            case 4:
                currentVisible = 4;
                y4.setVisibility(View.VISIBLE);
                break;
        }
    }
}
