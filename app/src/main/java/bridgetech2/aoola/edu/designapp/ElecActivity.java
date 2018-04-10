package bridgetech2.aoola.edu.designapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ElecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elec);
    }

    public void infoo(View view) {
        Intent intent = new Intent(this, info1.class);
        startActivity(intent);
    }

    public void person2(View view) {
        Intent intent = new Intent(this, info2.class);
        startActivity(intent);
    }

    public void person3(View view) {
        Intent intent = new Intent(this, info3.class);
        startActivity(intent);

    }
}
