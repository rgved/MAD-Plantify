package com.mad.plantify;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;

/**
 * Home screen template that mirrors the scanned plants gallery.
 * In a full MVVM flow, this list should come from ViewModel + Room.
 */
public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView list = root.findViewById(R.id.scanned_plants_list);
        list.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        list.setAdapter(new PlantCardAdapter(Arrays.asList(
                "Swiss cheese plant",
                "Aloe vera plant",
                "Snake plant",
                "Succulent plant",
                "Money plant",
                "Devil's ivy plant"
        )));

        return root;
    }
}
