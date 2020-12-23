package com.anisbatcgdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.anisbatcgdemo.repository.PersonRepository;

@RestController
public class DataserviceController {
     
	@Autowired
	PersonRepository prepo;
	
}
