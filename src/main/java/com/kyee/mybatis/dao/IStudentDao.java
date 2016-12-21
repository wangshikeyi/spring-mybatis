package com.kyee.mybatis.dao;

import com.kyee.mybatis.domain.Student;

public interface IStudentDao {

    Student selectStudent(int studentId);
}
