package com.example.quickStart;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.data.mongodb.repository.Update;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping
public class storingController {
    @Autowired
    private ValorantRepository valorantRepository;
    @Autowired
    private MongoTemplate mongoTemplate;


    @PostMapping("/storeNew")
    public void storeData (@RequestBody Valorant valorant) {
        valorantRepository.save(valorant);
    }
    @PutMapping("/updateValue")
    public void updateData (@RequestBody Map<String, Object> data) {
        String id = (String) data.get("id");
        String fieldToUpdate = (String) data.get("incrementField");
        String userCount = (String) data.get("incrementUserCount");
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = new Update().inc(fieldToUpdate,1);
        update.inc(userCount,1);
        mongoTemplate.updateFirst(query, update, Valorant.class);
    }


}
