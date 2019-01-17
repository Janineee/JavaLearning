package com.janine.dao;

import com.janine.BaseTest;
import com.janine.pojo.Area;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;
    
    @Test
    public void testQueryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(4, areaList.size());
        System.out.println(areaList);
    }
    
    
    
}
