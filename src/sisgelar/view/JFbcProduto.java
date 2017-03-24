package sisgelar.view;


import sisgelar.controller.ProdutoClienteController;
import sisgelar.controller.Utilitarios;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import sisgelar.model.ProdutoCliente;


/**
 *
 * @author kaikealexsander
 */
public class JFbcProduto extends javax.swing.JFrame {

    //private OrigvwVendas v;
    private JFCadClientes v;
    private List<ProdutoCliente> produtos;
    
    private JFCadClientes Frame1;
    //private JFCadOS Frame2;
    
    /**
     * Creates new form Produto
     */
    public JFbcProduto() {
        this.v = v;
//        buscaInicial(b);
        this.setLocationRelativeTo(null);
        Utilitarios.setAcessibilidade(this.getRootPane(), this);
        initComponents();
        
        String b = "";
        buscaInicial(b);
    }

    public void enviaPalavra(JFCadClientes veiDo1, String nome){
        tfBusca.setText(nome);
        buscaInicial(tfBusca.getText());
        this.Frame1 =veiDo1;
    }
//    public void enviaPalavra(frmCadAluguel veiDo1, String nome){
//        tfBusca.setText(nome);
//        buscaInicial(tfBusca.getText());
//        this.Frame2 =veiDo1;
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        tfBusca = new javax.swing.JTextField();
        lbNome2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Pesquisar", jPanel5);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Estoque de Produtos");
        setName("Estoque de Produtos"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tabelaInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lbNome2.setText("Pesquise:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSelecionar)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tabelaInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaInputMethodTextChanged

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
           tabela.getSelectionModel().addListSelectionListener(tabela);
                if (tabela.getSelectedRow() >= 0) {
                    Object idProduto = tabela.getValueAt(tabela.getSelectedRow(), 0);
                    Object produto = tabela.getValueAt(tabela.getSelectedRow(), 1);
                    Object desc = tabela.getValueAt(tabela.getSelectedRow(), 2);
                    Object valor = tabela.getValueAt(tabela.getSelectedRow(), 3);
                    Object quantidade = tabela.getValueAt(tabela.getSelectedRow(), 4);
                    
                  //Object idproduto = tabela.getValueAt(tabela.getSelectedRow(), 0);
                    //tfAlteraCodigo.setText(idProduto.toString());
         //          Produto p = new Produto(0, produto, desc, valor, quantidade);      
                }               
    }//GEN-LAST:event_tabelaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String b = tfBusca.getText();
        buscaInicial(b);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        
       ProdutoCliente prod= produtos.get(tabela.getSelectedRow());
        //v.setPessoa(p);
  //      v.setPessoa(ps);
//                AtualizaDados();
        //dispose();
//        bcPessoas.this.dispose();
       
        if(Frame1 !=null){
            Frame1.setProduto(prod);
            //this.dispose();
        }
        this.dispose();
    }//GEN-LAST:event_btnSelecionarActionPerformed

    
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
            java.util.logging.Logger.getLogger(JFbcProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFbcProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFbcProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFbcProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new JFbcProduto().setVisible(true);
            }
        });
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lbNome2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tfBusca;
    // End of variables declaration//GEN-END:variables

     private void buscaInicial(String b){        
       
       DefaultTableModel busctab = new DefaultTableModel();
       String[] nomesColunas = new String[]{"ID","CLIENTE", "MARCA", "LOCAL", "MODELO", "VOLTAGEM"};
       busctab.setColumnIdentifiers(nomesColunas);
       busctab.setNumRows(0);
       
       produtos = ProdutoClienteController.pesquisar(b);
       
        for (ProdutoCliente p : produtos) {
			busctab.addRow(new Object[]{
                            p.getIdProdCliente(),
                            p.getIdCliente(),
                            p.getMarca(),
                            p.getLocalizacao(),
                            p.getModelo(),
                            p.getVoltagem()});
        }
        
        tabela.setModel(busctab);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(250);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(50);
        
        new Utilitarios().limparTodosCampos(rootPane);
        }         

    private void AtualizaDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }