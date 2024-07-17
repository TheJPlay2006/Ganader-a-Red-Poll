/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

/**
 *
 * @author Jairo
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {
private boolean isPasswordVisible = false;
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private int rol_Id;
    private int contadorID = 1;
    private Login login;
   
    public Registro(Login login) {
        this.rol_Id = 1;
        initComponents();
        Botontranparente();
        this.login = login;
        this.setLocationRelativeTo(null);
        this.listaUsuarios = login.getListaUsuarios();
        this.contadorID = login.getContadorID();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        PanRegistro = new javax.swing.JPanel();
        btnregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        pwdContra = new javax.swing.JPasswordField();
        btnRegistro = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnsalir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jrbOpcionRolPropietario = new javax.swing.JRadioButton();
        jrbOpcionRolVeterinario = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jrbOpcionRolEncargadoLeche = new javax.swing.JRadioButton();
        lblFondo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanRegistro.setBackground(new java.awt.Color(0, 0, 0));
        PanRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregresar.setBackground(new java.awt.Color(51, 51, 51));
        btnregresar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnregresar.setForeground(new java.awt.Color(255, 255, 255));
        btnregresar.setText("Cancelar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        PanRegistro.add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 159, 42));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO GANADERÍA RED POLL");
        PanRegistro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 640, 50));

        txtCorreo.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(new javax.swing.border.MatteBorder(null));
        PanRegistro.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 530, 50));

        lblCorreo.setFont(new java.awt.Font("Lucida Bright", 1, 34)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreo.setText("Digite su correo electrónico:");
        PanRegistro.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 520, 50));

        lblContra.setFont(new java.awt.Font("Lucida Bright", 1, 34)); // NOI18N
        lblContra.setForeground(new java.awt.Color(0, 0, 0));
        lblContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContra.setText("Digite su contraseña:");
        PanRegistro.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 380, 60));

        pwdContra.setBackground(new java.awt.Color(51, 51, 51));
        pwdContra.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pwdContra.setForeground(new java.awt.Color(255, 255, 255));
        pwdContra.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pwdContra.setBorder(new javax.swing.border.MatteBorder(null));
        pwdContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdContraActionPerformed(evt);
            }
        });
        PanRegistro.add(pwdContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 530, 50));

        btnRegistro.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistro.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        PanRegistro.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, 198, 45));

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ojos2.png"))); // NOI18N
        btnMostrar.setBorder(null);
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojos (1).png"))); // NOI18N
        btnMostrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMostrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        PanRegistro.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, -1, 60));

        lblNombre.setFont(new java.awt.Font("Lucida Bright", 1, 34)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Digite su nombre:");
        PanRegistro.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 340, 40));

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(new javax.swing.border.MatteBorder(null));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        PanRegistro.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 530, 50));

        btnsalir.setBackground(new java.awt.Color(51, 51, 51));
        btnsalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        PanRegistro.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 760, 160, 40));
        PanRegistro.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jrbOpcionRolPropietario.setBackground(new java.awt.Color(51, 51, 51));
        jrbOpcionRolPropietario.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jrbOpcionRolPropietario.setForeground(new java.awt.Color(255, 255, 255));
        jrbOpcionRolPropietario.setText("Propietario(a)");
        jrbOpcionRolPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcionRolPropietarioActionPerformed(evt);
            }
        });
        PanRegistro.add(jrbOpcionRolPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 140, -1));

        jrbOpcionRolVeterinario.setBackground(new java.awt.Color(51, 51, 51));
        jrbOpcionRolVeterinario.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jrbOpcionRolVeterinario.setForeground(new java.awt.Color(255, 255, 255));
        jrbOpcionRolVeterinario.setText("Veterinario(a)");
        jrbOpcionRolVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcionRolVeterinarioActionPerformed(evt);
            }
        });
        PanRegistro.add(jrbOpcionRolVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 150, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 34)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seleccione el rol: ");
        PanRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));

        jrbOpcionRolEncargadoLeche.setBackground(new java.awt.Color(51, 51, 51));
        jrbOpcionRolEncargadoLeche.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jrbOpcionRolEncargadoLeche.setForeground(new java.awt.Color(255, 255, 255));
        jrbOpcionRolEncargadoLeche.setText("Encargado(a) de lechería");
        jrbOpcionRolEncargadoLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcionRolEncargadoLecheActionPerformed(evt);
            }
        });
        PanRegistro.add(jrbOpcionRolEncargadoLeche, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacas,-prado,-cielo-oscuro-246167.jpg"))); // NOI18N
        PanRegistro.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 840));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 833, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Botontranparente (){
    btnMostrar.setOpaque(false);
        btnMostrar.setContentAreaFilled(false);
        btnMostrar.setBorderPainted(false);    
    }
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        Login registro = new Login();
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        if (isPasswordVisible) {
            pwdContra.setEchoChar('*');
            isPasswordVisible = false;
        } else {
            pwdContra.setEchoChar('\u0000');
            isPasswordVisible = true;
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void pwdContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdContraActionPerformed
     
    }//GEN-LAST:event_pwdContraActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
    String nombre = txtNombre.getText().trim();
    String correo = txtCorreo.getText().trim();
    String contrasena = new String(pwdContra.getPassword()).trim();
    
    int rol_Id = 0; 
    
    if (jrbOpcionRolPropietario.isSelected()) {
        rol_Id = 4; 
    } else if (jrbOpcionRolVeterinario.isSelected()) {
        rol_Id = 2; 
    } else if (jrbOpcionRolEncargadoLeche.isSelected()) {
        rol_Id = 3; 
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona un rol", "Error de Registro", JOptionPane.ERROR_MESSAGE);
        return; 
    }
    if (nombre.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor complete todos los campos", "Error de Registro", JOptionPane.ERROR_MESSAGE);
        return; 
    }
    Roles roles = Roles.getInstance();
    Usuario nuevoUsuario = new Usuario(rol_Id, nombre, correo, contrasena, 0); 
    roles.registrarUsuario(nuevoUsuario);
    listaUsuarios.add(nuevoUsuario);
    
    JOptionPane.showMessageDialog(this, "Usuario(a) registrado exitosamente", "Registro", JOptionPane.INFORMATION_MESSAGE);
    
    Login IrLogin = new Login();
    IrLogin.setVisible(true);
    this.setVisible(false); 

    }//GEN-LAST:event_btnRegistroActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jrbOpcionRolPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOpcionRolPropietarioActionPerformed

    }//GEN-LAST:event_jrbOpcionRolPropietarioActionPerformed

    private void jrbOpcionRolVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOpcionRolVeterinarioActionPerformed

    }//GEN-LAST:event_jrbOpcionRolVeterinarioActionPerformed

    private void jrbOpcionRolEncargadoLecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOpcionRolEncargadoLecheActionPerformed

    }//GEN-LAST:event_jrbOpcionRolEncargadoLecheActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanRegistro;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton jrbOpcionRolEncargadoLeche;
    private javax.swing.JRadioButton jrbOpcionRolPropietario;
    private javax.swing.JRadioButton jrbOpcionRolVeterinario;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPasswordField pwdContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
