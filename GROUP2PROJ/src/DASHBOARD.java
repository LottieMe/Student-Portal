
import javax.swing.*;


public class DASHBOARD extends JFrame {
     
    public DASHBOARD() {
        initComponents();
        //setupUI();
    }
    
    private void initializeDashboard() {
        // Customize components or perform additional setup here
    }
    @SuppressWarnings("unchecked")
                        
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        qcu_logo = new javax.swing.JLabel();
        blueline = new javax.swing.JLabel();
        MenuBar = new javax.swing.JPanel();
        labelMENU = new javax.swing.JLabel();
        menu1 = new javax.swing.JPanel();
        labelDB = new javax.swing.JLabel();
        iconDB = new javax.swing.JLabel();
        menu2 = new javax.swing.JPanel();
        labelSP = new javax.swing.JLabel();
        iconSP = new javax.swing.JLabel();
        menu3 = new javax.swing.JPanel();
        labelSE = new javax.swing.JLabel();
        iconSE = new javax.swing.JLabel();
        menu4 = new javax.swing.JPanel();
        labelGRADES = new javax.swing.JLabel();
        iconGRADES = new javax.swing.JLabel();
        menu5 = new javax.swing.JPanel();
        labelCS = new javax.swing.JLabel();
        iconCS = new javax.swing.JLabel();
        menu6 = new javax.swing.JPanel();
        labelSA = new javax.swing.JLabel();
        iconSA = new javax.swing.JLabel();
        menu7 = new javax.swing.JPanel();
        labelLOGOUT = new javax.swing.JLabel();
        iconLOGOUT = new javax.swing.JLabel();
        DASHBOARDlabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cubes = new javax.swing.JPanel();
        box1 = new javax.swing.JPanel();
        txtSubEnrolledNUM = new javax.swing.JLabel();
        txtSubEnrolled = new javax.swing.JLabel();
        boxBTN1 = new javax.swing.JButton();
        box2 = new javax.swing.JPanel();
        txtGWANUM = new javax.swing.JLabel();
        txtGWA = new javax.swing.JLabel();
        boxBTN2 = new javax.swing.JButton();
        box3 = new javax.swing.JPanel();
        txtClassSchedNUM = new javax.swing.JLabel();
        txtClassSched = new javax.swing.JLabel();
        boxBTN3 = new javax.swing.JButton();
        box4 = new javax.swing.JPanel();
        txtStdANUM = new javax.swing.JLabel();
        txtStdA = new javax.swing.JLabel();
        boxBTN4 = new javax.swing.JButton();
        DASHBOARDbox = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("dashboardFrame");
        setSize(1070,650);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        qcu_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QCU_Logo_2019 (1).png"))); // NOI18N

        blueline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue line.png"))); // NOI18N
        blueline.setToolTipText("");
        blueline.setAlignmentY(0.0F);
        blueline.setPreferredSize(new java.awt.Dimension(1080, 650));

        MenuBar.setBackground(new java.awt.Color(239, 72, 72));

        labelMENU.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        labelMENU.setForeground(new java.awt.Color(255, 255, 255));
        labelMENU.setText("MENU");

