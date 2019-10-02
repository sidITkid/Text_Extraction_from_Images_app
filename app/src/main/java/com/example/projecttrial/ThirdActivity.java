package com.example.projecttrial;

import android.content.Intent;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.Bitmap;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ImageView image = (ImageView) findViewById(R.id.image);
        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
        image.setImageBitmap(bitmap);

    }

    public void camera(View view) {
        Button camera = (Button) findViewById(R.id.camera);

        try {
            Intent intent = new Intent();
            intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
}
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
//        image.setImageBitmap(bitmap);
//    }


