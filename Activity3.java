package com.example.secondproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//Activity DeleteTask
public class Activity3 extends AppCompatActivity {

    String num;
    private Button bHome, bSub;
    private EditText taskno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        bHome = findViewById(R.id.btnHome2);
        bSub = findViewById(R.id.btnSub2);
        taskno = findViewById(R.id.DelNo);

        bHome.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View v)
            {
                openMainAct();
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = taskno.getText().toString();
                openActivity4(num);
            }
        });
    }
    public void openMainAct()
    {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
    public void openActivity4(String x)
    {
        Intent intent2=new Intent(this,Activity4.class);
        intent2.putExtra("tasknum",num);
        intent2.putExtra("entry","3");
        startActivity(intent2);
    }
}
