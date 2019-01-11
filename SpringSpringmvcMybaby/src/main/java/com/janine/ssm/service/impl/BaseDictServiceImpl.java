package com.janine.ssm.service.impl;

import com.janine.ssm.mapper.BaseDictMapper;
import com.janine.ssm.pojo.BaseDict;
import com.janine.ssm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDictServiceImpl implements BaseDictService {
    
    @Autowired
    private BaseDictMapper baseDictMapper;
    
    @Override
    public List<BaseDict> findByTypecode(String typecode) {
        return baseDictMapper.findByTypecode(typecode);
    }
}
