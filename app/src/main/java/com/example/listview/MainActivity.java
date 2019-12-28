package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String sting[] = {"Android","java","HTML","CSS","SQL","c","C++"};
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_expandable_list_item_1,sting);
        listView.setAdapter(arrayAdapter);

    }
}
