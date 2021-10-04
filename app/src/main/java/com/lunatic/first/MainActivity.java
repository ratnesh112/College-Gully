package com.lunatic.first;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login , signup;
    TextView take2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        getSupportActionBar().hide();

        login = findViewById(R.id.btnlogin);
        signup = findViewById(R.id.btnsignUp);
        take2 = findViewById(R.id.choice1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "login has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this , SignIn_Activity.class);
                startActivity(intent);

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "transfering to signup page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this , SignUp_Activity.class);
                startActivity(intent);
            }
        });
        take2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "transfering to choice page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this , Choice_Activity.class);
                startActivity(intent);
            }
        });

    }
}