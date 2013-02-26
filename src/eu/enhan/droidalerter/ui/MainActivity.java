package eu.enhan.droidalerter.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import eu.enhan.droidalerter.R;

/**
 * @author Emmanuel Nhan
 */
public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    public void configure(View view){
        Log.d("DROIDALERTER", "Starting configure...");
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

}