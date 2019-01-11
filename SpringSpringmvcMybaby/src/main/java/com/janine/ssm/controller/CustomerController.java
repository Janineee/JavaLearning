package com.janine.ssm.controller;

import com.janine.common.utils.PageBean;
import com.janine.ssm.pojo.BaseDict;
import com.janine.ssm.pojo.Customer;
import com.janine.ssm.pojo.QueryVo;
import com.janine.ssm.service.BaseDictService;
import com.janine.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class CustomerController {
    
    @Value("${base_dict.source}")
    private String baseDictSource;
    @Value("${base_dict.industry}")
    private String baseDictIndustry;
    @Value("${base_dict.level}")
    private String baseDictLevel;
    
    @Autowired
    private BaseDictService baseDictService;
    
    @Autowired
	private CustomerService customerService;
    
    @RequestMapping("/list")
    public String list(QueryVo queryVo, Model model) throws UnsupportedEncodingException {
        // 查询客户来源、行业、等级
        List<BaseDict> sourceList = baseDictService.findByTypecode(baseDictSource);
        List<BaseDict> industryList = baseDictService.findByTypecode(baseDictIndustry);
        List<BaseDict> levelList = baseDictService.findByTypecode(baseDictLevel);
    
        for (int i = 0; i < sourceList.size(); i++){
            System.out.println(sourceList.toString());
        }
        for (int i = 0; i < industryList.size(); i++){
            System.out.println(industryList.toString());
        }
        for (int i = 0; i < levelList.size(); i++){
            System.out.println(levelList.toString());
        }
        
        //
        model.addAttribute("sourceList", sourceList);
        model.addAttribute("industryList", industryList);
        model.addAttribute("levelList", levelList);
        
        if(queryVo.getCurrentPage()==0){
			queryVo.setCurrentPage(1);
		}
		if(queryVo.getPageSize()==0){
			queryVo.setPageSize(5);
		}
		queryVo.setStart((queryVo.getCurrentPage()-1)*queryVo.getPageSize());
  
		model.addAttribute("custSource", queryVo.getCustSource());
		model.addAttribute("custIndustry", queryVo.getCustIndustry());
		model.addAttribute("custLevel", queryVo.getCustLevel());
		
		if(queryVo.getCustName()!=null && !queryVo.getCustName().equals("")){
			String custName = new String(queryVo.getCustName().getBytes("iso-8859-1"),"utf-8");
			model.addAttribute("custName", custName);
			queryVo.setCustName(custName);
		}
		
		// 获取分页数据
		PageBean pageBean = customerService.findByPage(queryVo);
		model.addAttribute("page", pageBean);
		
        return "customer";
    }
    
    @RequestMapping("/edit")
    @ResponseBody   // 作用把对象转成json字符串并且回写浏览器
    public Customer edit(long id){
        return customerService.findById(id);
    }
}
