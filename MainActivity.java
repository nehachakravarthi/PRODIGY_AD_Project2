package com.example.secondproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button bAdd,bEdit,bView,bDel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bAdd = findViewById(R.id.btnAdd);
        bEdit = findViewById(R.id.btnEdit);
        bView = findViewById(R.id.btnView);
        bDel = findViewById(R.id.btnDel);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        bEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        bView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }

    public void openActivity1()
    {
        Intent intent1 = new Intent(this, Activity1.class);
        startActivity(intent1);
    }
    public void openActivity2()
    {
        Intent intent2 = new Intent(this, Activity2.class);
        startActivity(intent2);
    }
    public void openActivity3()
    {
        Intent intent3 = new Intent(this, Activity3.class);
        startActivity(intent3);
    }
    public void openActivity4()
    {
        Intent intent4 = new Intent(this,Activity4.class);
        intent4.putExtra("entry","0");
        startActivity(intent4);
    }
}
