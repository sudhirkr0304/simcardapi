package com.sudhirkumar.simcardapi.repository;

import com.sudhirkumar.simcardapi.entity.SimRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimCardRepository extends CrudRepository<SimRecord,Long> {
}
