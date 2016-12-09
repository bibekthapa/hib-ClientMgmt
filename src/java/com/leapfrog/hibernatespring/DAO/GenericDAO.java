/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hibernatespring.DAO;

import java.util.List;

/**
 *
 * @author HOME
 */
public interface GenericDAO<T> {
    List<T> getAll();
    int insert(T c);
    void delete(int id);
    void update(int id);
    T getById(int id);
    
}
