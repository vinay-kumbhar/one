package com.cjc.app.mfi.master.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.mfi.master.main.model.Bank_Details;
import com.cjc.app.mfi.master.main.model.Branch_details;
import com.cjc.app.mfi.master.main.model.City;
import com.cjc.app.mfi.master.main.model.Employee_Details;
import com.cjc.app.mfi.master.main.model.Employee_Document_Details;
import com.cjc.app.mfi.master.main.model.EnquiryDetails;
import com.cjc.app.mfi.master.main.model.Role_Details;
import com.cjc.app.mfi.master.main.repositry.Bank_Repository;
import com.cjc.app.mfi.master.main.repositry.Branch_repository;
import com.cjc.app.mfi.master.main.repositry.CityRepository;
import com.cjc.app.mfi.master.main.repositry.EmployeeDetailsRepositry;
import com.cjc.app.mfi.master.main.repositry.EmployeeDocumentDetailsRepositry;
import com.cjc.app.mfi.master.main.repositry.EnquiryDetailsRep;
import com.cjc.app.mfi.master.main.repositry.Role_Repository;


@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	EnquiryDetailsRep cr;
	
	@Autowired
	CityRepository ct;
	
	@Autowired
	Bank_Repository br;
	
	@Autowired
	Branch_repository brr;
	
	@Autowired
	Role_Repository rr;
	
	@Autowired EmployeeDetailsRepositry r;
	
	@Autowired
	EmployeeDocumentDetailsRepositry eddr;

	@Override
	public void addCustomerEnq(EnquiryDetails end) {
		// TODO Auto-generated method stub
		cr.save(end);
		System.out.println("Enquiry Details added Successfully!");
	}

	@Override
	public Iterable<EnquiryDetails> getAllData() {
		// TODO Auto-generated method stub
		Iterable<EnquiryDetails> itr=cr.findAll();
		return itr;
	}

	@Override
	public void saveCityData(City c) {
		// TODO Auto-generated method stub
		ct.save(c);
	}

	@Override
	public void save(Bank_Details bd) {
		// TODO Auto-generated method stub
		br.save(bd);
	}

	@Override
	public void sava(Branch_details brd) {
		// TODO Auto-generated method stub
		brr.save(brd);
	}

	@Override
	public void sava(Role_Details rd) {
		// TODO Auto-generated method stub
		rr.save(rd);
	}

	@Override
	public void saveEmployeeDetails(Employee_Details ed) {
		// TODO Auto-generated method stub
		r.save(ed);
	}

	@Override
	public void saveEmployeeDocumentDetails(Employee_Document_Details edd) {
		// TODO Auto-generated method stub
		eddr.save(edd);
	}

	@Override
	public List<EnquiryDetails> getAllDataForRE() {
		// TODO Auto-generated method stub
		
		return cr.findAll();
	}

}
