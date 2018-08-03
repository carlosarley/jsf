/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.corfillanos;
import java.util.List;
import com.corfillanos.modelo.Clientes;
 
/**
 *
 * @author SENA
 */
public interface DAO {
    
    public boolean createCredito(Clientes clienteInsertar);
    public boolean updateCredito(Clientes clienteActualizar);
    public boolean deleteCredito(Clientes clienteEliminar);
    
    public List<Clientes> readClientes();
    
}
