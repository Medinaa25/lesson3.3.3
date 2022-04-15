package com.example.lesson333;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList <String> person = new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        person.add("Doctor");
        person.add("Teacher");
        person.add("Policeman");
        person.add("Actor");
        person.add("Advocate");
        person.add("Programmer");
        person.add("Architect");
        person.add("Leading");
        person.add("Dentist");
        person.add("Accountant");
        person.add("Scientist");
        PersonAdapter personAdapter = new PersonAdapter(person);
        recyclerView.setAdapter(personAdapter);

    }
}