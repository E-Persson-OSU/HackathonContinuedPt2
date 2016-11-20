package com.example.arian.hackathoncontinued;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

/**
 * Created by Redse on 11/20/2016.
 */

public class likeList extends Activity {
    ListView listView ;

    public likeList(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get listview object from xml
        listView = (ListView)findViewById(R.id.custom_ListView);
    }

}
