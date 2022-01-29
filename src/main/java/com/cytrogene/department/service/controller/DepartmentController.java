package com.cytrogene.department.service.controller;

import com.cytrogene.department.service.entity.Department;
import com.cytrogene.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    public DepartmentService departmentService;

    @PostConstruct
    public void postContruct(){
      log.info("Started Controller");
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){ //It doesn't work without request body
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{departmentId}")
    public Department getDepartment(@PathVariable Long departmentId){
        return departmentService.getDepartment(departmentId);
    }
}
