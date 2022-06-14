/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gesterpkx;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConsultasTablaEmpleado {

    conexion con = new conexion();
    Statement st;
    JButton btn2 = new JButton("Modificar");
    Connection conexion = con.conectar();

    public void mostrarEmpleado(JTable visor) {
        String sql = "select id_emple,roles.descripcion,nombre,usuario from empleados INNER JOIN roles on empleados.rol = roles.id_rol";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_Empleado");
        model.addColumn("Rol");
        model.addColumn("Nombre");
        model.addColumn("Usuario");
        visor.setModel(model);

        String[] datos = new String[5];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void mostrarAparcamiento(JTable visor) {
        String sql = "select * from aparcamiento";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_Aparcamiento");
        model.addColumn("Nombre");
        model.addColumn("Planta");
        model.addColumn("Posición");
        model.addColumn("Disponibilidad");
        visor.setModel(model);

        String[] datos = new String[5];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = String.valueOf(rs.getString(4));
                datos[4] = rs.getString(5);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void mostrarParking(JTable visor) {
        String sql = "select * from parking";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_parking");
        model.addColumn("Nombre parking");
        model.addColumn("Localizacion");
        model.addColumn("Zona");
        visor.setModel(model);

        String[] datos = new String[4];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void mostrarMovimientos(JTable visor) {
        String sql = "select * from clientesaparc";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Cliente");
        model.addColumn("Id Aparcamiento");
        model.addColumn("Fecha");
        model.addColumn("Precio");
        model.addColumn("Observaciones");
        visor.setModel(model);

        String[] datos = new String[5];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = String.valueOf(rs.getInt(2));
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[3] = String.valueOf(rs.getDouble(5));
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void mostrarClientes(JTable visor) {
        String sql = "select * from cliente";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Cliente");
        model.addColumn("Nombre");
        model.addColumn("Doc identidad");
        model.addColumn("Observaciones");
        visor.setModel(model);

        String[] datos = new String[4];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void eliminar(String ntabla, String ncolumna, String dato) {
        String sql = "delete from " + ntabla + " WHERE " + ncolumna + " = " + "'" + dato + "'";
        try {
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }

    public void buscarempleado(String ntabla, String ncolumna, String dato, JTable visor) {
        String sql = "select id_emple,roles.descripcion,nombre,usuario from " + ntabla + " INNER JOIN roles on empleados.rol = roles.id_rol WHERE " + ncolumna + " = '" + dato + "' or " + ncolumna + " LIKE '%" + dato + "%' or roles.descripcion LIKE '%" + dato + "%'";
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_Empleado");
        model.addColumn("Rol");
        model.addColumn("Nombre");
        model.addColumn("Usuario");
        visor.setModel(model);

        String[] datos = new String[5];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void editar(String ntabla, String ncolumna, String dato, String dato2, JTable visor) {
        String sql = "UPDATE " + ntabla + " SET " + ncolumna + " = '" + dato2 + "' WHERE " + ncolumna + " LIKE '" + dato + "'";
        try {
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }
}
