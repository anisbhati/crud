package com.anisbatcgdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class DataserviceController {
    
	@RequestMapping("/")
	public String getTest() {
		return "running ...... ";
	}
}
