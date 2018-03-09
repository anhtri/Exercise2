package com.example.anhtr.exercise2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class ChangeTitleActivity extends AppCompatActivity {
    EditText edtChangeTittle;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6;
    View viewSample;
    Button btnSave;
    String color;
    View.OnClickListener event;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_title);
        addControls();
        addEvents();

    }

    private void addEvents() {
        event= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.iv1:
                        viewSample.setBackgroundResource(R.color.pink);
                        color = "pink";
                        break;
                    case R.id.iv2:
                        viewSample.setBackgroundResource(R.color.purple);
                        color = "purple";
                        break;
                    case R.id.iv3:
                        viewSample.setBackgroundResource(R.color.indigo);
                        color = "indigo";
                        break;
                    case R.id.iv4:
                        viewSample.setBackgroundResource(R.color.blue);
                        color = "blue";
                        break;
                    case R.id.iv5:
                        viewSample.setBackgroundResource(R.color.teal);
                        color = "teal";
                        break;
                    case R.id.iv6:
                        viewSample.setBackgroundResource(R.color.green);
                        color = "green";
                        break;
                    case R.id.btnSave:
                        intent = new Intent();
                        intent.putExtra("Title", edtChangeTittle.getText().toString());
                        intent.putExtra("Color", color);
                        setResult(RESULT_OK, intent);
                        finish();
                        break;
                    default:
                        break;

                }


            }
        };
        btnSave.setOnClickListener(event);
        btnSave.setOnClickListener(event);
        iv1.setOnClickListener(event);
        iv2.setOnClickListener(event);
        iv3.setOnClickListener(event);
        iv4.setOnClickListener(event);
        iv5.setOnClickListener(event);
        iv6.setOnClickListener(event);
        edtChangeTittle.setOnClickListener(event);
    }

    private void addControls() {
        edtChangeTittle = findViewById(R.id.edtChangeTittle);
        btnSave = findViewById(R.id.btnSave);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        iv4 = findViewById(R.id.iv4);
        iv5 = findViewById(R.id.iv5);
        iv6 = findViewById(R.id.iv6);
        viewSample = findViewById(R.id.viewSample);


    }
}
