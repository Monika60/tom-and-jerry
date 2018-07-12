package com.a.com.class12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<Cartoon> cartoons = new ArrayList<>();
        cartoons.add(new Cartoon("Tom", "About Tom", R.drawable.tom));
        cartoons.add(new Cartoon("Jerry", "About Jerry", R.drawable.jerry));

        CartoonAdapter adapter = new CartoonAdapter(this, cartoons);
        listView.setAdapter(adapter);
    }
}
