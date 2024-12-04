
package club_view;

import club_controller.AnnouncementController;
import club_controller.AuthenticationController;
import club_controller.ButtonHoverController;
import club_controller.EventController;
import club_controller.MessageController;
import club_controller.NavigationController;
import club_controller.PanelController;
import club_controller.SalaryController;
import club_model.AnnouncementModel;
import club_model.PanelModel;
import club_model.SalaryModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FrmStaffDash extends javax.swing.JFrame {

    public FrmStaffDash() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        LeftOptionPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        button1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        button2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        button7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        button3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        button4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        UpperSmallPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        AllPanel = new javax.swing.JLayeredPane();
        StaffDash = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        StaffViewSalary = new javax.swing.JPanel();
        lblSalary = new javax.swing.JLabel();
        btnViewSalary = new javax.swing.JButton();
        btnWorkLoad = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorks = new javax.swing.JTable();
        StaffAnnouncements = new javax.swing.JPanel();
        txtAnn1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAnn = new javax.swing.JTable();
        btnWorkLoad1 = new javax.swing.JButton();
        StaffEvents = new javax.swing.JPanel();
        lblEvent = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblEvent = new javax.swing.JTable();
        lblType = new javax.swing.JLabel();
        StaffMessages = new javax.swing.JPanel();
        jTextField29 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftOptionPanel.setBackground(new java.awt.Color(33, 33, 33));
        LeftOptionPanel.setPreferredSize(new java.awt.Dimension(200, 450));
        LeftOptionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LeftOptionPanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        button1.setBackground(new java.awt.Color(33, 33, 33));
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(120, 120, 120));
        jLabel15.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\dashboard.png")); // NOI18N
        jLabel15.setText("DashBoard");
        jLabel15.setIconTextGap(15);

        javax.swing.GroupLayout button1Layout = new javax.swing.GroupLayout(button1);
        button1.setLayout(button1Layout);
        button1Layout.setHorizontalGroup(
            button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        button1Layout.setVerticalGroup(
            button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        LeftOptionPanel.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 40));

        button2.setBackground(new java.awt.Color(33, 33, 33));
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2MouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(120, 120, 120));
        jLabel16.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\Micrphone.png")); // NOI18N
        jLabel16.setText("View Salary");
        jLabel16.setIconTextGap(15);

        javax.swing.GroupLayout button2Layout = new javax.swing.GroupLayout(button2);
        button2.setLayout(button2Layout);
        button2Layout.setHorizontalGroup(
            button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button2Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        button2Layout.setVerticalGroup(
            button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        LeftOptionPanel.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 40));

        jPanel17.setBackground(new java.awt.Color(33, 33, 33));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel18.setText("TrackStaff");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        LeftOptionPanel.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 40));

        button7.setBackground(new java.awt.Color(33, 33, 33));
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button7MouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(120, 120, 120));
        jLabel17.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\power-off.png")); // NOI18N
        jLabel17.setText("Log out");
        jLabel17.setIconTextGap(15);

        javax.swing.GroupLayout button7Layout = new javax.swing.GroupLayout(button7);
        button7.setLayout(button7Layout);
        button7Layout.setHorizontalGroup(
            button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button7Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        button7Layout.setVerticalGroup(
            button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        LeftOptionPanel.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 200, 40));

        button3.setBackground(new java.awt.Color(33, 33, 33));
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button3MouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(120, 120, 120));
        jLabel19.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\track.png")); // NOI18N
        jLabel19.setText("Announcements");
        jLabel19.setIconTextGap(15);

        javax.swing.GroupLayout button3Layout = new javax.swing.GroupLayout(button3);
        button3.setLayout(button3Layout);
        button3Layout.setHorizontalGroup(
            button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button3Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        button3Layout.setVerticalGroup(
            button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        LeftOptionPanel.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 40));

        button4.setBackground(new java.awt.Color(33, 33, 33));
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button4MouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(120, 120, 120));
        jLabel21.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\events.png")); // NOI18N
        jLabel21.setText("Events");
        jLabel21.setIconTextGap(15);

        javax.swing.GroupLayout button4Layout = new javax.swing.GroupLayout(button4);
        button4.setLayout(button4Layout);
        button4Layout.setHorizontalGroup(
            button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button4Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        button4Layout.setVerticalGroup(
            button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        LeftOptionPanel.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 40));

        jLabel57.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 102, 102));
        jLabel57.setText("OZZY CLUB");
        LeftOptionPanel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\club-50.png")); // NOI18N
        jLabel61.setMaximumSize(new java.awt.Dimension(70, 70));
        jLabel61.setMinimumSize(new java.awt.Dimension(70, 70));
        jLabel61.setPreferredSize(new java.awt.Dimension(70, 70));
        LeftOptionPanel.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 60, 50));

        getContentPane().add(LeftOptionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        UpperSmallPanel.setBackground(new java.awt.Color(33, 33, 33));
        UpperSmallPanel.setPreferredSize(new java.awt.Dimension(600, 25));
        UpperSmallPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\Message.png")); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        UpperSmallPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 30, -1));

        getContentPane().add(UpperSmallPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 30));

        AllPanel.setLayout(new java.awt.CardLayout());

        StaffDash.setBackground(new java.awt.Color(56, 56, 56));
        StaffDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(45, 45, 45));

        jPanel7.setBackground(new java.awt.Color(36, 36, 36));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("118");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 18, 18));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Members");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        StaffDash.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 180, 290));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Hi Staff Member, Welcome");
        StaffDash.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 500, 50));

        jPanel12.setBackground(new java.awt.Color(45, 45, 45));

        jPanel13.setBackground(new java.awt.Color(36, 36, 36));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jLabel48.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("118");

        jLabel49.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(18, 18, 18));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Members");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        StaffDash.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 290));

        jPanel14.setBackground(new java.awt.Color(45, 45, 45));

        jPanel15.setBackground(new java.awt.Color(36, 36, 36));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jLabel58.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setText("118");

        jLabel59.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(18, 18, 18));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Members");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        StaffDash.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 170, -1));

        AllPanel.add(StaffDash, "card2");

        StaffViewSalary.setBackground(new java.awt.Color(56, 56, 56));

        lblSalary.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        lblSalary.setForeground(new java.awt.Color(160, 160, 160));
        lblSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalary.setText("XXXXXXXXXXX");

        btnViewSalary.setBackground(new java.awt.Color(41, 41, 41));
        btnViewSalary.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnViewSalary.setForeground(new java.awt.Color(153, 153, 153));
        btnViewSalary.setText("View Salary");
        btnViewSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSalaryActionPerformed(evt);
            }
        });

        btnWorkLoad.setBackground(new java.awt.Color(41, 41, 41));
        btnWorkLoad.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnWorkLoad.setForeground(new java.awt.Color(153, 153, 153));
        btnWorkLoad.setText("View Workload");
        btnWorkLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkLoadActionPerformed(evt);
            }
        });

        tblWorks.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblWorks.setForeground(new java.awt.Color(102, 102, 102));
        tblWorks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Working Date", "Working Hours", "Staff Salary", "Staff OT Hours", "admin ID", "Staff ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblWorks);

        javax.swing.GroupLayout StaffViewSalaryLayout = new javax.swing.GroupLayout(StaffViewSalary);
        StaffViewSalary.setLayout(StaffViewSalaryLayout);
        StaffViewSalaryLayout.setHorizontalGroup(
            StaffViewSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffViewSalaryLayout.createSequentialGroup()
                .addGroup(StaffViewSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StaffViewSalaryLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StaffViewSalaryLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnViewSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnWorkLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffViewSalaryLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        StaffViewSalaryLayout.setVerticalGroup(
            StaffViewSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffViewSalaryLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(StaffViewSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWorkLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(lblSalary)
                .addGap(29, 29, 29))
        );

        AllPanel.add(StaffViewSalary, "card6");

        StaffAnnouncements.setBackground(new java.awt.Color(56, 56, 56));
        StaffAnnouncements.setForeground(new java.awt.Color(255, 255, 255));

        txtAnn1.setBackground(new java.awt.Color(51, 51, 51));
        txtAnn1.setForeground(new java.awt.Color(255, 255, 255));

        tblAnn.setBackground(new java.awt.Color(41, 41, 41));
        tblAnn.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblAnn.setForeground(new java.awt.Color(255, 255, 255));
        tblAnn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Time", "Date", "Title", "Description", "Admin ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAnn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnnMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblAnn);

        btnWorkLoad1.setBackground(new java.awt.Color(41, 41, 41));
        btnWorkLoad1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnWorkLoad1.setForeground(new java.awt.Color(153, 153, 153));
        btnWorkLoad1.setText("View Announcements");
        btnWorkLoad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkLoad1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StaffAnnouncementsLayout = new javax.swing.GroupLayout(StaffAnnouncements);
        StaffAnnouncements.setLayout(StaffAnnouncementsLayout);
        StaffAnnouncementsLayout.setHorizontalGroup(
            StaffAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffAnnouncementsLayout.createSequentialGroup()
                .addGroup(StaffAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(StaffAnnouncementsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWorkLoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StaffAnnouncementsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(StaffAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                            .addComponent(txtAnn1))))
                .addGap(33, 33, 33))
        );
        StaffAnnouncementsLayout.setVerticalGroup(
            StaffAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffAnnouncementsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtAnn1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnWorkLoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        AllPanel.add(StaffAnnouncements, "card4");

        StaffEvents.setBackground(new java.awt.Color(56, 56, 56));
        StaffEvents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEvent.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        lblEvent.setForeground(new java.awt.Color(160, 160, 160));
        lblEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEvent.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        StaffEvents.add(lblEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, 70));

        jButton3.setBackground(new java.awt.Color(41, 41, 41));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 153));
        jButton3.setText("More Info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        StaffEvents.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 250, 36));

        jLabel55.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(160, 160, 160));
        jLabel55.setText("Next Event :");
        StaffEvents.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 507, 70));

        jLabel34.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(160, 160, 160));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Event Type :");
        StaffEvents.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 30));

        lblDate.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lblDate.setForeground(new java.awt.Color(160, 160, 160));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("xxxxxxxxxxx");
        lblDate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StaffEvents.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 230, 40));

        jLabel32.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(160, 160, 160));
        jLabel32.setText("Event Date :");
        StaffEvents.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 140, 30));

        tblEvent.setBackground(new java.awt.Color(41, 41, 41));
        tblEvent.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblEvent.setForeground(new java.awt.Color(255, 255, 255));
        tblEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Event ID", "Event Title", "Event Date", "Event Time", "Event Type", "Event Description", "post_date", "post_time", "Admin ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblEvent);

        StaffEvents.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 560, 150));

        lblType.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lblType.setForeground(new java.awt.Color(160, 160, 160));
        lblType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblType.setText("xxxxxxxxxxx");
        lblType.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StaffEvents.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 230, 40));

        AllPanel.add(StaffEvents, "card5");

        StaffMessages.setBackground(new java.awt.Color(56, 56, 56));

        jTextField29.setBackground(new java.awt.Color(51, 51, 51));
        jTextField29.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(255, 255, 255));
        jTextField29.setCaretColor(new java.awt.Color(255, 255, 255));

        jButton17.setBackground(new java.awt.Color(41, 41, 41));
        jButton17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(153, 153, 153));
        jButton17.setText("Clear");

        jButton18.setBackground(new java.awt.Color(41, 41, 41));
        jButton18.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(153, 153, 153));
        jButton18.setText("Send");

        jLabel51.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(160, 160, 160));
        jLabel51.setText("Contact Us Through a Message :");

        javax.swing.GroupLayout StaffMessagesLayout = new javax.swing.GroupLayout(StaffMessages);
        StaffMessages.setLayout(StaffMessagesLayout);
        StaffMessagesLayout.setHorizontalGroup(
            StaffMessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffMessagesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(StaffMessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StaffMessagesLayout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StaffMessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StaffMessagesLayout.createSequentialGroup()
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        StaffMessagesLayout.setVerticalGroup(
            StaffMessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StaffMessagesLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(StaffMessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        AllPanel.add(StaffMessages, "card3");

        getContentPane().add(AllPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 600, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
             ButtonHoverController color = new ButtonHoverController ();
             color.setColor(button1);
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
              ButtonHoverController color = new ButtonHoverController ();
              color.ResetColor(button1);
    }//GEN-LAST:event_button1MouseExited

    private void button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseEntered
               ButtonHoverController color = new ButtonHoverController ();
               color.setColor(button2);
    }//GEN-LAST:event_button2MouseEntered

    private void button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseExited
               ButtonHoverController color = new ButtonHoverController ();
               color.ResetColor(button2);
    }//GEN-LAST:event_button2MouseExited

    private void button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseEntered
                ButtonHoverController color = new ButtonHoverController ();
                color.setColor(button3);
    }//GEN-LAST:event_button3MouseEntered

    private void button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseExited
                ButtonHoverController color = new ButtonHoverController ();
                color.ResetColor(button3);
    }//GEN-LAST:event_button3MouseExited

    private void button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseEntered
               ButtonHoverController color = new ButtonHoverController ();
               color.setColor(button4);
    }//GEN-LAST:event_button4MouseEntered

    private void button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseExited
               ButtonHoverController color = new ButtonHoverController ();
               color.ResetColor(button4);
    }//GEN-LAST:event_button4MouseExited

    private void button7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseEntered
               ButtonHoverController color = new ButtonHoverController ();
               color.setColor(button7);
    }//GEN-LAST:event_button7MouseEntered

    private void button7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseExited
               ButtonHoverController color = new ButtonHoverController ();
               color.ResetColor(button7);
    }//GEN-LAST:event_button7MouseExited

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
            PanelModel model = new PanelModel ();
            model.setLayeredPane(AllPanel);
            model.setPanel(StaffDash);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
            PanelModel model = new PanelModel ();
            model.setLayeredPane(AllPanel);
            model.setPanel(StaffViewSalary);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
            PanelModel model = new PanelModel ();
            model.setLayeredPane(AllPanel);
            model.setPanel(StaffAnnouncements);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
           EventController display = new EventController ();
           display.getDataToVariable();
           lblEvent.setText(display.Title);
           lblType.setText(display.Type);
           lblDate.setText(display.Date);
        
           PanelModel model = new PanelModel ();
            model.setLayeredPane(AllPanel);
            model.setPanel(StaffEvents);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
            
    }//GEN-LAST:event_button4MouseClicked

    private void button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseClicked
            NavigationController controller = new NavigationController (this);
            controller.navigateToRegister1(new FrmRegister1());
    }//GEN-LAST:event_button7MouseClicked

    private void btnViewSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSalaryActionPerformed
         SalaryModel salaryModel = new SalaryModel () ;      
         SalaryController salaryCon = new SalaryController (salaryModel) ;
         double x = salaryCon.getSalaryToLabel();
         String y = Double.toString(x);
         lblSalary.setText(y);
    }//GEN-LAST:event_btnViewSalaryActionPerformed

    private void btnWorkLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkLoadActionPerformed
         SalaryModel salaryModel = new SalaryModel () ;      
         SalaryController salaryCon = new SalaryController (salaryModel) ;
         salaryCon.GetSalaryResults (tblWorks);                    
    }//GEN-LAST:event_btnWorkLoadActionPerformed

    private void btnWorkLoad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkLoad1ActionPerformed
          AnnouncementController controller = new AnnouncementController () ;
          controller. GetAnnToTable (tblAnn) ;
    }//GEN-LAST:event_btnWorkLoad1ActionPerformed

    private void tblAnnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnnMouseClicked
         AnnouncementController controller = new AnnouncementController () ;        
        txtAnn1.setText(controller.DataToTextField(tblAnn));
    }//GEN-LAST:event_tblAnnMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            EventController event = new EventController ();
            event.GetEventResults(tblEvent);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        NavigationController controller = new NavigationController (this);
        controller.navigateToFrmMemMessage(new FrmMemMessage());
        
    }//GEN-LAST:event_jLabel24MouseClicked


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
            java.util.logging.Logger.getLogger(FrmStaffDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStaffDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStaffDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStaffDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStaffDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane AllPanel;
    private javax.swing.JPanel LeftOptionPanel;
    private javax.swing.JPanel StaffAnnouncements;
    private javax.swing.JPanel StaffDash;
    private javax.swing.JPanel StaffEvents;
    private javax.swing.JPanel StaffMessages;
    private javax.swing.JPanel StaffViewSalary;
    private javax.swing.JPanel UpperSmallPanel;
    private javax.swing.JButton btnViewSalary;
    private javax.swing.JButton btnWorkLoad;
    private javax.swing.JButton btnWorkLoad1;
    private javax.swing.JPanel button1;
    private javax.swing.JPanel button2;
    private javax.swing.JPanel button3;
    private javax.swing.JPanel button4;
    private javax.swing.JPanel button7;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblType;
    private javax.swing.JTable tblAnn;
    private javax.swing.JTable tblEvent;
    private javax.swing.JTable tblWorks;
    private javax.swing.JTextField txtAnn1;
    // End of variables declaration//GEN-END:variables
}
