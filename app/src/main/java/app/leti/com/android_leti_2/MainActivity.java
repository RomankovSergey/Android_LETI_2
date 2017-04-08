package app.leti.com.android_leti_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import app.leti.com.android_leti_2.DrawableAnimation.DrawableAnamationActivity;
import app.leti.com.android_leti_2.ViewAnimationActivity.ViewAnimationActivity;
import app.leti.com.android_leti_2.ViewPropertyAnimation.ViewPropertyAnimationActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView);
        // создаем адаптер
        ArrayList<String> title = new ArrayList<>();
        title.add("Drawable Animation");
        title.add("View Animation");
        title.add("View Property");



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, title);

        listView.setAdapter(adapter);
        Intent i;

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i = new Intent(MainActivity.this, DrawableAnamationActivity.class);
                        startActivity(i);
                        break;

                    case 1:
                        Intent i1 = new Intent(MainActivity.this, ViewAnimationActivity.class);
                        startActivity(i1);
                        break;

                    case 2:
                        Intent i2 = new Intent(MainActivity.this, ViewPropertyAnimationActivity.class);
                        startActivity(i2);
                        break;
                }
            }
        });
    }
}
