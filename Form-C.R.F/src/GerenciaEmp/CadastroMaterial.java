/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciaEmp;

import javax.swing.JOptionPane;
import static GerenciaEmp.MenuPrincipal.material;
import GerenciaEmp.Classes.Material;
import static GerenciaEmp.MenuPrincipal.material;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Toni
 */
public class CadastroMaterial extends javax.swing.JFrame {

    /**
     * Creates new form CadastroMaterial
     */
    Material m;
    public CadastroMaterial() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfMaterial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfQuant = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDesc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JB_Alterar = new javax.swing.JButton();
        JB_Excluir = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        RB_A = new javax.swing.JRadioButton();
        RB_Retira = new javax.swing.JRadioButton();
        TF_Acrecenta = new javax.swing.JTextField();
        TF_Retira = new javax.swing.JTextField();
        CB_Tipo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Cod:");

        tfCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodActionPerformed(evt);
            }
        });

        jLabel2.setText("Material:");

        tfMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaterialActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Descrição:");

        jLabel6.setText("Tipo:");

        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pesquisar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JB_Alterar.setText("Alterar");
        JB_Alterar.setEnabled(false);
        JB_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AlterarActionPerformed(evt);
            }
        });

        JB_Excluir.setText("Excluir");
        JB_Excluir.setEnabled(false);
        JB_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ExcluirActionPerformed(evt);
            }
        });

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Imprimir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alteração:"));

        buttonGroup1.add(RB_A);
        RB_A.setSelected(true);
        RB_A.setText("Acrescenta");
        RB_A.setEnabled(false);

        buttonGroup1.add(RB_Retira);
        RB_Retira.setText("Retira");
        RB_Retira.setEnabled(false);

        TF_Acrecenta.setEnabled(false);

        TF_Retira.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RB_A)
                    .addComponent(RB_Retira))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_Acrecenta)
                    .addComponent(TF_Retira, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_A)
                    .addComponent(TF_Acrecenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_Retira)
                    .addComponent(TF_Retira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        CB_Tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Caneta", "Lápis", "Resma de papel A4" }));

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Material", "Marca", "Quant"
            }
        ));
        jScrollPane2.setViewportView(Tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMaterial))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMarca)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDesc))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(85, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(CB_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tfQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(JB_Alterar)
                    .addComponent(JB_Excluir)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(tfCod.getText().isEmpty() || tfMaterial.getText().isEmpty() || tfMarca.getText().isEmpty() ||  tfQuant.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para cadastro de novo material.");
        }
        else{
            if(!existeMaterial2(Integer.parseInt(tfCod.getText())))
            {
            int cod = Integer.parseInt(tfCod.getText());
            String mat = tfMaterial.getText();
            String marca = tfMarca.getText();
            String tipo = CB_Tipo.getSelectedItem().toString();
            int quant = Integer.parseInt(tfQuant.getText());
            String desc = tfDesc.getText();
            m = new Material(cod, mat, tipo, marca, quant, desc);
            material.add(m); 
            }else
            {
                JOptionPane.showMessageDialog(null, "Codigo ja cadastrado!");
        }
            }
        limpar();
    }//GEN-LAST:event_jButton1ActionPerformed

       public Material existeMaterial  (int codigo)
    {
        for (Material   p : material)
        {
            if (p.getCod() == codigo)
                return p;
        }
        return null;
    }
        public boolean existeMaterial2 (int codigo)
    {
        for (Material   p : material)
        {
            if (p.getCod() == codigo)
                return true;
        }
        return false;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        
          if (tfCod.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Código deve estar preenchido!");
        else
         {
              m = existeMaterial(Integer.parseInt(tfCod.getText()));
              limpar();
              if(m!=null)
              {
                  tfCod.setText(m.getCod()+"");
                  tfMaterial.setText(m.getNome());
                  tfMarca.setText(m.getMarca());
                 CB_Tipo.setSelectedItem(m.getTipo());
                  tfDesc.setText(m.getDesc());
                    tfQuant.setText(m.getQuant()+"");
                  tfQuant.setEnabled(false);
                  
                   RB_A.setEnabled(true);
        
        TF_Acrecenta.setEnabled(true);
        RB_Retira.setEnabled(true);
        
        TF_Retira.setEnabled(true);
      
        JB_Excluir.setEnabled(true);
                JB_Alterar.setEnabled(true);
                
                 
                  
              }else
             JOptionPane.showMessageDialog(null, "Material não encontrado!");
         }
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaterialActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        limpar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void JB_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ExcluirActionPerformed
         material.remove(m);        
        limpar();
    }//GEN-LAST:event_JB_ExcluirActionPerformed

    private void JB_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AlterarActionPerformed
        
          if(tfCod.getText().isEmpty() || tfMaterial.getText().isEmpty() || tfMarca.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para Alterar os dados do material.");
        }
        else{
            int cod = Integer.parseInt(tfCod.getText());
            String mat = tfMaterial.getText();
            String marca = tfMarca.getText();
            String tipo = CB_Tipo.getSelectedItem().toString();
            if(RB_A.isSelected())
            {
                    if(!TF_Acrecenta.getText().isEmpty())
                m.acrescentaQuantidade(Integer.parseInt(TF_Acrecenta.getText()));
            }else
            {
                if(!TF_Retira.getText().isEmpty())
                 m.retiraQuantidade(Integer.parseInt(TF_Retira.getText()));
            }
            int quant=m.getQuant();
            String desc = tfDesc.getText();
            material.remove(m); 
            m = new Material(cod, mat, tipo, marca, quant, desc);
            material.add(m); 
        }
       
        
    }//GEN-LAST:event_JB_AlterarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     DefaultTableModel modelo = (DefaultTableModel)Tabela.getModel();
        String[] linha;
        modelo.setNumRows(0); //Limpa a tabela 

         for (Material p : material){
         
                   
                  
                linha = new String[]{p.getCod()+"",p.getNome(),p.getMarca(), p.getQuant()+""};
                
                modelo.addRow(linha);  
                }
            
    }//GEN-LAST:event_jButton6ActionPerformed

private void limpar() {
        
        tfCod.setText(null);
       tfMaterial.setText(null);
        tfMarca.setText(null);
        tfDesc.setText(null);
        CB_Tipo.setSelectedIndex(0);
        tfQuant.setText(null);
        RB_A.setEnabled(false);
        TF_Acrecenta.setText(null);
        TF_Acrecenta.setEnabled(false);
        RB_Retira.setEnabled(false);
        TF_Retira.setText(null);
        TF_Retira.setEnabled(false);
       
        JB_Excluir.setEnabled(false);
                JB_Alterar.setEnabled(false);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CB_Tipo;
    private javax.swing.JButton JB_Alterar;
    private javax.swing.JButton JB_Excluir;
    private javax.swing.JRadioButton RB_A;
    private javax.swing.JRadioButton RB_Retira;
    private javax.swing.JTextField TF_Acrecenta;
    private javax.swing.JTextField TF_Retira;
    private javax.swing.JTable Tabela;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField tfCod;
    private javax.swing.JTextField tfDesc;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfMaterial;
    private javax.swing.JTextField tfQuant;
    // End of variables declaration//GEN-END:variables
}