/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Owner
 */
public class BuscarContactos extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCelllEditable(int a, int b) {
            return false;
        }
    };

    /**
     * Creates new form BuscarContactos
     */
    public BuscarContactos() {
        initComponents();
        cargarColumnasTabla();
        botonEditar.setEnabled(false);
        botonEliminar.setEnabled(false);
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
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jbuscarE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Buscar contactos");

        jLabel1.setText("Buscar por");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Email", "Numero" }));

        jLabel2.setText("Elemento a buscar");

        jbuscarE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jbuscarEKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Buscar Contacto");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) tabla.getSelectionModel();

        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && tabla.getSelectedRow() != -1) {
                    botonEditar.setEnabled(true);
                    botonEliminar.setEnabled(true);
                } else {
                    botonEliminar.setEnabled(false);
                    botonEditar.setEnabled(false);
                }
            }
        });

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad de contactos");

        jLabel5.setText("0");

        jLabel6.setText("Contactos  Eliminados");

        jLabel7.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbuscarE, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbuscarE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(botonEditar)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEliminar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jbuscarEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbuscarEKeyReleased
        // TODO add your handling code here:
        borrarFilas();
        String item = (String) jComboBox2.getSelectedItem();
        String box = jbuscarE.getText();

        for (Contacto c : ej2Menu.listaContactos) {
            boolean condicion = false;
            condicion = switch (item) {
                case "Nombre" ->
                    c.getNombre().equals(box);
                case "Apellido" ->
                    c.getApellido().equals(box);
                case "Numero" ->
                    c.getNumeroTelefonico().equals(box);
                default ->
                    c.getEmail().equals(box);
            };

            if (condicion) {
                modelo.addRow(new Object[]{
                    c.getNombre(), c.getApellido(), c.getNumeroTelefonico(), c.getEmail()
                });
            }

        }

//        switch (item) {
//            case "Nombre":
//                for (Contacto c : ej2Menu.listaContactos) {
//                    if (c.getNombre().equals(box)) {
//                        modelo.addRow(new Object[]{
//                            c.getNombre(), c.getApellido(),c.getNumeroTelefonico(),c.getEmail()
//                        });
//                    }
//
//                }
//                break;
//            case "Apellido":
//                 for (Contacto c : ej2Menu.listaContactos) {
//                    if (c.getApellido().equals(box)) {
//                        modelo.addRow(new Object[]{
//                            c.getNombre(), c.getApellido(),c.getNumeroTelefonico(),c.getEmail()
//                        });
//                    }
//
//                }
//                 break;
//            case "Numero":
//                 for (Contacto c : ej2Menu.listaContactos) {
//                    if (c.getNumeroTelefonico().equals(box)) {
//                        modelo.addRow(new Object[]{
//                            c.getNombre(), c.getApellido(), c.getNumeroTelefonico(),c.getEmail()
//                        });
//                    }
//
//                }
//                break;
//            default:
//                 for (Contacto c : ej2Menu.listaContactos) {
//                    if (c.getEmail().equals(box)) {
//                        modelo.addRow(new Object[]{
//                            c.getNombre(), c.getApellido(), c.getNumeroTelefonico(),c.getEmail()
//                        });
//                    }
//
//                }
//                break;
//        }

    }//GEN-LAST:event_jbuscarEKeyReleased

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        int filaSelecionada = tabla.getSelectedRow();

        if (filaSelecionada != -1) {
            String[] valores = new String[4];
            for (int i = 0; i < valores.length; i++) {
                valores[i] = (String) tabla.getValueAt(filaSelecionada, i);

            }
            Contacto contacto = new Contacto(valores[0], valores[1], valores[2], valores[3]);

            // JOptionPane.showMessageDialog(this,"Fila"+tabla.getSelectedRow()+"Columna"+tabla.getSelectedColumn(),"Aviso",JOptionPane.INFORMATION_MESSAGE);
            if (ej2Menu.listaContactos.contains(contacto)) {
                ej2Menu.listaContactos.remove(contacto);
                JOptionPane.showMessageDialog(this, "" + ej2Menu.listaContactos.size(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                modelo.removeRow(filaSelecionada);
            } else {
                JOptionPane.showMessageDialog(this, "No se puedo borrar el elemento", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_botonEliminarActionPerformed
    }


    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        // TODO add your handling code here:
        int fila=tabla.getSelectedRow();
        String nombre="";
        String apellido="";
        String numero="";
        String email="";
       boolean camposVacios=nombre.isEmpty()&& apellido.isEmpty() && numero.isEmpty() && email.isEmpty();
       boolean bandera=false;
        Pattern patron=Pattern.compile("\\d");
        Matcher macher=patron.matcher(numero);
        nombre=JOptionPane.showInputDialog(this,"Ingrese su nombre","");
        apellido=JOptionPane.showInputDialog(this,"Ingrese su apellido","");
        numero=JOptionPane.showInputDialog(this,"Ingrese su numero","");
        email=JOptionPane.showInputDialog(this,"Ingrese su email","");
        if(!camposVacios){
            
        }else{
            
        }
        
    }//GEN-LAST:event_botonEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jbuscarE;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
private void cargarColumnasTabla() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Numero");
        modelo.addColumn("Email");
        tabla.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = modelo.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);

        }
    }

    private Contacto obtenerValorFila() {
        int filaSelecionada = tabla.getSelectedRow();
        Contacto contacto = null;
        if (filaSelecionada != -1) {
            String[] valores = new String[4];
            for (int i = 0; i < valores.length; i++) {
                valores[i] = (String) tabla.getValueAt(filaSelecionada, i);
            }
            contacto = new Contacto(valores[0], valores[1], valores[2], valores[3]);
        }
        return contacto;
    }
    private void reemplazarFila(int fila,JTable tabla,Object[] nuevoDato){
        DefaultTableModel modeloTabla=(DefaultTableModel)tabla.getModel();
        modeloTabla.removeRow(fila);
        modeloTabla.insertRow(fila,nuevoDato);
        
    }
}