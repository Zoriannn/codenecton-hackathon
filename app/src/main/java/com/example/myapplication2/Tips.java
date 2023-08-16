package com.example.myapplication2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication2.databinding.TipsBinding;

public class Tips extends Fragment {

    private TipsBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = TipsBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.button.setBackgroundColor(getResources().getColor(R.color.purple_500));
                NavHostFragment.findNavController(Tips.this)
                        .navigate(R.id.home);
            }
        });

        binding.buttondriving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.buttondriving.setBackgroundColor(getResources().getColor(R.color.purple_500));
                NavHostFragment.findNavController(Tips.this)
                        .navigate(R.id.driving);
            }
        });
        binding.buttonpurse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.buttonpurse.setBackgroundColor(getResources().getColor(R.color.purple_500));
                NavHostFragment.findNavController(Tips.this)
                        .navigate(R.id.purse);
            }
        });
        binding.buttonwalking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.buttonwalking.setBackgroundColor(getResources().getColor(R.color.purple_500));
                NavHostFragment.findNavController(Tips.this)
                        .navigate(R.id.walking);
            }
        });
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}