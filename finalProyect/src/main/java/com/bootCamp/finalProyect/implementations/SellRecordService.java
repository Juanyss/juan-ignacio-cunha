package com.bootCamp.finalProyect.implementations;

import com.bootCamp.finalProyect.domain.Product;
import com.bootCamp.finalProyect.domain.SellRecord;
import com.bootCamp.finalProyect.interfaces.SellRecordImp;
import com.bootCamp.finalProyect.repositories.ItemRepository;
import com.bootCamp.finalProyect.repositories.ProductRepository;
import com.bootCamp.finalProyect.repositories.SellRecordRepository;
import com.bootCamp.finalProyect.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellRecordService implements SellRecordImp {
    @Autowired
    SellRecordRepository sellRecordRepository;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @Autowired
    ProductRepository productRepository;

    public SellRecordService() {
    }

    @Override
    public List<SellRecord> SellRecords(){
        return this.sellRecordRepository.userSellRecords();
    }

    @Override
    public List<SellRecord> userSellRecord(Long userId){
        return this.sellRecordRepository.userSellRecord(userId);
    }

    @Override
    public void save(Long userId){
        for(Integer i=0;i<this.itemRepository.findAll(this.shoppingCartRepository.getShoppingCartId(userId)).size();i++){
            SellRecord sr = new SellRecord();
            sr.setUserId(this.shoppingCartRepository.getShoppingCartId(userId).getUser());
            sr.setProductId(this.itemRepository.findAllItems(this.shoppingCartRepository.getShoppingCartId(userId))
                    .get(i).getProduct());
            sr.setProductName(this.itemRepository.productNames(this.shoppingCartRepository.getShoppingCartId(userId))
                    .get(i));
            sr.setQuantity(this.itemRepository.findAllItems(this.shoppingCartRepository.getShoppingCartId(userId))
                    .get(i).getQuantity());
            sr.setAmount(this.itemRepository.productPrices(this.shoppingCartRepository.getShoppingCartId(userId))
                    .get(i));
            this.sellRecordRepository.save(sr);
        }

        this.itemRepository.deleteAll(this.shoppingCartRepository.getShoppingCartId(userId));
    }
}
