/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablas;

/**
 *
 * @author a2488
 */
public class Aparcamiento {
    private String planta;


    public Aparcamiento() {
        
    }


    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }


        @Override
    public String toString() {
        return getPlanta();
    }
}
