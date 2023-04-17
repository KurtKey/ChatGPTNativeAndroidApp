package com.lavaeff.unlimitedgpt.ui.rating;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lavaeff.unlimitedgpt.databinding.FragmentRateUsBinding;
import com.lavaeff.unlimitedgpt.ui.guide.GuideViewModel;

public class RateUSFragment extends Fragment {

    private FragmentRateUsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GuideViewModel slideshowViewModel =
                new ViewModelProvider(this).get(GuideViewModel.class);

        binding = FragmentRateUsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}