package in.kashewdevelopers.mirrortext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    int angle = 0;
    TextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        appName = findViewById(R.id.appName);

        final Handler rotate = new Handler();
        rotate.postDelayed(new Runnable() {
            @Override
            public void run() {
                angle += 15;
                appName.setRotationY(angle);
                if (angle < 180)
                    rotate.postDelayed(this, 50);
                else
                    go();
            }
        }, 250);

    }

    public void go() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
            }
        }, 1000);
    }
}
