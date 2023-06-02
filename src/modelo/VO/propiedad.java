/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.VO;

/**
 *
 * @author JESUS DAVID
 */
public class propiedad {

    private String direccion;
    private Integer numHabitaciones;
    private double precioAlquiler;
    private boolean disponible;

    public propiedad() {
    }

    public propiedad(String direccion, Integer numHabitaciones, double precioAlquiler, boolean disponible) {
        this.direccion = direccion;
        this.numHabitaciones = numHabitaciones;
        this.precioAlquiler = precioAlquiler;
        this.disponible = disponible;
    }

    @Override
    public String toString() {

        return "Propiedad [Direccion: " + getDireccion() + ", Numero de habitaciones: " + getNumHabitaciones() + ", Precio del alquiler: " + getPrecioAlquiler() 
                + ", Disponibilidad: " + isDisponible() + "]";

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
