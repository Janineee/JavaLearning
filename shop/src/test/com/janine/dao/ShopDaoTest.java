package com.janine.dao;

import com.janine.BaseTest;
import com.janine.pojo.Area;
import com.janine.pojo.PersonInfo;
import com.janine.pojo.Shop;
import com.janine.pojo.ShopCategory;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import io.codearte.jfairy.producer.text.TextProducer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Locale;


class ShopDaoTest extends BaseTest {
    @Autowired
    private ShopDao shopDao;
    
    Fairy fairy = Fairy.create(Locale.forLanguageTag("zh"));
    
    @Test
    public void insertShopTest() {
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        
        owner.setUserId(1L);
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        // 创造虚假数据
        TextProducer textProducer = fairy.textProducer();
        Person person = fairy.person();
        shop.setShopName("测试店铺1");
        shop.setShopDesc(textProducer.paragraph());
        shop.setShopAddr(person.getAddress().getAddressLine1());
        shop.setPhone(person.getTelephoneNumber());
        shop.setShopImg("test img");
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        
        int effectedNum = shopDao.insertShop(shop);
        Assertions.assertEquals(1, effectedNum);
        
    }
}