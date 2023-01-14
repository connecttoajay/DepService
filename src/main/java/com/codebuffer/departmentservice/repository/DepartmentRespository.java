package com.codebuffer.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codebuffer.departmentservice.Entity.Department;

@Repository
public interface DepartmentRespository extends JpaRepository<Department, Long> {

    Department findByDepartmentId(Long id);

}
