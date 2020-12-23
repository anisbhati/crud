package com.anisbatcgdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.anisbatcgdemo.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{

}
