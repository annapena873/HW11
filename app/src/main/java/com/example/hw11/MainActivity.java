package com.example.hw11;

import java.util.List;
import java.util.ArrayList;
import com.example.hw11.model.SoccerEntity;
import com.example.hw11.model.Player;
import com.example.hw11.model.Match;
import com.example.hw11.model.Team;
import com.example.hw11.iterator.CustomIterator;
import com.example.hw11.data.DataProvider;
import com.example.hw11.repository.MatchRepository;
import com.example.hw11.repository.PlayerRepository;
import com.example.hw11.repository.TeamRepository;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataProvider provider = new DataProvider();

        // Repositories
        TeamRepository teamRepo = new TeamRepository();
        PlayerRepository playerRepo = new PlayerRepository();
        MatchRepository matchRepo = new MatchRepository();

        // Fill repositories
        for (Team t : provider.createSampleTeams()) teamRepo.add(t);
        for (Player p : provider.createSamplePlayers()) playerRepo.add(p);
        for (Match m : provider.createSampleMatches()) matchRepo.add(m);

        // RecyclerViews
        RecyclerView recyclerTeams = findViewById(R.id.recyclerViewTeams);
        recyclerTeams.setLayoutManager(new LinearLayoutManager(this));
        recyclerTeams.setAdapter(new TeamAdapter(teamRepo.getAll()));

        RecyclerView recyclerPlayers = findViewById(R.id.recyclerViewPlayers);
        recyclerPlayers.setLayoutManager(new LinearLayoutManager(this));
        recyclerPlayers.setAdapter(new PlayerAdapter(playerRepo.getAll()));

        RecyclerView recyclerMatches = findViewById(R.id.recyclerViewMatches);
        recyclerMatches.setLayoutManager(new LinearLayoutManager(this));
        recyclerMatches.setAdapter(new MatchAdapter(matchRepo.getAll()));
    }
}