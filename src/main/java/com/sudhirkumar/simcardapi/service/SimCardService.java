package com.sudhirkumar.simcardapi.service;

import com.sudhirkumar.simcardapi.entity.SimRecord;
import com.sudhirkumar.simcardapi.repository.SimCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimCardService {
    @Autowired
   private  SimCardRepository simCardRepository;

   public void saveData(SimRecord simRecord) {
       simCardRepository.save(simRecord);
   }

   public List<SimRecord> getAll() {
       return (List<SimRecord>) simCardRepository.findAll();
   }
}
