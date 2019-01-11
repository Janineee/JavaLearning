package com.janine.ssm.service.impl;

import com.janine.common.utils.PageBean;
import com.janine.ssm.mapper.CustomerMapper;
import com.janine.ssm.pojo.Customer;
import com.janine.ssm.pojo.QueryVo;
import com.janine.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerMapper customerMapper;
    
    @Override
    public PageBean findByPage(QueryVo queryVo) {
        PageBean pageBean = new PageBean<Customer>();
        List<Customer> list = customerMapper.findByPage(queryVo);
		int totalCount = customerMapper.findTotalCount(queryVo);
		pageBean.setCurrentPage(queryVo.getCurrentPage());
		pageBean.setList(list);
		pageBean.setPageSize(queryVo.getPageSize());
		pageBean.setTotalCount(totalCount);
        
        return pageBean;
    }
    
    @Override
    public Customer findById(long id) {
        return customerMapper.findById(id);
    }
}
