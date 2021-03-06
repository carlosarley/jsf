package com.corfillanos.modelo;
// Generated 26-jul-2018 21:08:15 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private ClientesId id;
     private Categoria categoria;
     private String tipoId;
     private int identificacion;
     private String nombres;
     private String apellidos;
     private String correo;
     private Date fechaNacimiento;
     private String lugarNacimiento;
     private String direccion;
     private int telefono;
     private String empleado;
     private String tipoCont;
     private String empresa;
     private String cargo;
     private Integer tiempo;
     private int ingreso;
     private int egreso;
     private String tipoCredit;
     private int montoSolic;
     private int plasoMes;
     private String terminos;

    public Clientes() {
    }

	
    public Clientes(ClientesId id, Categoria categoria, String tipoId, int identificacion, String nombres, String apellidos, Date fechaNacimiento, String lugarNacimiento, String direccion, int telefono, int ingreso, int egreso, String tipoCredit, int montoSolic, int plasoMes) {
        this.id = id;
        this.categoria = categoria;
        this.tipoId = tipoId;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.tipoCredit = tipoCredit;
        this.montoSolic = montoSolic;
        this.plasoMes = plasoMes;
    }
    public Clientes(ClientesId id, Categoria categoria, String tipoId, int identificacion, String nombres, String apellidos, String correo, Date fechaNacimiento, String lugarNacimiento, String direccion, int telefono, String empleado, String tipoCont, String empresa, String cargo, Integer tiempo, int ingreso, int egreso, String tipoCredit, int montoSolic, int plasoMes, String terminos) {
       this.id = id;
       this.categoria = categoria;
       this.tipoId = tipoId;
       this.identificacion = identificacion;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.correo = correo;
       this.fechaNacimiento = fechaNacimiento;
       this.lugarNacimiento = lugarNacimiento;
       this.direccion = direccion;
       this.telefono = telefono;
       this.empleado = empleado;
       this.tipoCont = tipoCont;
       this.empresa = empresa;
       this.cargo = cargo;
       this.tiempo = tiempo;
       this.ingreso = ingreso;
       this.egreso = egreso;
       this.tipoCredit = tipoCredit;
       this.montoSolic = montoSolic;
       this.plasoMes = plasoMes;
       this.terminos = terminos;
    }
   
    public ClientesId getId() {
        return this.id;
    }
    
    public void setId(ClientesId id) {
        this.id = id;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getTipoId() {
        return this.tipoId;
    }
    
    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }
    public int getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getLugarNacimiento() {
        return this.lugarNacimiento;
    }
    
    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
    public String getTipoCont() {
        return this.tipoCont;
    }
    
    public void setTipoCont(String tipoCont) {
        this.tipoCont = tipoCont;
    }
    public String getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Integer getTiempo() {
        return this.tiempo;
    }
    
    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }
    public int getIngreso() {
        return this.ingreso;
    }
    
    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }
    public int getEgreso() {
        return this.egreso;
    }
    
    public void setEgreso(int egreso) {
        this.egreso = egreso;
    }
    public String getTipoCredit() {
        return this.tipoCredit;
    }
    
    public void setTipoCredit(String tipoCredit) {
        this.tipoCredit = tipoCredit;
    }
    public int getMontoSolic() {
        return this.montoSolic;
    }
    
    public void setMontoSolic(int montoSolic) {
        this.montoSolic = montoSolic;
    }
    public int getPlasoMes() {
        return this.plasoMes;
    }
    
    public void setPlasoMes(int plasoMes) {
        this.plasoMes = plasoMes;
    }
    public String getTerminos() {
        return this.terminos;
    }
    
    public void setTerminos(String terminos) {
        this.terminos = terminos;
    }




}


