package com.sudhirkumar.simcardapi.service;

import com.sudhirkumar.simcardapi.entity.SimRecord;
import com.sudhirkumar.simcardapi.repository.SimCardRepository;

import java.util.List;

public class SimCardService {

   private  SimCardRepository simCardRepository;

   public void saveData(SimRecord simRecord) {
       simCardRepository.save(simRecord);
   }

   public List<SimRecord> getAll() {
       return (List<SimRecord>) simCardRepository.findAll();
   }
}
