package com.ecom.myapp;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    private EditText editText;
    private Button buttonAdd, buttonSub, buttonMul, buttonDivide, buttonEquals;
    private float value1, value2;
    private boolean addition, subtract, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        editText = findViewById(R.id.editTextText);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDivide = findViewById(R.id.buttondivide);
        buttonEquals = findViewById(R.id.buttonequals);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length() != 0) {
                    value1 = Float.parseFloat(editText.getText().toString());
                    addition = true;
                    editText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length() != 0) {
                    value1 = Float.parseFloat(editText.getText().toString());
                    subtract = true;
                    editText.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length() != 0) {
                    value1 = Float.parseFloat(editText.getText().toString());
                    multiplication = true;
                    editText.setText(null);
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length() != 0) {
                    value1 = Float.parseFloat(editText.getText().toString());
                    division = true;
                    editText.setText(null);
                }
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length() != 0) {
                    value2 = Float.parseFloat(editText.getText().toString());

                    if (addition) {
                        editText.setText(value1 + value2 + "");
                        addition = false;
                    }

                    if (subtract) {
                        editText.setText(value1 - value2 + "");
                        subtract = false;
                    }

                    if (multiplication) {
                        editText.setText(value1 * value2 + "");
                        multiplication = false;
                    }

                    if (division) {
                        editText.setText(value1 / value2 + "");
                        division = false;
                    }
                }
            }
        });
    }
}
