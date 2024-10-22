/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.Views;
import javax.swing.BorderFactory;
import application.Controllers.Conta;
import application.Controllers.ControllerEconomia;
import application.errors.*;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
/**
 * Classe responsavel por extrato do usuario 
 * @author Helder Lourenço
 * @version 1.0.0
 */
public class Extrato extends javax.swing.JFrame {
    private Conta conta;
    private ControllerEconomia poupar;
   /**
    * 
    * @param poupar recebe controllerEconomia
    * @param conta recebe Conta
    */
    public Extrato(ControllerEconomia poupar,Conta conta) {
        this.poupar = poupar;
        this.conta = conta;
        initComponents();
        this.atualizarListaConstrucao();
    }
    
    private DefaultListModel listModelFixas = new DefaultListModel();
    /**
     * Metodo responsavel por atualizar lista e componentes
     */
    public void atualizarListaConstrucao() {
        
        //List Fixas
        listModelFixas.removeAllElements();
        if(!this.conta.getExtrato().isEmpty()){
           List<String> ver = this.conta.getExtrato();
            for(int i = 0; i<conta.sizeExtrato(); ++i ){
             
               String qualquer = ver.get(i);
               
               if(!qualquer.isBlank()){
                    if(conta.verificaValor(i)){
                        setForeground(Color.RED);
                    }
                    else {
                        setForeground(Color.GREEN);
                    }
                   listModelFixas.addElement(qualquer);
               }
            }   
        }
        ListaVariaveis.setModel(listModelFixas);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNexus = new javax.swing.JButton();
        btnNexus.setBorder(BorderFactory.createEmptyBorder());
        btnNexus.setContentAreaFilled(false);
        btnNexus.setFocusPainted(false);
        scrollPane2 = new java.awt.ScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaVariaveis = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnNexus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/imagens/logoNexus.png"))); // NOI18N
        btnNexus.setBorder(null);
        btnNexus.setBorderPainted(false);
        btnNexus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNexusActionPerformed(evt);
            }
        });

        ListaVariaveis.setBackground(new java.awt.Color(51, 51, 51));
        ListaVariaveis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ListaVariaveis.setForeground(new java.awt.Color(51, 255, 0));
        ListaVariaveis.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaVariaveis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListaVariaveis.setSelectionBackground(new java.awt.Color(204, 0, 204));
        ListaVariaveis.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(ListaVariaveis);

        scrollPane2.add(jScrollPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btnNexus, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnNexus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
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
    /**
     * Metodo responsavel por retornar ao menu a partir da interaçao
     * @param evt 
     */
    private void btnNexusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNexusActionPerformed
        MainView teste = new MainView(this.poupar,this.conta);
        teste.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNexusActionPerformed

 
private javax.swing.JButton jButton1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaVariaveis;
    private javax.swing.JButton btnNexus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.ScrollPane scrollPane2;
    // End of variables declaration//GEN-END:variables
}
