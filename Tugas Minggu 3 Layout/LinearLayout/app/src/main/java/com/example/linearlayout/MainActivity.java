package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    View Pada;
    View Subject;
    View Pesan;
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pada = findViewById(R.id.pada);
        Subject = findViewById(R.id.subject);
        Pesan = findViewById(R.id.pesan);
        Submit = findViewById(R.id.submit);
    }
}