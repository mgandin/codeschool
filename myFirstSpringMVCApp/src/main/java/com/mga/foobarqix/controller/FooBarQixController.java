package com.mga.foobarqix.controller;

import com.google.common.collect.Lists;
import com.mga.foobarqix.model.FooBarQix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/foobarqix")
public class FooBarQixController {

    private FooBarQix fooBarQix;

    @Autowired
    public FooBarQixController(FooBarQix fooBarQix) {
        this.fooBarQix = fooBarQix;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ModelAttribute("foobarqixs")
    public List<String> display(ModelMap modelMap) {

        List<String> fooBarQixs = Lists.newArrayList();
        for(int i=1; i <= 100;i++) {
            fooBarQixs.add(fooBarQix.fooBarQix(i));
        }
        return fooBarQixs;
    }
}
