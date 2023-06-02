/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DAO;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import modelo.VO.propiedad;

/**
 *
 * @author JESUS DAVID
 */
public class PropiedadServicio {
   
    public void guardar(java.sql.Connection conexion, propiedad propiedad) throws SQLException {
        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO propiedad (direccion, numhabitaciones, precioalquiler, disponibilidad) "
                    + "VALUES(?, ?, ?, ?)");
            consulta.setString(1, propiedad.getDireccion());
            consulta.setInt(2, propiedad.getNumHabitaciones());
            consulta.setDouble(3, propiedad.getPrecioAlquiler());
            consulta.setBoolean(4, propiedad.isDisponible());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
}

    

