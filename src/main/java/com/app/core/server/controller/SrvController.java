package com.app.core.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sanya on 12.01.16.
 */

@Controller
@RequestMapping("/server")
public class SrvController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String get(ModelMap model) {
        return "Hello World!";
    }

}
