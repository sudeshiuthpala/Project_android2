package com.example.smartvanproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VanReport extends AppCompatActivity {
    String j;
    Button erouting,mrouting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_van_report);
        Intent ii = getIntent();
        Bundle b = ii.getExtras();
        if (b != null) {
            j = (String) b.get("name");
            // text.setText(j);
        }
        erouting = findViewById(R.id.eveningroutine);
        mrouting = findViewById(R.id.mourningroutine);
        mrouting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VanReport.this, MorningRoutingHome.class);
                i.putExtra("name", j);
                startActivity(i);
            }
        });
        erouting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VanReport.this, EveningRoutingHome.class);
                i.putExtra("name", j);
                startActivity(i);
            }
        });
    }
}