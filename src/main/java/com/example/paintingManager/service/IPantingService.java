package com.example.paintingManager.service;

import com.example.paintingManager.model.Painting;

import java.util.List;

public interface IPantingService {
    List<Painting> findAll();
    void add(Painting painting);
    Painting findById(int id);
    void update(int id, Painting painting);
    void remove(int id);

}
