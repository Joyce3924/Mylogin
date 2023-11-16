package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username= findViewById(R.id.Username);
        TextView Passsword= findViewById(R.id.Password);
        MaterialButton loginbtn=(MaterialButton)  findViewById(R.id.loginbtn);
    //admin and admin
     loginbtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if (Username.getText().toString().equals("admin") && password.getText().toString.equals("admin"))
             //correct
                 Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();

         }else
             //incorrect

                 Toast.makeText(MainActivity.this, "Login FAILLED!!!", Toast.LENGTH_SHORT).show();


         }
     });







    }
}