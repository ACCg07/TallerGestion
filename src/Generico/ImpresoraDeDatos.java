package Generico;

import entidades.Usuario;
import entidades.Vehiculo;

public class ImpresoraDeDatos {


    public static void ImprimirInfoVehiculo(Vehiculo vehiculo) {
        System.out.println("Matrícula: " + vehiculo.getMatricula());
        System.out.println("Número de bastidor: " + vehiculo.getNumeroBastidor());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Color: " + vehiculo.getColor());
        System.out.println("Fecha de fabricación: " + vehiculo.getFechaFabricacion());
        System.out.println("Fecha de última ITV: " + vehiculo.getFechaITV());
        System.out.println(); // Salto de línea entre vehículos
    }

    public static void ImprimirInfoUsuario(Usuario usuario) {
        System.out.println("Usuario: " + usuario.getNombreUsuario());
        System.out.println("Contraseña: " + usuario.getContraseña());
        System.out.println("Correo electronico: " + usuario.getCorreoElectronico());


    }
}