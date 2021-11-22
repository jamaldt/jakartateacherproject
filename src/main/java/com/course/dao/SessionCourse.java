package com.course.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

/**
 * System:                 CleanBnB
 * Name:                   SessionCourse
 * Description:            Class that represents a SessionCourse's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/21/21
 */
public class SessionCourse
{
    private static EntityManagerFactory _emf;
    private EntityManager _em;
    private EntityTransaction _tx;
    private boolean _isTransaction;

    public SessionCourse()
    {
        if ( _emf == null )
        {
            try
            {
                _emf = Persistence.createEntityManagerFactory("default");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    /**
     * @return
     */
    public EntityManager getSession()
    {
        try
        {
            if ( _em == null )
            {
                _em = _emf.createEntityManager();
                beginTransaction();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return _em;
    }

    public EntityManager getQuerySession()
    {
        if ( _em == null )
        {
            _em = _emf.createEntityManager();
        }

        return _em;
    }

    /**
     * @return
     */
    public Object beginTransaction()
    {
        if ( _em == null )
        {
            getSession();
        }
        if ( _tx == null )
        {
            _tx = _em.getTransaction();
        }
        if ( !_tx.isActive() )
        {
            _tx.begin();
        }

        return _tx;
    }

    /**
     *
     */
    //TODO quizas aqui no se necesite hacer el throw de la excepcion
    public void closeSession()
    {
        try
        {
            if ( _em != null )
            {
                if ( _isTransaction || ( _tx != null && _tx.isActive() ))
                {
                    finishTransaction();
                }

                _em.close();
                _em = null;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     *
     */
    public void finishTransaction()
    {
        if ( _tx != null && _tx.isActive() )
        {
            try
            {
                _tx.commit();
                _tx = null;
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     */
    public void revertTransaction()
    {
        if ( _tx != null && _tx.isActive() )
        {
            _tx.rollback();
            _tx = null;
        }
    }

    /**
     * @return
     */
    public boolean isTransaction()
    {
        return _isTransaction;
    }

    /**
     * @param transaction
     */
    public void setTransaction( boolean transaction )
    {
        _isTransaction = transaction;
    }

}
