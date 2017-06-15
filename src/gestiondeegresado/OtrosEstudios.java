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
public class OtrosEstudios {
         private int codigo_Estudio;
             private String Nombre_Estudio;
             private String Institucion;
             private String Año;
             private String titulo;
             private String Area_estudio;
             private String Motivo_retiro;
             private String Actual_Estudio;
             
 public void setcodigo_Estudio (int  codigo_EstudioP){ 
        this.codigo_Estudio = codigo_EstudioP; 
    } 
 public void setNombre_Estudio (String  Nombre_EstudioP){
        this.Nombre_Estudio = Nombre_EstudioP; }
 
 public void setInstitucion (String  InstitucionP){
        this.Institucion = InstitucionP; }
 
 public void setAño (String  AñoP){
        this.Año = AñoP; }
 
public void settitulo (String  tituloP){
        this.titulo = tituloP; }

public void setArea_estudio (String  Area_estudioP){
        this.Area_estudio = Area_estudioP; }
 
 public void setMotivo_retiro (String  Motivo_retiroP){
        this.Motivo_retiro = Motivo_retiroP; }
 
public void setActual_Estudio (String  Actual_EstudioP){
        this.Actual_Estudio = Actual_EstudioP; }

}
