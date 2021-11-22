package com.course.entity;

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
import java.util.Set;

/**
 * System:                 CleanBnB
 * Name:                   TeacherSocialMedia
 * Description:            Class that represents a TeacherSocialMedia's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/21/21
 */
@Entity
@Table(name = "teacher_social_media", schema = "public", catalog = "cursojakarta")
public class TeacherSocialMedia extends BaseEntity
{
    @Column(name = "nickname")
    private  String nickname;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_teacher")
    private TeacherEntity _teacher;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_social_media")
    private SocialMediaEntity _socialMedia;

    public TeacherSocialMedia()
    {
    }

    public TeacherEntity getTeacher()
    {
        return _teacher;
    }

    public TeacherSocialMedia setTeacher(TeacherEntity teacher)
    {
        _teacher = teacher;
        return this;
    }

    public SocialMediaEntity getSocialMedia()
    {
        return _socialMedia;
    }

    public String getNickname()
    {
        return nickname;
    }

    public TeacherSocialMedia setNickname(String nickname)
    {
        this.nickname = nickname;
        return this;
    }

    public TeacherSocialMedia setSocialMedia(SocialMediaEntity socialMedia)
    {
        _socialMedia = socialMedia;
        return this;
    }


}
