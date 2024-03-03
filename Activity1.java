package com.example.secondproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//Activity AddTask
public class Activity1 extends AppCompatActivity
{

    private Button bSub, bHome;
    private EditText task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        bSub = findViewById(R.id.btnSub);
        bHome= findViewById(R.id.btnHome);
        task = findViewById(R.id.TF1);

        bHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainAct();
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taskname = task.getText().toString();
                SubmitActivated(taskname);
            }
        });
    }

    public void openMainAct()
    {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
    public void SubmitActivated(String s)
    {
        Intent intent2 = new Intent(this, Activity4.class);
        intent2.putExtra("taskname",s);
        intent2.putExtra("entry","1");
        startActivity(intent2);
    }
}
