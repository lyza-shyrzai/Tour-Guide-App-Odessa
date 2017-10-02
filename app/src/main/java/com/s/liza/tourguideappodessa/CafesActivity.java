package com.s.liza.tourguideappodessa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CafesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info(R.drawable.cafes_one, R.string.one_hotel_name, "Welcome to the restaurant \"Bernardazzi\" - a special world in which pleasant combinations of wine and food are decorated with live musical sketches.", "вулиця Буніна, 15", "График работы: Понедельник-Четверг с 12:00 до 00:00", "(48) 785-55-85", "bernardazzi.od.ua"));

        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
