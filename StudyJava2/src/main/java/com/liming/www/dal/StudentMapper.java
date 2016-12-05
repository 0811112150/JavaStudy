package com.liming.www.dal;

import com.liming.www.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}