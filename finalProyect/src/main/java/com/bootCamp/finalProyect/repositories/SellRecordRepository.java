package com.bootCamp.finalProyect.repositories;

import com.bootCamp.finalProyect.domain.SellRecord;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellRecordRepository extends CrudRepository<SellRecord,Long> {

    @Query("SELECT sr FROM SellRecord sr")
    List<SellRecord> userSellRecords();

    @Query("SELECT sr FROM SellRecord sr WHERE sr.userId = :userId ")
    List<SellRecord> userSellRecord(@Param("userId") Long userId);
}
