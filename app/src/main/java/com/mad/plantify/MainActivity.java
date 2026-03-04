package com.mad.plantify;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.mad.plantify.databinding.ActivityMainBinding;

/**
 * Main host activity with a custom floating-center navigation bar.
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState == null) {
            switchFragment(new HomeFragment());
            setSelectedTab(Tab.HOME);
        }

        binding.navHome.setOnClickListener(v -> {
            switchFragment(new HomeFragment());
            setSelectedTab(Tab.HOME);
        });

        binding.navLibrary.setOnClickListener(v -> {
            switchFragment(new ShopFragment());
            setSelectedTab(Tab.LIBRARY);
        });

        binding.navAlerts.setOnClickListener(v -> {
            switchFragment(new CareFragment());
            setSelectedTab(Tab.ALERTS);
        });

        binding.navProfile.setOnClickListener(v -> {
            switchFragment(new ProfileFragment());
            setSelectedTab(Tab.PROFILE);
        });

        binding.navScan.setOnClickListener(v -> switchFragment(new IdentifyFragment()));
    }

    private void switchFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

    private void setSelectedTab(Tab tab) {
        setNavState(binding.navHomeIcon, binding.navHomeLabel, tab == Tab.HOME);
        setNavState(binding.navLibraryIcon, binding.navLibraryLabel, tab == Tab.LIBRARY);
        setNavState(binding.navAlertsIcon, binding.navAlertsLabel, tab == Tab.ALERTS);
        setNavState(binding.navProfileIcon, binding.navProfileLabel, tab == Tab.PROFILE);
    }

    private void setNavState(ImageView icon, TextView label, boolean selected) {
        int color = getColor(selected ? R.color.nav_active : R.color.nav_inactive);
        icon.setColorFilter(color);
        label.setTextColor(color);
    }

    private enum Tab {
        HOME,
        LIBRARY,
        ALERTS,
        PROFILE
    }
}
