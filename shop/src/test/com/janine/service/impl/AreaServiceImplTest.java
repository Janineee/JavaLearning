package com.janine.service.impl;

import com.janine.BaseTest;
import com.janine.pojo.Area;
import com.janine.service.AreaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AreaServiceImplTest extends BaseTest {
    
    @Autowired
    private AreaService areaService;
    
    @Test
    void getAreaList() {
        List<Area> areaList = areaService.getAreaList();
    }
}