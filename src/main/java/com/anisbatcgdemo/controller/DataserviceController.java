package com.anisbatcgdemo.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
import org.springframework.web.bind.annotation.RequestMapping;

>>>>>>> branch 'master' of https://github.com/anisbhati/crud.git
import org.springframework.web.bind.annotation.RestController;

import com.anisbatcgdemo.repository.PersonRepository;

@RestController
public class DataserviceController {

     
	@Autowired
	PersonRepository prepo;
	


    
	@RequestMapping("/")
	public String getTest() {
		return "running ...... ";
	}

}
