package com.course.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * System:                 CleanBnB
 * Name:                   BaseEntity
 * Description:            Class that represents a BaseEntity's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/21/21
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable
{
    //region Attribute

    /**
     * Name:                   Name
     * Description:            BaseEntity's Id attribute that every Entity will inherit
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long _id;

    //endregion

    //region Method

    /**
     * Name:                   BaseEntity's Constructor
     * Description:            Method that initialize BaseEntity's class
     */
    public BaseEntity(long id)
    {
        _id = id;
    }

    public BaseEntity()
    {
    }

    /**
     * Name:                   getId
     * Description:            Method that returns BaseEntity's Id
     */
    public long getId()
    {
        return _id;
    }

//endregion
}
