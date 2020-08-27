package com.jiangfan.springboot09.controller;

import com.jiangfan.springboot09.bean.Department;
import com.jiangfan.springboot09.bean.Employee;
import com.jiangfan.springboot09.mapper.DepartmentMapper;
import com.jiangfan.springboot09.mapper.EmployeeMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: 江帆
 * @Date: 2020/7/5
 * @Description: com.jiangfan.springboot09.controller
 * @version: 1.0
 */
@RequestMapping(value = "user")
@Api(value = "用户controller", tags = "用户controller")
@RestController
public class UserController {
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/getDept/{id}")
    @ApiOperation(value = "用户查询接口", notes = "用户查询接口")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.findDepartmentById(id);
    }

    @PostMapping("addDept")
    @ApiOperation(value = "用户新增接口", notes = "用户新增接口")
    public Department insertDept(@RequestBody Department department) {
        departmentMapper.inserDepartment(department);
        return department;
    }

    @PostMapping("addEmp")
    @ApiOperation(value = "员工新增接口", notes = "员工新增接口")
    public Employee inserEmp(@RequestBody Employee employee) {
        employeeMapper.inertEmp(employee);
        return employee;
    }

    @ApiOperation(value = "员工查询接口", notes = "员工查询接口")
    @GetMapping("/getEmp/{id}")
    public Employee getEmp(@PathVariable Integer id) {
        return employeeMapper.getEmpById(id);
    }
}
