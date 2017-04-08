package app.leti.com.android_leti_2.ViewAnimationActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;

import app.leti.com.android_leti_2.R;

/**
 * Created by romankov on 08.04.17.
 */

public class ViewAnimationActivityExampleOne extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation_example1);

        final ScaleAnimation scaleAnimation = new ScaleAnimation(1,0.1f,1,0.1f, Animation.RELATIVE_TO_SELF,.5f,Animation.RELATIVE_TO_SELF,.5f);
        scaleAnimation.setDuration(1000);
        final View viewAnimation = findViewById(R.id.customView);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAnimation.startAnimation(scaleAnimation);
            }
        });
    }

}
