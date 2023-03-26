package com.example.paintingManager.service;

import com.example.paintingManager.model.Painting;

import java.util.*;

public class PaintingService implements IPantingService{
    private static final Map<Integer, Painting> paintings = new HashMap<>();

    static {
        paintings.put(1, new Painting(1, "p1", 3.1, 3.0, "paper", "normal", 100));
        paintings.put(2, new Painting(2, "p2", 4.2, 3.8, "wood", "good", 1000));
        paintings.put(3, new Painting(3, "p3", 6.3, 3.5, "wood", "bad", 10));

    }
    @Override
    public List<Painting> findAll() {
        return new ArrayList<>(paintings.values());
    }

    @Override
    public void add(Painting painting) {
        paintings.put(painting.getId(), painting);
    }

    @Override
    public Painting findById(int id) {
        return paintings.get(id);
    }

    @Override
    public void update(int id, Painting painting) {
        paintings.put(id, painting);
    }

    @Override
    public void remove(int id) {
        paintings.remove(id);
    }


}
