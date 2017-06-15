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
public class DatoAcademico {
      private int Codigo_cargo;
             private String Cotinuidad;
             private String Finalizacion_continuidad;
                     
 public void setCodigo_cargo (int  Codigo_cargoP){ 
        this.Codigo_cargo = Codigo_cargoP; 
    } 
 public void setFinalizacion_continuidad (String  Finalizacion_continuidadP){
        this.Finalizacion_continuidad = Finalizacion_continuidadP; }
 
 public void setCotinuidad (String  CotinuidadP){
        this.Cotinuidad = CotinuidadP; }
}
