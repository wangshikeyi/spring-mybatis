package com.kyee.mybatis;

import com.kyee.mybatis.dao.IStudentDao;
import com.kyee.mybatis.service.IStudentService;
import org.junit.BeforeClass;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mybaitsTest {

    private static IStudentService studentService;

    private static IStudentDao studentDao;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        studentDao = (IStudentDao ) context.getBean("studentDao");
        studentService = (IStudentService) context.getBean("studentService");
    }

    @Test
    public void testSelectStudentFromDao(){
        System.out.println(studentDao.selectStudent(1));
    }

    @Test
    public void testgetStudentFromService(){
        System.out.println(studentService.getStudent(2));
    }
}
