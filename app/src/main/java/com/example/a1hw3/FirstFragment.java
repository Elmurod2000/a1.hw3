package com.example.a1hw3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment {

    private Button button;
    private EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = view.findViewById(R.id.btn_send_one);
        editText = view.findViewById(R.id.et_first);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        Bundle bundle = new Bundle();
        SecondFragment fragment = new SecondFragment();
        String data = editText.getText().toString();
        fragment.setArguments(bundle);
        bundle.putString("key_first", data);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_cont, fragment).addToBackStack(null)
                .commit();

            }
        });

    }
}