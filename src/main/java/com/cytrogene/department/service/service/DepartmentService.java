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

    public Department getDepartment(Long departmentId) {
        //return departmentRepository.getById(departmentId).get();
        // This is lazy loading gives error returning response back via service.
        //No serializer found for class org.hibernate.proxy.pojo.bytebuddy.ByteBuddyInterceptor
        //Thus go with below
        return departmentRepository.findById(departmentId).get();
    }
}
