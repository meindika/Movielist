package com.gmail.meindika80.movielist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editName, editEmail;
    TextView output;
    Button tombolcheck;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_main));
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk = new Intent(getApplicationContext(), Movie.class);
                startActivity(masuk);
            }
        });
        editName = (EditText) findViewById(R.id.name);
        editEmail = (EditText) findViewById(R.id.email);
        output = (TextView) findViewById(R.id.textView3);
        tombolcheck = (Button) findViewById(R.id.button1);
    }
        protected void onClick (View view){
            String nama, nim;
            nama = editName.getText().toString();
            nim = editEmail.getText().toString();
            output.setText("" + nama + " - " + nim);
        }

    }
