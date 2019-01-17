package com.janine.service.impl;

import com.janine.dao.AreaDao;
import com.janine.pojo.Area;
import com.janine.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    
    @Autowired
    private AreaDao areaDao;
    
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
