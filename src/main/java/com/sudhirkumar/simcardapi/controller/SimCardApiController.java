package com.sudhirkumar.simcardapi.controller;

import com.sudhirkumar.simcardapi.entity.SimRecord;
import com.sudhirkumar.simcardapi.service.SimCardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class SimCardApiController {
    private  SimCardService simCardService;
    @GetMapping("/")
    public ResponseEntity hello() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add")
    public ResponseEntity addSimRecord(@RequestBody SimRecord simRecord) {
        simCardService.saveData(simRecord);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/listall")
//    public List<SimRecord> listAllRecord() {
//        List<SimRecord> list = new ArrayList<>();
//        return list;
//    }
//
//    @PutMapping("/:id")
//    public SimRecord updateRecord() {
//        SimRecord simRecord = null;
//        return simRecord;
//    }
//
//    @DeleteMapping("/:id")
//    public void deleteRecond() {
//
//    }
}
