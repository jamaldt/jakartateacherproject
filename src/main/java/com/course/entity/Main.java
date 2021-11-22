package com.course.entity;

import com.course.dao.TeacherDaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import java.util.List;

/**
 * System:                 CleanBnB
 * Name:                   Main
 * Description:            Class that represents a Main's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/21/21
 */
public class Main
{
    public static void main(String[] args)
    {

        try
        {
            TeacherEntity teacher = new TeacherEntity("andres","andres avatar");
            TeacherDaoImpl teacherDao = new TeacherDaoImpl();
            teacherDao.saveTeacher(teacher);

            List<TeacherEntity> teacherEntityList = teacherDao.findAllTeachers();

            for (TeacherEntity t : teacherEntityList)
            {
                System.out.println("nombre :"+ t.getName());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
