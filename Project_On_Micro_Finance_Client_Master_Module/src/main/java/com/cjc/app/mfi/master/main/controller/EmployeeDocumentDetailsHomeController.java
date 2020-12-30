package com.cjc.app.mfi.master.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.cjc.app.mfi.master.main.model.Employee_Document_Details;
import com.cjc.app.mfi.master.main.service.ClientService;
import com.google.gson.Gson;
@CrossOrigin("*")
@RestController
public class EmployeeDocumentDetailsHomeController 
{
	@Autowired
	ClientService cs;
	
	@GetMapping("/doc")
	public String getstring()
	{
		return "document";
	}
	
	@PostMapping(value="/saveemployeedocument",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public String saveEmployeeDocumentDetails(@RequestPart(value = "doc",required = true) String doc,
											  @RequestPart("employee_adhar_card") MultipartFile file1,
											  @RequestPart("employee_bankpassbook") MultipartFile file2,
											  @RequestPart("employee_pancard") MultipartFile file3,
											  @RequestPart("employee_photo") MultipartFile file4
											 )throws IOException
	{
		Employee_Document_Details edd=new Employee_Document_Details();
		
		edd.setEmployee_adhar_card(file1.getBytes());
		edd.setEmployee_bankpassbook(file2.getBytes());
		edd.setEmployee_pancard(file3.getBytes());
		edd.setEmployee_photo(file4.getBytes());
		
		Gson gson=new Gson();//this is used to get document id and employee id from front end
		//Object mapper is same method which is used as gson method of google
		Employee_Document_Details d=gson.fromJson(doc, Employee_Document_Details.class);
		edd.setEmployee_document_id(d.getEmployee_document_id());
		edd.setEmployee_id(d.getEmployee_id());
		
		System.out.println(edd);
		
		cs.saveEmployeeDocumentDetails(edd);
		return "Document Saved Successfully !!";
	}
}
