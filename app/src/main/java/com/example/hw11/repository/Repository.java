package com.example.hw11.repository;

import com.example.hw11.model.SoccerEntity;
import java.util.ArrayList;
import java.util.List;

public class Repository<T extends SoccerEntity> {

    protected List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }
}