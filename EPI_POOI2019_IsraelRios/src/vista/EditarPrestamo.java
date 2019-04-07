/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import controlador.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
/**
 *
 * @author israel
 */
public class EditarPrestamo extends javax.swing.JFrame {

    int id_usuario_original;
    public EditarPrestamo() {
        initComponents();
        this.setTitle("Editar prestamo");
        Biblioteca.llenarComboIdPrestamo(cmboPrestamosHechos);
        Biblioteca.llenarComboIdMaterial(cmboMateriales);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmboPrestamosHechos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrestamos = new javax.swing.JTable();
        cmboUsuarios = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        cmboMateriales = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMateriales = new javax.swing.JTable();
        fechaSalida = new com.toedter.calendar.JDateChooser();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cmboPrestamosHechos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboPrestamosHechosActionPerformed(evt);
            }
        });

        tablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Prestamo", "ID Usuario:", "Nombre Usuario:", "Fecha Salida", "Fecha Entrega", "Material :", "Estado:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPrestamos);

        cmboUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboUsuariosActionPerformed(evt);
            }
        });

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Usuario:", "Tipo de Usuario:", "Nombre:", "Apellido Paterno:", "Apellido Materno:", "Telefono:", "Deuda:", "Multa:", "Matricula:", "Carrera:", "Id Empleado:", "Cedula:", "Promedio:", "Departamento:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaUsuarios);

        cmboMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboMaterialesActionPerformed(evt);
            }
        });

        tablaMateriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Material:", "Titulo:", "Autor:", "Año:", "Tipo Material:", "Ejemplares:", "Estado:", "Editorial:", "Categoria:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaMateriales);

        btnAceptar.setText("Editar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmboPrestamosHechos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmboMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptar)
                                .addGap(35, 35, 35)
                                .addComponent(btnCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmboPrestamosHechos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmboMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmboUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboUsuariosActionPerformed
        // TODO add your handling code here:
       DefaultTableModel modelo=(DefaultTableModel) tablaUsuarios.getModel();
        //2.- limpiar la tabla
        modelo.getDataVector().clear();
        int id=(int)cmboUsuarios.getSelectedItem();
        Biblioteca.cargarTablaUsuario(modelo, id);
        tablaUsuarios.updateUI();//Hasta aqui acaba lo de usuarios
    }//GEN-LAST:event_cmboUsuariosActionPerformed

    private void cmboMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboMaterialesActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo=(DefaultTableModel) tablaMateriales.getModel();
        //2.- limpiar la tabla
        modelo.getDataVector().clear();
        int id=(int)cmboMateriales.getSelectedItem();
        Biblioteca.cargarTablaMateriales(modelo, id);
        tablaUsuarios.updateUI();//Hasta aqui acaba lo de materiales
    }//GEN-LAST:event_cmboMaterialesActionPerformed

    private void cmboPrestamosHechosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboPrestamosHechosActionPerformed
        // TODO add your handling code here:
       DefaultTableModel modelo=(DefaultTableModel) tablaPrestamos.getModel();
        //2.- limpiar la tabla
        modelo.getDataVector().clear();
        int id=(int)cmboPrestamosHechos.getSelectedItem();
        Biblioteca.cargarTablaPrestamos(modelo, id);
        tablaPrestamos.updateUI();//Hasta aqui acaba lo de prestamos
        DefaultTableModel modelo1=(DefaultTableModel) tablaUsuarios.getModel();//Cuando damos clic en el combo de prestamos, se llena el combo de usuarios
        modelo1.getDataVector().clear();
        Prestamo prestamo=Biblioteca.devolverPrestamo(id);//esto lo hacemos por si no se requiere modificar el usuario del prestamo
        Usuario usuario=prestamo.getUsuario();//Se hace la excepcion con este y se carga en el combobox
        Biblioteca.llenarIdUsuario(cmboUsuarios, usuario.getIdUsuario());//Pues solo los usuarios que no esten en un prestamo se les puede asignar uno
    }//GEN-LAST:event_cmboPrestamosHechosActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        if(cmboPrestamosHechos.getSelectedItem()==null)
        {
            JOptionPane.showMessageDialog(null,"Al parecer no hay prestamos para Editar");
            this.dispose();
        }
        
        try
        {
            Calendar fecha=fechaSalida.getCalendar();
            Biblioteca.validarFecha(fechaSalida);
            System.out.println("Fecha puesta por el usuario");
            System.out.println(String.format("%1$tY-%1$tm-%1$td",fecha));
            System.out.println("\n");
            System.out.println("\n");
            Prestamo.editar((int)cmboPrestamosHechos.getSelectedItem(), (int)cmboUsuarios.getSelectedItem(),(int)cmboMateriales.getSelectedItem(),fecha);
            JOptionPane.showMessageDialog(null,"Prestamo editado");
            this.dispose();
        }
        catch(Excepcion e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al editar el prestamo");
        }
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmboMateriales;
    private javax.swing.JComboBox<String> cmboPrestamosHechos;
    private javax.swing.JComboBox<String> cmboUsuarios;
    private com.toedter.calendar.JDateChooser fechaSalida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaMateriales;
    private javax.swing.JTable tablaPrestamos;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
