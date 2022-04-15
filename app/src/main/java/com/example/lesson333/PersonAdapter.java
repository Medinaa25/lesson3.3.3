package com.example.lesson333;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    public PersonAdapter(ArrayList<String> person) {
        this.person = person;
    }

    private ArrayList <String> person = new ArrayList<>();


    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.bind(person.get(position));
    }

    @Override
    public int getItemCount() {
        return person.size();
    }
}
