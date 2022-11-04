
package busreservationsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ChangeSeat extends javax.swing.JFrame {

    /**
     * Creates new form ChangeSeat
     */
    public ChangeSeat() {
        initComponents();
    }
     ArrayList<BusTicket> booked;
     ArrayList<BusTicket> allTickets;
     String IDs="";
     String Prices="";
     public static int oldTicketID;
     public static String oldprice;
     public static ArrayList<String> oldTicketPrice;
    public ChangeSeat(Passenger P) {
        initComponents();
        this.oldTicketPrice = new ArrayList<String>();
        this.booked = P.getAllBookedtickets();
        if(this.booked.size() != 0)
        {
           for(int i = 0 ; i < this.booked.size(); i++)
           {
              BusTicket bt = (BusTicket)this.booked.get(i);
              this.oldTicketPrice.add(String.valueOf(bt.getTicketID()));
              this.oldTicketPrice.add(bt.getTicketPrice());
              this.IDs += String.valueOf(bt.getTicketID()) + " , ";
               this.Prices += bt.getTicketPrice() + " , ";

           
           }
               this.jLabel1.setText(this.IDs);
               this.jLabel2.setText(this.Prices);

        }
        else
        {
                    
            JOptionPane.showMessageDialog(null, "No Booked Tickets till now , Go to Dashboard and  Book Tickets");
                   
           /* PassengerDashboard goPage = new PassengerDashboard();
            goPage.setVisible(true);
            goPage.setLocationRelativeTo(null);
               dispose(); */     
        
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

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        nameLabel4 = new javax.swing.JLabel();
        ticketidfield = new javax.swing.JTextField();
        renterButton2 = new javax.swing.JButton();
        renterButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel.setText("Booked Tickets IDs");

        nameLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel1.setText("Tickets Prices");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel1)
                    .addComponent(nameLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameLabel)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(nameLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(66, 66, 66)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addGap(80, 80, 80))
        );

        nameLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel4.setText("Select Ticket ID ");

        ticketidfield.setToolTipText("");
        ticketidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketidfieldActionPerformed(evt);
            }
        });

        renterButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        renterButton2.setText("Go To Dashboard");
        renterButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renterButton2ActionPerformed(evt);
            }
        });

        renterButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        renterButton1.setText("View Other Tickets in This Trip");
        renterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renterButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(nameLabel4)
                        .addGap(35, 35, 35)
                        .addComponent(ticketidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(renterButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(renterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel4)
                    .addComponent(ticketidfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(renterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(renterButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketidfieldActionPerformed

    }//GEN-LAST:event_ticketidfieldActionPerformed

    private void renterButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renterButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Back to DashBoard");
        PassengerDashboard goPage = new PassengerDashboard();
        goPage.setVisible(true);
        goPage.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_renterButton2ActionPerformed

    private void renterButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renterButton1ActionPerformed

        if(this.ticketidfield.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Empty Field , Enter Chosen Ticket ID", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            this.oldTicketID = Integer.parseInt(this.ticketidfield.getText());
            for(int i = 0 ; i < this.oldTicketPrice.size() ; i++)
            {
               if(this.oldTicketPrice.get(i).equals(this.ticketidfield.getText()))
               {
                 this.oldprice = this.oldTicketPrice.get(i+1);
                 break;
               }
               
            }
            if(HomePage.Trips.size() != 0)
            {
             //JOptionPane.showMessageDialog(null, "Check All Trips");

            for(int i = 0 ; i < HomePage.Trips.size(); i++)
            {
                Trip trip = (Trip)HomePage.Trips.get(i);
                allTickets = trip.getTripAvailableTickets();
                if(allTickets.size() != 0)
                {    
                     DisplayAllSeatsTickets Page = new DisplayAllSeatsTickets(allTickets);
                     Page.setVisible(true);
                     Page.setLocationRelativeTo(null);
                     dispose();
                     break;
/*
                for(int j = 0 ; j < allTickets.size(); j++ )
                {
                  BusTicket bt = (BusTicket)allTickets.get(j);

                 if(bt.getTicketID() == Integer.parseInt(this.ticketidfield.getText()))
                {
                     JOptionPane.showMessageDialog(null, "View All Tickets Seats in Same Ticket Trip");
                     DisplayAllSeatsTickets Page = new DisplayAllSeatsTickets(allTickets);
                     Page.setVisible(true);
                     Page.setLocationRelativeTo(null);
                     dispose();
                     break;
                }
                
                 
                }
*/
                }
            }


        }
            else
            {
             JOptionPane.showMessageDialog(null, "No Trips Available");

            }
        }
    }//GEN-LAST:event_renterButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeSeat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel4;
    private javax.swing.JButton renterButton1;
    private javax.swing.JButton renterButton2;
    private javax.swing.JTextField ticketidfield;
    // End of variables declaration//GEN-END:variables
}
