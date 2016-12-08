/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hibernatespring.impl;

import com.leapfrog.hibernatespring.DAO.ClientDAO;
import com.leapfrog.hibernatespring.entity.Client;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "clientDAO")
public class ClientDAOImpl implements ClientDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    private Session session;
    private Transaction trans;
    
    @Override
    public List<Client> getAll() {
        session=sessionFactory.openSession();
        List<Client> clientList=session.createQuery("SELECT c FROM Client c").list();
        session.close();
        return clientList;

    }

    @Override
    public int insert(Client c) {
        session=sessionFactory.openSession();
        trans=session.beginTransaction();
        int result=(int)session.save(c);
        
        trans.commit();
        session.close();
        return result;
        
        
    }

    @Override
    public void delete(int id) {
            session=sessionFactory.openSession();
            trans=session.beginTransaction();
            Client c=(Client)session.get(Client.class, id);
            session.delete(c);
            trans.commit();
            session.close();
            

    }
    
}
