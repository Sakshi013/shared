package com.example.sakshi.shared;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView Hello,yes,No;
    String userName,userAge,userClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        get the refernce
        Hello = findViewById(R.id.Helllo);
        yes= findViewById(R.id.yes);
        No= findViewById(R.id.No);

//        1SHaredpref strt here
        SharedPreferences sp = getSharedPreferences("detail",MODE_PRIVATE);

        userName = sp.getString("name","none");
        userClass = sp.getString("class","none");
        userAge = sp.getString("age","none");

//        set the value to textView
        Hello.setText(userName);
        yes.setText(userAge);
        No.setText(userName);



    }
}
