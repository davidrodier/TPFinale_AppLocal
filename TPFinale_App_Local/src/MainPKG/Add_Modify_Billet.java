/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPKG;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import oracle.jdbc.OracleDriver;
import javax.swing.DefaultListModel;
/**
 *
 * @author 201329288
 */
public class Add_Modify_Billet extends javax.swing.JFrame {

    Main_Screen main_Page = null;
    Connection conn = null;
    /**
     * Creates new form Add_Modify
     */
    public Add_Modify_Billet(Connection main_Conn, Main_Screen main, String template) {
        initComponents();
        main_Page = main;
        conn = main_Conn;
        
        jLabel1.setText("Billet-" + template);
        
        String sql = "SELECT * FROM CATEGORIES";
        ResultSet rst = null;
        Statement stm = null;
        
         try{
                stm = null;
                rst = null;
                sql = "SELECT * FROM REPRESENTATIONS";
                
                stm = conn.createStatement();
                rst = stm.executeQuery(sql);
               
                CBX_Rep.removeAllItems();
                while(rst.next())
                {
                    CBX_Rep.addItem(rst.getDate(3).toString() + "_" + rst.getInt(1));
                }
                stm.close();
                rst.close();
            }
            catch(SQLException sqe){
            }
                  try{
                stm = null;
                rst = null;
                sql = "SELECT * FROM SECTIONS";
                
                stm = conn.createStatement();
                rst = stm.executeQuery(sql);
               
                CBX_Sec.removeAllItems();
                while(rst.next())
                {
                    CBX_Sec.addItem(rst.getString(4) + "_" + rst.getInt(1));
                }
                stm.close();
                rst.close();
            }
            catch(SQLException sqe){
            }
        try{
            stm = conn.createStatement();
            rst = stm.executeQuery(sql);
            
            while(rst.next())
            {
                CBX_Catégorie.addItem(rst.getString("NOMCAT") + "-" + rst.getString("NUMCAT"));
            }
            
            stm.close();
            rst.close();
        }
        catch(SQLException except){          
        }
        try{
            DefaultListModel dlm = new DefaultListModel();
            sql = "SELECT NOMSPEC, NUMSPEC FROM SPECTACLES";
            stm = conn.createStatement();
            rst = stm.executeQuery(sql);
            
            while(rst.next())
            {
                dlm.addElement(rst.getString(1) + "-" + rst.getInt(2));
            }
            
            stm.close();
            rst.close();
            
            jList1.setModel(dlm);
        }
        catch(SQLException except){          
        }
        try{
            DefaultListModel dlm = new DefaultListModel();
            sql = "SELECT NOMSALLE, NUMSALLE FROM SALLES";
            stm = conn.createStatement();
            rst = stm.executeQuery(sql);
            
            while(rst.next())
            {
                dlm.addElement(rst.getString(1) + "-" + rst.getInt(2));
            }
            
            stm.close();
            rst.close();
            
            jList2.setModel(dlm);
        }
        catch(SQLException except){          
        }
                try{
            DefaultListModel dlm = new DefaultListModel();
            sql = "SELECT NOMSALLE, NUMSALLE FROM SALLES";
            stm = conn.createStatement();
            rst = stm.executeQuery(sql);
            
            while(rst.next())
            {
                dlm.addElement(rst.getString(1) + "-" + rst.getInt(2));
            }
            
            stm.close();
            rst.close();
            
            jList3.setModel(dlm);
        }
        catch(SQLException except){          
        }
        try{
            DefaultListModel dlm = new DefaultListModel();
            sql = "SELECT NUMBILLET, SPEC.NOMSPEC, REP.LADATE, SEC.NOMSEC FROM BILLETS B INNER JOIN REPRESENTATIONS REP ON B.NUMREP=REP.NUMREP INNER JOIN SPECTACLES SPEC ON REP.NUMSPEC=SPEC.NUMSPEC INNER JOIN SECTIONS SEC ON B.NUMSEC=SEC.NUMSEC";
            stm = conn.createStatement();
            rst = stm.executeQuery(sql);
            
            while(rst.next())
            {
                dlm.addElement("Billet pour " + rst.getString(2) + " pour la représentation de " + rst.getString(3) + " dans la section " + rst.getString(4) + "-" + rst.getInt(1));
            }
            
            stm.close();
            rst.close();
            
            List.setModel(dlm);
        }
        catch(SQLException except){          
        }
    }
    public Add_Modify_Billet() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        BTN_Cancel = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TXB_NomSpectacle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CBX_Catégorie = new javax.swing.JComboBox();
        BTN_Accept_Spec = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TXB_NbPlace = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXB_NomSection = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        BTN_Section = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TXB_Date = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList();
        CBX_Sec = new javax.swing.JComboBox();
        CBX_Rep = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TXB_NumBillet = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Page Title (Add/Modify)");

