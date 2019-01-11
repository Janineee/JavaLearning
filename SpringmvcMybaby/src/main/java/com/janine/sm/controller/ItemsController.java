package com.janine.sm.controller;

import com.janine.sm.pojo.Items;
import com.janine.sm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
public class ItemsController {
    
    @Autowired
    private ItemService itemService;
    
    @RequestMapping("/list")
    public ModelAndView showList() {
        List<Items> itemsList = itemService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemList", itemsList);
        modelAndView.setViewName("itemList");
        return modelAndView;
    }
    
    @RequestMapping("/itemEdit")
    public String itemEdit(@RequestParam(value = "id", required = false, defaultValue = "1") int itemId, HttpServletRequest request, HttpServletResponse response, HttpSession httpSession, Model model) {
        Items items = itemService.findById(itemId);
        model.addAttribute("item", items);
        return "editItem";
    }
    
    @RequestMapping("/updateitem")
    public String updateItem(Items item, Model model){
        itemService.update(item);
        
        return "success";
    }
    
}
