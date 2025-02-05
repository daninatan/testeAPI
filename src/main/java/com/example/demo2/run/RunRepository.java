package com.example.demo2.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    public List<Run> getRuns() {
        return runs;
    }

    public Run findById(Integer id) {
        for (Run run : runs) {
            if(run.id().equals(id)){
                return run;
            }
        }
        return null;
    }

    @PostConstruct
    private void init(){
        runs.add(new Run(1,
           "Monday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1),
                3,
                Location.INDOOR
        ));

        runs.add(new Run(2,
                "Saturday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1),
                7,
                Location.OUTDOOR
        ));
    }

}
