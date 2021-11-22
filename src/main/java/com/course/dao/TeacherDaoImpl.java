package com.course.dao;

import com.course.entity.TeacherEntity;

import java.util.List;

/**
 * System:                 CleanBnB
 * Name:                   TeacherDaoImpl
 * Description:            Class that represents a TeacherDaoImpl's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/21/21
 */
public class TeacherDaoImpl extends SessionCourse implements TeacherDao
{
    private SessionCourse _sessionCourse;
    public TeacherDaoImpl()
    {
        _sessionCourse = new SessionCourse();
    }

    @Override
    public void saveTeacher(TeacherEntity teacher)
    {
        _sessionCourse.getSession().persist(teacher);
        _sessionCourse.getSession().getTransaction().commit();
        _sessionCourse.closeSession();

    }

    @Override
    public List<TeacherEntity> findAllTeachers()
    {
        return _sessionCourse.getSession()
            .createQuery("SELECT a FROM TeacherEntity a",TeacherEntity.class).getResultList();
    }

    @Override
    public void deleteTeacher(long id)
    {

    }

    @Override
    public void updateTeacher(TeacherEntity teacher)
    {

    }

    @Override
    public TeacherEntity findById(long id)
    {
        return null;
    }

    @Override
    public TeacherEntity findByName(String name)
    {
        return null;
    }
}
