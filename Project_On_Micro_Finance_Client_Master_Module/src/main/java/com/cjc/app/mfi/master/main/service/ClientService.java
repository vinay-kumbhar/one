package com.cjc.app.mfi.master.main.service;

import java.util.List;

import com.cjc.app.mfi.master.main.model.Bank_Details;
import com.cjc.app.mfi.master.main.model.Branch_details;
import com.cjc.app.mfi.master.main.model.City;
import com.cjc.app.mfi.master.main.model.Employee_Details;
import com.cjc.app.mfi.master.main.model.Employee_Document_Details;
import com.cjc.app.mfi.master.main.model.EnquiryDetails;
import com.cjc.app.mfi.master.main.model.Role_Details;

public interface ClientService {
	
	public void addCustomerEnq(EnquiryDetails end);
	public Iterable<EnquiryDetails> getAllData();
	
	public void saveCityData(City c);
	
	void save(Bank_Details bd);
	void sava(Branch_details brd);
	void sava(Role_Details rd);
	
	public void saveEmployeeDetails(Employee_Details ed);
	public void saveEmployeeDocumentDetails(Employee_Document_Details edd);
	
	//Get Data of Customer For RE
	
	public List<EnquiryDetails> getAllDataForRE();

}
