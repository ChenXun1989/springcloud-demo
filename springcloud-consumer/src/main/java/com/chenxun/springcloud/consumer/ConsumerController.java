package com.chenxun.springcloud.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chenxun.springcloud.api.ComputeService;

@RestController
public class ConsumerController {
	
	@Autowired
	private ComputeService computeService;
	
	@RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b){
		return computeService.add(a, b);
	}

}
