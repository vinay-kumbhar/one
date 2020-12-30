package com.cjc.app.mfi.master.main.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.mfi.master.main.model.Employee_Document_Details;

@Repository
public interface EmployeeDocumentDetailsRepositry extends JpaRepository<Employee_Document_Details, Integer>
{

}
