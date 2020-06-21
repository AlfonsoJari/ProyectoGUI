package proyectogui;

public class DepartamentosGUI extends javax.swing.JInternalFrame {

    public DepartamentosGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btoNuevo = new javax.swing.JButton();
        btoGuardar = new javax.swing.JButton();
        btoModif = new javax.swing.JButton();
        btoEliminar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(300, 300));

        jToolBar1.setRollover(true);

        btoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectogui/imagenes/add-new-document_icon-icons.com_54068.png"))); // NOI18N
        btoNuevo.setFocusable(false);
        btoNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btoNuevo);

        btoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectogui/imagenes/savetheapplication_guardar_2958.png"))); // NOI18N
        btoGuardar.setFocusable(false);
        btoGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoGuardar);

        btoModif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectogui/imagenes/notes_edit_modify_icon_143729.png"))); // NOI18N
        btoModif.setFocusable(false);
        btoModif.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoModif.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btoModif);

        btoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectogui/imagenes/borrar.png"))); // NOI18N
        btoEliminar.setFocusable(false);
        btoEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btoEliminar);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btoNuevoActionPerformed

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btoGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoEliminar;
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btoModif;
    private javax.swing.JButton btoNuevo;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
