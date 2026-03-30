package com.example.hw11.repository;

import com.example.hw11.model.Team;
import java.util.ArrayList;
import java.util.List;

public class TeamRepository {
    private List<Team> teams = new ArrayList<>();

    public void add(Team team) {
        teams.add(team);
    }

    public List<Team> getAll() {
        return teams;
    }
}