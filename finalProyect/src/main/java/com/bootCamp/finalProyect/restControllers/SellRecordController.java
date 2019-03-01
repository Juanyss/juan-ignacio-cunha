package com.bootCamp.finalProyect.restControllers;

import com.bootCamp.finalProyect.domain.SellRecord;
import com.bootCamp.finalProyect.implementations.SellRecordService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/api/sellrecords"})
public class SellRecordController {
    private SellRecordService sellRecordService;

    public SellRecordController(SellRecordService sellRecordService) {
        this.sellRecordService = sellRecordService;
    }

    @ApiOperation("Return all the sell record data")
    @GetMapping("")
    List<SellRecord> sellRecordsHistory() {
        return this.sellRecordService.SellRecords();
    }

    @ApiOperation("Return all the sell record data from one user via user id")
    @GetMapping("/{userId}")
    List<SellRecord> userSellRecord(@PathVariable("userId") Long userId) {
        return this.sellRecordService.userSellRecord(userId);
    }

    @ApiOperation("CheckOut all the shopping cart products to sell record")
    @GetMapping("/{userId}/checkout")
    public void checkOut(@PathVariable("userId") Long userId) {
        this.sellRecordService.save(userId);
    }
}
