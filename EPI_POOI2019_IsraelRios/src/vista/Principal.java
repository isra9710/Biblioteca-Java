/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author israel
 */
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;
import modelo.*;
public class Principal extends javax.swing.JFrame 
{

   
    public Principal() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_crud_material = new javax.swing.JButton();
        btn_crud_prestamos = new javax.swing.JButton();
        btn_crud_usuarios = new javax.swing.JButton();
        btn_mostrar_material = new javax.swing.JButton();
        btn_mostrar_prestamos = new javax.swing.JButton();
        btn_mostrar_usuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_crud_material.setText("CRUD MATERIAL");
        btn_crud_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crud_materialActionPerformed(evt);
            }
        });

        btn_crud_prestamos.setText("CRUD PRESTAMOS");
        btn_crud_prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crud_prestamosActionPerformed(evt);
            }
        });

        btn_crud_usuarios.setText("CRUD USUARIOS");
        btn_crud_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crud_usuariosActionPerformed(evt);
            }
        });

        btn_mostrar_material.setText("Mostrar Material");
        btn_mostrar_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_materialActionPerformed(evt);
            }
        });

        btn_mostrar_prestamos.setText("Mostrar Prestamos");
        btn_mostrar_prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_prestamosActionPerformed(evt);
            }
        });

        btn_mostrar_usuarios.setText("Mostrar Usuarios");
        btn_mostrar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_usuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_crud_material)
                    .addComponent(btn_mostrar_material))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_crud_prestamos)
                    .addComponent(btn_mostrar_prestamos))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_mostrar_usuarios)
                    .addComponent(btn_crud_usuarios))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crud_material)
                    .addComponent(btn_crud_prestamos)
                    .addComponent(btn_crud_usuarios))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mostrar_material)
                    .addComponent(btn_mostrar_prestamos)
                    .addComponent(btn_mostrar_usuarios))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mostrar_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_materialActionPerformed
        // TODO add your handling code here:
        MostrarMaterial nuevo=new MostrarMaterial();
        nuevo.show();
    }//GEN-LAST:event_btn_mostrar_materialActionPerformed

    private void btn_crud_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crud_materialActionPerformed
        // TODO add your handling code here:
        CrudMaterial nuevo = new CrudMaterial();
        nuevo.show();
    }//GEN-LAST:event_btn_crud_materialActionPerformed

    private void btn_mostrar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_usuariosActionPerformed
        // TODO add your handling code here:
        MostrarUsuarios nuevo= new MostrarUsuarios();
        nuevo.show();
    }//GEN-LAST:event_btn_mostrar_usuariosActionPerformed

    private void btn_crud_prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crud_prestamosActionPerformed
        // TODO add your handling code here:
        CrudPrestamos nuevo=new CrudPrestamos();
       nuevo.show();
    }//GEN-LAST:event_btn_crud_prestamosActionPerformed

    private void btn_mostrar_prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_prestamosActionPerformed
        // TODO add your handling code here:
         MostrarPrestamos nuevo=new MostrarPrestamos();
        nuevo.show();
    }//GEN-LAST:event_btn_mostrar_prestamosActionPerformed

    private void btn_crud_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crud_usuariosActionPerformed
        // TODO add your handling code here:
        CrudUsuarios nuevo=new CrudUsuarios();
        nuevo.show();
    }//GEN-LAST:event_btn_crud_usuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crud_material;
    private javax.swing.JButton btn_crud_prestamos;
    private javax.swing.JButton btn_crud_usuarios;
    private javax.swing.JButton btn_mostrar_material;
    private javax.swing.JButton btn_mostrar_prestamos;
    private javax.swing.JButton btn_mostrar_usuarios;
    // End of variables declaration//GEN-END:variables
}