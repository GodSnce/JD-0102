package com.tsrj.manager.controller;

import com.tsrj.manager.po.TbItem;
import com.tsrj.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/item")
@Controller
public class ItemController {

    @Autowired
    private ItemService service;

    @RequestMapping("/test/{itemId}")
    @ResponseBody
    public TbItem queryItemById(@PathVariable Long itemId) {

        return service.queryItemById(itemId);
    }
}
