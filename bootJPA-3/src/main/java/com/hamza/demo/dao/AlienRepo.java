package com.hamza.demo.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hamza.demo.model.Alien;


public interface AlienRepo extends JpaRepository<Alien, Integer>{
		

}
