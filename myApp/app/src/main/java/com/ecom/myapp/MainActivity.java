package com.ecom.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ed;
    private EditText ed2;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.editTextText1);
        ed2 = findViewById(R.id.editTextText2);
        bt = findViewById(R.id.button1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = ed.getText().toString();
                String password = ed2.getText().toString();

                if (password.length()>8) {
                    Intent intent=new Intent(MainActivity.this, HomePage.class);
                    Toast.makeText(MainActivity.this, "Welcome " + username, Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}
