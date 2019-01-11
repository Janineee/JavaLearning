package com.janine.ssm.mapper;

import com.janine.ssm.pojo.BaseDict;
import com.janine.ssm.pojo.Customer;
import com.janine.ssm.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDictMapper {
    List<BaseDict> findByTypecode(@Param("typecode") String typecode);
    // List<Customer> findByPage(QueryVo queryVo);
}
