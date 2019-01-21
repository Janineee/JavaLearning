package com.janine.dao;

import com.janine.BaseTest;
import com.janine.pojo.Area;
import com.janine.pojo.PersonInfo;
import com.janine.pojo.Shop;
import com.janine.pojo.ShopCategory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;


class ShopDaoTest extends BaseTest {
    @Autowired
    private ShopDao shopDao;
    
    public void insertShopTest() {
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        
        owner.setUserId(1L);
        area.setAreaId(2L);
        shopCategory.setShopCategoryId(1L);
        // shop.seto(owner);
    }
}