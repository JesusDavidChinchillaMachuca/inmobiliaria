/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Formulario;
import inmobiliaria.Inmobiliaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.VO.propiedad;
import modelo.DAO.PropiedadServicio;
import modelo.DAO.conexion;

/**
 *
 * @author JESUS DAVID
 */
public class Servicio implements ActionListener {

    private Formulario vista;
    private Inmobiliaria principal;

    public Servicio(Formulario vista, Inmobiliaria principal) {
        this.vista = vista;
        this.principal = principal;
        ActionListener(this);
    }

    private void ActionListener(ActionListener controller) {
        vista.btnAgregar1.addActionListener(controller);
        vista.btnListar.addActionListener(controller);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().contentEquals("Agregar")) {

            String direccion = vista.txtDireccion.getText();
            Integer numHabitaciones = Integer.parseInt(vista.txtHabitaciones1.getText());
            double precio = Double.parseDouble(vista.txtPrecio1.getText());
            boolean disponible = true;
            if (vista.cmbDisponibilidad.getSelectedItem() == "Si") {
                disponible = true;
            } else {
                disponible = false;
            }

            propiedad propiedad = new propiedad(direccion, numHabitaciones, precio, disponible);

            agregarDB(propiedad);
            principal.agregarPropiedad(propiedad);

            JOptionPane.showMessageDialog(vista, "Registrado correctamente");

            vista.txtDireccion.setText("");
            vista.txtHabitaciones1.setText("");
            vista.txtPrecio1.setText("");

        }

        if (e.getActionCommand().contentEquals("Listar")) {

            vista.area.setText(principal.listar());

        }

    }

    public void agregarDB(propiedad propiedad) {
        try {
            PropiedadServicio ps = new PropiedadServicio();
            ps.guardar(conexion.obtener(), propiedad);
        } catch (Exception e) {
        }
    }
}