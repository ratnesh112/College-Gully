package com.lunatic.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Choice_Activity extends AppCompatActivity {
    Button canteen,truth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_);
        getSupportActionBar().setTitle("The Choice");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        canteen = findViewById(R.id.sub_button);
        canteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Choice_Activity.this, "transfering to Canteen page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Choice_Activity.this , Canteen_Activity.class);
                startActivity(intent);
            }
        });

        truth = findViewById(R.id.choice2);
        truth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Choice_Activity.this, "transfering to Cafeteria page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Choice_Activity.this , Cafeteria_activity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
