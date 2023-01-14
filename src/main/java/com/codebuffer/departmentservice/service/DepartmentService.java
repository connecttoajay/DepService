package com.codebuffer.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebuffer.departmentservice.Entity.Department;
import com.codebuffer.departmentservice.repository.DepartmentRespository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRespository departmentRespository;

    public Department saveDepartment(Department department) {
        log.info("insdie saveDepartment method of department service");
        return departmentRespository.save(department);
    }

    public Department findByDepartmentId(Long id) {
        return departmentRespository.findByDepartmentId(id);
    }
}
