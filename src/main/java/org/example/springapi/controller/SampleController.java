package org.example.springapi.controller;

import org.example.springapi.model.SampleModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SampleController {

    private final List<SampleModel> samples = new ArrayList<>();

    @GetMapping("/samples")
    public List<SampleModel> getSamples() {
        return samples;
    }

    @PostMapping("/samples")
    public String addSample(@RequestBody SampleModel sample) {
        samples.add(sample);
        return "Элемент успешно добавлен!";
    }
}