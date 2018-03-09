package com.example.anhtr.exercise2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnChangeTittle;
    Button btnChangeBackground;
    TextView txtTitle;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addConTrols();
        addEvents();
    }

    private void addEvents() {
        btnChangeTittle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ChangeTitleActivity.class);
                intent.putExtra("Title", txtTitle.getText());
                String color = txtTitle.getTextColors().toString();
                startActivityForResult(intent,27);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 27)
        {
            if(resultCode == RESULT_OK)
            {
                String title;
                String color;
                title = data.getStringExtra("Title");
                color = data.getStringExtra("Color");
                txtTitle.setText(title);
                switch (color) {
                    case "pink":
                        txtTitle.setTextColor(getResources().getColor(R.color.pink));
                        break;
                    case "purple":
                        txtTitle.setTextColor(getResources().getColor(R.color.purple));
                        break;
                    case "indigo":
                        txtTitle.setTextColor(getResources().getColor(R.color.indigo));
                        break;
                    case "blue":
                        txtTitle.setTextColor(getResources().getColor(R.color.blue));
                        break;
                    case "teal":
                        txtTitle.setTextColor(getResources().getColor(R.color.teal));
                        break;
                    case "green":
                        txtTitle.setTextColor(getResources().getColor(R.color.green));
                        break;
                    default:
                        txtTitle.setTextColor(getResources().getColor(R.color.pink));
                        break;
                }

            }
        }
    }

    private void addConTrols() {
        btnChangeBackground =   findViewById(R.id.btnChangeBackground);
        btnChangeTittle =  findViewById(R.id.btnChangeTittle);
        txtTitle =  findViewById(R.id.txtTittle);
    }


}
