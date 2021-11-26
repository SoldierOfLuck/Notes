package ru.lukmanov.notes;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import ru.lukmanov.notes.Notes.Notes;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, new NotesFragment()).commit();
    }
}
