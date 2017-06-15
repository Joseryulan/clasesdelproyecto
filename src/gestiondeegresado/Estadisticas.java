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
public class Estadisticas {
    private int codigo_Estadistica;
             private String Detalle_estadistica;
             private String Porcentaje;
              private String Grafico;
             
 public void setcodigo_Estadistica (int  codigo_EstadisticaP){ 
        this.codigo_Estadistica = codigo_EstadisticaP; 
    } 
 public void setDetalle_estadistica (String  Detalle_estadisticaP){
        this.Detalle_estadistica = Detalle_estadisticaP; }
 
 public void setPorcentaje (String  PorcentajeP){
        this.Porcentaje = PorcentajeP; }
 
 public void setGrafico (String  GraficoP){
        this.Grafico = GraficoP; }
}
