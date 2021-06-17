package com.neji.employeemanager.repo;

import com.neji.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository <Employee,Long> {

    @Transactional
    void deleteEmployeeById(Long id);

    Optional <Employee> findEmployeeById(Long id);
}
