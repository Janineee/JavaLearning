package com.janine.ssm.service;

import com.janine.ssm.pojo.BaseDict;

import java.util.List;

public interface BaseDictService {
    List<BaseDict> findByTypecode(String typecode);
}
