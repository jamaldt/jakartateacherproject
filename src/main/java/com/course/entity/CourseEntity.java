package com.course.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * System:                 CleanBnB
 * Name:                   CourseEntity
 * Description:            Class that represents a CourseEntity's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/21/21
 */
@Entity
@Table(name = "course", schema = "public", catalog = "cursojakarta")
public class CourseEntity extends BaseEntity
{
    @Column(name = "name")
    private String _name;
    @Column(name = "themes")
    private String _themes;
    @Column(name = "project")
    private String _project;
    @ManyToOne(optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name="id_teacher")
    private TeacherEntity teacher;

    public CourseEntity()
    {
    }

    public CourseEntity(long id)
    {
        super(id);
    }

    public String getName()
    {
        return _name;
    }

    public CourseEntity setName(String name)
    {
        _name = name;
        return this;
    }

    public String getThemes()
    {
        return _themes;
    }

    public CourseEntity setThemes(String themes)
    {
        _themes = themes;
        return this;
    }

    public String getProject()
    {
        return _project;
    }

    public CourseEntity setProject(String project)
    {
        _project = project;
        return this;
    }

    public TeacherEntity getTeacher()
    {
        return teacher;
    }

    public CourseEntity setTeacher(TeacherEntity teacher)
    {
        this.teacher = teacher;
        return this;
    }

}
