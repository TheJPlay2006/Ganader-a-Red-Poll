/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

// Importar las librerias y demás 
import Gestiones.FormularioPropietarios;
import Gestiones.RedirigirAdmin;
import Gestiones.RedirigirLechero;
import Gestiones.RedirigirVeterinario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo
 */

public class Login extends javax.swing.JFrame {  
    
    //Declara listas y variables
    private boolean isPasswordVisible = false;
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private int contadorID = 1;
    private Roles roles;

    
    public Login() {
    initComponents();
    Botontranparente();
    this.setLocationRelativeTo(null);
    }
    
    public void Botontranparente (){
    btnMostrar.setOpaque(false);
        btnMostrar.setContentAreaFilled(false);
        btnMostrar.setBorderPainted(false);    
    }
    
    //Metodos
    public boolean autenticar(String correo, String contrasena) {
        return roles.validarCredenciales(correo, contrasena);

     }
     
    public Usuario obtenerUsuario(String correo) {
        return roles.obtenerUsuario(correo);
    }
    
    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public int obtenerNuevoID() {
        return contadorID++;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public int getContadorID() {
        return contadorID;
    }

    public void incrementarContadorID() {
        contadorID++;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblvaca1 = new javax.swing.JLabel();
        PanLogin = new javax.swing.JPanel();
        lblganaderia = new javax.swing.JLabel();
        lblingresarcorreo = new javax.swing.JLabel();
        txtingresarcorreo = new javax.swing.JTextField();
        lblcontrasena = new javax.swing.JLabel();
        txtponercontrasena = new javax.swing.JPasswordField();
        btnMostrar = new javax.swing.JButton();
        btnregistro = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btniniciarsecion = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        lblvaca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vaca2.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanLogin.setBackground(new java.awt.Color(112, 87, 72));
        PanLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblganaderia.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        lblganaderia.setForeground(new java.awt.Color(0, 0, 0));
        lblganaderia.setText("INICIO DE SESIÓN");
        PanLogin.add(lblganaderia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 450, 90));

        lblingresarcorreo.setBackground(new java.awt.Color(0, 0, 0));
        lblingresarcorreo.setFont(new java.awt.Font("Lucida Bright", 1, 34)); // NOI18N
        lblingresarcorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblingresarcorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Correo (1).png"))); // NOI18N
        lblingresarcorreo.setText("Correo electrónico:");
        PanLogin.add(lblingresarcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, 50));

        txtingresarcorreo.setBackground(new java.awt.Color(51, 51, 51));
        txtingresarcorreo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtingresarcorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtingresarcorreo.setBorder(null);
        txtingresarcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtingresarcorreoActionPerformed(evt);
            }
        });
        PanLogin.add(txtingresarcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 530, 60));

        lblcontrasena.setFont(new java.awt.Font("Lucida Bright", 1, 34)); // NOI18N
        lblcontrasena.setForeground(new java.awt.Color(0, 0, 0));
        lblcontrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/persona1 (2).png"))); // NOI18N
        lblcontrasena.setText("Contraseña:");
        PanLogin.add(lblcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 290, 50));

        txtponercontrasena.setBackground(new java.awt.Color(51, 51, 51));
        txtponercontrasena.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtponercontrasena.setForeground(new java.awt.Color(255, 255, 255));
        txtponercontrasena.setBorder(null);
        txtponercontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtponercontrasenaActionPerformed(evt);
            }
        });
        PanLogin.add(txtponercontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 527, 54));

        btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ojos2.png"))); // NOI18N
        btnMostrar.setBorder(null);
        btnMostrar.setContentAreaFilled(false);
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMostrar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrar.setOpaque(true);
        btnMostrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojos (1).png"))); // NOI18N
        btnMostrar.setRequestFocusEnabled(false);
        btnMostrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        PanLogin.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, -1, 70));

        btnregistro.setBackground(new java.awt.Color(51, 51, 51));
        btnregistro.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N
        btnregistro.setForeground(new java.awt.Color(255, 255, 255));
        btnregistro.setText("Registrarse");
        btnregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroActionPerformed(evt);
            }
        });
        PanLogin.add(btnregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 770, 150, 50));

        btnsalir.setBackground(new java.awt.Color(51, 51, 51));
        btnsalir.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        PanLogin.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 770, 150, 50));

        btniniciarsecion.setBackground(new java.awt.Color(51, 51, 51));
        btniniciarsecion.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        btniniciarsecion.setForeground(new java.awt.Color(255, 255, 255));
        btniniciarsecion.setText("Iniciar sesión");
        btniniciarsecion.setBorder(null);
        btniniciarsecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarsecionActionPerformed(evt);
            }
        });
        PanLogin.add(btniniciarsecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 170, 50));

        lblLogo.setForeground(new java.awt.Color(0, 0, 0));
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Default_A_logo_for_Ganaderia_Red.png"))); // NOI18N
        PanLogin.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 190, 170));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo madera.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        PanLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 0, 1070, 850));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtponercontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtponercontrasenaActionPerformed

    }//GEN-LAST:event_txtponercontrasenaActionPerformed
    private void limpiarDatos() {
    txtingresarcorreo.setText(""); 
    txtponercontrasena.setText(""); 
 
}
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (isPasswordVisible) {
            txtponercontrasena.setEchoChar('*');
            isPasswordVisible = false;
        } else {
            txtponercontrasena.setEchoChar('\u0000');
            isPasswordVisible = true;
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroActionPerformed
    Registro nuevo = new Registro(this); 
    nuevo.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnregistroActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed
    //Botón que valida registro
    private void btniniciarsecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarsecionActionPerformed
    String correo = txtingresarcorreo.getText().trim();
    String contrasena = new String(txtponercontrasena.getPassword()).trim();
    Roles roles = Roles.getInstance();

    //Verifica que todo esté correcto 
    if (roles.validarCredenciales(correo, contrasena)) {
        Usuario usuario = roles.obtenerUsuario(correo);
        JOptionPane.showMessageDialog(this, "Bienvenido(a), " + usuario.getNombre(), "Inicio de sesión exitoso", JOptionPane.INFORMATION_MESSAGE);
        
      //Esto hace que los roles o usuarios se redirijan a sus respectivos lugares. 
        switch (usuario.getRolId()) {
            case 1: //
                RedirigirAdmin adminredi = new RedirigirAdmin();
                adminredi.setVisible(true);
                this.setVisible(false);
                break;
            case 2: 
               RedirigirVeterinario veteriRedi = new RedirigirVeterinario();
                veteriRedi.setVisible(true);
                break;
            case 3: 
               RedirigirLechero lecheroRedi = new RedirigirLechero();
                lecheroRedi.setVisible(true);
                break;
                case 4: 
              FormularioPropietarios formuPropie = new FormularioPropietarios();
                formuPropie.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Rol no reconocido", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
        this.setVisible(false);
    } else {
        JOptionPane.showMessageDialog(this, "No existen los datos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
        limpiarDatos();
    }
    }//GEN-LAST:event_btniniciarsecionActionPerformed

    private void txtingresarcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingresarcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtingresarcorreoActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanLogin;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btniniciarsecion;
    private javax.swing.JButton btnregistro;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JLabel lblganaderia;
    private javax.swing.JLabel lblingresarcorreo;
    private javax.swing.JLabel lblvaca1;
    private javax.swing.JTextField txtingresarcorreo;
    private javax.swing.JPasswordField txtponercontrasena;
    // End of variables declaration//GEN-END:variables
}