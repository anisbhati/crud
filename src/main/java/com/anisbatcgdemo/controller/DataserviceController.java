package com.anisbatcgdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataserviceController {

    
	@RequestMapping("/")
	public String getTest() {
		return "running ...... ";
	}
}
