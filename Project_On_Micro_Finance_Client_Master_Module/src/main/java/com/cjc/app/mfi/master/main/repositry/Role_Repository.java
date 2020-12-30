package com.cjc.app.mfi.master.main.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.mfi.master.main.model.Role_Details;

@Repository
public interface Role_Repository extends CrudRepository<Role_Details, Integer> {

}
