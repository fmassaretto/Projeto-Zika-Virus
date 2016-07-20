/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import com.mysql.jdbc.PreparedStatement;
import dbconnector.DBconnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabio
 */
public class BuscarPaciente extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel(0, 0);
    private final String colunas[] = new String[]{
        "ID", "Numero Caso", "Nome Completo", "CPF", "Data de Entrada", "Resultado 1ª Amotra", "Resultado 2ª Amotra", "Resultado 3ª Amotra", "Resultado 4ª Amotra", "Resultado Final Mãe", "Resultado Final RN", "Data 1ª Coleta", "Data 2ª Coleta", "Data 3ª Coleta", "Data 4ª Coleta", "Data 5ª Coleta"
    };

    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private Statement statement = null;
    private String selectedID = null;
    private String selectedNome = null;
    private String selectedCPF = null;
    DBconnector conexao = new DBconnector();

    public String getSelectedID() {
        return selectedID;
    }

    public String getSelectedNome() {
        return selectedNome;
    }

    public String getSelectedCPF() {
        return selectedCPF;
    }

    /**
     * Creates new form buscarPaciente
     */
    public BuscarPaciente() {
        initComponents();
//        tbl.setModel(dtm);
//        tbl.setModel(new javax.swing.table.DefaultTableModel(
//                new Object [][] {
//
//                }, 
//                new String [] {
//                "ID", "Numero Caso", "Nome Completo", "CPF", "Data de Entrada", "Resultado 1ª Amotra", "Resultado 2ª Amotra", "Resultado 3ª Amotra", "Resultado 4ª Amotra", "Resultado Final Mãe", "Resultado Final RN", "Data 1ª Coleta", "Data 2ª Coleta", "Data 3ª Coleta", "Data 4ª Coleta", "Data 5ª Coleta"
//                }
//        ));
//        tbl.paintImmediately(0, 0, 200, 300);
//        tbl.setRowHeight(0, 2);

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
        tbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtProcura = new org.jdesktop.swingx.JXSearchField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Paciente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        tbl.setAutoCreateRowSorter(true);
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Numero Caso", "Nome Completo", "CPF", "Data Entrada", "Resultado 1ª Amotra", "Resultado 2ª Amotra", "Resultado 3ª Amotra", "Resultado 4ª Amotra", "Resultado Final Mãe", "Resultado Final RN", "Data 1ª Coleta", "Data 2ª Coleta", "Data 3ª Coleta", "Data 4ª Coleta", "Data 5ª Coleta"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        jButton1.setText("Editar Paciente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtProcura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcuraActionPerformed(evt);
            }
        });
        txtProcura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProcuraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtProcura, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(157, 157, 157))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtProcura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultQuery() throws SQLException{
        //resultado da tabela pacientes
        String id = resultSet.getString("ID_Paciente");
        String nrCaso = resultSet.getString("NumeroCaso");
        String nomeComp = resultSet.getString("NomeCompleto");
        String cpf = resultSet.getString("CPF");
        String dataEntrada = resultSet.getString("DataEntrada");
        
        //resultado da tabela resultados
        String resultadoA1 = resultSet.getString("ResultadoAmostra1");
        String resultadoA2 = resultSet.getString("ResultadoAmostra2");
        String resultadoA3 = resultSet.getString("ResultadoAmostra3");
        String resultadoA4 = resultSet.getString("ResultadoAmostra4");
        String resultadoFM = resultSet.getString("ResultadoFinalMAE");
        String resultadoRN = resultSet.getString("ResultadoFinalRN");
        
        //resultado da tabela coletas
        String coleta1 = resultSet.getString("DataPrimeiraC");
        String coleta2 = resultSet.getString("DataSegundaC");
        String coleta3 = resultSet.getString("DataTerceiraC");
        String coleta4 = resultSet.getString("DataQuartaC");
        String coleta5 = resultSet.getString("DataQuintaC");
        

        dtm.addRow(new Object[]{id, nrCaso, nomeComp, cpf, dataEntrada, resultadoA1, resultadoA2, resultadoA3, resultadoA4, resultadoFM, resultadoRN, coleta1, coleta2, coleta3, coleta4, coleta5});
    }
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {

//                    System.out.println("-------- MySQL JDBC Connection Testing ------------");
//
//                try {
//                        Class.forName("com.mysql.jdbc.Driver");
//                } catch (ClassNotFoundException e) {
//                        System.out.println("Where is your MySQL JDBC Driver?");
//                        e.printStackTrace();
//                        return;
//                }
//
//                System.out.println("MySQL JDBC Driver Registered!");
//                Connection connection = null;
//                
//
//                try {
//                        connection = DriverManager
//                        .getConnection("jdbc:mysql://localhost:3306/projetozikadb","root", "lmi56n");
//
//                } catch (SQLException e) {
//                        System.out.println("Connection Failed! Check output console");
//                        e.printStackTrace();
//                        return;
//                }
//
//                if (connection != null) {
//                        System.out.println("You made it, take control your database now!");
//                } else {
//                        System.out.println("Failed to make connection!");
//                }
            conexao.conexao();
            statement = conexao.connection.createStatement();
//            preparedStatement = (PreparedStatement) conexao.connection.prepareStatement("SELECT * from pacientes");
            preparedStatement = (PreparedStatement) conexao.connection.prepareStatement("SELECT * FROM pacientes p INNER JOIN resultados r ON r.ID_Paciente = p.ID_Paciente INNER JOIN coletas c ON c.ID_Paciente = p.ID_Paciente");
            resultSet = preparedStatement.executeQuery();
            dtm.setColumnIdentifiers(colunas);
            tbl.setModel(dtm);

            while (resultSet.next()) {
                resultQuery();
            }
            conexao.connection.close();
            //            
            //            stmt = connection.createStatement();
            //            rs = stmt.executeQuery("INSERT INTO pacientes ");
            //
            //            // or alternatively, if you don't know ahead of time that
            //            // the query will be a SELECT...
            //
            //            if (stmt.execute("SELECT foo FROM bar")) {
            //                rs = stmt.getResultSet();
            //            }

            // Now do something with the ResultSet ....
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (tbl.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um paciente para editar");
        } else {

            int[] selectedRow = tbl.getSelectedRows();

            for (int i = 0; i < selectedRow.length; i++) {

                selectedID = (String) tbl.getValueAt(selectedRow[i], 0);
                selectedNome = (String) tbl.getValueAt(selectedRow[i], 2);
                selectedCPF = (String) tbl.getValueAt(selectedRow[i], 3);
            }
            System.out.println("Selected: " + selectedID);
            System.out.println("Selected: " + selectedNome);
            System.out.println("Selected: " + selectedCPF);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtProcuraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProcuraKeyPressed
        txtProcura.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                try {
                    procurar();
                } catch (SQLException ex) {
                    Logger.getLogger(BuscarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            public void removeUpdate(DocumentEvent e) {
                try {
                    procurar();
                } catch (SQLException ex) {
                    Logger.getLogger(BuscarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            public void insertUpdate(DocumentEvent e) {
                try {
                    procurar();
                } catch (SQLException ex) {
                    Logger.getLogger(BuscarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            public void procurar() throws SQLException {
                // fire the execute statement.
                conexao.conexao();

//                String sql = "SELECT * FROM pacientes p INNER JOIN resultados r ON r.ID_Paciente = p.ID_Paciente WHERE NumeroCaso LIKE '%" + txtProcura.getText()
//                        + "%' or NomeCompleto LIKE '%" + txtProcura.getText() + "%' or CPF LIKE '%" + txtProcura.getText() + "%'";
                String sql = "SELECT * FROM pacientes p INNER JOIN resultados r ON r.ID_Paciente = p.ID_Paciente INNER JOIN coletas c ON c.ID_Paciente = p.ID_Paciente WHERE NumeroCaso LIKE '%" + txtProcura.getText()
                        + "%' or NomeCompleto LIKE '%" + txtProcura.getText() + "%' or CPF LIKE '%" + txtProcura.getText() + "%'";
                statement = conexao.connection.createStatement();
                preparedStatement = (PreparedStatement) conexao.connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();

                dtm.setRowCount(0);

                while (resultSet.next()) {
                    resultQuery();
                }
                tbl.setModel(dtm);
                conexao.connection.close();
            }
        });
    }//GEN-LAST:event_txtProcuraKeyPressed


    private void txtProcuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcuraActionPerformed

    }//GEN-LAST:event_txtProcuraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private org.jdesktop.swingx.JXSearchField txtProcura;
    // End of variables declaration//GEN-END:variables
}
