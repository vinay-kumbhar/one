package com.cjc.app.mfi.master.main.service;

import java.util.List;

import com.cjc.app.mfi.master.main.model.CustomerDetails;

public interface CustomerService {

	void savedata(CustomerDetails cd);

	List<CustomerDetails> displayData();

}
