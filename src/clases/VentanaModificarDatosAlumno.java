/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.Principal.matricula;

/**
 *
 * @author Brayan
 */
public class VentanaModificarDatosAlumno extends javax.swing.JFrame {

    VentanaPrincipall v ;
    /**
     * Creates new form VentanaModificarDatosAlumno
     */
    public VentanaModificarDatosAlumno() {
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

        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSexoModificar = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtApellidoModificar = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtNombreModificar = new javax.swing.JTextField();
        txtIdModificar = new javax.swing.JTextField();
        txtEdadModificar = new javax.swing.JTextField();
        btnBuscarModificar = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtIdBuscarModificar = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MODIFICAR DATOS DE ALUMNO");
        jLabel4.setOpaque(true);
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
        jPanel8.add(txtSexoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 170, -1));

        jLabel22.setBackground(new java.awt.Color(255, 0, 0));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Edad:");
        jLabel22.setToolTipText("");
        jLabel22.setOpaque(true);
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(255, 0, 0));
        btnActualizar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel8.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        txtApellidoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoModificarActionPerformed(evt);
            }
        });
        jPanel8.add(txtApellidoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 170, -1));

        jLabel38.setBackground(new java.awt.Color(255, 0, 0));
        jLabel38.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Apellido:");
        jLabel38.setToolTipText("");
        jLabel38.setOpaque(true);
        jPanel8.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        txtNombreModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreModificarActionPerformed(evt);
            }
        });
        jPanel8.add(txtNombreModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 170, -1));

        txtIdModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdModificarActionPerformed(evt);
            }
        });
        jPanel8.add(txtIdModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, -1));
        jPanel8.add(txtEdadModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 170, -1));

        btnBuscarModificar.setBackground(new java.awt.Color(255, 0, 0));
        btnBuscarModificar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnBuscarModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarModificar.setText("BUSCAR");
        btnBuscarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarModificarActionPerformed(evt);
            }
        });
        jPanel8.add(btnBuscarModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel30.setBackground(new java.awt.Color(255, 0, 0));
        jLabel30.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("INGRESA ID:");
        jLabel30.setToolTipText("");
        jLabel30.setOpaque(true);
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel39.setBackground(new java.awt.Color(255, 0, 0));
        jLabel39.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Sexo:");
        jLabel39.setToolTipText("");
        jLabel39.setOpaque(true);
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel37.setBackground(new java.awt.Color(255, 0, 0));
        jLabel37.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Nombre:");
        jLabel37.setToolTipText("");
        jLabel37.setOpaque(true);
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));
        jPanel8.add(txtIdBuscarModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, -1));

        jLabel36.setBackground(new java.awt.Color(255, 0, 0));
        jLabel36.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("ID:");
        jLabel36.setToolTipText("");
        jLabel36.setOpaque(true);
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        jLabel28.setBackground(new java.awt.Color(255, 0, 0));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        v = new VentanaPrincipall();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        String nombre,apellido,sexo,id;
        int edad;
        int indice;
        nombre = txtNombreModificar.getText();
        apellido = txtApellidoModificar.getText();
        sexo = txtSexoModificar.getText();
        id = txtIdModificar.getText();
        edad = Integer.parseInt(txtEdadModificar.getText());
        indice = matricula.BuscarAlumno(id);
        matricula.alumnos.get(indice).setNombre(nombre);
        matricula.alumnos.get(indice).setApellido(apellido);
        matricula.alumnos.get(indice).setEdad(edad);
        matricula.alumnos.get(indice).setSexo(sexo);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtApellidoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoModificarActionPerformed

    private void txtNombreModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreModificarActionPerformed

    private void txtIdModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdModificarActionPerformed

    private void btnBuscarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarModificarActionPerformed
        // TODO add your handling code here:
        String id;
        id = txtIdBuscarModificar.getText();
        int indice=matricula.BuscarAlumno(id);
        if(indice==-1){
            txtApellidoModificar.setEnabled(false);
            txtNombreModificar.setEnabled(false);
            txtEdadModificar.setEnabled(false);
            txtIdModificar.setEnabled(false);
            txtSexoModificar.setEnabled(false);

            txtApellidoModificar.setText("NO EXISTE ESE ID");
            txtNombreModificar.setText("NO EXISTE ESE ID");
            txtEdadModificar.setText("NO EXISTE ESE ID");
            txtIdModificar.setText("NO EXISTE ESE ID");
            txtSexoModificar.setText("NO EXISTE ESE ID");

            btnActualizar.setEnabled(false);
        }else{
            btnActualizar.setEnabled(true);
            txtApellidoModificar.setEnabled(true);
            txtNombreModificar.setEnabled(true);
            txtEdadModificar.setEnabled(true);
            txtIdModificar.setEnabled(false);
            txtSexoModificar.setEnabled(true);

            txtApellidoModificar.setText(matricula.alumnos.get(indice).getApellido());
            txtNombreModificar.setText(matricula.alumnos.get(indice).getNombre());
            txtSexoModificar.setText(matricula.alumnos.get(indice).getSexo());
            txtIdModificar.setText(matricula.alumnos.get(indice).getIdAlumno());
            txtEdadModificar.setText(String.valueOf(matricula.alumnos.get(indice).getEdad()));
        }

    }//GEN-LAST:event_btnBuscarModificarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaModificarDatosAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarDatosAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarDatosAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarDatosAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificarDatosAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtApellidoModificar;
    private javax.swing.JTextField txtEdadModificar;
    private javax.swing.JTextField txtIdBuscarModificar;
    private javax.swing.JTextField txtIdModificar;
    private javax.swing.JTextField txtNombreModificar;
    private javax.swing.JTextField txtSexoModificar;
    // End of variables declaration//GEN-END:variables
}
