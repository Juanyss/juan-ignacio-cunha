package com.bootCamp.finalProyect.interfaces;

import com.bootCamp.finalProyect.domain.SellRecord;

import java.util.List;

public interface SellRecordImp {
    void save(Long userId);
    List<SellRecord> SellRecords();
    List<SellRecord> userSellRecord(Long userId);
}
