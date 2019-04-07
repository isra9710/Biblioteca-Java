/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
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
import controlador.Biblioteca;
import javax.swing.JOptionPane;
public class Principal extends javax.swing.JFrame 
{
   
    public Principal() 
    {
        initComponents();
        if(Biblioteca.materiales==null&&Biblioteca.prestamos==null&&Biblioteca.usuarios==null)
        {
            Biblioteca.materiales=new ArrayList<Material>();
            Biblioteca.usuarios=new ArrayList<Usuario>();
            Biblioteca.prestamos=new ArrayList<Prestamo>();
            Biblioteca.inicializarPrestamos();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemAgregarPrestamo = new javax.swing.JMenuItem();
        itemEditarPrestamo = new javax.swing.JMenuItem();
        itemDevolverPrestamo = new javax.swing.JMenuItem();
        itemEliminarPrestamo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemMostrarUsuario = new javax.swing.JMenuItem();
        itemMostrarMaterial = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuLibro = new javax.swing.JMenu();
        itemAgregarLibro = new javax.swing.JMenuItem();
        itemEditarLibro = new javax.swing.JMenuItem();
        itemEliminarLibro = new javax.swing.JMenuItem();
        menuRevista = new javax.swing.JMenu();
        itemAgregarRevista = new javax.swing.JMenuItem();
        itemEditarRevista = new javax.swing.JMenuItem();
        itemEliminarRevista = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("/media/israel/Nuevo vol/Israel/Universidad/5/POO/Proyecto-Poo/LIBROS-Estantería.jpg")); // NOI18N

        jMenu1.setText("Prestamos");

        itemAgregarPrestamo.setText("Agregar un prestamo");
        itemAgregarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarPrestamoActionPerformed(evt);
            }
        });
        jMenu1.add(itemAgregarPrestamo);

        itemEditarPrestamo.setText("Editar un prestamo");
        itemEditarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarPrestamoActionPerformed(evt);
            }
        });
        jMenu1.add(itemEditarPrestamo);

        itemDevolverPrestamo.setText("Devolver un prestamo");
        itemDevolverPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDevolverPrestamoActionPerformed(evt);
            }
        });
        jMenu1.add(itemDevolverPrestamo);

        itemEliminarPrestamo.setText("Eliminar un prestamo");
        itemEliminarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarPrestamoActionPerformed(evt);
            }
        });
        jMenu1.add(itemEliminarPrestamo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mostrar");

        itemMostrarUsuario.setText("Mostrar Usuarios");
        itemMostrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMostrarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(itemMostrarUsuario);

        itemMostrarMaterial.setText("Mostrar Materiales");
        itemMostrarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMostrarMaterialActionPerformed(evt);
            }
        });
        jMenu2.add(itemMostrarMaterial);

        jMenuItem1.setText("Mostrar Prestamos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        menuLibro.setText("Gestionar Libros");

        itemAgregarLibro.setText("Agregar Libro");
        itemAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarLibroActionPerformed(evt);
            }
        });
        menuLibro.add(itemAgregarLibro);

        itemEditarLibro.setText("Editar Libro");
        itemEditarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarLibroActionPerformed(evt);
            }
        });
        menuLibro.add(itemEditarLibro);

        itemEliminarLibro.setText("Eliminar Libro");
        menuLibro.add(itemEliminarLibro);

        jMenuBar1.add(menuLibro);

        menuRevista.setText("Gestionar Revista");

        itemAgregarRevista.setText("Agregar Revista");
        itemAgregarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarRevistaActionPerformed(evt);
            }
        });
        menuRevista.add(itemAgregarRevista);

        itemEditarRevista.setText("Editar Revista");
        itemEditarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarRevistaActionPerformed(evt);
            }
        });
        menuRevista.add(itemEditarRevista);

        itemEliminarRevista.setText("Eliminar Revista");
        itemEliminarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarRevistaActionPerformed(evt);
            }
        });
        menuRevista.add(itemEliminarRevista);

        jMenuBar1.add(menuRevista);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAgregarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarPrestamoActionPerformed
        // TODO add your handling code here:
        AgregarPrestamo nuevo=new AgregarPrestamo();
        nuevo.show();
    }//GEN-LAST:event_itemAgregarPrestamoActionPerformed

    private void itemEditarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarPrestamoActionPerformed
        // TODO add your handling code here:
        if(Biblioteca.prestamos.size()==0)
        {
            JOptionPane.showMessageDialog(null,"No hay prestamos, registra uno");
        }
        else
        {
            EditarPrestamo nuevo=new EditarPrestamo();
            nuevo.show();
        }
    }//GEN-LAST:event_itemEditarPrestamoActionPerformed

    private void itemDevolverPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDevolverPrestamoActionPerformed
        // TODO add your handling code here:
        if(Biblioteca.prestamos.size()==0)
        {
            JOptionPane.showMessageDialog(null,"No hay prestamos, registra uno");
        }
        else
        {
            DevolverPrestamo nuevo=new DevolverPrestamo();
            nuevo.show();
        }
    }//GEN-LAST:event_itemDevolverPrestamoActionPerformed

    private void itemEliminarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarPrestamoActionPerformed
        // TODO add your handling code here:
        if(Biblioteca.prestamos.size()==0)
        {
            JOptionPane.showMessageDialog(null,"No hay prestamos, registra uno");
        }
        else
        {
            EliminarPrestamo nuevo=new EliminarPrestamo();
            nuevo.show();
        }
        
    }//GEN-LAST:event_itemEliminarPrestamoActionPerformed

    private void itemMostrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMostrarUsuarioActionPerformed
        // TODO add your handling code here:
        if(Biblioteca.usuarios.size()==0)
        {
            JOptionPane.showMessageDialog(null,"No hay usuarios, registra uno");
        }
        else
        {
            MostrarUsuarios nuevo=new MostrarUsuarios();
            nuevo.show();
        }
        
    }//GEN-LAST:event_itemMostrarUsuarioActionPerformed


    private void itemMostrarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMostrarMaterialActionPerformed
        // TODO add your handling code here:
        if(Biblioteca.materiales.size()==0)
        {
            JOptionPane.showMessageDialog(null,"No hay material, registra uno");
        }
        else
        {
            MostrarMaterial nuevo=new MostrarMaterial();
            nuevo.show();
        }
    }//GEN-LAST:event_itemMostrarMaterialActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if(Biblioteca.prestamos.size()==0)
        {
            JOptionPane.showMessageDialog(null,"No hay material, registra uno");
        }
        else
        {
            EliminarPrestamo nuevo=new EliminarPrestamo();
            nuevo.show();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itemAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarLibroActionPerformed
        // TODO add your handling code here:
        AgregarLibro nuevo=new AgregarLibro();
        nuevo.show();
    }//GEN-LAST:event_itemAgregarLibroActionPerformed

    private void itemEditarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarLibroActionPerformed
        // TODO add your handling code here:
        EditarLibro nuevo=new EditarLibro();
        nuevo.show();
    }//GEN-LAST:event_itemEditarLibroActionPerformed

    private void itemAgregarRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarRevistaActionPerformed
        // TODO add your handling code here:
        AgregarRevista nuevo=new AgregarRevista();
        nuevo.show();
    }//GEN-LAST:event_itemAgregarRevistaActionPerformed

    private void itemEditarRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarRevistaActionPerformed
        // TODO add your handling code here:
        EditarRevista nuevo=new EditarRevista();
        nuevo.show();
    }//GEN-LAST:event_itemEditarRevistaActionPerformed

    private void itemEliminarRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarRevistaActionPerformed
        // TODO add your handling code here:
        EliminarRevista nuevo=new EliminarRevista();
        nuevo.show();
    }//GEN-LAST:event_itemEliminarRevistaActionPerformed

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
    private javax.swing.JMenuItem itemAgregarLibro;
    private javax.swing.JMenuItem itemAgregarPrestamo;
    private javax.swing.JMenuItem itemAgregarRevista;
    private javax.swing.JMenuItem itemDevolverPrestamo;
    private javax.swing.JMenuItem itemEditarLibro;
    private javax.swing.JMenuItem itemEditarPrestamo;
    private javax.swing.JMenuItem itemEditarRevista;
    private javax.swing.JMenuItem itemEliminarLibro;
    private javax.swing.JMenuItem itemEliminarPrestamo;
    private javax.swing.JMenuItem itemEliminarRevista;
    private javax.swing.JMenuItem itemMostrarMaterial;
    private javax.swing.JMenuItem itemMostrarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuLibro;
    private javax.swing.JMenu menuRevista;
    // End of variables declaration//GEN-END:variables
}
