package com.example.trickster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_layout);

        ViewGroup viewGroup = findViewById(R.id.imageScroll);
        ImageButton imgButton = new ImageButton(this);
        viewGroup.addView(imgButton);

        imgButton.setImageResource(R.drawable.hello);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img = (ImageView) findViewById(R.id.contentImage);
                TextView txt = (TextView) findViewById(R.id.description);

                img.setImageResource(R.drawable.hello);
                txt.setText("Sample Test Text");
            }
        });
    }

    public void mainViewLoad(){

    }
}
