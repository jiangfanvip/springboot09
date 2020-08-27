package com.jiangfan.springboot09.mapper;

import com.jiangfan.springboot09.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Auther: 江帆
 * @Date: 2020/7/5
 * @Description: com.jiangfan.springboot09.mapper
 * @version: 1.0
 */
//@Mapper
public interface DepartmentMapper {
    @Select("select * from  department  where id=#{id}")
    public Department findDepartmentById(@Param("id") Integer id);

    @Delete("delete from   department  t where t.id=#{id}")
    public Integer deleteDepartmentById(@Param("id") Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id") //插入后把主键返回回来设置到department.id里
    @Insert("insert into department(department_name) values(#{departmentName})")
    public Integer inserDepartment(Department department);


}
