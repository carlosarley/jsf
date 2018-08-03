/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corfillanos.mb;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;

import com.corfillanos.modelo.Categoria;


@ManagedBean
public class CategoriaMB {
		private ArrayList<Categoria> listacategoria;

		
		
		public CategoriaMB() {
			listacategoria= new ArrayList<Categoria>();
			 Categoria c1=new Categoria();
			 c1.setId(1);
			 c1.setCategoria("A");
			 listacategoria.add(c1);
			 
			 Categoria c2=new Categoria();
			 c2.setId(1);
			 c2.setCategoria("B");
			 listacategoria.add(c2);
			 
			 Categoria c3=new Categoria();
			 c3.setId(1);
			 c3.setCategoria("C");
			 listacategoria.add(c3);
			 
			 Categoria c4=new Categoria();
			 c4.setId(1);
			 c4.setCategoria("D");
			 listacategoria.add(c4);
		
		}
		
		
		
		
		
		
		
		public ArrayList<Categoria> getListacategoria() {
			return listacategoria;
		}

		public void setListacategoria(ArrayList<Categoria> listacategoria) {
			this.listacategoria = listacategoria;
		}
		
		
		
}

