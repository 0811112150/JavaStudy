package com.liming.www.service;

import com.liming.www.model.Student;

/**
 * Created by aa on 2016/12/2.
 */
public interface IStudentService {
//    public boolean insertStudent(String name);

    Student findById(Integer id);
}
