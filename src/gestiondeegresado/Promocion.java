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
public class Promocion {
             private int Codigo_promocion;
             private String Año;
             private String Modalidad;
             private String Detalle_Promocion;
 public void setAño (int  Codigo_promocionP){ 
        this.Codigo_promocion = Codigo_promocionP; 
    } 
 public void setAño (String  AñoP){
        this.Año = AñoP; }
 
 public void setModalidad (String  ModalidadP){
        this.Modalidad = ModalidadP; }
 
 public void setDetalle_Promocion (String  Detalle_PromocionP){
        this.Detalle_Promocion = Detalle_PromocionP; }
}
