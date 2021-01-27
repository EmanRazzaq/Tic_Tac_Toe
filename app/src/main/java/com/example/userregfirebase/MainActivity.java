package com.example.userregfirebase;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.RequiresApi;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {




    TextView t;
    TextView t1;
    TextView t2;
TextView t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        t= findViewById(R.id.textView);
        t.setOnClickListener(this::onClick);

        t1 = findViewById(R.id.textView2);
        t1.setOnClickListener(this::onClick);

        t2=findViewById(R.id.textView3);
        t2.setOnClickListener(this::onClick);

        t3=findViewById(R.id.textView5);
        t3.setOnClickListener(this::onClick);


    }

    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.textView:
                OpenActivity1();
                break;

            case R.id.textView2:
                OpenActivity2();
                break;


            case R.id.textView3:
                OpenActivity3();
                break;

            case R.id.textView5:
                OpenActivity4 ();
                break;



        } }



    public void OpenActivity1() {
        Intent A = new Intent(this, Choiceactivity.class);
        startActivity(A); }


    public void OpenActivity2() {
        Intent intent = new Intent(this, Second1.class);
        startActivity(intent); }

    public void OpenActivity3() {
        Intent A = new Intent(this, TemperaturAndHumidity.class);
        startActivity(A); }

    public void OpenActivity4() {
        Intent A = new Intent(this, userchoice.class);
        startActivity(A); }







}
