package com.s.liza.tourguideappodessa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamAttrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info(R.drawable.fam_one, R.string.one_fam_name, R.string.one_fam_desc, R.string.one_fam_addr, R.string.one_fam_work, R.string.one_fam_tel, R.string.one_fam_site));
        info.add(new Info(R.drawable.fam_two, R.string.two_fam_name, R.string.two_fam_desc, R.string.two_fam_addr, R.string.two_fam_work, R.string.two_fam_tel, R.string.two_fam_site));
        info.add(new Info(R.drawable.fam_three, R.string.three_fam_name, R.string.three_fam_desc, R.string.three_fam_addr, R.string.three_fam_work, R.string.three_fam_tel, R.string.three_fam_site));
        info.add(new Info(R.drawable.fam_four, R.string.four_fam_name, R.string.four_fam_desc, R.string.four_fam_addr, R.string.four_fam_work, R.string.four_fam_tel, R.string.four_fam_site));
        info.add(new Info(R.drawable.fam_five, R.string.five_fam_name, R.string.five_fam_desc, R.string.five_fam_addr, R.string.five_fam_work, R.string.five_fam_tel, R.string.five_fam_site));

        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
