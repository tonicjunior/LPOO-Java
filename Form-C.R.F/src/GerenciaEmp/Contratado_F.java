/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GerenciaEmp;

import GerenciaEmp.Classes.Contratado;
import GerenciaEmp.Classes.Funcionario;
import GerenciaEmp.Classes.Gerente;
import GerenciaEmp.Classes.Terceirizado;
import static GerenciaEmp.MenuPrincipal.funcionario;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toni C
 */
public class Contratado_F extends javax.swing.JFrame {

    /**
     * Creates new form Contratado
     */
    public Contratado_F() {
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
        jLabel6 = new javax.swing.JLabel();
        CB_A = new javax.swing.JComboBox();
        CB_D = new javax.swing.JComboBox();
        CB_M = new javax.swing.JComboBox();
        Data = new javax.swing.JRadioButton();
        Todos = new javax.swing.JRadioButton();
        CB_Tipo = new javax.swing.JComboBox();
        Tipo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel6.setText("Admissão:");

        CB_A.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2011", "2012", "2013", "2014", "2015" }));
        CB_A.setEnabled(false);

        CB_D.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        CB_D.setEnabled(false);
        CB_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DActionPerformed(evt);
            }
        });

        CB_M.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        CB_M.setEnabled(false);
        CB_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_MActionPerformed(evt);
            }
        });

        buttonGroup1.add(Data);
        Data.setText("Data de Admissão");
        Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataActionPerformed(evt);
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

        CB_Tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Graduado", "Especialista", "Mestre", "Doutor" }));
        CB_Tipo.setEnabled(false);
        CB_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_TipoActionPerformed(evt);
            }
        });

        buttonGroup1.add(Tipo);
        Tipo.setText("Tipo");
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Tipo", "Data de ADM"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Todos)
                        .addGap(18, 18, 18)
                        .addComponent(Data)
                        .addGap(18, 18, 18)
                        .addComponent(Tipo)
                        .addGap(18, 18, 18)
                        .addComponent(CB_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Todos)
                        .addComponent(Data)
                        .addComponent(Tipo))
                    .addComponent(CB_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CB_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CB_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_DActionPerformed

    private void CB_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_MActionPerformed

    private void TodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosActionPerformed
CB_Tipo.setEnabled(false);
    limpar();    
        
       
                  
        
        
        
        
        
       
    
        
        
    }//GEN-LAST:event_TodosActionPerformed

    private void CB_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_TipoActionPerformed

    private void DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataActionPerformed
       
       CB_Tipo.setEnabled(false);
              
        CB_A.setEnabled(true);        
        CB_M.setEnabled(true);
        CB_D.setEnabled(true);   
        
        
    }//GEN-LAST:event_DataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         DefaultTableModel modelo = (DefaultTableModel)Tabela.getModel();
        String[] linha;
        modelo.setNumRows(0); //Limpa a tabela
        String tipo="-",tipo2="-";
   String data;
if(Todos.isSelected())
{
    
    
    
       
          
            
        for (Funcionario p : funcionario){
            if (p instanceof Contratado)
                {   
                    if(((Contratado) p).getDataAdm()!=null)
                    {
                        tipo2=((Contratado) p).getDataAdm().get(Calendar.DAY_OF_MONTH)+"/"+
                               ((Contratado) p).getDataAdm().get(Calendar.MONTH)+"/"+
                               ((Contratado) p).getDataAdm().get(Calendar.YEAR) ;
                    }
                        if(p instanceof Gerente)
                        {
                                tipo="Gerente";
                        }
                  
                linha = new String[]{p.getCod()+"",p.getNome(),tipo, tipo2};
                
                modelo.addRow(linha);  
                }
            
            tipo="-";
            tipo2="-";
            }
}else
    
    if(Tipo.isSelected())
    {           
            
        for (Funcionario p : funcionario){
            if (p instanceof Gerente)
                {   
                    if(((Gerente)p).getTitulacao()==CB_Tipo.getSelectedItem().toString()){
                    
                    if(((Contratado) p).getDataAdm()!=null)
                    {
                        tipo2=((Contratado) p).getDataAdm().get(Calendar.DAY_OF_MONTH)+"/"+
                               ((Contratado) p).getDataAdm().get(Calendar.MONTH)+"/"+
                               ((Contratado) p).getDataAdm().get(Calendar.YEAR) ;
                    }
                       
                                tipo="Gerente";
                        
                  
                linha = new String[]{p.getCod()+"",p.getNome(),tipo, tipo2};
                
                modelo.addRow(linha);  
                }
            
            tipo="-";
            tipo2="-";
            }
        }
        
        
    }else
    {
           
        for (Funcionario p : funcionario){
            if (p instanceof Contratado)
                {   
                    if(((Contratado) p).getDataAdm()!=null)
                    {
                        data=CB_D.getSelectedItem().toString()+"/"+CB_M.getSelectedItem().toString()+"/"+
                                CB_A.getSelectedItem().toString();
                
                        
                    
                    tipo2=((Contratado) p).getDataAdm().get(Calendar.DAY_OF_MONTH)+"/"+
                               ((Contratado) p).getDataAdm().get(Calendar.MONTH)+"/"+
                               ((Contratado) p).getDataAdm().get(Calendar.YEAR) ;
                     
                         if(data.equals(tipo2)) {
                        if(p instanceof Gerente)
                        {
                                tipo="Gerente";
                        }
                  
                linha = new String[]{p.getCod()+"",p.getNome(),tipo, tipo2};
                
                modelo.addRow(linha);  
                }
            
            tipo="-";
            tipo2="-";
            }
    }
         }
    }



    }//GEN-LAST:event_jButton1ActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
       CB_Tipo.setEnabled(true);
        limpar();
    }//GEN-LAST:event_TipoActionPerformed

    public void limpar(){
       
       
        CB_A.setEnabled(false);        
        CB_M.setEnabled(false);
        CB_D.setEnabled(false);
       
        
    }
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CB_A;
    private javax.swing.JComboBox CB_D;
    private javax.swing.JComboBox CB_M;
    private javax.swing.JComboBox CB_Tipo;
    private javax.swing.JRadioButton Data;
    private javax.swing.JTable Tabela;
    private javax.swing.JRadioButton Tipo;
    private javax.swing.JRadioButton Todos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
