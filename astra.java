package com.example.valmegaencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class astra extends AppCompatActivity {
    int imageIDX = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agents_astra);
        Button btnLeft = findViewById(R.id.imgBtn_left);
        btnLeft.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                imageIDX--;
                if (imageIDX < 0)
                    imageIDX = 2;
                changeImage();
            }
        });
        Button btnRight = findViewById(R.id.imgBtn_right);
        btnRight.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                imageIDX++;
                if (imageIDX > 2)
                    imageIDX = 0;
                changeImage();
            }
        });
        changeImage();

    }

    public int getImageID() {
        int imgID;
        switch (imageIDX) {
            case 0:
                imgID = R.drawable.astra;
                break;
            case 1:
                imgID = R.drawable.astra_1_;
                break;
            case 2:
                imgID = R.drawable.astra_2_;
                break;
            case 3:
                imgID = R.drawable.astra_3_;
                break;
            default:
                imgID = R.drawable.astra;
                break;
        }
        return imgID;
    }

    private void changeImage() {
        ImageView imageView = findViewById(R.id.imgViewer);

        imageView.setImageResource(getImageID());
    }
}
