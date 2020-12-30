package com.cjc.app.mfi.master.main.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.mfi.master.main.model.EnquiryDetails;

@Repository
public interface EnquiryDetailsRep extends JpaRepository<EnquiryDetails, Integer>{

}
