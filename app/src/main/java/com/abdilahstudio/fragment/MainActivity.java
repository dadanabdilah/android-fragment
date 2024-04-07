package com.abdilahstudio.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button firstFragment, secondFragment;
    FragmentFirst fragmentFirst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment = (Button) findViewById(R.id.fistFragment);
        secondFragment = (Button) findViewById(R.id.SecondFragment);

        fragmentFirst = new FragmentFirst();

        firstFragment.setOnClickListener(V -> {
            loadFragment(fragmentFirst);

        });

        secondFragment.setOnClickListener(V -> {
            loadFragment(new FragmentSecond());
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}