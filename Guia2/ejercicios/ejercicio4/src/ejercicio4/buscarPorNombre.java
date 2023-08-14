/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ejercicio4;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Owner
 */
public class buscarPorNombre extends javax.swing.JInternalFrame {
    DefaultTableModel modeloTabla=new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int rows,int columnns){
            return false;
        }
    };
    /**
     * Creates new form buscarPorNombre
     */
    public buscarPorNombre() {
        initComponents();
        CargarColumnas();
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
        jLabel2 = new javax.swing.JLabel();
        jNombreABuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaProductos = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Listar por nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Escriba los caracteres que desea Buscar");

        jNombreABuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jNombreABuscarKeyReleased(evt);
            }
        });

        jtablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtablaProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jNombreABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jNombreABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNombreABuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreABuscarKeyReleased
        // TODO add your handling code here:
        borrarFilas();
        if(!(jNombreABuscar.getText().isEmpty())){
            for(Producto p:menuFrame.productosTreeset){
                if(p.getDescripcion().startsWith(jNombreABuscar.getText())){
                    modeloTabla.addRow(new Object[]{
                        p.getCodigo(),p.getDescripcion(),p.getPrecio(),p.getStock()
                    });
                }
            }
        }
    }//GEN-LAST:event_jNombreABuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jNombreABuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablaProductos;
    // End of variables declaration//GEN-END:variables

private void CargarColumnas(){
    modeloTabla.addColumn("Codigo");
    modeloTabla.addColumn("Descripcion");
    modeloTabla.addColumn("Precio");
    modeloTabla.addColumn("Stock");
    jtablaProductos.setModel(modeloTabla);
}
private void borrarFilas(){
    int filas=jtablaProductos.getRowCount()-1; // cantidad filas
    // va de atras para adelante
    for(int f=filas;f>=0;f--){
        modeloTabla.removeRow(f);
    }
}
}