        menu1.setBackground(new java.awt.Color(144, 72, 72));
        //menu1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu1MousePressed(evt);
            }
        });

        labelDB.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        labelDB.setForeground(new java.awt.Color(255, 255, 255));
        labelDB.setText("Dashboard");
        labelDB.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelDB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labelDB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        iconDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconImages/db icon.png"))); // NOI18N

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(iconDB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconDB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu2.setBackground(new java.awt.Color(239, 72, 72));
       // menu2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu2MousePressed(evt);
            }
        });

        labelSP.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        labelSP.setForeground(new java.awt.Color(255, 255, 255));
        labelSP.setText("Student's Profile");
        labelSP.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelSP.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labelSP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        iconSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconImages/new profile.png"))); // NOI18N

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(iconSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelSP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconSP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu3.setBackground(new java.awt.Color(239, 72, 72));
       // menu3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));

        labelSE.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        labelSE.setForeground(new java.awt.Color(255, 255, 255));
        labelSE.setText("Subject/s Enrolled");
        labelSE.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelSE.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labelSE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        iconSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconImages/subs en.png"))); // NOI18N

        javax.swing.GroupLayout menu3Layout = new javax.swing.GroupLayout(menu3);
        menu3.setLayout(menu3Layout);
        menu3Layout.setHorizontalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(iconSE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu3Layout.setVerticalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelSE, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconSE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu4.setBackground(new java.awt.Color(239, 72, 72));
        //menu4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));

        labelGRADES.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        labelGRADES.setForeground(new java.awt.Color(255, 255, 255));
        labelGRADES.setText("Grades");
        labelGRADES.setToolTipText("");
        labelGRADES.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelGRADES.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labelGRADES.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        iconGRADES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconImages/grade.png"))); // NOI18N

        javax.swing.GroupLayout menu4Layout = new javax.swing.GroupLayout(menu4);
        menu4.setLayout(menu4Layout);
        menu4Layout.setHorizontalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(iconGRADES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelGRADES)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu4Layout.setVerticalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelGRADES, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconGRADES))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu5.setBackground(new java.awt.Color(239, 72, 72));
        //menu5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));

        labelCS.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        labelCS.setForeground(new java.awt.Color(255, 255, 255));
        labelCS.setText("Class Schedules");
        labelCS.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelCS.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labelCS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        iconCS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconImages/class sched.png"))); // NOI18N

        javax.swing.GroupLayout menu5Layout = new javax.swing.GroupLayout(menu5);
        menu5.setLayout(menu5Layout);
        menu5Layout.setHorizontalGroup(
            menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(iconCS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu5Layout.setVerticalGroup(
            menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelCS, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconCS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu6.setBackground(new java.awt.Color(239, 72, 72));
       // menu6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelSA.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        labelSA.setForeground(new java.awt.Color(255, 255, 255));
        labelSA.setText("Student's Account");
        labelSA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelSA.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labelSA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        iconSA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconImages/subs en.png"))); // NOI18N

        javax.swing.GroupLayout menu6Layout = new javax.swing.GroupLayout(menu6);
        menu6.setLayout(menu6Layout);
        menu6Layout.setHorizontalGroup(
            menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(iconSA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu6Layout.setVerticalGroup(
            menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu6Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu6Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelSA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconSA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu7.setBackground(new java.awt.Color(239, 72, 72));
       // menu7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelLOGOUT.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        labelLOGOUT.setForeground(new java.awt.Color(255, 255, 255));
        labelLOGOUT.setText("Logout");
        labelLOGOUT.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelLOGOUT.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        labelLOGOUT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        iconLOGOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconImages/new log out.png"))); // NOI18N

        javax.swing.GroupLayout menu7Layout = new javax.swing.GroupLayout(menu7);
        menu7.setLayout(menu7Layout);
        menu7Layout.setHorizontalGroup(
            menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(iconLOGOUT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLOGOUT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu7Layout.setVerticalGroup(
            menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelLOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconLOGOUT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MenuBarLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(labelMENU))
                    .addComponent(menu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(menu4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(menu7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuBarLayout.setVerticalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelMENU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DASHBOARDlabel.setFont(new java.awt.Font("Calibri", 1, 40)); // NOI18N
        DASHBOARDlabel.setText("STUDENT DASHBOARD");

        jPanel5.setBackground(new java.awt.Color(88, 88, 208));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(88, 88, 208));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(88, 88, 208));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        box1.setBackground(new java.awt.Color(88, 88, 208));
       // box1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, null));
        box1.setPreferredSize(new java.awt.Dimension(198, 170));

        txtSubEnrolledNUM.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        txtSubEnrolledNUM.setText("6");

        txtSubEnrolled.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtSubEnrolled.setText("Subject/s Enrolled");

        boxBTN1.setBackground(new java.awt.Color(255, 255, 255));
        boxBTN1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        boxBTN1.setText("View");
        boxBTN1.setBorder(null);

        javax.swing.GroupLayout box1Layout = new javax.swing.GroupLayout(box1);
        box1.setLayout(box1Layout);
        box1Layout.setHorizontalGroup(
            box1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(box1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubEnrolledNUM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(box1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSubEnrolled)
                .addContainerGap())
        );
        box1Layout.setVerticalGroup(
            box1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtSubEnrolledNUM, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubEnrolled)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        box2.setBackground(new java.awt.Color(88, 88, 208));
      //  box2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white));

        box2.setPreferredSize(new java.awt.Dimension(198, 170));

        txtGWANUM.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        txtGWANUM.setText("1.5");

        txtGWA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtGWA.setText("GWA");

        boxBTN2.setBackground(new java.awt.Color(255, 255, 255));
        boxBTN2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        boxBTN2.setText("View");
        boxBTN2.setBorder(null);

        javax.swing.GroupLayout box2Layout = new javax.swing.GroupLayout(box2);
        box2.setLayout(box2Layout);
        box2Layout.setHorizontalGroup(
            box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGWANUM)
                    .addComponent(txtGWA))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        box2Layout.setVerticalGroup(
            box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtGWANUM, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGWA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxBTN2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        box3.setBackground(new java.awt.Color(88, 88, 208));
    //    box3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, null));
        box3.setPreferredSize(new java.awt.Dimension(198, 170));

        txtClassSchedNUM.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        txtClassSchedNUM.setText("9");

        txtClassSched.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtClassSched.setText("Class Schedules");

        boxBTN3.setBackground(new java.awt.Color(255, 255, 255));
        boxBTN3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        boxBTN3.setText("View");
        boxBTN3.setBorder(null);

        javax.swing.GroupLayout box3Layout = new javax.swing.GroupLayout(box3);
        box3.setLayout(box3Layout);
        box3Layout.setHorizontalGroup(
            box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxBTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClassSchedNUM)
                    .addComponent(txtClassSched))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        box3Layout.setVerticalGroup(
            box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtClassSchedNUM, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClassSched)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxBTN3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        box4.setBackground(new java.awt.Color(88, 88, 208));
       // box4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, null));
        box4.setPreferredSize(new java.awt.Dimension(198, 170));

        txtStdANUM.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        txtStdANUM.setText("0");

        txtStdA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtStdA.setText("Student Account");

        boxBTN4.setBackground(new java.awt.Color(255, 255, 255));
        boxBTN4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        boxBTN4.setText("View");
        boxBTN4.setBorder(null);

        javax.swing.GroupLayout box4Layout = new javax.swing.GroupLayout(box4);
        box4.setLayout(box4Layout);
        box4Layout.setHorizontalGroup(
            box4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(box4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxBTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStdANUM)
                    .addComponent(txtStdA))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        box4Layout.setVerticalGroup(
            box4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtStdANUM, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStdA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxBTN4, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout cubesLayout = new javax.swing.GroupLayout(cubes);
        cubes.setLayout(cubesLayout);
        cubesLayout.setHorizontalGroup(
            cubesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cubesLayout.createSequentialGroup()
                .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cubesLayout.setVerticalGroup(
            cubesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cubesLayout.createSequentialGroup()
                .addGroup(cubesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        DASHBOARDbox.setBackground(new java.awt.Color(136, 136, 203));

        jLabel31.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel31.setText("Welcome back!");
        jLabel31.setToolTipText("");
        jLabel31.setAlignmentY(0.0F);
        jLabel31.setIconTextGap(0);

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel32.setText("Stay updated to your portal");

        javax.swing.GroupLayout DASHBOARDboxLayout = new javax.swing.GroupLayout(DASHBOARDbox);
        DASHBOARDbox.setLayout(DASHBOARDboxLayout);
        DASHBOARDboxLayout.setHorizontalGroup(
            DASHBOARDboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DASHBOARDboxLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(DASHBOARDboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31))
                .addContainerGap(462, Short.MAX_VALUE))
        );
        DASHBOARDboxLayout.setVerticalGroup(
            DASHBOARDboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DASHBOARDboxLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(0, 0, 0)
                .addComponent(jLabel32)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(qcu_logo))
            .addComponent(blueline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DASHBOARDlabel)
                    .addComponent(DASHBOARDbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(620, 620, 620)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cubes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qcu_logo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(blueline, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DASHBOARDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(DASHBOARDbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cubes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(1086, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    
    
    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        // TODO add your handling code here:
    }                                                          

    private void rSMetroTextPlaceHolder1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {                                                               
        // TODO add your handling code here:
    }                                                              

    private void rSPasswordTextPlaceHolder1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {                                                                  
        // TODO add your handling code here:
    }                                                                 

    private void rSMetroTextPlaceHolder1ActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    
    private void menu2MousePressed(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        //PROFILE profile = new PROFILE();
        //profile.setVisible(true);
    }                                  

    private void menu1MousePressed(java.awt.event.MouseEvent evt) {                                   
        //DASHBOARD MENU
       // DASHBOARD dashboard = new DASHBOARD();
       // dashboard.setVisible(true);
    }                                  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DASHBOARD().setVisible(true);
      });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel DASHBOARDbox;
    private javax.swing.JLabel DASHBOARDlabel;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JLabel blueline;
    private javax.swing.JPanel box1;
    private javax.swing.JPanel box2;
    private javax.swing.JPanel box3;
    private javax.swing.JPanel box4;
    private javax.swing.JButton boxBTN1;
    private javax.swing.JButton boxBTN2;
    private javax.swing.JButton boxBTN3;
    private javax.swing.JButton boxBTN4;
    private javax.swing.JPanel cubes;
    private javax.swing.JLabel iconCS;
    private javax.swing.JLabel iconDB;
    private javax.swing.JLabel iconGRADES;
    private javax.swing.JLabel iconLOGOUT;
    private javax.swing.JLabel iconSA;
    private javax.swing.JLabel iconSE;
    private javax.swing.JLabel iconSP;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel labelCS;
    private javax.swing.JLabel labelDB;
    private javax.swing.JLabel labelGRADES;
    private javax.swing.JLabel labelLOGOUT;
    private javax.swing.JLabel labelMENU;
    private javax.swing.JLabel labelSA;
    private javax.swing.JLabel labelSE;
    private javax.swing.JLabel labelSP;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JPanel menu4;
    private javax.swing.JPanel menu5;
    private javax.swing.JPanel menu6;
    private javax.swing.JPanel menu7;
    private javax.swing.JLabel qcu_logo;
    private javax.swing.JLabel txtClassSched;
    private javax.swing.JLabel txtClassSchedNUM;
    private javax.swing.JLabel txtGWA;
    private javax.swing.JLabel txtGWANUM;
    private javax.swing.JLabel txtStdA;
    private javax.swing.JLabel txtStdANUM;
    private javax.swing.JLabel txtSubEnrolled;
    private javax.swing.JLabel txtSubEnrolledNUM;                 

   private void setBackground(int r, int g, int b) {
        getContentPane().setBackground(new java.awt.Color(r, g, b));
    }
}
