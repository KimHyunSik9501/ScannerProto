package com.example.scannerproto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button CameraButton = (Button) findViewById(R.id.CameraButton);
        Button ImageButton = (Button) findViewById(R.id.ImageButton);
        Button StoredButton = (Button) findViewById(R.id.StoredButton);

        CameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CameraIntent = new Intent(MainActivity.this, camerascan.class);
                MainActivity.this.startActivity(CameraIntent);
            }
        }); // 메인 화면에서 camera scan 버튼 눌렀을 때, Camerascan 화면으로 넘어가게 하는 함수.

        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ImageIntent = new Intent(MainActivity.this, imagescan.class);
                MainActivity.this.startActivity(ImageIntent);
            }
        }); // 메인 화면에서 image scan 버튼 눌렀을 때, Imagescan 화면으로 넘어가게 하는 함수.

        StoredButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StoredIntent = new Intent(MainActivity.this, stored.class);
                MainActivity.this.startActivity(StoredIntent);
            }
        }); // 메인 화면에서 stored 버튼 눌렀을 때, Stored 화면으로 넘어가게 하는 함수.



    }
}