        BTN_Cancel.setText("Cancel");
        BTN_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CancelActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Spectacles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel5.setText("Nom :");

        jLabel7.setText("Catégorie :");

        BTN_Accept_Spec.setText("Accepter");
        BTN_Accept_Spec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Accept_SpecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXB_NomSpectacle)
                            .addComponent(CBX_Catégorie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTN_Accept_Spec)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXB_NomSpectacle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CBX_Catégorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_Accept_Spec)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sections", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setText("Nombre places :");

        jLabel3.setText("Nom section :");

        jLabel9.setText("Salles");

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList3);

        BTN_Section.setText("Accepter");
        BTN_Section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BTN_Section))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXB_NbPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(TXB_NomSection)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXB_NbPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXB_NomSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_Section))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Représentation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel4.setText("Date :");

        TXB_Date.setText("AAAA-MM-JJ");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel6.setText("Spectacles");

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        jLabel8.setText("Salles");

        jButton1.setText("Accepter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXB_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 74, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXB_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Interne", jPanel4);

        List.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(List);

        jLabel10.setText("Numero Billet :");

        jLabel11.setText("Représentation :");

        jLabel12.setText("Section :");

        TXB_NumBillet.setEnabled(false);

        jButton2.setText("Accepter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBX_Sec, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXB_NumBillet)
                                    .addComponent(CBX_Rep, 0, 127, Short.MAX_VALUE))))
                        .addGap(58, 416, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TXB_NumBillet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CBX_Rep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CBX_Sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        jTabbedPane1.addTab("Billet", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTN_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_Cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CancelActionPerformed
        this.setVisible(false);
        main_Page.setVisible(true);
    }//GEN-LAST:event_BTN_CancelActionPerformed

    private void BTN_Accept_SpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Accept_SpecActionPerformed
        if(jLabel1.getText().endsWith("Add"))
        {
            try{
                CallableStatement Callins = conn.prepareCall("{call AMINAPP.ADDSPECTACLES (?,?,?,?)}");

                Callins.setString(1, TXB_NomSpectacle.getText());
                Callins.setString(2, "");
                Callins.setInt(3, Integer.parseInt(String.valueOf(CBX_Catégorie.getSelectedItem().toString().charAt(CBX_Catégorie.getSelectedItem().toString().length()-1))));
                Callins.setString(4, "O");
                
                Callins.executeUpdate();
                Callins.clearParameters();
                Callins.close();
            }
            catch(SQLException ins)
            {
                System.out.println(ins.getMessage());
            }
        }
        else
        {
            try{
                CallableStatement Callins = conn.prepareCall("{call AMINAPP.UPDATESALLES (?,?,?)}");

                Callins.executeUpdate();
                Callins.clearParameters();
                Callins.close();
            }
            catch(SQLException ins)
            {
                System.out.println(ins.getMessage());
            }
        }
    }//GEN-LAST:event_BTN_Accept_SpecActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jLabel1.getText().endsWith("Add"))
        {
            try{
                CallableStatement Callins = conn.prepareCall("{call AMINAPP.ADDREPRESENTATIONS (?,?,?,?)}");

                Callins.setInt(1, Integer.parseInt(String.valueOf(jList2.getSelectedValue().toString().charAt(jList2.getSelectedValue().toString().length()-1))));
                Callins.setDate(2, Date.valueOf(TXB_Date.getText()));
                Callins.setInt(3, Integer.parseInt(String.valueOf(jList1.getSelectedValue().toString().charAt(jList1.getSelectedValue().toString().length()-1))));
                Callins.setString(4, "O");
                
                Callins.executeUpdate();
                Callins.clearParameters();
                Callins.close();
            }
            catch(SQLException ins)
            {
                System.out.println(ins.getMessage());
            }
        }
        else
        {
            try{
                CallableStatement Callins = conn.prepareCall("{call AMINAPP.UPDATESALLES (?,?,?)}");

                Callins.executeUpdate();
                Callins.clearParameters();
                Callins.close();
            }
            catch(SQLException ins)
            {
                System.out.println(ins.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTN_SectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SectionActionPerformed
                if(jLabel1.getText().endsWith("Add"))
        {
            try{
                CallableStatement Callins = conn.prepareCall("{call AMINAPP.ADDSECTIONS (?,?,?)}");

                Callins.setInt(1, Integer.parseInt(String.valueOf(jList3.getSelectedValue().toString().charAt(jList3.getSelectedValue().toString().length()-1))));
                Callins.setInt(2, Integer.parseInt(TXB_NbPlace.getText()));
                Callins.setString(3, TXB_NomSection.getText());
                
                Callins.executeUpdate();
                Callins.clearParameters();
                Callins.close();
            }
            catch(SQLException ins)
            {
                System.out.println(ins.getMessage());
            }
        }
        else
        {
            try{
                CallableStatement Callins = conn.prepareCall("{call AMINAPP.UPDATESALLES (?,?,?)}");

                Callins.executeUpdate();
                Callins.clearParameters();
                Callins.close();
            }
            catch(SQLException ins)
            {
                System.out.println(ins.getMessage());
            }
        }
    }//GEN-LAST:event_BTN_SectionActionPerformed

    private void ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMouseClicked
            if(jLabel1.getText().endsWith("Modify"))
            {
            try{
                Statement stm = null;
                Statement tempstm = null;
                ResultSet rst = null;
                ResultSet temp = null;
                String sql = "SELECT * FROM REPRESENTATIONS";
                String sql2 = "SELECT * FROM BILLETS WHERE NUMBILLET=" + List.getSelectedValue().toString().charAt(List.getSelectedValue().toString().length()-1);
                
                stm = conn.createStatement();
                rst = stm.executeQuery(sql);
                tempstm = conn.createStatement();
                temp = tempstm.executeQuery(sql2);
               
                temp.next();
                int i = 0;
                int j = 0;
                while(rst.next())
                {
                    if(temp.getInt(2) == rst.getInt(1))
                    {
                        i=j;
                    }
                    j++;
                }

                CBX_Rep.setSelectedIndex(i);
                stm.close();
                rst.close();
                temp.close();
                tempstm.close();
            }
            catch(SQLException sqe){
            }
                        try{
                Statement stm = null;
                Statement tempstm = null;
                ResultSet rst = null;
                ResultSet temp = null;
                String sql = "SELECT * FROM SECTIONS";
                String sql2 = "SELECT * FROM BILLETS WHERE NUMBILLET=" + List.getSelectedValue().toString().charAt(List.getSelectedValue().toString().length()-1);
                
                stm = conn.createStatement();
                rst = stm.executeQuery(sql);
                tempstm = conn.createStatement();
                temp = tempstm.executeQuery(sql2);
               
                temp.next();
                int i = 0;
                int j = 0;
                while(rst.next())
                {
                    if(temp.getInt(3) == rst.getInt(1))
                    {
                        i=j;
                    }
                    j++;
                }

                CBX_Sec.setSelectedIndex(i);
                stm.close();
                rst.close();
                temp.close();
                tempstm.close();
            }
            catch(SQLException sqe){
            }
            }
    }//GEN-LAST:event_ListMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jLabel1.getText().endsWith("Modify"))
        {
            try
            {
                CallableStatement Callins = conn.prepareCall("{call AMINAPP.UPDATEBILLET (?,?,?)}");
                Callins.setInt(1, Integer.parseInt(String.valueOf(List.getSelectedValue().toString().charAt(List.getSelectedValue().toString().length()-1))));
                Callins.setInt(2, Integer.parseInt(String.valueOf(CBX_Rep.getSelectedItem().toString().charAt(CBX_Rep.getSelectedItem().toString().length()-1))));
                Callins.setInt(3, Integer.parseInt(String.valueOf(CBX_Sec.getSelectedItem().toString().charAt(CBX_Sec.getSelectedItem().toString().length()-1))));

                Callins.executeUpdate();
                Callins.clearParameters();
                Callins.close();
            }
            catch(SQLException ins)
            {
                System.out.println(ins.getMessage());
            }
        }
        else
        {
            try
            {
                CallableStatement Callins = conn.prepareCall("{call AMINAPP.ADDBILLET (?,?)}");
                Callins.setInt(1, Integer.parseInt(String.valueOf(CBX_Rep.getSelectedItem().toString().charAt(CBX_Rep.getSelectedItem().toString().length()-1))));
                Callins.setInt(2, Integer.parseInt(String.valueOf(CBX_Sec.getSelectedItem().toString().charAt(CBX_Sec.getSelectedItem().toString().length()-1))));

                Callins.executeUpdate();
                Callins.clearParameters();
                Callins.close();
            }
            catch(SQLException ins)
            {
                System.out.println(ins.getMessage());
            } 
        }
                
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Modify_Billet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Modify_Billet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Modify_Billet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Modify_Billet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Modify_Billet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Accept_Spec;
    private javax.swing.JButton BTN_Cancel;
    private javax.swing.JButton BTN_Section;
    private javax.swing.JComboBox CBX_Catégorie;
    private javax.swing.JComboBox CBX_Rep;
    private javax.swing.JComboBox CBX_Sec;
    private javax.swing.JList List;
    private javax.swing.JTextField TXB_Date;
    private javax.swing.JTextField TXB_NbPlace;
    private javax.swing.JTextField TXB_NomSection;
    private javax.swing.JTextField TXB_NomSpectacle;
    private javax.swing.JTextField TXB_NumBillet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
