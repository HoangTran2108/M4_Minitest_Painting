package com.example.paintingManager.controller;

import com.example.paintingManager.model.Painting;
import com.example.paintingManager.service.IPantingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/painting")

public class PaintingController {
    @Autowired
    private IPantingService pantingService;

    @GetMapping("")
    public ModelAndView index() {
        List<Painting> paintingList = pantingService.findAll();
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("paintings", paintingList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("painting", new Painting());
        return modelAndView;
    }
    @PostMapping("/add")
    public ModelAndView save(Painting painting) {
        ModelAndView modelAndView = new ModelAndView("redirect:/painting");
        painting.setId((int) (Math.random() * 10000));
        pantingService.add(painting);
        return modelAndView;
    }

    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("painting", pantingService.findById(id));
        return modelAndView;
    }
    @PostMapping("/update")
    public ModelAndView update(Painting painting) {
        pantingService.update(painting.getId(), painting);
        ModelAndView modelAndView = new ModelAndView("redirect:/painting");
        return modelAndView;
    }

    @GetMapping("/delete")
    public ModelAndView delete(Painting painting) {
        ModelAndView modelAndView = new ModelAndView("redirect:/painting");
        pantingService.remove(painting.getId());
        return modelAndView;
    }

    @GetMapping("/{id}/view")
    public ModelAndView view(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/view");
        modelAndView.addObject("painting", pantingService.findById(id));
        return modelAndView;
    }

}
