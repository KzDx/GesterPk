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
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConsultasTabla {

    conexion con = new conexion();
    Statement st;
    JButton btn2 = new JButton("Modificar");
    Connection conexion = con.conectar();

    public void mostrarroles(JTable visor) {
        String sql = "select * from roles";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id_rol");
        model.addColumn("descripcion");
        visor.setModel(model);

        String[] datos = new String[2];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void mostrarEmpleado(JTable visor) {
        String sql = "select * from empleados";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_Empleado");
        model.addColumn("Rol");
        model.addColumn("Nombre");
        model.addColumn("Usuario");
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

    public void mostrarAparcamiento(JTable visor) {
        String sql = "select * from aparcamiento";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_Aparcamiento");
        model.addColumn("Nombre");
        model.addColumn("Planta");
        model.addColumn("N_estacionamiento");
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
        model.addColumn("Nombre_parking");
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
        model.addColumn("Id_Cliente");
        model.addColumn("Id_Aparcamiento");
        model.addColumn("Fecha");
        model.addColumn("Observaciones");
        model.addColumn("Precio");

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
                datos[4] = String.valueOf(rs.getDouble(5));
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void mostrarClientes(JTable visor) {
        String sql = "select * from cliente";
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_Cliente");
        model.addColumn("Nombre");
        model.addColumn("Doc_identidad");
        model.addColumn("Telefono");
        model.addColumn("Observaciones");
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
                datos[4] = rs.getString(5);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void eliminar(String ntabla, String ncolumna, String identificador, String dato3, String dato) {
        String sql = "delete from " + ntabla + " WHERE " + ncolumna + " = '" + dato + "' and "
                + identificador + " = '" + dato3 + "'";
        try {
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }

    public void editar(String ntabla, String ncolumna, String identificador, String dato3, String dato, String dato2, JTable visor) {
        String sql = "UPDATE " + ntabla + " SET " + ncolumna + " = '" + dato2 + "' WHERE " + ncolumna + " = '" + dato + "' and "
                + identificador + " = '" + dato3 + "'";
        try {
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }

    public void buscar(String ntabla, String ncolumna, String dato, JTable visor) {
        String sql = "select * from " + ntabla + " WHERE " + ncolumna + " = '" + dato + "'";
        DefaultTableModel model = new DefaultTableModel();
        int i = visor.getColumnCount();
        for (int x = 0; x < i; x++) {
            model.addColumn(visor.getColumnName(x));
        }
        visor.setModel(model);
        if (i == 4 || ntabla.equals("empleados")) {
            String[] datos = new String[4];
            try {
                st = conexion.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    model.addRow(datos);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        if (i == 5) {
            String[] datos = new String[5];
            try {
                st = conexion.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    model.addRow(datos);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public void registrarcliente(String nombrecliente, String docidcliente, String telefonocliente, String observacionescliente, double tiempo, String var) {
        String sqlmax = "SELECT MAX(cliente.id_cliente) from cliente";
        String idaparc = "SELECT id_aparcamiento from aparcamiento WHERE planta LIKE '" + var + "'";
        int a = 0, b = 0;
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sqlmax);
            while (rs.next()) {
                a = rs.getInt(1);
                a += 1;
            }
            st = conexion.createStatement();
            rs = st.executeQuery(idaparc);
            while (rs.next()) {
                b = rs.getInt(1);
            }
            String sqlinsertcli = "INSERT INTO cliente VALUES ('" + a + "','" + nombrecliente + "','" + docidcliente + "','" + telefonocliente + "','" + observacionescliente + "')";
            try {
                PreparedStatement pst = conexion.prepareStatement(sqlinsertcli);
                pst.executeUpdate();
            } catch (Exception ex) {
                System.out.println("Error" + ex);
            }
            String sqlinsertcliapar = "INSERT INTO clientesaparc VALUES ('" + a + "','" + b + "','" + LocalDateTime.now() + "','" + observacionescliente + "','" + tiempo * 0.25 + "')";
            try {
                PreparedStatement pst = conexion.prepareStatement(sqlinsertcliapar);
                pst.executeUpdate();
            } catch (Exception ex) {
                System.out.println("Error" + ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasTabla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registrarempleado(String var, String usuario, String nombre, String contraseña) {
        String sqlmax = "SELECT MAX(id_empleado) from empleados";
        int a = 0, b = 0, c = 0;
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sqlmax);
            while (rs.next()) {
                a = rs.getInt(1);
                a += 1;
            }
            String sqlgetIdroles = "SELECT id_rol from roles where descripcion LIKE '" + var + "'";
            rs = st.executeQuery(sqlgetIdroles);
            while (rs.next()) {
                b = rs.getInt(1);
            }
            String sqlinsertemple = "INSERT INTO empleados VALUES ('" + a + "','" + b + "','" + usuario + "','" + nombre + "','" + contraseña + "')";
            try {
                PreparedStatement pst = conexion.prepareStatement(sqlinsertemple);
                pst.executeUpdate();
            } catch (Exception ex) {
                System.out.println("Error" + ex);
            }
            String sqlmaxemprol = "SELECT MAX(id_emprol) from emprol";
            try {
                rs = st.executeQuery(sqlmax);
                while (rs.next()) {
                    c = rs.getInt(1);
                    c += 1;
                }
            } catch (Exception ex) {
                System.out.println("Error" + ex);
            }
            String sqlinsertcliapar = "INSERT INTO emprol VALUES ('" + c + "','" + a + "','" + b + "')";
            try {
                PreparedStatement pst = conexion.prepareStatement(sqlinsertcliapar);
                pst.executeUpdate();
            } catch (Exception ex) {
                System.out.println("Error" + ex);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }

    public void registrarrol(String dato1, String dato2) {
        String sql = "INSERT INTO roles VALUES ('" + dato1 + "','" + dato2 + "')";
        try {
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }
}
