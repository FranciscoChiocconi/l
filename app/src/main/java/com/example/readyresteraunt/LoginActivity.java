package com.example.readyresteraunt;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.loginbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });

        button2 = findViewById(R.id.restarauntsbutton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRestaraunts();
            }
        });


    }
    public void openRestaraunts(){
        Intent intent = new Intent(getBaseContext(), Restaraunts.class);
        startActivity(intent);
    }

    public void openLogin(){
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }


}