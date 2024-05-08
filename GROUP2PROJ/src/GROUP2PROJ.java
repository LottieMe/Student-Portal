//package cc103_projsystem;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GROUP2PROJ extends javax.swing.JFrame {

    public GROUP2PROJ() {
        
        initComponents();
        this.setBackground(255, 255, 255);
    }
    @SuppressWarnings("unchecked")
                           
    private void initComponents() {

        BLUEline = new javax.swing.JPanel();
        qcuTitle = new javax.swing.JLabel();
        QCUportal = new javax.swing.JLabel();
        signIn = new javax.swing.JLabel();
        forgotpass = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        NEW = new javax.swing.JLabel();
        qculogo = new javax.swing.JLabel();
        stdIMAGE = new javax.swing.JLabel();
        enterEmail = new javax.swing.JTextField();
        emailLABEL = new javax.swing.JLabel();
        passLABEL = new javax.swing.JLabel();
        enterPassword = new javax.swing.JPasswordField();
        login = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("loginFrame");
        setSize(1070,650);
        setAlwaysOnTop(true);
        setBackground(255,255,255);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        BLUEline.setBackground(new java.awt.Color(46, 46, 189));

        javax.swing.GroupLayout BLUElineLayout = new javax.swing.GroupLayout(BLUEline);
        BLUEline.setLayout(BLUElineLayout);
        BLUElineLayout.setHorizontalGroup(
            BLUElineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BLUElineLayout.setVerticalGroup(
            BLUElineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        qcuTitle.setFont(new java.awt.Font("Calibri", 1, 35)); // NOI18N
        qcuTitle.setText("Quezon City University");

        QCUportal.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        QCUportal.setText("QCU Student Portal");

        signIn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        signIn.setText("Sign In");

        forgotpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(204, 0, 0));
        forgotpass.setText("Forgot Password?");
        forgotpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpassMouseClicked(evt);
            }
        });

        register.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        register.setForeground(new java.awt.Color(204, 0, 0));
        register.setText("Register");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });

        NEW.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NEW.setText("New?");

        qculogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QCU_Logo_2019 (1).png"))); // NOI18N
        qculogo.setToolTipText("");

        stdIMAGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hahagaa (4).png"))); // NOI18N

        enterEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enterEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterEmailActionPerformed(evt);
            }
        });

        emailLABEL.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        emailLABEL.setText("Enter Email");

        passLABEL.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        passLABEL.setText("Password");

        enterPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        login.setBackground(new java.awt.Color(153, 153, 255));
        login.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setLabel("LOGIN");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
        });
        
        
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BLUEline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(qculogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qcuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(forgotpass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterEmail)
                            .addComponent(emailLABEL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passLABEL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 343, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QCUportal)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(stdIMAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)))
                        .addGap(334, 334, 334))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(signIn)
                        .addGap(491, 491, 491))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(469, 469, 469))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NEW)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(register)
                        .addGap(481, 481, 481))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(qcuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qculogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BLUEline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(stdIMAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QCUportal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signIn)
                .addGap(12, 12, 12)
                .addComponent(emailLABEL)
                .addGap(0, 0, 0)
                .addComponent(enterEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(passLABEL)
                .addGap(0, 0, 0)
                .addComponent(enterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotpass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NEW, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        signIn.getAccessibleContext().setAccessibleName("SignIn");
        qculogo.getAccessibleContext().setAccessibleName("QCUlogo");
        stdIMAGE.getAccessibleContext().setAccessibleName("stdPIC");

        setSize(new java.awt.Dimension(1086, 689));
        setLocationRelativeTo(null);
    }
    private void forgotpassMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     
    private void enterEmailActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String email = enterEmail.getText().trim();
        String password = new String(enterPassword.getPassword());


        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your email!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your password!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Connection conn = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            
            try {
                conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);

                String sql = "SELECT * FROM users WHERE Email=? AND Password=?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, email);
                pstmt.setString(2, password);
                
                rs = pstmt.executeQuery();
                
                if (rs.next()) {
                    // Login successful
                    JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    // Open dashboard or next frame here
                    DASHBOARD dashboard = new DASHBOARD();
                    dashboard.setVisible(true);
                    this.dispose(); // Close the login window
                } else {
                    // Invalid credentials
                    JOptionPane.showMessageDialog(this, "Invalid email or password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error occurred!", "Error", JOptionPane.ERROR_MESSAGE);
            }   finally {
                    try {
                        // Close resources
                        if (rs != null) rs.close();
                        if (pstmt != null) pstmt.close();
                        if (conn != null) conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }        
        }
    }                                     

    private boolean isValidLogin(String email, String password) {
        return false;
        // Dummy method for login validation (replace with your actual login logic)
        // For example, check against a database or an authentication service
        //return email.equals("lotte@gmail.com") && password.equals("password");
    }
    
    
    private void loginMousePressed(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GROUP2PROJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GROUP2PROJ().setVisible(true);//LOGIN
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel BLUEline;
    private javax.swing.JLabel NEW;
    private javax.swing.JLabel QCUportal;
    private javax.swing.JLabel emailLABEL;
    private javax.swing.JTextField enterEmail;
    private javax.swing.JPasswordField enterPassword;
    private javax.swing.JLabel forgotpass;
    private java.awt.Button login;
    private javax.swing.JLabel passLABEL;
    private javax.swing.JLabel qcuTitle;
    private javax.swing.JLabel qculogo;
    private javax.swing.JLabel register;
    private javax.swing.JLabel signIn;
    private javax.swing.JLabel stdIMAGE;
    // End of variables declaration  
    
        
    // Database connection details
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/studentportaldb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    

    private void setBackground(int r, int g, int b) {
        getContentPane().setBackground(new java.awt.Color(r, g, b));
    }
}
