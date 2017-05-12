/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao.jpa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karthik
 */

@Component
public class StudentDao {
    
    // Injected database connection
    //:
    @PersistenceContext(unitName = "student-unit")
    private EntityManager em;

    
    @Transactional
    public void persist(Student student) {
        em.persist(student);
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

   
    public List<Student> getAllStudents() {
        TypedQuery<Student> query = em.createQuery(
                "SELECT s FROM Student s ORDER BY s.id", Student.class);
        return query.getResultList();
    }
}
