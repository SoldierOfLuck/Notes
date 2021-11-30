package ru.lukmanov.notes;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_create = findViewById(R.id.button_create);
        Button button_settings = findViewById(R.id.button_settings);
        Button button_data = findViewById(R.id.button_data);

        button_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .addToBackStack("")
                        .add(R.id.fragment_container, new SettingsFragment()).commit();
            }

        });
        button_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.fragment_container, new AppDataFragment()).commit();
            }

        });
        button_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.fragment_container, new NotesFragment()).commit();
            }

        });
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack("")
                .add(R.id.fragment_container, new NotesFragment()).commit();
    }
    private boolean isLandscape() {
        return getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE;
    }
}
