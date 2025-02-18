package com.miempresa.proyecto;

/**
 * Clase que representa un usuario en el sistema.
 * @author Javier
 * @version 1.0
 * @since 2025
 */
public class Usuario {
    private String nombre;
    private int edad;

    /**
     * Es el constructor de la clase Usuario.
     * @param nombre Nombre del usuario
     * @param edad Edad del usuario
     */
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return Nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la edad del usuario.
     * @return Edad del usuario
     */
    public int getEdad() {
        return edad;
    }
}
