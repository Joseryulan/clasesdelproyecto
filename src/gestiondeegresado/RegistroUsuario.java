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
public class RegistroUsuario {
             private int Numero_registro;
             private String Nombre_registro;
             private String Correo_electronico;
             private String Clave;
             
 public void setNumero_registro (int  Numero_registroP)
    { 
        this.Numero_registro = Numero_registroP; 
    } 
 public void setNombre_registro (String  Nombre_registroP){
    
        this.Nombre_registro = Nombre_registroP; }
 
 public void setCorreo_electronico (String  Correo_electronicoP){
    
        this.Correo_electronico = Correo_electronicoP; }
 public void setClave (String  ClaveP){
    
        this.Clave = ClaveP; }

    public void Registrarse(){}
    public void Crear_usuario(){}
}
