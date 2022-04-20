package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email, pass;
        Button btn;
        TextView resultTxt;


        email = findViewById(R.id.email_id);
        pass = findViewById(R.id.pass_id);
        resultTxt = findViewById(R.id.result);
        btn = findViewById(R.id.logBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.equals("")&&pass.equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter Credentials First", Toast.LENGTH_SHORT).show();
                }
                else{
                    resultTxt.setText("Welcome, You are Logged In!");
                }
            }
        });








    }
}