package com.example.secondproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;
//Activity ViewToDoList
public class Activity4 extends AppCompatActivity {

    private Button bHome;
    private TextView task;
    private static StringBuffer tlbuff = new StringBuffer();
    private static ArrayList<String> tasklist = new ArrayList<String>();
    String tasknum,entry,taskname, taskstr="";
    String taskno, newtask;
    int n,num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        bHome = findViewById(R.id.btnHome3);
        task = findViewById(R.id.ToDo);

        entry = getIntent().getStringExtra("entry");

        if (entry.equals("1"))
        {
            taskname = getIntent().getStringExtra("taskname");
            if (taskname!=null)
            {
                tasklist.add(taskname);
                tlbuff.append(taskname);
                tlbuff.append("\n");
                taskstr = tlbuff.toString();
                task.setText(taskstr);
            }
        }
        else if (entry.equals("0"))
        {
            taskstr=tlbuff.toString();
            task.setText(taskstr);
        }
        else if (entry.equals("2"))
        {
            taskno = getIntent().getStringExtra("taskno");
            n=Integer.parseInt(taskno);
            if (num>0 && num<=tasklist.size())
            {
                newtask = getIntent().getStringExtra("newtask");
                tasklist.set(n-1,newtask);
                tlbuff.replace(0,tlbuff.length(),"");
                for (String s:tasklist)
                {
                    tlbuff.append(s);
                    tlbuff.append("\n");
                }
                taskstr=tlbuff.toString();
                task.setText(taskstr);
            }
            else
            {
                taskstr=tlbuff.toString();
                task.setText(taskstr);
                openPopUp();
            }
        }
        else if (entry.equals("3"))
        {
            tasknum = getIntent().getStringExtra("tasknum");
            num=Integer.parseInt(tasknum);
            if (num>0 && num<=tasklist.size())
            {
                tasklist.remove(num-1);
                tlbuff.replace(0,tlbuff.length(),"");
                for (String s:tasklist)
                {
                    tlbuff.append(s);
                    tlbuff.append("\n");
                }
                taskstr=tlbuff.toString();
                task.setText(taskstr);
            }
            else
            {
                taskstr=tlbuff.toString();
                task.setText(taskstr);
                openPopUp();
            }
        }

        bHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainAct();
            }
        });
    }
    public void openMainAct()
    {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
    public void openPopUp()
    {
        PopUp popupmsg = new PopUp();
        popupmsg.show(getSupportFragmentManager(),"Pop Up Message");
    }
}
