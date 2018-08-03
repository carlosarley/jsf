/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corfillanos.logic;

import java.util.List;
import java.util.ResourceBundle;

import com.dao.corfillanos.CorfillanosDAO_hibernate1;
import com.dao.corfillanos.DAO;
import com.corfillanos.daoImpl.CorfillanosDAO;
import com.corfillanos.modelo.Categoria;
import com.corfillanos.modelo.Clientes;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CorfillanosLogic {
		private DAO dao;
		
			public CorfillanosLogic() {
				ResourceBundle rs= ResourceBundle.getBundle("configuracion");
				String tipoBaseDatos = rs.getString("tipoBD");
				if(tipoBaseDatos.equals("1")) {
					dao = new CorfillanosDAO();
				}else if(tipoBaseDatos.equals("2")) {
					//
				}else if(tipoBaseDatos.equals("3")) {
					dao = new CorfillanosDAO_hibernate1();
				}
			}
			
			public boolean createClientes(Clientes clienteInsertar) {
				return dao.createCredito(clienteInsertar);
			}
			
			public boolean updateClientes(Clientes clienteActualizar) {
				return dao.updateCredito(clienteActualizar);
			}
			
			public boolean deleteClientes(Clientes clienteEliminar) {
				return dao.deleteCredito(clienteEliminar);
			}

			public List<Clientes> readClientes() {
				return dao.readClientes();
			}
			
			
			public double categorizar(Clientes corfillanos) {
				double ce = 0;		
                    String categoria = null;
				if(categoria == "A") {
                                    double gf = 0;
                                    double ti = 0;
					
					
					ce = (ti-gf)*0.55;
					
					return ce;
				}
				else if(categoria == "B") {
                                    double gf = 0;
                                    double ti = 0;
					
					ce = (ti-gf)*0.55;
					
					return ce;
				}
				else if(categoria == "C") {
                                    double gf = 0;
                                    double ti = 0;
					
					ce = (ti-gf)*0.55;
					
					return ce;
				}
				else if(categoria == "D") {
					
					System.out.println("Solicitud Rechzada");
					
					return ce;
				}
					
				
				
				return 0;
			}
			
}

