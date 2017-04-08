package app.leti.com.android_leti_2.ViewAnimationActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import app.leti.com.android_leti_2.R;

/**
 * Created by romankov on 08.04.17.
 */

public class ViewAnimationActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);

        ListView listView = (ListView) findViewById(R.id.listView);
        // создаем адаптер
        ArrayList<String> title = new ArrayList<>();
        title.add("ExampleOne");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, title);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i = new Intent(ViewAnimationActivity.this, ViewAnimationActivityExampleOne.class);
                        startActivity(i);
                        break;

                    case 1:
                        break;

                    case 2:
                        break;
                }
            }
        });


    }
}
