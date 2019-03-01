package com.bootCamp.finalProyect.implementations;

import com.bootCamp.finalProyect.domain.Item;
import com.bootCamp.finalProyect.interfaces.ItemImp;
import com.bootCamp.finalProyect.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemService implements ItemImp {
    
    @Autowired
    private ItemRepository itemRepository;

    public ItemService() {
    }

    @Override
    public void save(Item item){
        Item i = new Item();
        i.setProduct(item.getProduct());
        i.setQuantity(item.getQuantity());
        System.out.println(i.getQuantity());
        this.itemRepository.save(i);
    }
}
