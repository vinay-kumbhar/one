package com.cjc.app.mfi.master.main.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.mfi.master.main.model.Bank_Details;



@Repository
public interface Bank_Repository extends CrudRepository<Bank_Details, Integer> {
	
	
	
	
	

}
