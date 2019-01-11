package com.janine.sm.service;

import com.janine.sm.pojo.Items;

import java.util.List;

public interface ItemService {
    List<Items> findAll();
    
    Items findById(int itemId);
    
    void update(Items item);
}
