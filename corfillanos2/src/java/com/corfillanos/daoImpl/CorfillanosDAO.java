/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corfillanos.daoImpl;

import java.util.List;

import com.dao.corfillanos.DAO;
import com.corfillanos.db.BaseDatos;
import com.corfillanos.modelo.Clientes;

public class CorfillanosDAO implements DAO {

    @Override
	public boolean createCredito(Clientes clienteInsertar) {
		return BaseDatos.getInstancia().getListaCorfillanosBD().add(clienteInsertar);
	}

	@Override
	public boolean updateCredito(Clientes clienteActualizar) {
		List<Clientes> listaTemp = BaseDatos.getInstancia().getListaCorfillanosBD();
		for(int i=0;i<listaTemp.size();i++){
			Clientes corfillanosTemp = listaTemp.get(i);
			System.out.println(clienteActualizar.equals(corfillanosTemp));
			//if(corfillanosTemp.getId()==corfillanosAActualizar.getId()){
				if(corfillanosTemp.equals(clienteActualizar)) {
					listaTemp.set(i, clienteActualizar);
					return true;
				}
			}
		return false;
	}

	@Override
	public boolean deleteCredito(Clientes clienteEliminar) {
		List<Clientes> listaTemp = BaseDatos.getInstancia().getListaCorfillanosBD();
		for(int i=0;i<listaTemp.size();i++){
			Clientes corfillanosTemp = listaTemp.get(i);
			System.out.println(clienteEliminar.equals(corfillanosTemp));
			//if(corfillanosTemp.getId()==corfillanosAEliminar.getId()){
				if(corfillanosTemp.equals(clienteEliminar)) {
					listaTemp.remove(i);
					return true;
				}
			}
		return false;
	}

	@Override
	public List<Clientes> readClientes() {
		return BaseDatos.getInstancia().getListaCorfillanosBD();
	}
	
}
