package com.janine.ssm.service;

import com.janine.common.utils.PageBean;
import com.janine.ssm.pojo.Customer;
import com.janine.ssm.pojo.QueryVo;

public interface CustomerService {
    PageBean findByPage(QueryVo queryVo);
    Customer findById(long id);
}
