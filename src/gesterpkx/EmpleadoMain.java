/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gesterpkx;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EmpleadoMain extends javax.swing.JFrame {

    Login l;
    ConsultasTabla cte;
    String ntabla, ncolumna, dato1, dato3, identificador;

    /**
     * Creates new form Tableaparcamientos
     */
    public EmpleadoMain() {
        initComponents();
        cte = new ConsultasTabla();
        DefaultTableModel modelo = new DefaultTableModel();
        visor.setEnabled(false);
        cte.mostrarParking(visor);
        JTableHeader jtableHeader = visor.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        visor.setTableHeader(jtableHeader);
        ntabla = "parking";
        ncolumna = "nombre_parking";
        jComboBox1.removeAllItems();
        jComboBox1.addItem("id_parking");
        jComboBox1.addItem("nombre_parking");
        jComboBox1.addItem("localizacion");
        jComboBox1.addItem("zona");
        jComboBox1.setVisible(false);
        jTextField1.setVisible(false);
        Eliminar.setVisible(false);
        Buscar.setVisible(false);
        setBounds(0, 0, 1100, 600);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        Eliminar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Buscar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GesterPK©");
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Captura-removebg-preview.png")).getImage());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/888.jpg"))); // NOI18N
        jLabel4.setToolTipText("");

        visor.setAutoCreateRowSorter(true);
        visor.setBackground(new java.awt.Color(153, 153, 153));
        visor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        visor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        visor.setToolTipText("");
        visor.setColumnSelectionAllowed(true);
        visor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visor.setDragEnabled(true);
        visor.setEditingColumn(0);
        visor.setEditingRow(0);
        visor.setRowHeight(30);
        visor.setSelectionBackground(new java.awt.Color(153, 0, 153));
        visor.setShowHorizontalLines(true);
        visor.setShowVerticalLines(true);
        visor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visorMouseClicked(evt);
            }
        });
        visor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                visorPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(visor);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jMenu1.setText("Tablas");

        jMenuItem3.setText("Parking");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Aparcamientos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Movimientos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Clientes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Registro");

        jMenuItem1.setText("Registrar Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("⚙");

        jMenuItem2.setText("Cerrar Sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1083, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        cte.mostrarParking(visor);
        visor.setEnabled(false);
        ntabla = "parking";
        jComboBox1.removeAllItems();
        jComboBox1.addItem("id_parking");
        jComboBox1.addItem("nombre_parking");
        jComboBox1.addItem("localizacion");
        jComboBox1.addItem("zona");
        jComboBox1.setVisible(false);
        jTextField1.setVisible(false);
        Eliminar.setVisible(false);
        Buscar.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        cte.mostrarAparcamiento(visor);
        DefaultTableModel modelo = new DefaultTableModel();
        visor.setEnabled(false);
        ntabla = "aparcamiento";
        jComboBox1.removeAllItems();
        jComboBox1.addItem("id_aparcamiento");
        jComboBox1.addItem("nombre");
        jComboBox1.addItem("planta");
        jComboBox1.addItem("N_estaiconamiento");
        jComboBox1.addItem("disponibilidad");
        jComboBox1.setVisible(false);
        jTextField1.setVisible(false);
        Eliminar.setVisible(false);
        Buscar.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        cte.mostrarMovimientos(visor);
        DefaultTableModel modelo = new DefaultTableModel();
        visor.setEnabled(true);
        ntabla = "clientesaparc";
        jComboBox1.removeAllItems();
        jComboBox1.addItem("id_cliente");
        jComboBox1.addItem("id_aparcamiento");
        jComboBox1.addItem("fecha");
        jComboBox1.addItem("precio");
        jComboBox1.addItem("observaciones");
        jComboBox1.setVisible(true);
        jTextField1.setVisible(true);
        Eliminar.setVisible(true);
        Buscar.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        cte.mostrarClientes(visor);
        DefaultTableModel modelo = new DefaultTableModel();
        visor.setEnabled(true);
        ntabla = "cliente";
        jComboBox1.removeAllItems();
        jComboBox1.addItem("id_cliente");
        jComboBox1.addItem("nombre");
        jComboBox1.addItem("doc_identidad");
        jComboBox1.addItem("telefono");
        jComboBox1.addItem("observaciones");
        jComboBox1.setVisible(true);
        jTextField1.setVisible(true);
        Eliminar.setVisible(true);
        Buscar.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        RegistroclienteEmp rc = new RegistroclienteEmp();
        rc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void visorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visorMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) visor.getModel();
        dato1 = String.valueOf(modelo.getValueAt(visor.getSelectedRow(), visor.getSelectedColumn()));
        dato3 = String.valueOf(modelo.getValueAt(visor.getSelectedRow(), 0));
    }//GEN-LAST:event_visorMouseClicked

    private void visorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_visorPropertyChange
        DefaultTableModel modelo = (DefaultTableModel) visor.getModel();
        String dato2;
        try {
            if ("tableCellEditor".equals(evt.getPropertyName())) {
                if (visor.isEditing()) {
                } else {
                    ncolumna = visor.getColumnName(visor.getSelectedColumn());
                    dato2 = String.valueOf(modelo.getValueAt(visor.getSelectedRow(), visor.getSelectedColumn()));
                    identificador = visor.getColumnName(0);
                    cte.editar(ntabla, ncolumna, identificador, dato3, dato1, dato2, visor);
                    if ("aparcamiento".equals(ntabla)) {
                        cte.mostrarAparcamiento(visor);
                    }
                    if ("empleados".equals(ntabla)) {
                        cte.mostrarEmpleado(visor);
                    }
                    if ("cliente".equals(ntabla)) {
                        cte.mostrarClientes(visor);
                    }
                    if ("clientesaparc".equals(ntabla)) {
                        cte.mostrarMovimientos(visor);
                    }
                    if ("roles".equals(ntabla)) {
                        cte.mostrarroles(visor);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_visorPropertyChange

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) visor.getModel();
        String dato2 = String.valueOf(modelo.getValueAt(visor.getSelectedRow(), visor.getSelectedColumn()));
        ncolumna = visor.getColumnName(visor.getSelectedColumn());
        identificador = visor.getColumnName(0);
        int confirmado = JOptionPane.showConfirmDialog(null, "Desea eliminar fila seleccionada con dato '" + dato2 + "'");
        if (JOptionPane.OK_OPTION == confirmado) {
            cte.eliminar(ntabla, ncolumna, identificador, dato3, dato2);
            JOptionPane.showMessageDialog(null, "Confirmacion", "Eliminacion realizada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("ERROR");
        }
        if ("aparcamiento".equals(ntabla)) {
            cte.mostrarAparcamiento(visor);
        }
        if ("empleados".equals(ntabla)) {
            cte.mostrarEmpleado(visor);
        }
        if ("cliente".equals(ntabla)) {
            cte.mostrarClientes(visor);
        }
        if ("clientesaparc".equals(ntabla)) {
            cte.mostrarMovimientos(visor);
        }
        if ("parking".equals(ntabla)) {
            cte.mostrarParking(visor);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        ncolumna = (String) jComboBox1.getSelectedItem();
        dato1 = jTextField1.getText().trim();
        if (jTextField1.getText().trim() != "") {
            cte.buscar(ntabla, ncolumna, dato1, visor);
            JOptionPane.showMessageDialog(null, "Error", "Busqueda compleatada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Error");
        }


    }//GEN-LAST:event_BuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpleadoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables

}
