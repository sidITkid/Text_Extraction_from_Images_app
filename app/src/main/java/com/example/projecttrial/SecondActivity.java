package com.example.projecttrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {


    public void signin(View view) {
        EditText username = (EditText) findViewById((R.id.username));
        EditText password = (EditText) findViewById(R.id.password);


        String user = username.getText().toString();

//        if(!password.getText().toString().equals(""))
//        {
//            Double pass = Double.parseDouble(password.getText().toString());
//        }

        String num = "sp";
//        int passw=12345;

        if (user.equals(num)) {
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(intent);
        }
        else{
            TextView invalid = (TextView) findViewById(R.id.invalid);
            invalid.setText("invalid");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
}
