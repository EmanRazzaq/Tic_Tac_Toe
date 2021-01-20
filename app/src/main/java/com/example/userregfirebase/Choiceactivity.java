package com.example.userregfirebase;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Choiceactivity extends AppCompatActivity {



    RecyclerView recyclerView;
    DatabaseReference reference;
    FirebaseDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choiceactivity);
//       getSupportActionBar().setTitle("Videos");




        recyclerView = findViewById(R.id.video_recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        database = FirebaseDatabase.getInstance();
        reference = database.getReference("MQ5&YS17");



    }


    @Override
    protected void onStart() {
        super.onStart();


        FirebaseRecyclerAdapter<User,ViewHolder>firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<User,ViewHolder>(

                        User.class,
                        R.layout.data,
                        ViewHolder.class,
                        reference
                ) {
                    @Override
                    protected void populateViewHolder(ViewHolder viewHolder,User user, int i) {

                        viewHolder.setView(getApplicationContext(),user.getGas(),user.getFire());
                    }




                };






        recyclerView.setAdapter(firebaseRecyclerAdapter);









    }
}
