/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.Principal.matricula;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Brayan
 */
public class VentanaAgregarAlumno extends javax.swing.JFrame {
    DefaultListModel<String>modeloAlumno = new DefaultListModel<>();
    VentanaPrincipall v;
    /**
     * Creates new form VentanaAgregarAlumno
     */
    public VentanaAgregarAlumno() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSexoAlumno = new javax.swing.JTextField();
        txtIdAlumno = new javax.swing.JTextField();
        txtNombreAlumno = new javax.swing.JTextField();
        txtApellidoAlumno = new javax.swing.JTextField();
        txtEdadAlumno = new javax.swing.JTextField();
        btnRegistrarAlumno = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtNombreApoderado = new javax.swing.JTextField();
        txtTelefonoApoderado = new javax.swing.JTextField();
        txtDireccionApoderado = new javax.swing.JTextField();
        txtDniApoderado = new javax.swing.JTextField();
        txtParentescoApoderado = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AGREGAR ALUMNO");
        jLabel6.setOpaque(true);
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("EDAD:");
        jLabel7.setOpaque(true);
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setText("NOMBRE:");
        jLabel8.setOpaque(true);
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setText("APELLIDO:");
        jLabel9.setOpaque(true);
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setText("SEXO:");
        jLabel10.setOpaque(true);
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setText("ID:");
        jLabel11.setOpaque(true);
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));
        jPanel4.add(txtSexoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 210, -1));

        txtIdAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdAlumnoMouseClicked(evt);
            }
        });
        txtIdAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAlumnoActionPerformed(evt);
            }
        });
        jPanel4.add(txtIdAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 210, -1));
        jPanel4.add(txtNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 210, -1));

        txtApellidoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoAlumnoActionPerformed(evt);
            }
        });
        jPanel4.add(txtApellidoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 210, -1));
        jPanel4.add(txtEdadAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 210, -1));

        btnRegistrarAlumno.setBackground(new java.awt.Color(255, 0, 0));
        btnRegistrarAlumno.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnRegistrarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAlumno.setText("REGISTRAR");
        btnRegistrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlumnoActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegistrarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 90, -1));

        jLabel31.setBackground(new java.awt.Color(255, 0, 0));
        jLabel31.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel31.setText("Parentesco:");
        jLabel31.setOpaque(true);
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel32.setBackground(new java.awt.Color(255, 0, 0));
        jLabel32.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel32.setText("Nombre: ");
        jLabel32.setOpaque(true);
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel33.setBackground(new java.awt.Color(255, 0, 0));
        jLabel33.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel33.setText("Direccion:");
        jLabel33.setOpaque(true);
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel34.setBackground(new java.awt.Color(255, 0, 0));
        jLabel34.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel34.setText("Telefono:");
        jLabel34.setOpaque(true);
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel35.setBackground(new java.awt.Color(255, 0, 0));
        jLabel35.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel35.setText("DNI:");
        jLabel35.setOpaque(true);
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        txtNombreApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreApoderadoActionPerformed(evt);
            }
        });
        jPanel4.add(txtNombreApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 210, -1));
        jPanel4.add(txtTelefonoApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 210, -1));
        jPanel4.add(txtDireccionApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 210, -1));
        jPanel4.add(txtDniApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 210, -1));
        jPanel4.add(txtParentescoApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 210, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 500, 20));

        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 0, 0));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 500, 500));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        v = new VentanaPrincipall();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreApoderadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreApoderadoActionPerformed

    private void btnRegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAlumnoActionPerformed

        Alumno alum = new Alumno();
        //Contenedores de Alumno
        String id,nombre,apellido,sexo;
        int edad;

        //Contenedores de Apoderado
        String nombreApoderado,telefono,direccion,dni,parentesco;
        //txt's de cajas de Alumno
        id = txtIdAlumno.getText();
        nombre=txtNombreAlumno.getText();
        apellido=txtApellidoAlumno.getText();
        sexo=txtSexoAlumno.getText();
        edad=Integer.parseInt(txtEdadAlumno.getText());
        //txt's de cajas de apoderado

        nombreApoderado = txtNombreApoderado.getText();
        telefono = txtTelefonoApoderado.getText();
        direccion = txtDireccionApoderado.getText();
        dni = txtDireccionApoderado.getText();
        parentesco = txtParentescoApoderado.getText();
        alum.setApellido(apellido);
        alum.setEdad(edad);
        alum.setIdAlumno(id);
        alum.setSexo(sexo);
        alum.setNombre(nombre);

        alum.setApoderado(new Apoderado(nombreApoderado, direccion, telefono, dni, parentesco, alum));

        matricula.alumnos.add(alum);
        modeloAlumno.addElement("El Id del alumno : "+alum.getIdAlumno()+">>Nombre: "+alum.getNombre()+">>"+"Apellido: "+alum.getApellido()+">>"+"Sexo: "+alum.getSexo()+">>"+"Edad: "+alum.getEdad());
        //listaAlumnos.setModel(modeloAlumno);
        //listaAlumnosDos.setModel(modeloAlumno);
        //ListaAlumnosRegistrados.setModel(modeloAlumno);
        JOptionPane.showMessageDialog(null, "Se registro con exito");
        txtApellidoAlumno.setText("");
        txtNombreAlumno.setText("");
        txtEdadAlumno.setText("");
        txtSexoAlumno.setText("");
        txtIdAlumno.setText("");

        txtTelefonoApoderado.setText("");
        txtDireccionApoderado.setText("");
        txtParentescoApoderado.setText("");
        txtNombreApoderado.setText("");
        txtDniApoderado.setText("");
    }//GEN-LAST:event_btnRegistrarAlumnoActionPerformed

    private void txtApellidoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoAlumnoActionPerformed

    private void txtIdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAlumnoActionPerformed

    private void txtIdAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdAlumnoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAlumnoMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaAgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarAlumno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellidoAlumno;
    private javax.swing.JTextField txtDireccionApoderado;
    private javax.swing.JTextField txtDniApoderado;
    private javax.swing.JTextField txtEdadAlumno;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtNombreApoderado;
    private javax.swing.JTextField txtParentescoApoderado;
    private javax.swing.JTextField txtSexoAlumno;
    private javax.swing.JTextField txtTelefonoApoderado;
    // End of variables declaration//GEN-END:variables
}