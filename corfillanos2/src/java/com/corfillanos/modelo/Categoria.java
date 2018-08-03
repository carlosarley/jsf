package com.corfillanos.modelo;
// Generated 26-jul-2018 21:08:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private int id;
     private String categoria;
     private Set clienteses = new HashSet(0);

    public Categoria() {
    }

	
    public Categoria(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }
    public Categoria(int id, String categoria, Set clienteses) {
       this.id = id;
       this.categoria = categoria;
       this.clienteses = clienteses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Set getClienteses() {
        return this.clienteses;
    }
    
    public void setClienteses(Set clienteses) {
        this.clienteses = clienteses;
    }




}

