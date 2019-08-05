package com.zoo.usermanager.handler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorExceptionHandler {



    private final static Logger LOG = LoggerFactory.getLogger(ErrorExceptionHandler.class);

    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(Exception e){

        LOG.info("-----自定义异常处理-----");
        ModelAndView model = new ModelAndView(  );
        model.addObject("processException",e.getMessage()  );
        model.setViewName("error/500");
        return model;

    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(RuntimeException e){

        LOG.info("-----自定义异常处理-----");
        ModelAndView model = new ModelAndView(  );
        model.addObject("runtimeException",e.getMessage()  );
        model.setViewName("error/500");
        return model;

    }

}
