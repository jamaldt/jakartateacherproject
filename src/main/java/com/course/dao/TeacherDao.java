package com.course.dao;

import com.course.entity.TeacherEntity;

import java.util.List;

/**
 * System:                 CleanBnB
 * Name:                   TeacherDao
 * Description:            Class that represents a TeacherDao's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/21/21
 */
public interface TeacherDao
{
    void saveTeacher(TeacherEntity teacher);

    List<TeacherEntity> findAllTeachers();

    void deleteTeacher(long id);

    void updateTeacher(TeacherEntity teacher);

    TeacherEntity findById(long id);

    TeacherEntity findByName(String name);
}
