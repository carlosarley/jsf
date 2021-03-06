package com.corfillanos.modelo;
// Generated 26-jul-2018 21:08:15 by Hibernate Tools 4.3.1



/**
 * ClientesId generated by hbm2java
 */
public class ClientesId  implements java.io.Serializable {


     private int id;
     private int categoriaId;

    public ClientesId() {
    }

    public ClientesId(int id, int categoriaId) {
       this.id = id;
       this.categoriaId = categoriaId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getCategoriaId() {
        return this.categoriaId;
    }
    
    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ClientesId) ) return false;
		 ClientesId castOther = ( ClientesId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getCategoriaId()==castOther.getCategoriaId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getCategoriaId();
         return result;
   }   


}


