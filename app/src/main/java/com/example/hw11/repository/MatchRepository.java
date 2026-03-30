package com.example.hw11.repository;

import com.example.hw11.model.Match;
import java.util.ArrayList;
import java.util.List;

public class MatchRepository {
    private List<Match> matches = new ArrayList<>();

    public void add(Match match) {
        matches.add(match);
    }

    public List<Match> getAll() {
        return matches;
    }
}