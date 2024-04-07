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

public class FragmentFirst extends Fragment {

    View view;
    Button firstButton;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_fragment_first, container, false);
        firstButton = view.findViewById(R.id.firstButton);
        firstButton.setOnClickListener(view -> {
            Toast.makeText(getActivity(), "First Fragment", Toast.LENGTH_LONG).show();

        });
        return view;
    };
}