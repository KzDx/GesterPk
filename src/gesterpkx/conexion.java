/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gesterpkx;

import Tablas.Aparcamiento;
import Tablas.Registros;
import Tablas.Roles;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class conexion {
     static Connection con;
     static Statement mStatement;
     static ResultSet mResultSet;

    public Connection conectar(){
        try {
            con=(Connection)  DriverManager.getConnection("jdbc:mysql://localhost/gesterpk", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error"+ex.toString());
        }
        return con;
    }
    public ArrayList getListaRolEmple(){
        ArrayList listaroles= new ArrayList();
        Roles lroles = null;
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs= st.executeQuery("SELECT * FROM `roles` WHERE id_rol not like 4");
            while(rs.next()){
                lroles = new Roles();
                lroles.setId_rol(rs.getInt("id_rol"));
                lroles.setDescripcion(rs.getString("descripcion"));
                listaroles.add(lroles);
            }
        } catch (SQLException e) {
        }
        return listaroles;
    }
    public ArrayList getListaRolAdm(){
        ArrayList listaroles= new ArrayList();
        Roles lroles = null;
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs= st.executeQuery("Select * from roles");
            while(rs.next()){
                lroles = new Roles();
                lroles.setId_rol(rs.getInt("id_rol"));
                lroles.setDescripcion(rs.getString("descripcion"));
                listaroles.add(lroles);
            }
        } catch (SQLException e) {
        }
        return listaroles;
    }
    
    public ArrayList getPlantas(){
        ArrayList listaplantas= new ArrayList();
        Aparcamiento lplantas = null;
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs= st.executeQuery("SELECT DISTINCT(planta)AS planta FROM aparcamiento");
            while(rs.next()){
                lplantas = new Aparcamiento();

                lplantas.setPlanta(rs.getString("planta"));

                listaplantas.add(lplantas);
            }
        } catch (SQLException e) {
        }
        return listaplantas;
    }
    public conexion() {
        
    }
    public void Desconectar() {
        try {
            this.con.close();
        } catch (Exception e) {
        }
    }

    public Boolean AddUser(Registros oUsuario) {
        try {
            mStatement = con.createStatement();
            mStatement.execute("INSERT INTO empleados ( id_emple,rol, nombre, usuario, contrasena)"
                    + " VALUES ('" + oUsuario.getId_emple() + "','" + oUsuario.getRol() + "','" + oUsuario.getNombre() + "','" + oUsuario.getUsuario() + "','" + oUsuario.getContrasena() + "' )");
            return true;
        } catch (SQLException e) {
            System.err.println(e.toString());
            return false;
        }
    }

    public Registros GetUsuario(String usuario) {
        Registros mUsuario = null;
        try {
            mStatement = con.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM empleados WHERE usuario = '" + usuario + "' ");
            while (mResultSet.next()) {
                mUsuario = new Registros();
                mUsuario.setId_emple(mResultSet.getInt("id_empleado"));
                mUsuario.setRol(mResultSet.getInt("rol"));
                mUsuario.setNombre(mResultSet.getString("nombre"));
                mUsuario.setUsuario(mResultSet.getString("usuario"));
                mUsuario.setContrasena(mResultSet.getString("contraseña"));
                return mUsuario;
            }
        } catch (SQLException e) {
            return null;
        }
        return mUsuario;
    }
}
