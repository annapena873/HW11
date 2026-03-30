package com.example.hw11.repository;

import com.example.hw11.model.Player;
import java.util.ArrayList;
import java.util.List;

public class PlayerRepository {
    private List<Player> players = new ArrayList<>();

    public void add(Player player) {
        players.add(player);
    }

    public List<Player> getAll() {
        return players;
    }
}