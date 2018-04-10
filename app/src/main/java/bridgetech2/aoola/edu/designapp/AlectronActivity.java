package bridgetech2.aoola.edu.designapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AlectronActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alectron);
    }


    public void ELCC(View view) {
        Intent intent = new Intent(this , elc1.class);
        startActivity(intent);
    }
}
