package com.example.userregfirebase;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TemperaturAndHumidity extends AppCompatActivity {



    RecyclerView recyclerView;
        DatabaseReference reference;
        FirebaseDatabase database;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_temperatur_and_humidity);
//       getSupportActionBar().setTitle("Videos");



            recyclerView = findViewById(R.id.video_recycler_view);
            recyclerView.setHasFixedSize(true);

            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            database = FirebaseDatabase.getInstance();
            reference = database.getReference("DHT11");



        }

        @Override
        protected void onStart() {
            super.onStart();


            FirebaseRecyclerAdapter<tempuser,tempViewHolder>firebaseRecyclerAdapter =
                    new FirebaseRecyclerAdapter<tempuser,tempViewHolder>(

                            tempuser.class,
                            R.layout.tempdata,
                            tempViewHolder.class,
                            reference
                    ) {
                        @Override
                        protected void populateViewHolder(tempViewHolder tempViewHolder, tempuser user, int i) {
                            tempViewHolder.setView(getApplicationContext(),user.getTemperature (),user.getHumidity ());
                        }
                    };

            recyclerView.setAdapter(firebaseRecyclerAdapter);









        }
    }
