package com.kyee.mybatis.service;


import com.kyee.mybatis.dao.IStudentDao;
import com.kyee.mybatis.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentDao studentDao;

    @Override
    public Student getStudent(int studentId) {
        return studentDao.selectStudent(studentId);
    }
}
