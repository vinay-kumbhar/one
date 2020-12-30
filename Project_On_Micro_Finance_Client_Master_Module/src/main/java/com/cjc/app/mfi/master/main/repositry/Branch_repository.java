package com.cjc.app.mfi.master.main.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.mfi.master.main.model.Branch_details;
@Repository

public interface Branch_repository extends CrudRepository<Branch_details, Integer> {

}
