package com.example.theend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.firebase.Timestamp;

public class NotesDetailsActivity extends AppCompatActivity {

    EditText titleEditText,contentEditText;
    ImageButton saveNotesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_details);

        titleEditText = findViewById(R.id.notes_title_text);
        contentEditText = findViewById(R.id.notes_content_text);
        saveNotesBtn = findViewById(R.id.save_note_btn);

        saveNotesBtn.setOnClickListener((v)-> saveNote());
    }
    void saveNote(){
        String noteTitle = titleEditText.getText().toString();
        String noteContent = contentEditText.getText().toString();
        if (noteTitle==null || noteTitle.isEmpty() ){
            titleEditText.setError("Title is empty");
            return;
        }


    }
}