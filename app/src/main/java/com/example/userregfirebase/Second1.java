package com.example.userregfirebase;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Second1 extends AppCompatActivity {



    RecyclerView recyclerView;
    DatabaseReference reference;
    FirebaseDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);
//       getSupportActionBar().setTitle("Videos");



        recyclerView = findViewById(R.id.video_recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        database = FirebaseDatabase.getInstance();
        reference = database.getReference("ComputerVision");



    }

    @Override
    protected void onStart() {
        super.onStart();


        FirebaseRecyclerAdapter<User1,ViewHolder1>firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<User1,ViewHolder1>(

                        User1.class,
                        R.layout.data1,
                        ViewHolder1.class,
                        reference
                ) {
                    @Override
                    protected void populateViewHolder(ViewHolder1 viewHolder1, User1 user, int i) {
                        viewHolder1.setView(getApplicationContext(),user.getSOP(),user.getFaceDetection(),user.getRat());
                    }
                };

        recyclerView.setAdapter(firebaseRecyclerAdapter);









    }
}
