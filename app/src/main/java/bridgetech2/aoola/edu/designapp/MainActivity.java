package bridgetech2.aoola.edu.designapp;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ffff(View view) {

        Intent intent = new Intent(this , ElecActivity.class);
        startActivity(intent);


    }

    public void shebtes(View view) {
        Intent intent = new Intent(this , ShebotssActivity.class);
        startActivity(intent);

    }

    public void sbak(View view) {

        Intent intent = new Intent(this , SbakkActivity.class);
        startActivity(intent);
    }

    public void alectron(View view) {
        Intent intent = new Intent(this , AlectronActivity.class);
        startActivity(intent);
    }

    public void mid(View view) {
        Intent intent = new Intent(this , MidActivity.class);
        startActivity(intent);
    }

    public void carr(View view) {
        Intent intent = new Intent(this , CarActivity.class);
        startActivity(intent);
    }
}
