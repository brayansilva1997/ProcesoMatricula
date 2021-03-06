/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.Principal.matricula;
import javax.swing.DefaultListModel;

/**
 *
 * @author Brayan
 */
public class VentanaPrincipall extends javax.swing.JFrame {

    Matricula ma = new Matricula();
    VentanaAgregarAlumno a = new VentanaAgregarAlumno();
    VentanaBuscarAlumno  b = new VentanaBuscarAlumno();
    VentanaElegirCursosAlumno e = new VentanaElegirCursosAlumno();
    VentanaEliminarAlumno el = new VentanaEliminarAlumno();
    VentanaModificarDatosAlumno m = new VentanaModificarDatosAlumno();
    VentanaMostrarDatosAlumno mo = new VentanaMostrarDatosAlumno();
    
    DefaultListModel<String>modeloAlumno = new DefaultListModel<>();
    /**
     * Creates new form VentanaPrincipall
     */
    public VentanaPrincipall() {
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

        jLabel1 = new javax.swing.JLabel();
        botonBuscarAlumno = new javax.swing.JButton();
        botonAgregarAlumno = new javax.swing.JButton();
        botonEliminarAlumno = new javax.swing.JButton();
        botonMostrarAlumno = new javax.swing.JButton();
        botonElegirDatosAlumno = new javax.swing.JButton();
        botonModificarDatosAlumno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 20, 98, -1));

        botonBuscarAlumno.setText("BUSCAR ALUMNO");
        botonBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 138, -1, -1));

        botonAgregarAlumno.setText("AGREGAR ALUMNO");
        botonAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 87, -1, -1));

        botonEliminarAlumno.setText("ELIMINAR ALUMNO");
        botonEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 179, -1, -1));

        botonMostrarAlumno.setText("MOSTRAR DATOS DEL ALUMNO");
        botonMostrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(botonMostrarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 267, -1, -1));

        botonElegirDatosAlumno.setText("ELEGIR CURSOS DEL ALUMNO");
        botonElegirDatosAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElegirDatosAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(botonElegirDatosAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 233, -1, -1));

        botonModificarDatosAlumno.setText("MODIFICAR DATOS DEL ALUMNO");
        botonModificarDatosAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarDatosAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificarDatosAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 308, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarAlumnoActionPerformed
        // TODO add your handling code here:
        a.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonAgregarAlumnoActionPerformed

    private void botonBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarAlumnoActionPerformed
        // TODO add your handling code here:
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonBuscarAlumnoActionPerformed

    private void botonEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarAlumnoActionPerformed
        // TODO add your handling code here:
        el.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonEliminarAlumnoActionPerformed

    private void botonElegirDatosAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElegirDatosAlumnoActionPerformed
        // TODO add your handling code here:
        e.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonElegirDatosAlumnoActionPerformed
//jeje
    private void botonMostrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarAlumnoActionPerformed
        // TODO add your handling code here:
        mo.setVisible(true);
        mo.ListaAlumnosRegistrados.removeAll();;
        
        modeloAlumno.removeAllElements();
            for (int i= 0;i<matricula.alumnos.size();i++){
                modeloAlumno.addElement("Id: "+matricula.alumnos.get(i).getIdAlumno()+"||Nombre: "+matricula.alumnos.get(i).getNombre()+
                    "||Apellido: "+matricula.alumnos.get(i).getApellido()+
                    "||Sexo: "+matricula.alumnos.get(i).getSexo()+
                    "||Edad: "+matricula.alumnos.get(i).getEdad());

            }
            
        mo.ListaAlumnosRegistrados.setModel(modeloAlumno);
        dispose();
    }//GEN-LAST:event_botonMostrarAlumnoActionPerformed

    private void botonModificarDatosAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarDatosAlumnoActionPerformed
        // TODO add your handling code here:
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonModificarDatosAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarAlumno;
    private javax.swing.JButton botonBuscarAlumno;
    private javax.swing.JButton botonElegirDatosAlumno;
    private javax.swing.JButton botonEliminarAlumno;
    private javax.swing.JButton botonModificarDatosAlumno;
    private javax.swing.JButton botonMostrarAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
