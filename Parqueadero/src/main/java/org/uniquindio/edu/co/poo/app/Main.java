package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Parqueadero;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Creación del parqueadero con NIT correcto y listaVehiculos inicializada
        Parqueadero parqueadero = new Parqueadero("Autoplex", "Cra 17", "12345678");

        // Captura de datos del vehículo
        String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del Vehículo");
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del Vehículo");
        String placa = JOptionPane.showInputDialog(null, "Ingrese la placa del Vehículo");
        String color = JOptionPane.showInputDialog(null, "Ingrese el color del Vehiculo");

        // Registro del vehículo
        String mensaje = parqueadero.registrarVehiculo(marca, modelo, placa, color);
        JOptionPane.showMessageDialog(null, mensaje);

        // Ordenar la lista de vehículos después de registrar
        Parqueadero.ordenarPorPlaca(parqueadero.getListaVehiculos());

        // Mostrar la lista ordenada (opcional)
        JOptionPane.showMessageDialog(null, "Vehículos registrados:\n" + parqueadero.getListaVehiculos());
    }
}
