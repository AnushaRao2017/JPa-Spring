/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author karthik
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"bean.xml"});

        StudentDao dao = (StudentDao) context.getBean("studentDao");

        Student student = new Student();
        student.setFirstname("Test FName");
        student.setLastname("Test LName");
        student.setAge("45");

        Student student1 = new Student();
        student1.setFirstname("Likitha");
        student1.setLastname("Meederira");
        student1.setAge("50");

        try {

            dao.persist(student);
            dao.persist(student1);

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
