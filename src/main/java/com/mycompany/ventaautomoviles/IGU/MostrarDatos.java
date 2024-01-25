
package com.mycompany.ventaautomoviles.IGU;

import com.mycompany.ventaautomoviles.logica.Atomovil;
import com.mycompany.ventaautomoviles.logica.ControladorLogica;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MostrarDatos extends javax.swing.JFrame {

    ControladorLogica controlLogica = new ControladorLogica();
    
    public MostrarDatos() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        btnEditarDatos = new javax.swing.JButton();
        btnBorrarDatos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Datos Vehiculos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVehiculos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnEditarDatos.setIcon(new javax.swing.ImageIcon("C:\\Users\\hanns\\Downloads\\editar (1).png")); // NOI18N
        btnEditarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDatosActionPerformed(evt);
            }
        });

        btnBorrarDatos.setIcon(new javax.swing.ImageIcon("C:\\Users\\hanns\\Downloads\\boton-eliminar.png")); // NOI18N
        btnBorrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDatosActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnBorrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //Se crea una funcion para cargar la tabla de bd
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnBorrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDatosActionPerformed
        
        //Confirmar que la tabla tenga datos
        if (tblVehiculos.getRowCount() > 0) { //obtiene la cantidad de filas
            //Confirmanos que haya seleccopmado alguna fila
            if (tblVehiculos.getSelectedRow() != -1) {
                // Seleccionado el id de la fila, esta en la posicion 0
                int valor_id = Integer.parseInt(String.valueOf(tblVehiculos.getValueAt(tblVehiculos.getSelectedRow(),0)));
                
                controlLogica.borrarVehiculo(valor_id);
                
                mostrarMensaje("Elemento eliminado", "Info", " Eliminacion correcta");
            } else {
                mostrarMensaje(" Error al realizar la eliminacion, no se selecciono fila", "Error", "Erro Eliminar");
            }
        } else {
            mostrarMensaje("Error no hay filas para eliminar", "Error", "Error al eliminar");
        }
        cargarTabla(); //se actualiza la tabla
    }//GEN-LAST:event_btnBorrarDatosActionPerformed

    private void btnEditarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDatosActionPerformed
        //Validar si hay elementos en la tabla
        if (tblVehiculos.getRowCount() > 0) {
            //Validar si seleciono una fila
            if (tblVehiculos.getSelectedRow() != -1) {
                //tomamos el Id de la tabla, para que cargen los datos del vehiculo
                int valor_id = Integer.parseInt(String.valueOf(tblVehiculos.getValueAt(tblVehiculos.getSelectedRow(),0)));
                
                ModificarDatos pantalla = new ModificarDatos(valor_id);
                pantalla.setVisible(true);
                pantalla.setLocationRelativeTo(null);
                this.dispose(); //Cerramos la pagina actual
            }
        }
    }//GEN-LAST:event_btnEditarDatosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void mostrarMensaje(String mensaje,String tipo, String encabezado){
        JOptionPane option = new JOptionPane(mensaje);
        if (tipo.equalsIgnoreCase("Info")) {
            option.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equalsIgnoreCase("Error")) {
            option.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = option.createDialog(encabezado);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarDatos;
    private javax.swing.JButton btnEditarDatos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVehiculos;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
        //Definimos el modelo de la tabla
        DefaultTableModel modelTabla = new DefaultTableModel(){
            //Se establece que no se puede modificar datos en la tabla
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        //se asigna un vector para el encabezao de la tabla
        String encabezadoTabla[] = {"Id","Nodelo","Marca","Motor","Color","Placa","Can_Puertas"};
        modelTabla.setColumnIdentifiers(encabezadoTabla);
        
        //creamo una lista, para almacenar los datos que se traen de la base de datos
        List<Atomovil> listaVehiculos = controlLogica.traerVehiculos();
        
        //Debemos recorrer la lista, para acceder a cada uno de los datos
        if (listaVehiculos != null) {
            for (Atomovil listaVehiculo : listaVehiculos) {
                Object[] objeto = {listaVehiculo.getId_automovil(),listaVehiculo.getModelo(),
                                    listaVehiculo.getMarca(),listaVehiculo.getMotor(),listaVehiculo.getColor(),listaVehiculo.getPlaca(),
                                    listaVehiculo.getCantidad_puertas()};
                //Añadimos eñ objeto al modelo de la tabla
                modelTabla.addRow(objeto);
            }
        }
        
        //Se envia el modelo de la tabla a la tabla en el Jframe
        tblVehiculos.setModel(modelTabla);
            
        
        
    
    }
}
