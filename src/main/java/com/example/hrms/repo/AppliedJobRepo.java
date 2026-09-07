package com.example.hrms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.model.AppliedJob;

public interface AppliedJobRepo extends JpaRepository<AppliedJob, Integer>{

	//Check if user already exists
	boolean existsByJobidAndEmailaddress(int jobid,String emiladdress);
}
