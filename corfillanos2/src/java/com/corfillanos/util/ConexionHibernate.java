/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corfillanos.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author SENA
 */
public class ConexionHibernate {
    private static final SessionFactory sf = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory(){
        return new Configuration().configure().buildSessionFactory();
                  
    }
    public static SessionFactory getSf() {
        return sf;
    }
            
    
}
