package eu.enhan.droidalerter.ui.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import eu.enhan.droidalerter.R;

/**
 * @author Emmanuel Nhan
 */
public class SettingsFragment extends PreferenceFragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);
    }
}
