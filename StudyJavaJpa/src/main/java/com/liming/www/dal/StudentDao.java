package com.liming.www.dal;

import com.liming.www.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StudentDao extends JpaRepository<Student, Serializable> {
//    int insert(Student record);
//
//    int insertSelective(Student record);
//
//    Student getStudent(String id);

    Student findById(Integer id);
}