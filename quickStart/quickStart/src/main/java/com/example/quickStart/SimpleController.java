package com.example.quickStart;

import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import java.util.List;

@RestController
public class SimpleController {
    @Autowired
    private ValorantRepository valorantRepository;
    @GetMapping("/hey")
    public String heyThere() {
        return "hey there";
    }
    @GetMapping("/all")
    public List<Valorant> getValorants() {
        return valorantRepository.findAll();
    }

    @GetMapping("/items")
    public Page<Valorant>getAllItems(
            @PageableDefault(size = 10, sort="choicenSecond", direction = Sort.Direction.ASC) Pageable pageable){
            return valorantRepository.findAll(pageable);
    }





}
