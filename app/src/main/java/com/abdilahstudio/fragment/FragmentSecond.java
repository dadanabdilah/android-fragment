package com.abdilahstudio.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentSecond extends Fragment {
    View view;
    Button secondButton;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_fragment_second, container, false);
        secondButton = view.findViewById(R.id.secondButton);
        secondButton.setOnClickListener(view1 -> {
            Toast.makeText(getActivity(), "Second Fragment", Toast.LENGTH_LONG).show();
        });
        return view;
    }
}