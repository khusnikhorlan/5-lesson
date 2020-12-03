package com.example.a5lesson.ui.cabinet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.a5lesson.R;

public class CabinetFragment extends Fragment {
    View root;
    TextView tv_home;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.cabinet_fragment, container, false);
        tv_home= root.findViewById(R.id.tv_home);
        tv_home.setText("Text Changed");

        return root;
    }
}