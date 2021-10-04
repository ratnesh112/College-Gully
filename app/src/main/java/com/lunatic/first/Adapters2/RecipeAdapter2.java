package com.lunatic.first.Adapters2;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lunatic.first.Models2.RecipeModel2;
import com.lunatic.first.R;

import java.util.ArrayList;

public class RecipeAdapter2 extends  RecyclerView.Adapter<RecipeAdapter2.viewHolder> {

    ArrayList<RecipeModel2> list1;
    Context context1;

    public RecipeAdapter2(ArrayList<RecipeModel2> list1, Context context1) {
        this.list1 = list1;
        this.context1 = context1;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context1).inflate(R.layout.sample_recyclarview2 , parent , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        RecipeModel2 Model = list1.get(position);
        holder.imageView1.setImageResource(Model.getPic1());
        holder.textView1.setText(Model.getText1());

        holder.imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context1, "process ig going", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView1;
        TextView textView1;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.samo);
            textView1 = itemView.findViewById(R.id.samo2);
        }
    }
}
