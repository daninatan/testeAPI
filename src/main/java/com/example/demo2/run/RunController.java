package com.example.demo2.run;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // Permite requisições de qualquer origem
@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    @GetMapping("")
    List<Run> runs(){
        return runRepository.getRuns();
    }

    @GetMapping("/getById")
    Run findById(@RequestParam Integer id){
        return runRepository.findById(id);
    }
}
