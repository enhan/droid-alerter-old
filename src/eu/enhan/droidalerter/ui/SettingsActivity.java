package eu.enhan.droidalerter.ui;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import eu.enhan.droidalerter.ui.fragments.SettingsFragment;

/**
 * @author Emmanuel Nhan
 */
public class SettingsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display fragment as the main content
        getFragmentManager().beginTransaction().replace(R.id.content, new SettingsFragment()).commit();
    }
}