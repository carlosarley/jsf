/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corfillanos.mb;

import com.corfillanos.logic.CorfillanosLogic;
import com.corfillanos.modelo.Clientes;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class CorfillanosMB {
	
	private CorfillanosLogic logic;
	private Clientes clienteInsertar;
	private Clientes clienteActualizar;
	private Clientes clienteEliminar;
	private List<Clientes> listaCorfillanos;
	

	
	

	public String instaciarCorfillanosAInsertar() {
		clienteInsertar = new Clientes();
		return "Credito";
	}
	
	public CorfillanosMB() {
		clienteInsertar = new Clientes();
		logic = new CorfillanosLogic();
		readClientes();
	}
	
	public String createClientes() {
		logic.createClientes(clienteInsertar);
		readClientes();
		return "Credito1";
	}
	
	public String updateClientes() {
		logic.updateClientes(clienteActualizar);
		readClientes();
		return"Credito2";
	}
	
	public String deleteClientes() {
		logic.deleteClientes(clienteEliminar);
		readClientes();
		return null;
	}
	
	public String readClientes(){
		listaCorfillanos = logic.readClientes();
	
		return null;
	}
	

	public Clientes getClienteInsertar() {
		return clienteInsertar;
	}
	public void setClienteInsertar(Clientes corfillanosAInsertar) {
		this.clienteInsertar = clienteInsertar;
	}
	public Clientes getClienteActualizar() {
		return clienteActualizar;
	}
	public void setClienteActualizar(Clientes clienteActualizar) {
		this.clienteActualizar = clienteActualizar;
	}

	public Clientes getClienteEliminar() {
		return clienteEliminar;
	}

	public void setClienteEliminar(Clientes corfillanosAEliminar) {
		this.clienteEliminar = clienteEliminar;
	}

	public List<Clientes> getListaClientes() {
		return listaCorfillanos;
	}
	public void setListaCorfillanos(List<Clientes> listaCorfillanos) {
		this.listaCorfillanos = listaCorfillanos;
	}
}
