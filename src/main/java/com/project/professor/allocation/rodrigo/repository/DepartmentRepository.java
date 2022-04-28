package com.project.professor.allocation.rodrigo.repository;

import com.project.professor.allocation.rodrigo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findByNameContaining(String partName);
}
