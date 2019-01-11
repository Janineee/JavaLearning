package com.janine.items.controller;

import com.janine.items.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class ItemController {
    
    @RequestMapping("itemList")
    public ModelAndView itemList() {
        ModelAndView mav = new ModelAndView();
        
        List<Item> list = Arrays.asList(
                new Item(1, "冰箱1", 1999, new Date(), "冰箱很重要1"),
                new Item(2, "冰箱2", 1999, new Date(), "冰箱很重要2"),
                new Item(3, "冰箱3", 1999, new Date(), "冰箱很重要3"),
                new Item(4, "冰箱4", 1999, new Date(), "冰箱很重要4"));
        mav.addObject("itemList", list);
        // mav.setViewName("/WEB-INF/jsp/itemList.jsp");
        mav.setViewName("itemList");
        
        return mav;
    }
}
