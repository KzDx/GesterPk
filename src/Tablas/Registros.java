/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablas;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Registros {
    private int id_emple; 
    private int rol;
    private String usuario;
    private String nombre;
    private String contrasena;

    public Registros() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getId_emple() {
        return id_emple;
    }

    public void setId_emple(int id_emple) {
        this.id_emple = id_emple;
    }

    
}
