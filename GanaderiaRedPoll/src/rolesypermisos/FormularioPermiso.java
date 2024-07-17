/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package rolesypermisos;

import Login.Rol_1;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan Chaves
 */
public class FormularioPermiso extends javax.swing.JDialog {

    private boolean confirmar;
    private int idPermiso;
    private Map<String, Rol_1> roles = new HashMap<>();
    private boolean edicion;

    public FormularioPermiso(java.awt.Frame parent, boolean modal, Permiso permiso, Map<String, Rol_1> roles) {
        super(parent, modal);
        initComponents();
        this.roles = roles;
        this.cargarComboEstado();
        this.cargarComboRoles();
        this.inicializarFormulario(permiso);
        this.setResizable(false);
        this.setLocationRelativeTo(parent);
    }

    private void inicializarFormulario(Permiso permiso) {
        if (permiso != null) {
            this.idPermiso = permiso.getId();
            this.txtNombre.setText(permiso.getNombre());
            this.txtNombre.setEditable(false);
            this.cbxRoles.setSelectedItem(this.obtenerNombreRol(permiso.getId()));
            if (permiso.isEstado()) {
                this.cbxEstado.setSelectedItem("true");
            } else {
                this.cbxEstado.setSelectedItem("false");
            }
            this.edicion = true;
        } else {
            this.edicion = false;
        }
    }

    private void cargarComboEstado() {
        this.cbxEstado.addItem("Seleccionar opción");
        this.cbxEstado.addItem("true");
        this.cbxEstado.addItem("false");
    }

    private void cargarComboRoles() {
        this.cbxRoles.addItem("Seleccionar opción");
        for (Rol_1 rol : this.roles.values()) {
            if(rol.isEstado()){
                this.cbxRoles.addItem(rol.getNombre());
            }   
        }

    }

    public boolean confirmacion() {
        return this.confirmar;
    }

    private String obtenerNombreRol(int id) {
        String nombre = "";
        for (Rol_1 rol : this.roles.values()) {
            if (rol.getId() == id) {
                nombre = rol.getNombre();
            }
        }
        return nombre;
    }

    private int obtenerIdRol(String nombre) {
        int id = 0;
        for (Rol_1 rol : this.roles.values()) {
            if (rol.getNombre().equals(nombre)) {
                id = rol.getId();
            }
        }
        return id;
    }

    public Permiso consultarPermiso() {
        return new Permiso(
                this.edicion ? this.idPermiso : 0,
                this.txtNombre.getText(),
                this.obtenerIdRol((String) this.cbxRoles.getSelectedItem()),
                Boolean.parseBoolean((String) this.cbxEstado.getSelectedItem())
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitutlo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        cbxRoles = new javax.swing.JComboBox<>();
        lblRol = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitutlo.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblTitutlo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitutlo.setText("Permiso");

        lblNombre.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        lblEstado.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblEstado.setText("Estado");

        cbxRoles.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        lblRol.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblRol.setText("Rol");

        cbxEstado.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        btnCancelar.setBackground(new java.awt.Color(204, 0, 51));
        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cerrar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 0, 255));
        btnGuardar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(lblTitutlo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblEstado)
                            .addComponent(lblRol))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar))
                            .addComponent(txtNombre)
                            .addComponent(cbxRoles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxEstado, 0, 336, Short.MAX_VALUE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitutlo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRol)
                    .addComponent(cbxRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.confirmar = false;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.validarNombre() && this.validarComboRoles() && this.validarComboEstado()) {
            this.confirmar = true;
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    private boolean validarNombre() {
        boolean estado = false;
        if (this.txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe colocar un nombre", "Campo Nombre", JOptionPane.ERROR_MESSAGE);
        } else {
            estado = true;
        }
        return estado;
    }

    private boolean validarComboEstado() {
        boolean estado = false;
        String seleccionado = (String) this.cbxEstado.getSelectedItem();
        if (seleccionado.equals("Seleccionar opción")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar 'True' o 'False'.", "Selección inválida", JOptionPane.ERROR_MESSAGE);
            this.cbxEstado.setSelectedIndex(0);
        } else {
            estado = true;
        }
        return estado;
    }

    private boolean validarComboRoles() {
        boolean estado = false;
        String seleccionado = (String) this.cbxRoles.getSelectedItem();
        if (seleccionado.equals("Seleccionar opción")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un rol", "Selección inválida", JOptionPane.ERROR_MESSAGE);
            this.cbxRoles.setSelectedIndex(0);
        } else {
            estado = true;
        }
        return estado;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxRoles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTitutlo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
