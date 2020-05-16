package in.kashewdevelopers.mirrortext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void gitHubLink(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com/kashew-developers/MirrorText")));
    }
}
