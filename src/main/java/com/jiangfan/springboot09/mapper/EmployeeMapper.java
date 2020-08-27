package com.jiangfan.springboot09.mapper;

import com.jiangfan.springboot09.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: 江帆
 * @Date: 2020/7/5
 * @Description: com.jiangfan.springboot09.mapper
 * @version: 1.0
 */
//@Mapper
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void inertEmp(Employee employee);
}
