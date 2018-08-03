/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corfillanos.db;

import java.util.ArrayList;


import com.corfillanos.modelo.Clientes;


public class BaseDatos {
	private static BaseDatos instancia = getInstancia();
	private ArrayList<Clientes> listaCorfillanosBD= new ArrayList<Clientes>();
	

	
	public ArrayList<Clientes> getListaCorfillanosBD(){
		return listaCorfillanosBD;
	}
	
	public static BaseDatos getInstancia() {
		if(instancia==null) {
			instancia = new BaseDatos();
		}
		return instancia;
	}

}

