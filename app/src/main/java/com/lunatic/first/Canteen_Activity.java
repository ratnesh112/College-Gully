package com.lunatic.first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.lunatic.first.Adapters.RecipeAdapter;
import com.lunatic.first.Models.RecipeModel;

import java.util.ArrayList;

public class Canteen_Activity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen_);
        getSupportActionBar().setTitle("Canteen");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

     recyclerView = findViewById(R.id.recyclarView);

        ArrayList <RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.foodr1 ,  "samosa"));
        list.add(new RecipeModel(R.drawable.foodr2 ,  "spring roll"));
        list.add(new RecipeModel(R.drawable.foodr3 ,  "burger"));
        list.add(new RecipeModel(R.drawable.foodr4 ,  "bread pakora"));
        list.add(new RecipeModel(R.drawable.foodr5 ,  "sandwich"));
        list.add(new RecipeModel(R.drawable.foodr6 ,  "chole bhature"));
        list.add(new RecipeModel(R.drawable.foodr7 ,  "chowmein"));
        list.add(new RecipeModel(R.drawable.foodr8 ,  "Tea"));

        RecipeAdapter adapter = new RecipeAdapter(list , this);
        recyclerView.setAdapter(adapter);

//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//            LinearLayoutManager layoutManager = new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false);
//           recyclerView.setLayoutManager(layoutManager);

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
