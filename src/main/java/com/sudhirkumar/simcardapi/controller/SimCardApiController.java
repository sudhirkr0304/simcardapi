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
    public SimRecord addSimRecord(@RequestBody SimRecord simRecord) {
        SimRecord simRecord1 = new SimRecord("11","11","11","11" ,"11","11","11","11");

        try {
            if(simRecord == null) {
                simCardService.saveData(simRecord1);
            }
            else {
                simCardService.saveData(simRecord);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
            return simRecord;
        }


        return simRecord;
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
