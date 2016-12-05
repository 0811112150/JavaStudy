package com.liming.www.serviceImpl;

import com.liming.www.dal.StudentDao;
import com.liming.www.model.Student;
import com.liming.www.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by aa on 2016/12/2.
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Resource
    private StudentDao studentDao;

    public Student findById(Integer id) {
        return studentDao.findById(id);
    }

//    public boolean insertStudent(String name) {
//        Student student = new Student();
//        student.setName(name);
//        studentMapper.insert(student);
//        return true;
//    }
}
