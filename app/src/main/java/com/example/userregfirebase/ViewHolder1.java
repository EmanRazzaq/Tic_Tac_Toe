package com.example.userregfirebase;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ViewHolder1 extends RecyclerView.ViewHolder {

    View view;

    public ViewHolder1(@NonNull View itemView) {
        super(itemView);

        view = itemView;
    }


    public void setView(Context context,String sop,String det,String rat){
        TextView ratv=view.findViewById(R.id.sop);
        TextView detv=view.findViewById(R.id.face);
        TextView sopv=view.findViewById(R.id.rat);



        sopv.setText(sop);
        detv.setText(det);
        ratv.setText(rat);





    }


}