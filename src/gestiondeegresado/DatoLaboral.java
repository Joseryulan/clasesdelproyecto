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
public class DatoLaboral {
             private int codigo_laboral;
             private String Empresa_Laboral;
             private String Area_Trabajo;
             private String Tipo_cargo;
             private Date Fecha_inicio;
             private Date Fecha_inicializacion;
             private String Ciudad;
             private String Experiencia_laboral;
                     
 public void setcodigo_laboral (int  codigo_laboralP){ 
        this.codigo_laboral = codigo_laboralP; 
    } 
 public void setEmpresa_Laboral (String  Empresa_LaboralP){
        this.Empresa_Laboral = Empresa_LaboralP; }
 
 public void setArea_Trabajo (String  Area_TrabajoP){
        this.Area_Trabajo = Area_TrabajoP; }
 
 public void setTipo_cargo (String  Tipo_cargoP){
        this.Tipo_cargo = Tipo_cargoP; }
 
public void setFecha_inicio (Date  Fecha_inicioP){
        this.Fecha_inicio = Fecha_inicioP; }

public void setFecha_inicializacion (Date  Fecha_inicializacionP){
        this.Fecha_inicializacion = Fecha_inicializacionP; }

public void setCiudad (String  CiudadP){
        this.Ciudad = CiudadP; }

public void setExperiencia_laboral (String  Experiencia_laboralP){
        this.Ciudad = Experiencia_laboralP; }

}
