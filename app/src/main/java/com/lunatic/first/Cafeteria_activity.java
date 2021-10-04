package com.lunatic.first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.lunatic.first.Adapters.RecipeAdapter;
import com.lunatic.first.Adapters2.RecipeAdapter2;
import com.lunatic.first.Models.RecipeModel;
import com.lunatic.first.Models2.RecipeModel2;

import java.util.ArrayList;

public class Cafeteria_activity extends AppCompatActivity {

    RecyclerView recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeteria_activity);
        getSupportActionBar().setTitle("Cafeteria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView2 = findViewById(R.id.recyclarView2);

        ArrayList<RecipeModel2> list = new ArrayList<>();

        list.add(new RecipeModel2(R.drawable.foodc1 ,  "oreo shakes"));
        list.add(new RecipeModel2(R.drawable.foodc2 ,  "puff"));
        list.add(new RecipeModel2(R.drawable.foodc3 ,  "pastries"));
        list.add(new RecipeModel2(R.drawable.foodc4 ,  "coffee"));
        list.add(new RecipeModel2(R.drawable.foodr5 ,  "sandwich"));
        list.add(new RecipeModel2(R.drawable.foodr6 ,  "chole bhature"));
        list.add(new RecipeModel2(R.drawable.foodr7 ,  "chowmein"));
        list.add(new RecipeModel2(R.drawable.foodr8 ,  "Tea"));

        RecipeAdapter2 adapter = new RecipeAdapter2(list , this);
        recyclerView2.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView2.setLayoutManager(gridLayoutManager);


    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
