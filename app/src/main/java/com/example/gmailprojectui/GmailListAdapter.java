package com.example.gmailprojectui;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class GmailListAdapter extends ArrayAdapter<Gmail> {


    private Context mContext;
    private int mResource;


    public GmailListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Gmail> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

     //   String mailTitle = getItem(position).getMailTitle();
       // String mailSubject = getItem(position).getMailSubject();
        //String mailBody = getItem(position).getMailBody();
        //String mailDate = getItem(position).getMailDate();


        //Gmail gmail = new Gmail(imageView ,mailTitle, mailSubject, mailBody, mailDate);

        LayoutInflater inflater = LayoutInflater.from(mContext);

        convertView = inflater.inflate(mResource,parent,false);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        TextView textTitle = (TextView) convertView.findViewById(R.id.mailTitle);
        TextView textSubject = (TextView) convertView.findViewById(R.id.mailSubject);
        TextView textBody = (TextView) convertView.findViewById(R.id.mailBody);
        TextView textDate = (TextView) convertView.findViewById(R.id.mailDate);

        imageView.setImageResource(getItem(position).getImg());

        textTitle.setText(getItem(position).getMailTitle());

        textSubject.setText(getItem(position).getMailSubject());

        textBody.setText(getItem(position).getMailBody());

        textDate.setText(getItem(position).getMailDate());

       //   textTitle.setText(mailTitle);
       // textSubject.setText(mailSubject);
        //textBody.setText(mailBody);
        //textDate.setText(mailDate);


        return convertView;
    }
}

