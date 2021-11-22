package com.course.entity;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * System:                 CleanBnB
 * Name:                   TeacherEntity
 * Description:            Class that represents a TeacherEntity's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/21/21
 */
@Entity
@Table(name = "teacher", schema = "public", catalog = "cursojakarta")
public class TeacherEntity extends BaseEntity
{
    @Column(name = "name")
    private String _name;
    @Column(name = "avatar")
    private String _avatar;

    @OneToMany(mappedBy="teacher")
    private Set<CourseEntity> courses;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id_teacher")
    private Set<TeacherSocialMedia> teacherSocialMedias;

    public TeacherEntity()
    {
    }

    public TeacherEntity(long id)
    {
        super(id);
    }

    public TeacherEntity(String name, String avatar)
    {
        super();
        _name = name;
        _avatar = avatar;
    }

    public String getName()
    {
        return _name;
    }

    public TeacherEntity setName(String name)
    {
        _name = name;
        return this;
    }

    public String getAvatar()
    {
        return _avatar;
    }

    public TeacherEntity setAvatar(String avatar)
    {
        _avatar = avatar;
        return this;
    }

    public Set<CourseEntity> getCourses()
    {
        return courses;
    }

    public TeacherEntity setCourses(Set<CourseEntity> courses)
    {
        this.courses = courses;
        return this;
    }

}
