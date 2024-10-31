package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register=findViewById(R.id.register);
        e1=findViewById(R.id.name);
        e2=findViewById(R.id.password);
        e3=findViewById(R.id.confirmppass);
        e4=findViewById(R.id.phone_No);
        e5=findViewById(R.id.otp);
        e6=findViewById(R.id.email);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().isEmpty()){
                    e1.setError("Please Enter Name");
                }
                else if (e1.getText().toString().length()<5){
                    e1.setError("Username must be greater than 5 letters");
                }
                else if (e2.getText().toString().isEmpty()){
                    e2.setError("Please Enter Password");
                }
                else if (e2.getText().toString().length()<6)
                {
                    e2.setError("Password must be greater than 5 character");
                } else if ((e3.getText().toString().isEmpty())) {
                    e3.setError("Please confirm Password");
                }
//                else if (e3.getText().toString()!=e2.getText().toString()) {
//                    e3.setError("Password Can't mached");
//                }
                  else if (e4.getText().toString().isEmpty()) {
                    e4.setError("Please Enter the Mobile No");

                } else if (e4.getText().toString().length()<10 || e4.getText().toString().length()>10) {
                    e4.setError("Mobile no must be 10 digits");

                } else if (e5.getText().toString().isEmpty()) {
                    e5.setError("Enter OTP");

                } else if (e6.getText().toString().isEmpty()) {
                    e6.setError("Enter Email");

                }
                else {
                    Intent i=new Intent(RegisterActivity.this,LoginActivity.class);
                    startActivity(i);
                }
            }
        });

    }

}