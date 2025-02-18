package com.miempresa.proyecto;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para gestionar los usuarios.
 */
public class GestorUsuarios {
    private List<Usuario> usuarios;

    /**
     * Constructor que inicializa la lista de los usuarios.
     */
    public GestorUsuarios() {
        usuarios = new ArrayList<>();
    }

    /**
     * Agrega un usuario a la lista.
     * @param usuario Usuario a agregar
     */
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    /**
     * Muestra todos los usuarios.
     */
    public void MostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre() + ", Edad: " + usuario.getEdad());
        }
    }
}