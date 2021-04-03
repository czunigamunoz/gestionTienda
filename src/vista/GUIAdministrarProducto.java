/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.ControlProductos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
/**
 *
 * @author valen
 */
public class GUIAdministrarProducto extends javax.swing.JFrame {
    private final ControlProductos control;
    private Object[][] data;
    private final String columnas[] = {"Codigo","Nombre","Precio","Cantidad","Descripcion"};
    private DefaultTableModel dtm;
    private Producto producto;
    private int codigo;
    private double precio;
    private int cantidad;
    private String nombre;
    private String descripcion;

    /**
     * Creates new form GUIAgregarProducto
     * 
     */
    public GUIAdministrarProducto() {
        control = new ControlProductos();
        data = control.mostrarProducto();
        dtm = new DefaultTableModel(data, columnas);
        
        initComponents();
        TablaProductosA.setModel(dtm);
        TablaProductosA.repaint();
        
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        btAgregarP = new javax.swing.JButton();
        btnModificarP = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtCod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtPrecio = new javax.swing.JTextField();
        TxtDescp = new javax.swing.JTextField();
        TxtNom = new javax.swing.JTextField();
        TxtCant = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductosA = new javax.swing.JTable();
        BtnRegresar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 65, 81));

        btAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas_opt.png"))); // NOI18N
        btAgregarP.setText("AGREGAR");
        btAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarPActionPerformed(evt);
            }
        });

        btnModificarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnModificarP.setText("MODIFICAR");
        btnModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPActionPerformed(evt);
            }
        });

        btnEliminarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basura_opt.png"))); // NOI18N
        btnEliminarP.setText("ELIMINAR");
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCTOS");

        btnBuscarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarP.setText("BUSCAR");
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DESCRIPCION:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CANTIDAD:");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRECIO:");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CODIGO:");

        TablaProductosA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        TablaProductosA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductosA);

        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(208, 208, 208)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarP)
                            .addComponent(btAgregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnRegresar))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(TxtCod, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtPrecio))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarP)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDescp, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarP)
                    .addComponent(TxtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDescp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btAgregarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarP)
                        .addGap(18, 18, 18)
                        .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        // TODO add your handling code here:
        int codProducto = esNumeroINT(TxtCod.getText());
        if(codProducto != -1){
           producto = control.buscarProductoA((codProducto));
           if(producto != null){
                TxtCod.setText(String.valueOf(producto.getCodigo()));
                TxtNom.setText(producto.getNombre());
                TxtPrecio.setText(String.valueOf(producto.getPrecio()));
                TxtDescp.setText(producto.getDescripcion());
                TxtCant.setText(String.valueOf(producto.getCantidad()));        
            }else{
                JOptionPane.showMessageDialog(this, "No se encontro algun producto con ese numero de codigo");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar solo numeros");
        }
        
    }//GEN-LAST:event_btnBuscarPActionPerformed

    private void btAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarPActionPerformed
        // TODO add your handling code here: 
        ObtenerDatos();
        if (codigo != -1 && precio != -1 && cantidad != -1 && TxtCod.getText().length()<=8){
            producto=control.buscarProductoA(codigo);
            if(producto==null){
            producto = new Producto(codigo, nombre, precio,cantidad,descripcion );
            boolean agregar = control.agregarProducto(producto);
            if(agregar){
                JOptionPane.showMessageDialog(this, "AGREGADO CORRECTAMENTE");
                mostrarProductos();
                limpiarCampos();
            }else{ 
                JOptionPane.showMessageDialog(this, "ERROR");
            }    
         }else {
            JOptionPane.showMessageDialog(this, "ERROR CODIGO EXISTENTE");      
        }
        }else {JOptionPane.showMessageDialog(this, "CODIGO,PRECIO,CANTIDAD DEBEN SER ENTEROS POSITIVOS - CODIGO<=8 CARACTERES");}
    }//GEN-LAST:event_btAgregarPActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        // TODO add your handling code here:
        GUIPrincipal regresar = new GUIPrincipal();
        regresar.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void TablaProductosAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosAMouseClicked
        // TODO add your handling code here:
        int select = TablaProductosA.rowAtPoint(evt.getPoint());
        TxtCod.setText(String.valueOf(TablaProductosA.getValueAt(select, 0)));
        TxtNom.setText(String.valueOf(TablaProductosA.getValueAt(select, 1)));
        TxtPrecio.setText(String.valueOf(TablaProductosA.getValueAt(select, 2)));
        TxtDescp.setText(String.valueOf(TablaProductosA.getValueAt(select, 3)));
        TxtCant.setText(String.valueOf(TablaProductosA.getValueAt(select, 4)));      
    }//GEN-LAST:event_TablaProductosAMouseClicked

    private void btnModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPActionPerformed
        // TODO add your handling code here:
         ObtenerDatos();
         if(codigo != -1 && precio != -1 && cantidad != -1 && TxtCod.getText().length()<=8 ){
             if(producto != null){
               producto = control.buscarProductoA((codigo));              
                producto.setNombre(nombre);
                producto.setPrecio(precio);
                producto.setDescripcion(descripcion);
                producto.setCantidad(cantidad);
       
                mostrarProductos();
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "PRODUCTO EDITADO CORRECTAMENTE");
             }else {JOptionPane.showMessageDialog(this, "NO SE ENCUENTRA EL PRODUCTO");
             }
        }else {JOptionPane.showMessageDialog(this, "CODIGO,PRECIO,CANTIDAD DEBEN SER ENTEROS POSITIVOS");}      
    }//GEN-LAST:event_btnModificarPActionPerformed

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
        // TODO add your handling code here:
        ObtenerDatos();
        if(codigo!=-1){
            producto=control.buscarProductoA(codigo);
            if(producto!=null){
                boolean eliminar = control.eliminarProductoA(codigo);
                if(eliminar){
                    JOptionPane.showMessageDialog(this, "ELIMINADO CORRECTAMENTE");
                    mostrarProductos();
                    limpiarCampos();
                }else{
                    JOptionPane.showMessageDialog(this, "NO SE PUDO ELIMINAR");
                }
            }else {
               JOptionPane.showMessageDialog(this, "NO SE ENCUENTRA EL PRODUCTO REGISTRADO");
            }
        }else {
            JOptionPane.showMessageDialog(this, "CODIGO INVALIDO");
        }
        
            
    }//GEN-LAST:event_btnEliminarPActionPerformed
    private void mostrarProductos(){
        data = control.mostrarProducto();
        dtm = new DefaultTableModel(data, columnas);
        TablaProductosA.setModel(dtm);
        TablaProductosA.repaint();
    }
   private void mostrarProductos(Producto producto){
        data = control.mostrarProducto(producto);
        dtm = new DefaultTableModel(data, columnas);
        TablaProductosA.setModel(dtm);
        TablaProductosA.repaint();
    }
   
   private int esNumeroINT(String entrada){
        int numero;
        try{
            numero = Integer.parseInt(entrada);
            return numero;
        }catch(NumberFormatException nfe){
            return -1;
        }
    }  
   private double esNumeroDouble(String entrada){
       double numero;
       try {
           numero = Double.parseDouble(entrada);
           return numero;
       }catch(NumberFormatException nfe){
            return -1;
       }
   }
   
   private void ObtenerDatos(){
        codigo = esNumeroINT(TxtCod.getText());
        nombre = TxtNom.getText();
        precio= esNumeroDouble(TxtPrecio.getText());
        descripcion = TxtDescp.getText();
        cantidad = esNumeroINT(TxtCant.getText());
         
   }
   
   private void limpiarCampos(){
       TxtCod.setText("");
       TxtNom.setText("");
       TxtPrecio.setText("");
       TxtDescp.setText("");
       TxtCant.setText("");
      
   }
     
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
            java.util.logging.Logger.getLogger(GUIAdministrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAdministrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAdministrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAdministrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GUIAgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JTable TablaProductosA;
    private javax.swing.JTextField TxtCant;
    private javax.swing.JTextField TxtCod;
    private javax.swing.JTextField TxtDescp;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JButton btAgregarP;
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
