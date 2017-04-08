package app.leti.com.android_leti_2.ViewPropertyAnimation;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import app.leti.com.android_leti_2.R;

/**
 * Created by romankov on 08.04.17.
 */

public class ViewPropertyAnimationExampleOneActivity extends AppCompatActivity {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_view_property_example_one);

            final View viewCustom = (View) findViewById(R.id.customView);
            final float startPositionX = viewCustom.getX();


            Button btn = (Button) findViewById(R.id.button);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(viewCustom,"X",startPositionX + getRandom());
                    objectAnimator.start();
                }
            });

        }


        private int getRandom(){
            int min = 50;
            int max = 500;

            Random r = new Random();
            int i1 = r.nextInt(max - min + 1) + min;
            return i1;
        }
}
