package com.example.readyresteraunt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        button = findViewById(R.id.signout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentoLogin();
            }
        });
        button2 = findViewById(R.id.button18);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });
    }
    public void opentoLogin(){
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }
    public void save(){
        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
        startActivity(intent);
    }

}

