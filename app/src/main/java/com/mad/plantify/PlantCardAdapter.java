package com.mad.plantify;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Simple adapter that renders scanned plants as a UI template.
 * This data can be replaced by Room history records later.
 */
public class PlantCardAdapter extends RecyclerView.Adapter<PlantCardAdapter.PlantViewHolder> {

    private final List<String> plants;

    public PlantCardAdapter(List<String> plants) {
        this.plants = plants;
    }

    @NonNull
    @Override
    public PlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_scanned_plant, parent, false);
        return new PlantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlantViewHolder holder, int position) {
        holder.plantName.setText(plants.get(position));
    }

    @Override
    public int getItemCount() {
        return plants.size();
    }

    static class PlantViewHolder extends RecyclerView.ViewHolder {
        final TextView plantName;

        PlantViewHolder(@NonNull View itemView) {
            super(itemView);
            plantName = itemView.findViewById(R.id.plant_name);
        }
    }
}
