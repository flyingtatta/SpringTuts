package com.hamza.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.hamza.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
		
	

}
