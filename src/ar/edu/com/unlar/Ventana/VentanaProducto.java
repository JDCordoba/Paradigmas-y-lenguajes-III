/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.com.unlar.Ventana;

import ar.edu.com.unlar.Controlador.ControladorCategoria;
import ar.edu.com.unlar.Controlador.ControladorDetalle;
import ar.edu.com.unlar.Controlador.ControladorFactura;
import ar.edu.com.unlar.Controlador.ControladorProducto;
import ar.edu.com.unlar.Grillas.GrillaProducto;
import ar.edu.com.unlar.Objetos.Categoria;
import ar.edu.com.unlar.Objetos.Producto;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabry
 */
public class VentanaProducto extends javax.swing.JInternalFrame {
    
    private ControladorProducto cp = new ControladorProducto();
    private ControladorFactura cf = new ControladorFactura();
    ArrayList<Categoria> alcateg = new ArrayList<>();
    private ArrayList<Categoria> categoria = new ArrayList<>();
    private ControladorDetalle cd = new ControladorDetalle();
    private Integer rowSelect = null;
    private Producto objProducto = new Producto();


    /**
     * Creates new form VentanaProducto
     */
    public VentanaProducto() {
        initComponents();
        grilla();
        
        ComboCategoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jtCodigo = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcCategoria = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaProducto = new javax.swing.JTable();
        jBGuardar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Codigo");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Precio");

        jLabel4.setText("Categoria");

        jcCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jtTablaProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtTablaProducto);

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jtCodigo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbeliminar)
                            .addComponent(jBGuardar))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jbeliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        
        Producto produc = new Producto();
        
        produc.setCodigo(jtCodigo.getText());
        produc.setPrecio(Integer.parseInt(jtPrecio.getText()));
        produc.setDescripcion(jtDescripcion.getText());
        produc.setCategoria((Categoria)jcCategoria.getSelectedItem());
        
        cp.Guardar(produc);
        grilla();
        
        
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        // TODO add your handling code here:
        
        if(rowSelect != null){
            
            
            cd.Eliminar(rowSelect);
            cp.Eliminar(rowSelect);
            JOptionPane.showMessageDialog(rootPane, "Se elimino correctamente");
            grilla();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Seleccioné un cliente");
        }
        
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jtTablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaProductoMouseClicked
        // TODO add your handling code here:
        
        
        rowSelect = (Integer) jtTablaProducto.getValueAt(jtTablaProducto.getSelectedRow(), 4); 
        
        
        
    }//GEN-LAST:event_jtTablaProductoMouseClicked


     private void grilla(){
    
         GrillaProducto gp;
        gp = new GrillaProducto(cp.MostrarTodo());
        jtTablaProducto.setModel(gp);
    
    }
     
     
       private void ComboCategoria(){
           ControladorCategoria cc = new ControladorCategoria();
        ArrayList<Categoria> alCate = new ArrayList<>();
        
        alCate = cc.MostrarTodo();
       
        Categoria[] obj= new Categoria[alCate.size()];
        for (int i = 0; i < alCate.size(); i++) {
            obj[i]= alCate.get(i);
          
        }
        DefaultComboBoxModel<Categoria> boxModel= new DefaultComboBoxModel<>(obj);
        jcCategoria.setModel(boxModel);
        jcCategoria.setSelectedItem(null);
        
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JComboBox jcCategoria;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTable jtTablaProducto;
    // End of variables declaration//GEN-END:variables
}
