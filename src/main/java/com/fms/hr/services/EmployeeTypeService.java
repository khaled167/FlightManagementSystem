package com.fms.hr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fms.hr.models.EmployeeType;
import com.fms.hr.repositories.EmployeeTypeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {
	
	@Autowired
	private EmployeeTypeRepository employeeTypeRepository;
	
	//Get All EmployeeTypes
	public List<EmployeeType> findAll(){
		return employeeTypeRepository.findAll();
	}	
	
	//Get EmployeeType By Id
	public Optional<EmployeeType> findById(int id) {
		return employeeTypeRepository.findById(id);
	}	
	
	//Delete EmployeeType
	public void delete(int id) {
		employeeTypeRepository.deleteById(id);
	}
	
	//Update EmployeeType
	public void save( EmployeeType employeeType) {
		employeeTypeRepository.save(employeeType);
	}

}
