package com.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * System:                 CleanBnB
 * Name:                   SocialMediaEntity
 * Description:            Class that represents a SocialMediaEntity's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/21/21
 */
@Entity
@Table(name = "social_media", schema = "public", catalog = "cursojakarta")
public class SocialMediaEntity extends BaseEntity
{

    @Column(name = "name")
    private String _name;

    @Column(name = "icon")
    private String _icon;

    @OneToMany
    @JoinColumn(name = "id_social_media")
    private Set<SocialMediaEntity> teacherSocialMedias;


    public SocialMediaEntity()
    {
    }

    public SocialMediaEntity(long id)
    {
        super(id);

    }

    public String getName()
    {
        return _name;
    }

    public SocialMediaEntity setName(String name)
    {
        _name = name;
        return this;
    }

    public String getIcon()
    {
        return _icon;
    }

    public SocialMediaEntity setIcon(String icon)
    {
        _icon = icon;
        return this;
    }

}
