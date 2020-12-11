package com.bng.test.controller;

/**
 * @author Mansi Rajora
 */


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/bng/zbp")

public class TestController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "Data Structures and Persistence are pretty good.";
    }
}