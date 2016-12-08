/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hibernatespring.controller;

import com.leapfrog.hibernatespring.DAO.ClientDAO;
import com.leapfrog.hibernatespring.entity.Client;
import com.leapfrog.hibernatespring.impl.ClientDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/dashboard")
public class DashboardController {
    @Autowired
    ClientDAO clientDAO=new ClientDAOImpl();
    
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model)
    {
        model.addAttribute("clients", clientDAO.getAll());
        
        return "dashboard/index";
    }
    
    @RequestMapping(method=RequestMethod.GET,value = "/add")
    public String add(Model model)
    {
   
       return "dashboard/add";
    }
    @RequestMapping(method = RequestMethod.POST,value = "/save")
   public String save(Model model)
    {
        
        Client client =new Client();
        int result=clientDAO.insert(client);
        model.addAttribute("result",result);
       
        return "redirect:/dashboard/index";
    
    }
    
    
}
