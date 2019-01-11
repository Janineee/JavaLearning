package com.janine.sm.service.impl;

import com.janine.sm.mapper.ItemsMapper;
import com.janine.sm.pojo.Items;
import com.janine.sm.pojo.ItemsExample;
import com.janine.sm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    
    @Autowired
    private ItemsMapper itemsMapper;
    
    @Override
    public List<Items> findAll() {
        
        return itemsMapper.selectByExample(new ItemsExample());
    }
    
    @Override
    public Items findById(int itemId) {
        return itemsMapper.selectByPrimaryKey(itemId);
    }
    
    @Override
    public void update(Items item) {
        itemsMapper.updateByPrimaryKeySelective(item);
    }
}
