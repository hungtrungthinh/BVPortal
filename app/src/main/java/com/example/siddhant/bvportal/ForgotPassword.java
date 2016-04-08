package com.example.siddhant.bvportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    public void Continue(View view)
    {
        EditText ed1 = (EditText)findViewById(R.id.editText);
        String email = ed1.getText().toString();
        Firebase ref = new Firebase("https://bvportal.firebaseio.com/");
        ref.resetPassword(email,new Firebase.ResultHandler(){

            @Override
            public void onSuccess() {
                Toast.makeText(getApplicationContext(),"We have sent an email to your email-id. Follow the instructions to reset your password",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
            }

            @Override
            public void onError(FirebaseError firebaseError) {
                Toast.makeText(getApplicationContext(),"Invalid email id",Toast.LENGTH_LONG).show();
            }
        });
    }
}
