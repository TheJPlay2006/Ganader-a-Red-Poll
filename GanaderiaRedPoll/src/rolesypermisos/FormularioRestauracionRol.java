/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package rolesypermisos;


import Login.Rol_1;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan Chaves
 */
public class FormularioRestauracionRol extends javax.swing.JDialog {

    private Map<String, Rol_1> roles = new HashMap<>();
    private boolean confirmar;
    public FormularioRestauracionRol(java.awt.Frame parent, boolean modal, Map<String, Rol_1> roles) {
        super(parent, modal);
        initComponents();
        this.roles = roles;
        this.cargarComboRoles();
        this.setResizable(false);
        this.setLocationRelativeTo(parent);
    }

    private void cargarComboRoles() {
        this.cbxRoles.addItem("Seleccionar opción");
        for (Rol_1 rol : this.roles.values()) {
            if (!rol.isEstado()) {
                this.cbxRoles.addItem(rol.getNombre());
            }
        }
    }

    public boolean confirmacion() {
        return this.confirmar;
    }

    public String obtenerRolSeleccionado() {
        return (String) this.cbxRoles.getSelectedItem();
    }

    private boolean validarCombo() {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        cbxRoles = new javax.swing.JComboBox<>();
        btnRestaurar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblTitulo.setText("Restaurar Rol");

        lblRol.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblRol.setText("Rol");

        cbxRoles.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        btnRestaurar.setBackground(new java.awt.Color(0, 0, 255));
        btnRestaurar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnRestaurar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 0, 51));
        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(69, 69, 69)
                        .addComponent(btnRestaurar))
                    .addComponent(cbxRoles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblTitulo)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRol)
                    .addComponent(cbxRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnRestaurar))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        if (this.validarCombo() ) {
            this.confirmar = true;
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.confirmar =(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JComboBox<String> cbxRoles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
