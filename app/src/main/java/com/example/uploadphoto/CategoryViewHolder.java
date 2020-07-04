package com.example.uploadphoto;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtUserName,txtUserSurname,txtUserNumber;


    public CategoryViewHolder(@NonNull View itemView) {
        super(itemView);
        txtUserName = (TextView)itemView.findViewById(R.id.userName_textView);
        txtUserSurname = (TextView)itemView.findViewById(R.id.userSurname_textView);
        txtUserNumber = (TextView)itemView.findViewById(R.id.user_number_textView);
    }

    @Override
    public void onClick(View v) {

    }
}