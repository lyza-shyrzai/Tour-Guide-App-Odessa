package com.s.liza.tourguideappodessa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class CatacombsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info(R.drawable.cat_one, R.string.one_cat_name, R.string.one_cat_desc, R.string.one_cat_addr, R.string.one_cat_work, R.string.one_cat_tel, R.string.one_cat_site));
        info.add(new Info(R.drawable.cat_two, R.string.two_cat_name, R.string.two_cat_desc, R.string.two_cat_addr, R.string.two_cat_work, R.string.two_cat_tel, R.string.two_cat_site));
        info.add(new Info(R.drawable.cat_three, R.string.three_cat_name, R.string.three_cat_desc, R.string.three_cat_addr, R.string.three_cat_work, R.string.three_cat_tel, R.string.three_cat_site));

    }
}
