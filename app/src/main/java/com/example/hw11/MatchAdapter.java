package com.example.hw11;

import com.example.hw11.model.Match;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchViewHolder> {

    private List<Match> matches;

    public MatchAdapter(List<Match> matches) {
        this.matches = matches;
    }

    @Override
    public MatchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_2, parent, false);
        return new MatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MatchViewHolder holder, int position) {
        Match m = matches.get(position);
        holder.teams.setText(m.getHomeTeam() + " vs " + m.getAwayTeam());
        holder.score.setText(m.getScore());
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }

    static class MatchViewHolder extends RecyclerView.ViewHolder {
        TextView teams;
        TextView score;

        MatchViewHolder(View itemView) {
            super(itemView);
            teams = itemView.findViewById(android.R.id.text1);
            score = itemView.findViewById(android.R.id.text2);
        }
    }
}