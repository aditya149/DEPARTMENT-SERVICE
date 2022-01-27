package com.cytrogene.department.service.service;

import com.cytrogene.department.service.entity.Department;
import com.cytrogene.department.service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department user) {
        return departmentRepository.save(user);
    }
}
