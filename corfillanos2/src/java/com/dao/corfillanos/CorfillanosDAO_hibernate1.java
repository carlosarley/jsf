/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.corfillanos;

import com.corfillanos.util.ConexionHibernate;
import com.corfillanos.modelo.Clientes;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author SOPORTE
 */
public class CorfillanosDAO_hibernate1 implements DAO {

 @Override
    public boolean createCredito(Clientes clienteInsertar) {
    Session session = ConexionHibernate.getSf().getCurrentSession();
    session.beginTransaction();
    session.save(clienteInsertar);
    session.getTransaction().commit();
    session.close();
    return false;
}

    @Override
    public boolean updateCredito(Clientes clienteActualizar) {
    Session session = ConexionHibernate.getSf().getCurrentSession();
    session.beginTransaction();
    session.save(clienteActualizar);
    session.getTransaction().commit();
    session.close();
    return false;
}

    @Override
    public boolean deleteCredito(Clientes clienteEliminar) {
    Session session = ConexionHibernate.getSf().getCurrentSession();
    session.beginTransaction();
    session.save(clienteEliminar);
    session.getTransaction().commit();
    session.close();
    return false;
    }

    @Override
    public List<Clientes> readClientes() {
                Session session = ConexionHibernate.getSf().getCurrentSession();
		session.beginTransaction();
		
		Query query = session.createQuery("select c from Corfillanos as c ");
		
		ArrayList<Clientes> listaCorfillanos = (ArrayList<Clientes>)query.list();
		
		session.getTransaction().commit();
		
		return listaCorfillanos;}

}

    