/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GerenciaEmp;

import GerenciaEmp.Classes.Material;
import static GerenciaEmp.MenuPrincipal.material;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toni C
 */
public class RelatorioMaterial extends javax.swing.JFrame {

    /**
     * Creates new form Material
     */
    public RelatorioMaterial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Marca = new javax.swing.JRadioButton();
        CB_Tipo = new javax.swing.JComboBox();
        Todos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Tipo = new javax.swing.JRadioButton();
        TF_Marca = new javax.swing.JTextField();

        buttonGroup1.add(Marca);
        Marca.setText("Marca");
        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });

        CB_Tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Caneta", "Lápis", "Resma de papel A4" }));
        CB_Tipo.setEnabled(false);
        CB_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_TipoActionPerformed(evt);
            }
        });

        buttonGroup1.add(Todos);
        Todos.setSelected(true);
        Todos.setText("Todos");
        Todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Material", "Marca", "Quant"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Tipo);
        Tipo.setText("Tipo");
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        TF_Marca.setText(" ");
        TF_Marca.setEnabled(false);
        TF_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_MarcaActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Todos)
                            .addComponent(Tipo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Marca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CB_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Todos)
                    .addComponent(Marca)
                    .addComponent(TF_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(CB_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tipo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CB_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_TipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         DefaultTableModel modelo = (DefaultTableModel)Tabela.getModel();
        String[] linha;
        modelo.setNumRows(0); //Limpa a tabela
        
  
if(Todos.isSelected())
{
                   
        for (Material p : material){
         
                   
                  
                linha = new String[]{p.getCod()+"",p.getNome(),p.getMarca(), p.getQuant()+""};
                
                modelo.addRow(linha);  
                }
            
           
            
}else
    
    if(Marca.isSelected())
    {           
            
         for (Material p : material){
            if (p.getMarca().equalsIgnoreCase(TF_Marca.getText()))
                {   
                        
                  
               linha = new String[]{p.getCod()+"",p.getNome(),p.getMarca(), p.getQuant()+""};
                
                modelo.addRow(linha);  
                }
            
           
         }
        
    }else
    {
           
         for (Material p : material){
            if (p.getTipo().equalsIgnoreCase(CB_Tipo.getSelectedItem().toString()))
                {   
                   
                  
                   
               linha = new String[]{p.getCod()+"",p.getNome(),p.getMarca(), p.getQuant()+""};
                
                modelo.addRow(linha);  
                }
            
       
            }
    
         }
    

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        TF_Marca.setEnabled(true);
        TF_Marca.setText(null);
        CB_Tipo.setEnabled(false);
    }//GEN-LAST:event_MarcaActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        TF_Marca.setEnabled(false);
        CB_Tipo.setEnabled(true);
    }//GEN-LAST:event_TipoActionPerformed

    private void TodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosActionPerformed
      TF_Marca.setEnabled(false);
        CB_Tipo.setEnabled(false);
    }//GEN-LAST:event_TodosActionPerformed

    private void TF_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_MarcaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CB_Tipo;
    private javax.swing.JRadioButton Marca;
    private javax.swing.JTextField TF_Marca;
    private javax.swing.JTable Tabela;
    private javax.swing.JRadioButton Tipo;
    private javax.swing.JRadioButton Todos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}