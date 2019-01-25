/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaceCustomer;

import Business.Customer;
import Business.Flight;
import Business.Seats;
import UserInterfaceAirliner.ManageAirliner;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Ami Gandhi
 */
public class BookingDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookingDetailsJPanel
     */
    private JPanel rightPanel;
    private Flight f;
    private Customer customer;
    
    public BookingDetailsJPanel(JPanel rightPanel, Flight f) {
        initComponents();
        this.rightPanel = rightPanel;
        this.f = f;
        populateData();
        groupGender();
        
        for(int i = 0; i<9; i++)
        {
       
          if(f.getSeats().getSeatMap().get(i)!=null)
          {
            if(f.getSeats().getSeatMap().get(i).equals(seatComboBox.getItemAt(i).toString()))
            {    
                seatComboBox.removeItemAt(i);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Booking full!! No more seats available. Please select another flight !!");
                txtCustomerName.setEnabled(false);
                txtAreaAddr.setEnabled(false);
                btnBookFlight.setEnabled(false);
                seatComboBox.removeAllItems();
                seatComboBox.setEnabled(false);
                rBtnMale.setEnabled(false);
                rBtnFemale.setEnabled(false);
            }
          }
       
       }
    }


    public void populateData()
    {
        txtFlightNo.setText(String.valueOf(f.getFlightNumber()));
        txtAirline.setText(f.getFlightName());
        txtSource.setText(f.getFlightSource());
        txtDestination.setText(f.getFlightDestination());
        txtCost.setText(String.valueOf(f.getFlightPrice()));
        
    }
    
    
    public void groupGender()
    {
        ButtonGroup bgg = new ButtonGroup();
        bgg.add(rBtnMale);
        bgg.add(rBtnFemale);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnBookFlight = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtFlightNo = new javax.swing.JTextField();
        txtAirline = new javax.swing.JTextField();
        txtSource = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rBtnFemale = new javax.swing.JRadioButton();
        rBtnMale = new javax.swing.JRadioButton();
        seatComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAddr = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FLIGHT BOOKING SYSTEM");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Flight Number:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Airline:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Source:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Destination:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("*Name:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Seat Number:");

        btnBookFlight.setText("Book Flight");
        btnBookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Cost:");

        txtFlightNo.setEnabled(false);

        txtAirline.setEnabled(false);

        txtSource.setEnabled(false);
        txtSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSourceActionPerformed(evt);
            }
        });

        txtDestination.setEnabled(false);

        txtCost.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CUSTOMER DETAILS");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Gender:");

        rBtnFemale.setText("Female");
        rBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnFemaleActionPerformed(evt);
            }
        });

        rBtnMale.setText("Male");
        rBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMaleActionPerformed(evt);
            }
        });

        seatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1A", "1B", "1C", "2A", "2B", "2C", "3A", "3B", "3C"}));
        seatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Address:");

        txtAreaAddr.setColumns(20);
        txtAreaAddr.setRows(5);
        jScrollPane1.setViewportView(txtAreaAddr);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtFlightNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtSource, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel2)))
                                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAirline, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(25, 25, 25)
                                                .addComponent(seatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rBtnMale)
                                        .addGap(93, 93, 93)
                                        .addComponent(rBtnFemale))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel6)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnBookFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtAirline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(seatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rBtnFemale)
                    .addComponent(rBtnMale))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnBookFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightActionPerformed
        // TODO add your handling code here:
            customer = new Customer();
            
            if (txtCustomerName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Please enter customer name!!");
                return;
            } else {
                customer.setCustomerName(txtCustomerName.getText());
            }
            
            customer.setAddr(txtAreaAddr.getText());
            
            int key = seatComboBox.getSelectedIndex();
            String value = seatComboBox.getSelectedItem().toString();
            f.getSeats().populateHashMap(key, value);
            //JOptionPane.showMessageDialog(null, "Your Ticket has been booked");
            
            BookingConfirmationJPanel panel = new BookingConfirmationJPanel(rightPanel, f, customer);
            rightPanel.add("BookingConfirmation", panel);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.next(rightPanel);
                            
       
            //int No = 0;
            /*try {
               
               if (f.getNoOfSeats() != 0) { 
               
                if (f.getNoOfSeats() < Integer.parseInt(txtSeatNumber.getText())) {
                                                
                    JOptionPane.showMessageDialog(null,"Seat does not exist!!");
                    return;
                    
                } 
                 else {
                    if (txtSeatNumber.getText().isEmpty()) {
                        
                        JOptionPane.showMessageDialog(null,"Please enter your seat number!!");
                    } else {
                        
                        if (No == Integer.parseInt(txtSeatNumber.getText())) {
                            
                            JOptionPane.showMessageDialog(null,"This seat is already booked!! Please select another seat!!",  "Information", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            
                            f.setSeatNumber(Integer.parseInt(txtSeatNumber.getText()));
                            f.setNoOfSeats(f.getNoOfSeats()-1);

                            No = Integer.parseInt(txtSeatNumber.getText());
                        
                            BookingConfirmationJPanel panel = new BookingConfirmationJPanel(rightPanel, f, customer);
                            rightPanel.add("BookingConfirmation", panel);
                            CardLayout layout = (CardLayout) rightPanel.getLayout();
                            layout.next(rightPanel);
                        }
                      }
  
                 }
               } else {
                   JOptionPane.showMessageDialog(null,"Booking full!! No more seats available!!");
                   
               }
                                
            } catch (NumberFormatException e) {
        
                JOptionPane.showMessageDialog(null,"Invalid seat number!!");
               }
           */

    }//GEN-LAST:event_btnBookFlightActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSourceActionPerformed

    private void rBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnFemaleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rBtnFemaleActionPerformed

    private void rBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnMaleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rBtnMaleActionPerformed

    private void seatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookFlight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rBtnFemale;
    private javax.swing.JRadioButton rBtnMale;
    private javax.swing.JComboBox seatComboBox;
    private javax.swing.JTextField txtAirline;
    private javax.swing.JTextArea txtAreaAddr;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtFlightNo;
    private javax.swing.JTextField txtSource;
    // End of variables declaration//GEN-END:variables
}
