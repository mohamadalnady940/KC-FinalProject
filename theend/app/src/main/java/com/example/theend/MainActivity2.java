package com.example.theend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {

    FloatingActionButton addNoteBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        addNoteBtn = findViewById(R.id.add_note_btn);

        addNoteBtn.setOnClickListener((v)-> startActivity(new Intent(MainActivity2.this,NotesDetailsActivity.class)) );
    }
}