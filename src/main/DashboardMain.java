package main;

import backend.CurrentUser;
import backend.DBConnection;
import backend.Reminder;
import backend.TextHandler;
import backend.User;
import event.EventMenu;
import form.AllRemindersForm;
import form.CreateRemindersForm;
import form.DashboardForm;
import form.SettingsForm;
import java.awt.Color;
import java.awt.Component;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import swing.EventLogin;

public class DashboardMain extends javax.swing.JFrame {

    private EventLogin event;
    private CurrentUser current = CurrentUser.currentUser;
    private User user = current.getCurrentUser();
    private ArrayList<Reminder> reminders;

    public DashboardMain() {
        initComponents();
        initReminders();
        setBackground(new Color(0, 0, 0, 0));
        showForm(new DashboardForm());
    }
    
    private void initReminders() {
        try {
            reminders = DBConnection.getTodaysReminders(user.getUsername());
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm");
            for(Reminder r : reminders) {
                TextHandler handler = new TextHandler(r);
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    private void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.PanelBorder();
        dashboardMenu1 = new component.DashboardMenu();
        body = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(dashboardMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        dashboardMenu1.setSelectedIndex(0);
        dashboardMenu1.addEvent(new EventMenu() {
            @Override
            public void menuIndexChange(int index) {
                switch (index) {
                    case 0:
                        showForm(new DashboardForm());
                        break;
                    case 1:
                        showForm(new AllRemindersForm());
                        break;
                    case 2:
                        showForm(new CreateRemindersForm());
                        break;
                    case 3:
                        showForm(new SettingsForm());
                        break;
                    case 10:
                        EventLogin event = new EventLogin() {
                            @Override
                            public void loginDone() {
                            }

                            @Override
                            public void logOut() {
                                DashboardMain.this.dispose();
                                LoginMain login = new LoginMain();
                                login.setVisible(true);
                            }
                        };
                        event.logOut();
                        break;
                    default:
                        break;
                }
            }
        });
    }//GEN-LAST:event_formWindowOpened

    public void setEventLogin(EventLogin event) {
        this.event = event;
    }

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
            java.util.logging.Logger.getLogger(DashboardMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane body;
    private component.DashboardMenu dashboardMenu1;
    private swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
