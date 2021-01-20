package com.example.userregfirebase;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class tempViewHolder extends RecyclerView.ViewHolder {

    View view;


    public tempViewHolder(@NonNull View itemView) {
        super ( itemView );

        view = itemView;
    }

    public void setView(Context context, String temp, String humi) {

        TextView nametv = view.findViewById ( R.id.textView6 );
        TextView gendertv = view.findViewById ( R.id.textView8 );


        nametv.setText ( temp );
        gendertv.setText ( humi );

    }




}


