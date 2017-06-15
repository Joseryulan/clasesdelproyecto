/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeegresado;

import java.util.Date;

/**
 *
 * @author sena
 */
public class DatoPersonal {
             private int codigo_persona;
             private String Documento_ID;
             private String Nombres;
             private String Apellidos;
             private String Lugar_de_nacimiento;
             private String genero;
             private Date Fecha_de_nacimiento;
 public void setcodigo_persona (int  codigo_personaP){ 
        this.codigo_persona = codigo_personaP; 
    } 
 public void setDocumento_ID (String  Documento_IDP){
        this.Documento_ID = Documento_IDP; }
 
 public void setNombres (String  NombresP){
        this.Nombres = NombresP; }
 
 public void setApellidos (String  ApellidosP){
        this.Apellidos = ApellidosP; }
 
public void setLugar_de_nacimiento (String  Lugar_de_nacimientoP){
        this.Lugar_de_nacimiento = Lugar_de_nacimientoP; }

public void setFecha_de_nacimiento (Date  Fecha_de_nacimientoP){
        this.Fecha_de_nacimiento = Fecha_de_nacimientoP; }

public void setgenero (String  generoP){
        this.genero = generoP; }

    public void Ingresar(){}
    public void Modificar(){}

}
