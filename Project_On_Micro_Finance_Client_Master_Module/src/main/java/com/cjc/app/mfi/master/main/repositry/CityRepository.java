package com.cjc.app.mfi.master.main.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.mfi.master.main.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

}
