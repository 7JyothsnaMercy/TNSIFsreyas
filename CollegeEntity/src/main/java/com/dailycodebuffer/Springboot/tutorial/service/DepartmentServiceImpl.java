package com.dailycodebuffer.Springboot.tutorial.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
//import com.dailycodebuffer.Springboot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboot.tutorial.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

   @Override
   public Department fetchDepartmentById(Long departmentId) {
	   return departmentRepository.findById(departmentId).get();
   }
	
   @Override
   public void deleteDepartmentById(Long departmentId) {
       departmentRepository.deleteById(departmentId);
   }


   @Override
   public Department updateDepartment(Long departmentId, Department department) {
       Department depDB = departmentRepository.findById(departmentId).get();

       if(Objects.nonNull(department.getCollegeAdmin()) &&
       !"".equalsIgnoreCase(department.getCollegeAdmin())) {
           depDB.setCollegeAdmin(null);
       }

       if(Objects.nonNull(department.getCollegename()) &&
               !"".equalsIgnoreCase(department.getCollegename())) {
           depDB.setCollegename(null);
       }

       if(Objects.nonNull(department.getLocation()) &&
               !"".equalsIgnoreCase(department.getLocation())) {
           depDB.setLocation(null);
       }

       return departmentRepository.save(depDB);
   }

    
    

}
