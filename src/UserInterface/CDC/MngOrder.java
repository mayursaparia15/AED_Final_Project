/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.CDC;

import Business.EcoSystem;
import Business.NationalEnterprise.CDC;
import Business.Organization.CDCOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderVaccineOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akash
 */
public class MngOrder extends javax.swing.JPanel {

    private JPanel workContainer;
    private UserAccount userAccount;
    private EcoSystem business;
    private CDC cdcEnterprise;
    private CDCOrganization cdcOrg;
    
    
    public MngOrder(JPanel workContainer, UserAccount userAccount,EcoSystem business,CDC cdcEnterprise,CDCOrganization cdcOrg  ) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.cdcEnterprise = cdcEnterprise;
        this.cdcOrg = cdcOrg;
        populateTable();
     
    }
    
    private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) tblorder.getModel();
        model.setRowCount(0);
        
         CDCOrganization cOrg = null;
         
        for(Organization org : cdcEnterprise.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof CDCOrganization)
        {   cOrg = (CDCOrganization)org;
            for(WorkRequest workRequest : cOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof ProviderVaccineOrderWorkRequest)
            {ProviderVaccineOrderWorkRequest vaccineOrderWR = (ProviderVaccineOrderWorkRequest)workRequest;
                
                Object[] row = new Object[6];
            
                row[0] = vaccineOrderWR;
                row[1] = vaccineOrderWR.getEnterprise();
                row[2] = vaccineOrderWR.getreqState();
                row[3] = vaccineOrderWR.getSender();
                row[4] = vaccineOrderWR.getStatus();
                row[5] = vaccineOrderWR.getCdcApprovedBy();
                
                model.addRow(row);
            }
            }
        }
  
        
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblorder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Manage Vaccine Orders");

        btn1.setBackground(new java.awt.Color(0, 0, 102));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (2).png"))); // NOI18N
        btn1.setText("Refresh");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 102));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("View Details & Approve");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        tblorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Provider", "State", "Sender", "Status", "Approved By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorder.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblorder);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/approve4_50x50.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 464, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addGap(18, 18, 18)
                .addComponent(btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblorder.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Kindly select an Order from table first !");
            return;
        }

        ProviderVaccineOrderWorkRequest request = (ProviderVaccineOrderWorkRequest)tblorder.getValueAt(selectedRow, 0);

        AppOrder panel = new AppOrder(workContainer, userAccount, cdcEnterprise,cdcOrg, business, request);
        workContainer.add("ApproveOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JTable tblorder;
    // End of variables declaration//GEN-END:variables
}
