package com.springboot.mapper;

import com.springboot.vo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description:
 *
 * @Author: wxn
 * @Date: 2019/7/11
 * @Version 1.0
 */
@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findAll();
}
