package com.example.trickster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewGroup viewGroup = findViewById(R.id.linlayout);

        ConstraintLayout layout = (ConstraintLayout) getLayoutInflater().inflate(R.layout.card_layout, null);
        viewGroup.addView(layout);
        //((ImageView)ll.getChildAt(0)).setImageResource();
        ((TextView)layout.getChildAt(1)).setText("Veteran's Wall");
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //DO SOMETHING
                Intent intent = new Intent(MainActivity.this, ItemLayout.class);
                startActivity(intent);
            }
        });
    }
}
