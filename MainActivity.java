package com.example.valmegaencyclopedia;

import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = findViewById(R.id.button_menu);
        Button agentButton = findViewById(R.id.button_agents);
        Button killbnrButton = findViewById(R.id.button_killbanners);
        Button plrcrdButton = findViewById(R.id.button_playercards);
        Button weaponButton = findViewById(R.id.button_weapons);
        Button abilityButton = findViewById(R.id.button_abilities);
        Button miscButton = findViewById(R.id.button_misc);

        agentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, astra.class));
            }
        });
    }
}