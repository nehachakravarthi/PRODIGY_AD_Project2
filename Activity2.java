package com.example.secondproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//Activity EditTask
public class Activity2 extends AppCompatActivity
{
    private Button bHome;
    private Button bSub;
    private EditText taskno, newtask;
    String n, task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        bHome = findViewById(R.id.btnHome1);
        bSub = findViewById(R.id.btnSub1);
        taskno = findViewById(R.id.TaskNum);
        newtask = findViewById(R.id.EditTask);

        bHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainAct();
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                task = newtask.getText().toString();
                n = taskno.getText().toString();
                openActivity4();
            }
        });
    }
    public void openMainAct()
    {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
    public void openActivity4()
    {
        Intent intent2 = new Intent(this, Activity4.class);
        intent2.putExtra("taskno",n);
        intent2.putExtra("newtask",task);
        intent2.putExtra("entry","2");
        startActivity(intent2);
    }
}
