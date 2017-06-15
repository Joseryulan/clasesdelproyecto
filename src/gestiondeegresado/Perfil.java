/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeegresado;

/**
 *
 * @author sena
 */
public class Perfil {
             private int codigo_perfil;
             private String Nombre_completo;
             private String Telefono;
             private String Descripcion;
             private String Direccion;
 public void setcodigo_perfil (int  codigo_perfilP){ 
        this.codigo_perfil = codigo_perfilP; 
    } 
 public void setNombre_completo (String  Nombre_completoP){
        this.Nombre_completo = Nombre_completoP; }
 
 public void setTelefono (String  TelefonoP){
        this.Telefono = TelefonoP; }
 
 public void setDescripcion (String  DescripcionP){
        this.Descripcion = DescripcionP; }
 
public void setDireccion (String  DireccionP){
        this.Direccion = DireccionP; }

    public void Ingresar(){}
    public void Modificar(){}
}
