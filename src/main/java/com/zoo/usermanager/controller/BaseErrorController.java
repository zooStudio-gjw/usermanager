package com.zoo.usermanager.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/error")
public class BaseErrorController implements ErrorController {

    private final static Logger LOG = LoggerFactory.getLogger(BaseErrorController.class);

    @Override
    public String getErrorPath() {
        LOG.info("出错啦");
        return "error/error";
    }

    @RequestMapping()
    public String error(){
        return getErrorPath();
    }

}
