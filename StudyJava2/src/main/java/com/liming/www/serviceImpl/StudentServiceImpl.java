package com.liming.www.serviceImpl;

import com.liming.www.dal.StudentMapper;
import com.liming.www.model.Student;
import com.liming.www.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by aa on 2016/12/2.
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService {
    @Resource
    private StudentMapper studentMapper;

    public boolean insertStudent(String name) {
        Student student = new Student();
        student.setName(name);
        studentMapper.insert(student);
        return true;
    }
}
