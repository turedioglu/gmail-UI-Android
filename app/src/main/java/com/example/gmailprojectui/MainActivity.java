package com.example.gmailprojectui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        Gmail first = new Gmail(R.drawable.gmail,"Google Maps Timeline", "Test YK, Mart Ayı Özetiniz", "Bu zaman çizelgesi e-postası gittiği...","11 nisan");
        Gmail second = new Gmail( R.drawable.gmail,"Google Maps Timeline", "Test YK, Şubat Ayı Özetiniz", "Bu zaman çizelgesi e-postası gittiği...","11 nisan");
        Gmail third = new Gmail(R.drawable.gmail,"Google Maps Timeline", "Test YK, Ocak Ayı Özetiniz", "Bu zaman çizelgesi e-postası gittiği...","11 nisan");
        Gmail fourth = new Gmail( R.drawable.gmail,"Google Maps Timeline", "Test YK, 2020 yılına ait güncelleme", "Bu zaman çizelgesi e-postası gittiği...","11 nisan");
        Gmail fifth = new Gmail( R.drawable.gmail,"Google Maps Timeline", "Test YK, Şubat Ayı Özetiniz", "COVID-19 nedeniye 2020 yılında..","11 nisan");
        Gmail sixth = new Gmail( R.drawable.gmail,"Google Photos", "Google Fotograflar Deposu", "Merhaba Test Yk...","11 nisan");

        ArrayList<Gmail>gmailList = new ArrayList<>();
        gmailList.add(first);
        gmailList.add(second);
        gmailList.add(third);
        gmailList.add(fourth);
        gmailList.add(fifth);
        gmailList.add(sixth);


        GmailListAdapter adapter = new GmailListAdapter(this,R.layout.fragment_first,gmailList);
        listView.setAdapter(adapter);
    }
}