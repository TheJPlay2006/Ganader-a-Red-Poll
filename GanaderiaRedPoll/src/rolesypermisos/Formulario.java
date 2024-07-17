/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rolesypermisos;

import Login.Login;
import Login.Rol_1;
import rolesypermisos.FormularioRestauracionRol;
import rolesypermisos.FormularioRol;
import rolesypermisos.GestionPermisos;
import rolesypermisos.GestionRol;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Formulario extends javax.swing.JFrame {

    private DefaultTableModel modeloRoles = new DefaultTableModel();
    private DefaultTableModel modeloPermisos = new DefaultTableModel();
    private GestionRol gestionRol;
    private GestionPermisos gestionPermiso;
    private FormularioPermiso formularioPermiso;
    private FormularioRol formularioRol;
    private FormularioRestauracionRol formularioRestauracion;

    public Formulario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.gestionRol = new GestionRol();
        this.gestionPermiso = new GestionPermisos();
        String[] nombreColumnasTablaRoles = new String[]{"Id", "Nombre", "Estado"};
        this.modeloRoles.setColumnIdentifiers(nombreColumnasTablaRoles);
        this.tbRoles.setModel(this.modeloRoles);
        String[] nombreColumnasTablaPermisos = new String[]{"Id", "Nombre", "Rol", "Estado"};
        this.modeloPermisos.setColumnIdentifiers(nombreColumnasTablaPermisos);
        this.tbPermisos.setModel(this.modeloPermisos);

    }

    private void abrirFormularioRol(Rol_1 rol) {
        this.formularioRol = new FormularioRol(this, true, rol);
        this.formularioRol.setVisible(true);
        if (this.formularioRol.confirmacion()) {
            Rol_1 nuevoRol = this.formularioRol.consultarRol();
            if (rol == null) {
                if (this.gestionRol.validarExistencia(nuevoRol.getNombre())) {
                    JOptionPane.showMessageDialog(this, "El nombre ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    this.gestionRol.crear(nuevoRol.getNombre());
                    this.actualizarTablaRol();
                }
            } else {
                this.gestionRol.actualizarRol(nuevoRol);
                this.actualizarTablaRol();
            }
        }
    }

    private void abrirFormularioPermiso(Permiso permiso) {
        this.formularioPermiso = new FormularioPermiso(this, true, permiso, this.gestionRol.getRoles());
        this.formularioPermiso.setVisible(true);
        if (this.formularioPermiso.confirmacion()) {
            Permiso nuevoPermiso = (Permiso) this.formularioPermiso.consultarPermiso();
            if (permiso == null) {
                if (this.gestionPermiso.validarExistencia(nuevoPermiso.getNombre())) {
                    JOptionPane.showMessageDialog(this, "El nombre ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    this.gestionPermiso.crear(nuevoPermiso);
                    this.actualizarTablaPermiso();
                }
            } else {
                this.gestionPermiso.actualizarPermiso(nuevoPermiso);
                this.actualizarTablaPermiso();
            }
        }
    }

    private boolean validarSeleccion(String mensaje, int fila) {
        boolean valor = false;
        if (fila != -1) {
            valor = true;
        } else {
            JOptionPane.showMessageDialog(this, mensaje);
        }
        return valor;
    }

    private void editarRol() {
        if (this.validarSeleccion("Debe seleccionar un rol para poder editarlo.", this.tbRoles.getSelectedRow())) {
            String nombre = String.valueOf(this.tbRoles.getValueAt(this.tbRoles.getSelectedRow(), 1));
            Rol_1 rol = this.gestionRol.obtenerRol(nombre);
            this.abrirFormularioRol(rol);
        }
    }

    private void editarPermiso() {
        if (this.validarSeleccion("Debe seleccionar un permiso para poder editarlo.", this.tbPermisos.getSelectedRow())) {
            String nombre = String.valueOf(this.tbPermisos.getValueAt(this.tbPermisos.getSelectedRow(), 1));
            Permiso permiso = this.gestionPermiso.obtenerPermiso(nombre);
            this.abrirFormularioPermiso(permiso);
        }
    }

    private void eliminarRol() {
      
        if (this.validarSeleccion("Debe seleccionar un rol para poder eliminarlo.", this.tbRoles.getSelectedRow())) {
            String nombre = String.valueOf(this.tbRoles.getValueAt(this.tbRoles.getSelectedRow(), 1));
            this.gestionRol.eliminarRol(nombre,this.gestionPermiso.getPermisos());
            this.actualizarTablaRol();
            this.actualizarTablaPermiso();
        }
    }

    private void eliminarPermiso() {
        if (this.validarSeleccion("Debe seleccionar un permiso para poder eliminarlo.", this.tbPermisos.getSelectedRow())) {
            String nombre = String.valueOf(this.tbPermisos.getValueAt(this.tbPermisos.getSelectedRow(), 1));
            this.gestionPermiso.eliminarPermiso(nombre);
            this.actualizarTablaPermiso();
        }
    }

    private void actualizarTablaRol() {
        this.modeloRoles.setRowCount(0);
        for (Rol_1 rol : this.gestionRol.getRoles().values()) {
            if (rol.isEstado()) {
                this.modeloRoles.addRow(new Object[]{rol.getId(), rol.getNombre(), rol.isEstado()});
            }
        }
    }

    private void actualizarTablaPermiso() {
        this.modeloPermisos.setRowCount(0);
        for (Permiso permiso : this.gestionPermiso.getPermisos().values()) {
            if (permiso.isEstado()) {
                this.modeloPermisos.addRow(new Object[]{permiso.getId(), permiso.getNombre(), permiso.getId_rol(),permiso.isEstado()});
            }
        }
    }
    private void restaurarRol(){
        this.formularioRestauracion = new FormularioRestauracionRol(this, true,this.gestionRol.getRoles()); 
        this.formularioRestauracion.setVisible(true);
        if(this.formularioRestauracion.confirmacion()){
            this.gestionRol.restaurarRol(this.formularioRestauracion.obtenerRolSeleccionado(),this.gestionPermiso.getPermisos());
            this.actualizarTablaRol();
            this.actualizarTablaPermiso();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JTabbedPane();
        pnRoles = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRoles = new javax.swing.JTable();
        btnCrearRol = new javax.swing.JButton();
        lblTituloRoles = new javax.swing.JLabel();
        btnEditarRol = new javax.swing.JButton();
        btnEliminarRol = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnRegresarLogin1 = new javax.swing.JButton();
        pnPermisos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPermisos = new javax.swing.JTable();
        btnRegresarLogin = new javax.swing.JButton();
        lblTituloPermiso = new javax.swing.JLabel();
        btnCrearPermiso = new javax.swing.JButton();
        btnEditarPermiso = new javax.swing.JButton();
        btnEliminarPermiso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbRoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbRoles);

        btnCrearRol.setBackground(new java.awt.Color(80, 158, 50));
        btnCrearRol.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnCrearRol.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearRol.setText("Crear");
        btnCrearRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRolActionPerformed(evt);
            }
        });

        lblTituloRoles.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblTituloRoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRoles.setText("Roles");

        btnEditarRol.setBackground(new java.awt.Color(255, 163, 80));
        btnEditarRol.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnEditarRol.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarRol.setText("Editar");
        btnEditarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRolActionPerformed(evt);
            }
        });

        btnEliminarRol.setBackground(new java.awt.Color(255, 23, 93));
        btnEliminarRol.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnEliminarRol.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarRol.setText("Eliminar");
        btnEliminarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRolActionPerformed(evt);
            }
        });

        btnRestaurar.setBackground(new java.awt.Color(102, 51, 255));
        btnRestaurar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnRestaurar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        btnRegresarLogin1.setText("Cancelar");
        btnRegresarLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarLogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRolesLayout = new javax.swing.GroupLayout(pnRoles);
        pnRoles.setLayout(pnRolesLayout);
        pnRolesLayout.setHorizontalGroup(
            pnRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRolesLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnRegresarLogin1)
                .addGap(182, 182, 182)
                .addComponent(btnCrearRol, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(lblTituloRoles)
                .addGap(29, 29, 29)
                .addComponent(btnEditarRol, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnEliminarRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnRestaurar)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRolesLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnRolesLayout.setVerticalGroup(
            pnRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRolesLayout.createSequentialGroup()
                .addGroup(pnRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRolesLayout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(btnEliminarRol)
                        .addGap(95, 95, 95))
                    .addGroup(pnRolesLayout.createSequentialGroup()
                        .addGroup(pnRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditarRol)
                            .addGroup(pnRolesLayout.createSequentialGroup()
                                .addGroup(pnRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnRolesLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(pnRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblTituloRoles)
                                            .addComponent(btnRegresarLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCrearRol)))
                                    .addGroup(pnRolesLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(btnRestaurar)))
                                .addGap(5, 5, 5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu.addTab("Roles ", pnRoles);

        tbPermisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbPermisos);

        btnRegresarLogin.setText("Cancelar");
        btnRegresarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarLoginActionPerformed(evt);
            }
        });

        lblTituloPermiso.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblTituloPermiso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPermiso.setText("Permisos");

        btnCrearPermiso.setBackground(new java.awt.Color(80, 158, 50));
        btnCrearPermiso.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnCrearPermiso.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearPermiso.setText("Crear");
        btnCrearPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPermisoActionPerformed(evt);
            }
        });

        btnEditarPermiso.setBackground(new java.awt.Color(255, 163, 80));
        btnEditarPermiso.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnEditarPermiso.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPermiso.setText("Editar");
        btnEditarPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPermisoActionPerformed(evt);
            }
        });

        btnEliminarPermiso.setBackground(new java.awt.Color(255, 23, 93));
        btnEliminarPermiso.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnEliminarPermiso.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarPermiso.setText("Eliminar");
        btnEliminarPermiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPermisoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPermisosLayout = new javax.swing.GroupLayout(pnPermisos);
        pnPermisos.setLayout(pnPermisosLayout);
        pnPermisosLayout.setHorizontalGroup(
            pnPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(pnPermisosLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(btnRegresarLogin)
                .addGap(35, 35, 35)
                .addComponent(btnEditarPermiso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPermisosLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lblTituloPermiso)
                        .addGap(160, 160, 160)
                        .addComponent(btnEliminarPermiso))
                    .addGroup(pnPermisosLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnCrearPermiso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        pnPermisosLayout.setVerticalGroup(
            pnPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPermisosLayout.createSequentialGroup()
                .addGroup(pnPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPermisosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTituloPermiso)
                            .addComponent(btnEliminarPermiso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearPermiso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPermisosLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnEditarPermiso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPermisosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnRegresarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.addTab("Permisos", pnPermisos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRolActionPerformed
        this.abrirFormularioRol(null);
    }//GEN-LAST:event_btnCrearRolActionPerformed

    private void btnEditarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRolActionPerformed
        this.editarRol();
    }//GEN-LAST:event_btnEditarRolActionPerformed

    private void btnEliminarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRolActionPerformed
        this.eliminarRol();
    }//GEN-LAST:event_btnEliminarRolActionPerformed

    private void btnCrearPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPermisoActionPerformed
        this.abrirFormularioPermiso(null);
    }//GEN-LAST:event_btnCrearPermisoActionPerformed

    private void btnEditarPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPermisoActionPerformed
       this.editarPermiso();
    }//GEN-LAST:event_btnEditarPermisoActionPerformed

    private void btnEliminarPermisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPermisoActionPerformed
       this.eliminarPermiso();
    }//GEN-LAST:event_btnEliminarPermisoActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        this.restaurarRol();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       Login logiRegreso = new Login();
       logiRegreso.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegresarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarLoginActionPerformed
     Login regresarLogin = new Login();
     regresarLogin.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_btnRegresarLoginActionPerformed

    private void btnRegresarLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarLogin1ActionPerformed
        Login regresarLogin = new Login();
        regresarLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarLogin1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPermiso;
    private javax.swing.JButton btnCrearRol;
    private javax.swing.JButton btnEditarPermiso;
    private javax.swing.JButton btnEditarRol;
    private javax.swing.JButton btnEliminarPermiso;
    private javax.swing.JButton btnEliminarRol;
    private javax.swing.JButton btnRegresarLogin;
    private javax.swing.JButton btnRegresarLogin1;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTituloPermiso;
    private javax.swing.JLabel lblTituloRoles;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JPanel pnPermisos;
    private javax.swing.JPanel pnRoles;
    private javax.swing.JTable tbPermisos;
    private javax.swing.JTable tbRoles;
    // End of variables declaration//GEN-END:variables

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
