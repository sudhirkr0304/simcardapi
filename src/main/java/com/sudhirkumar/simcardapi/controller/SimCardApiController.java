package com.sudhirkumar.simcardapi.controller;

import com.sudhirkumar.simcardapi.entity.SimRecord;
import com.sudhirkumar.simcardapi.service.SimCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class SimCardApiController {
    @Autowired
    private  SimCardService simCardService;
    @GetMapping("/")
    public ResponseEntity hello() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addSimRecord(@RequestBody SimRecord simRecord) {
        SimRecord simRecord1 = new SimRecord("11","11","11","11","11","11","11","11");
        simCardService.saveData(simRecord1);
        if(simRecord != null) {
            try {
                simCardService.saveData(simRecord);
                return ResponseEntity.status(HttpStatus.OK).body("Data Interested..");
            }
            catch (Exception e) {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getLocalizedMessage());
            }

        }
        else {
            HttpStatus badRequest = HttpStatus.BAD_REQUEST;
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("incorrect data format");
        }
        
    }

    @GetMapping("/listall")
    public List<SimRecord> listAllRecord() {
        return simCardService.getAll();
    }
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
