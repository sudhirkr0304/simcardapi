package com.sudhirkumar.simcardapi.service;

import com.sudhirkumar.simcardapi.entity.SimRecord;
import com.sudhirkumar.simcardapi.repository.SimCardRepository;

public class SimCardService {

   private  SimCardRepository simCardRepository;

   public void saveData(SimRecord simRecord) {
       simCardRepository.save(simRecord);
   }
}
