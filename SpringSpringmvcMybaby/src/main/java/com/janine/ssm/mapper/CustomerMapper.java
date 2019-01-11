package com.janine.ssm.mapper;

import com.janine.ssm.pojo.Customer;
import com.janine.ssm.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {
    List<Customer> findByPage(QueryVo queryVo);
    int findTotalCount(QueryVo queryVo);
    Customer findById(@Param("id") long id);
}
