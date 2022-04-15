package com.example.lesson333;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    private TextView profession;
    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        profession = itemView.findViewById(R.id.profession);
    }

    public void bind (String person){
        profession.setText(person);
    }
}
