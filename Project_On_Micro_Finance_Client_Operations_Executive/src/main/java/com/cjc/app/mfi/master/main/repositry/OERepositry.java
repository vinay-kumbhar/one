package com.cjc.app.mfi.master.main.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.app.mfi.master.main.model.CibilCheck;


public interface OERepositry extends JpaRepository<CibilCheck, Integer>
{

}
