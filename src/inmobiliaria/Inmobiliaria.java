/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmobiliaria;

import Controller.Servicio;
import View.Formulario;
import java.util.ArrayList;
import modelo.VO.propiedad;

/**
 *
 * @author JESUS DAVID
 */
public class Inmobiliaria {

   private ArrayList<propiedad> propiedades;

    public Inmobiliaria() {
        propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(propiedad propiedad) {
        propiedades.add(propiedad);
    }

    public String listar() {
        for (propiedad propiedadFor : propiedades) {
            return "Propiedad [Direccion: " + propiedadFor.getDireccion() + ", Numero de habitaciones: " + propiedadFor.getNumHabitaciones()
                    + ", Precio del alquiler: " + propiedadFor.getPrecioAlquiler() + ", Disponibilidad: " + propiedadFor.isDisponible();
        }
        return null;
        
    }

    public static void main(String[] args) {

        Formulario vista = new Formulario();

        Inmobiliaria principal = new Inmobiliaria();

        Servicio controlador = new Servicio(vista, principal);
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

}


