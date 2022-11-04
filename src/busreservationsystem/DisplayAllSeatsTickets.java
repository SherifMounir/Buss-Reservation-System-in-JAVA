
package busreservationsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DisplayAllSeatsTickets extends javax.swing.JFrame {

    public DisplayAllSeatsTickets() {
        initComponents();
    }
     String IDs="";
     String Prices="";
     ArrayList<BusTicket> Tickets;
     ArrayList<BusTicket> passengerTickets;
     
    public DisplayAllSeatsTickets(ArrayList<BusTicket> AllTickets) {
        initComponents();
        this.Tickets = new ArrayList<>();
        this.passengerTickets = new ArrayList<>();
        for(int i = 0 ; i < AllTickets.size(); i++)
          {
              
             BusTicket bt = (BusTicket)AllTickets.get(i);
             this.Tickets.add(bt);
             this.IDs += String.valueOf(bt.getTicketID()) + " , ";
             this.Prices += bt.getTicketPrice() + " , ";

          }
        
              this.jLabel1.setText(this.IDs);
              this.jLabel2.setText(this.Prices);
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
        nameLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameLabel4 = new javax.swing.JLabel();
        ticketidfield = new javax.swing.JTextField();
        renterButton1 = new javax.swing.JButton();
        renterButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel.setText("Tickets IDs");

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
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameLabel)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        nameLabel4.setText("Change Mine with Ticket ID");

        ticketidfield.setToolTipText("");
        ticketidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketidfieldActionPerformed(evt);
            }
        });

        renterButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        renterButton1.setText("Swap");
        renterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renterButton1ActionPerformed(evt);
            }
        });

        renterButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        renterButton2.setText("Go To Dashboard");
        renterButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renterButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(ticketidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(renterButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(renterButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel4)
                    .addComponent(ticketidfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(renterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(renterButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketidfieldActionPerformed

    }//GEN-LAST:event_ticketidfieldActionPerformed

    private void renterButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renterButton1ActionPerformed

        if(this.ticketidfield.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Empty Field , Enter Chosen Ticket ID to Swap", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
          

            BusTicket rt = new BusTicket(ChangeSeat.oldTicketID , ChangeSeat.oldprice);
             for(int i = 0 ; i < this.Tickets.size(); i++)
             {
             BusTicket bt = (BusTicket)this.Tickets.get(i);
             if(bt.getTicketID() == Integer.parseInt(this.ticketidfield.getText()))
             {
               //HomePage.passenger.removeTicketfromBookedTicket(rt);  
               HomePage.passenger.addTicketToBookedTicket(bt);
               JOptionPane.showMessageDialog(null, "Ticket Added to Your Booked Tickets");
               this.Tickets.remove(bt);
               this.Tickets.add(new BusTicket(ChangeSeat.oldTicketID , ChangeSeat.oldprice));
               //HomePage.passenger.removeTicketfromBookedTicket(new BusTicket(ChangeSeat.oldTicketID , ChangeSeat.oldprice));  

               break;
             }
             
             this.passengerTickets = HomePage.passenger.getAllBookedtickets();
             for(int j = 0 ; j < this.passengerTickets.size(); j++)
             {
               BusTicket b = (BusTicket)this.passengerTickets.get(j);
               if((b.getTicketID()== rt.getTicketID()) && (b.getTicketPrice() == rt.getTicketPrice()))
               {
                 this.passengerTickets.remove(b);
                   b.setTicketID(0);
                   b.setTicketPrice("");
                 break;
               }
             }
             

          }


                    JOptionPane.showMessageDialog(null, "Refresh Page");
                    DisplayAllSeatsTickets Page = new DisplayAllSeatsTickets(this.Tickets);
                    Page.setVisible(true);
                    Page.setLocationRelativeTo(null);
                    dispose();
                    

        }
    }//GEN-LAST:event_renterButton1ActionPerformed

    private void renterButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renterButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Back to DashBoard");
        PassengerDashboard goPage = new PassengerDashboard();
        goPage.setVisible(true);
        goPage.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_renterButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayAllSeatsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayAllSeatsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayAllSeatsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayAllSeatsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayAllSeatsTickets().setVisible(true);
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