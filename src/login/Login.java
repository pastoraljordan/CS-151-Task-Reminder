package login;

import swing.EventLogin;

public class Login extends PanelCustom {

    private EventLogin event;
    public Login() {
        initComponents();
        setAlpha(1);
    }
    
    public void setEventLogin(EventLogin event) {
        this.event = event;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginTextField3 = new swing.LoginTextField();
        loginPassword1 = new swing.LoginPassword();
        loginButton1 = new swing.LoginButton();

        setBackground(new java.awt.Color(247, 247, 247));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN IN");

        loginTextField3.setForeground(new java.awt.Color(76, 76, 76));
        loginTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField3.setHint("USER NAME");

        loginPassword1.setForeground(new java.awt.Color(76, 76, 76));
        loginPassword1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginPassword1.setHint("PASSWORD");

        loginButton1.setBackground(new java.awt.Color(86, 142, 255));
        loginButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginButton1.setText("Sign In");
        loginButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(loginTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(getAlpha() == 0) {
            event.loginDone();
        }
    }                                            


    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private swing.LoginButton loginButton1;
    private swing.LoginPassword loginPassword1;
    private swing.LoginTextField loginTextField3;
    // End of variables declaration                   
}