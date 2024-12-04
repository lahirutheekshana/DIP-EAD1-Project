
package club_view;

import club_controller.AnnouncementController;
import club_controller.ButtonHoverController;
import club_controller.EventController;
import club_controller.NavigationController;
import club_controller.PanelController;
import club_controller.ReservationsController;
import club_model.PanelModel;
import club_model.ReservationsModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FrmMemberDash extends javax.swing.JFrame {

    public FrmMemberDash() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        LeftOptionPanel = new javax.swing.JPanel();
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
        MemberAllPanel = new javax.swing.JLayeredPane();
        MemberDash = new javax.swing.JPanel();
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
        MemberEvents = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblEvent = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblEvent = new javax.swing.JTable();
        MemberReservations = new javax.swing.JPanel();
        ManageAccLayered = new javax.swing.JLayeredPane();
        BookRoom = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtForHours = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtRoomType = new javax.swing.JTextField();
        btnRoomBook = new javax.swing.JButton();
        btnRoomView = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblMemRes = new javax.swing.JTable();
        btnRoomClear1 = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lblCurrent = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btnRoomCancle = new javax.swing.JButton();
        BookHall = new javax.swing.JPanel();
        txtHallType = new javax.swing.JTextField();
        txtTime1 = new javax.swing.JTextField();
        txtForHours1 = new javax.swing.JTextField();
        txtDate1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        btnHallClear = new javax.swing.JButton();
        btnHallBook = new javax.swing.JButton();
        btnHallView = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblResHall = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        lblCurrent1 = new javax.swing.JLabel();
        btnHallCancle = new javax.swing.JButton();
        btn1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btn2 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        MemberAnnouncements = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAnnounce = new javax.swing.JTable();
        txtAnnounce = new javax.swing.JTextField();
        btnWorkLoad1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftOptionPanel.setBackground(new java.awt.Color(33, 33, 33));
        LeftOptionPanel.setPreferredSize(new java.awt.Dimension(200, 450));
        LeftOptionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel16.setText("Announcements");
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
        jLabel19.setText("Events ");
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
        jLabel21.setText("Reservations");
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
        getContentPane().add(UpperSmallPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 30));

        MemberAllPanel.setLayout(new java.awt.CardLayout());

        MemberDash.setBackground(new java.awt.Color(56, 56, 56));
        MemberDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel1.setText("232");

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
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addContainerGap(13, Short.MAX_VALUE))
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

        MemberDash.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 180, 290));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Hi Member, Welcome");
        MemberDash.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 500, 50));

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
        jLabel48.setText("143");

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

        MemberDash.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 290));

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
        jLabel58.setText("121");

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

        MemberDash.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 170, -1));

        MemberAllPanel.add(MemberDash, "card2");

        MemberEvents.setBackground(new java.awt.Color(56, 56, 56));
        MemberEvents.setForeground(new java.awt.Color(255, 255, 255));

        jButton5.setBackground(new java.awt.Color(41, 41, 41));
        jButton5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 153, 153));
        jButton5.setText("More Info");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lblDate.setForeground(new java.awt.Color(160, 160, 160));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("xxxxxxxxxxx");
        lblDate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblType.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lblType.setForeground(new java.awt.Color(160, 160, 160));
        lblType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblType.setText("xxxxxxxxxxx");
        lblType.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel34.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(160, 160, 160));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Event Type :");

        jLabel32.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(160, 160, 160));
        jLabel32.setText("Event Date :");

        lblEvent.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        lblEvent.setForeground(new java.awt.Color(160, 160, 160));
        lblEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEvent.setText("xxxxxxxxxxxxxxxxxxxx");

        jLabel55.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(160, 160, 160));
        jLabel55.setText("Next Event :");

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

        javax.swing.GroupLayout MemberEventsLayout = new javax.swing.GroupLayout(MemberEvents);
        MemberEvents.setLayout(MemberEventsLayout);
        MemberEventsLayout.setHorizontalGroup(
            MemberEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemberEventsLayout.createSequentialGroup()
                .addGroup(MemberEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MemberEventsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MemberEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MemberEventsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MemberEventsLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MemberEventsLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MemberEventsLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(MemberEventsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MemberEventsLayout.setVerticalGroup(
            MemberEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MemberEventsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MemberEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MemberEventsLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MemberEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MemberEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(lblType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        MemberAllPanel.add(MemberEvents, "card4");

        MemberReservations.setBackground(new java.awt.Color(56, 56, 56));
        MemberReservations.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageAccLayered.setLayout(new java.awt.CardLayout());

        BookRoom.setBackground(new java.awt.Color(56, 56, 56));

        jLabel36.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(160, 160, 160));
        jLabel36.setText("Date :");

        txtDate.setBackground(new java.awt.Color(51, 51, 51));
        txtDate.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        txtDate.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel38.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(160, 160, 160));
        jLabel38.setText("For Hours :");

        txtForHours.setBackground(new java.awt.Color(51, 51, 51));
        txtForHours.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtForHours.setForeground(new java.awt.Color(255, 255, 255));
        txtForHours.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(160, 160, 160));
        jLabel39.setText("Room type :");

        txtTime.setBackground(new java.awt.Color(51, 51, 51));
        txtTime.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtTime.setForeground(new java.awt.Color(255, 255, 255));
        txtTime.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel40.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(160, 160, 160));
        jLabel40.setText("Time :");

        txtRoomType.setBackground(new java.awt.Color(51, 51, 51));
        txtRoomType.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtRoomType.setForeground(new java.awt.Color(255, 255, 255));
        txtRoomType.setCaretColor(new java.awt.Color(255, 255, 255));

        btnRoomBook.setBackground(new java.awt.Color(41, 41, 41));
        btnRoomBook.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRoomBook.setForeground(new java.awt.Color(153, 153, 153));
        btnRoomBook.setText("BOOK");
        btnRoomBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomBookActionPerformed(evt);
            }
        });

        btnRoomView.setBackground(new java.awt.Color(41, 41, 41));
        btnRoomView.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRoomView.setForeground(new java.awt.Color(153, 153, 153));
        btnRoomView.setText("VIEW");
        btnRoomView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomViewActionPerformed(evt);
            }
        });

        tblMemRes.setBackground(new java.awt.Color(41, 41, 41));
        tblMemRes.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblMemRes.setForeground(new java.awt.Color(255, 255, 255));
        tblMemRes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "R_id", "R_dateNow", "R_date", "R_hours", "R_timeNow", "R_time", "M_id", "admin_id", "Room_Num", "Confirmation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tblMemRes);

        btnRoomClear1.setBackground(new java.awt.Color(41, 41, 41));
        btnRoomClear1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRoomClear1.setForeground(new java.awt.Color(153, 153, 153));
        btnRoomClear1.setText("CLEAR");
        btnRoomClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomClear1ActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(160, 160, 160));
        lblTotal.setText("xx");

        jLabel43.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(160, 160, 160));
        jLabel43.setText("Total Available:");

        lblCurrent.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lblCurrent.setForeground(new java.awt.Color(160, 160, 160));
        lblCurrent.setText("xx");

        jLabel47.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(160, 160, 160));
        jLabel47.setText("Currently Available :");

        btnRoomCancle.setBackground(new java.awt.Color(41, 41, 41));
        btnRoomCancle.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRoomCancle.setForeground(new java.awt.Color(153, 153, 153));
        btnRoomCancle.setText("CANCLE");
        btnRoomCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomCancleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BookRoomLayout = new javax.swing.GroupLayout(BookRoom);
        BookRoom.setLayout(BookRoomLayout);
        BookRoomLayout.setHorizontalGroup(
            BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookRoomLayout.createSequentialGroup()
                .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BookRoomLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BookRoomLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BookRoomLayout.createSequentialGroup()
                                .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BookRoomLayout.createSequentialGroup()
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BookRoomLayout.createSequentialGroup()
                                        .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(BookRoomLayout.createSequentialGroup()
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtForHours, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRoomBook, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRoomView, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRoomClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRoomCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        BookRoomLayout.setVerticalGroup(
            BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookRoomLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(jLabel43)
                    .addComponent(lblCurrent)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BookRoomLayout.createSequentialGroup()
                        .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38)
                            .addComponent(txtForHours, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)))
                    .addGroup(BookRoomLayout.createSequentialGroup()
                        .addComponent(btnRoomBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRoomView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRoomClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnRoomCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        ManageAccLayered.add(BookRoom, "card2");

        BookHall.setBackground(new java.awt.Color(56, 56, 56));

        txtHallType.setBackground(new java.awt.Color(51, 51, 51));
        txtHallType.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtHallType.setForeground(new java.awt.Color(255, 255, 255));
        txtHallType.setCaretColor(new java.awt.Color(255, 255, 255));

        txtTime1.setBackground(new java.awt.Color(51, 51, 51));
        txtTime1.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtTime1.setForeground(new java.awt.Color(255, 255, 255));
        txtTime1.setCaretColor(new java.awt.Color(255, 255, 255));

        txtForHours1.setBackground(new java.awt.Color(51, 51, 51));
        txtForHours1.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtForHours1.setForeground(new java.awt.Color(255, 255, 255));
        txtForHours1.setCaretColor(new java.awt.Color(255, 255, 255));

        txtDate1.setBackground(new java.awt.Color(51, 51, 51));
        txtDate1.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtDate1.setForeground(new java.awt.Color(255, 255, 255));
        txtDate1.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel41.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(160, 160, 160));
        jLabel41.setText("Hall type :");

        jLabel50.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(160, 160, 160));
        jLabel50.setText("Time :");

        jLabel51.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(160, 160, 160));
        jLabel51.setText("For Hours :");

        jLabel52.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(160, 160, 160));
        jLabel52.setText("Date :");

        btnHallClear.setBackground(new java.awt.Color(41, 41, 41));
        btnHallClear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnHallClear.setForeground(new java.awt.Color(153, 153, 153));
        btnHallClear.setText("CLEAR");
        btnHallClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHallClearActionPerformed(evt);
            }
        });

        btnHallBook.setBackground(new java.awt.Color(41, 41, 41));
        btnHallBook.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnHallBook.setForeground(new java.awt.Color(153, 153, 153));
        btnHallBook.setText("BOOK");
        btnHallBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHallBookActionPerformed(evt);
            }
        });

        btnHallView.setBackground(new java.awt.Color(41, 41, 41));
        btnHallView.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnHallView.setForeground(new java.awt.Color(153, 153, 153));
        btnHallView.setText("VIEW");
        btnHallView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHallViewActionPerformed(evt);
            }
        });

        tblResHall.setBackground(new java.awt.Color(41, 41, 41));
        tblResHall.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblResHall.setForeground(new java.awt.Color(255, 255, 255));
        tblResHall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "R_id", "R_dateNow", "R_date", "R_hours", "R_timeNow", "R_time", "M_id", "admin_id", "Hall_Num", "Confirmation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResHall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResHallMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblResHall);

        jLabel44.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(160, 160, 160));
        jLabel44.setText("Total Available:");

        lblTotal1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(160, 160, 160));
        lblTotal1.setText("xx");

        jLabel53.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(160, 160, 160));
        jLabel53.setText("Currently Available :");

        lblCurrent1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lblCurrent1.setForeground(new java.awt.Color(160, 160, 160));
        lblCurrent1.setText("xx");

        btnHallCancle.setBackground(new java.awt.Color(41, 41, 41));
        btnHallCancle.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnHallCancle.setForeground(new java.awt.Color(153, 153, 153));
        btnHallCancle.setText("Cancle");
        btnHallCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHallCancleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BookHallLayout = new javax.swing.GroupLayout(BookHall);
        BookHall.setLayout(BookHallLayout);
        BookHallLayout.setHorizontalGroup(
            BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookHallLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BookHallLayout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BookHallLayout.createSequentialGroup()
                        .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHallType, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BookHallLayout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtForHours1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHallClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHallBook, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHallView, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHallCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BookHallLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BookHallLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCurrent1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        BookHallLayout.setVerticalGroup(
            BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookHallLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal1)
                    .addComponent(jLabel44)
                    .addComponent(lblCurrent1)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel52)
                        .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnHallBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHallView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtForHours1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHallClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHallCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHallType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        ManageAccLayered.add(BookHall, "card3");

        MemberReservations.add(ManageAccLayered, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 390));

        btn1.setBackground(new java.awt.Color(33, 33, 33));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("ROOM");
        jLabel25.setToolTipText("");

        javax.swing.GroupLayout btn1Layout = new javax.swing.GroupLayout(btn1);
        btn1.setLayout(btn1Layout);
        btn1Layout.setHorizontalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel25)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btn1Layout.setVerticalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        MemberReservations.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 30));

        btn2.setBackground(new java.awt.Color(33, 33, 33));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("HALL");
        jLabel37.setToolTipText("");

        javax.swing.GroupLayout btn2Layout = new javax.swing.GroupLayout(btn2);
        btn2.setLayout(btn2Layout);
        btn2Layout.setHorizontalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel37)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        btn2Layout.setVerticalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        MemberReservations.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, -1));

        MemberAllPanel.add(MemberReservations, "card6");

        MemberAnnouncements.setBackground(new java.awt.Color(56, 56, 56));

        tblAnnounce.setBackground(new java.awt.Color(41, 41, 41));
        tblAnnounce.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblAnnounce.setForeground(new java.awt.Color(255, 255, 255));
        tblAnnounce.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAnnounce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnnounceMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblAnnounce);

        txtAnnounce.setBackground(new java.awt.Color(51, 51, 51));
        txtAnnounce.setForeground(new java.awt.Color(255, 255, 255));

        btnWorkLoad1.setBackground(new java.awt.Color(41, 41, 41));
        btnWorkLoad1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnWorkLoad1.setForeground(new java.awt.Color(153, 153, 153));
        btnWorkLoad1.setText("View Announcements");
        btnWorkLoad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkLoad1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MemberAnnouncementsLayout = new javax.swing.GroupLayout(MemberAnnouncements);
        MemberAnnouncements.setLayout(MemberAnnouncementsLayout);
        MemberAnnouncementsLayout.setHorizontalGroup(
            MemberAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MemberAnnouncementsLayout.createSequentialGroup()
                .addGroup(MemberAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MemberAnnouncementsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWorkLoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MemberAnnouncementsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(MemberAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                            .addComponent(txtAnnounce))))
                .addGap(33, 33, 33))
        );
        MemberAnnouncementsLayout.setVerticalGroup(
            MemberAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemberAnnouncementsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtAnnounce, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWorkLoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        MemberAllPanel.add(MemberAnnouncements, "card3");

        getContentPane().add(MemberAllPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 600, 430));

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
            model.setLayeredPane(MemberAllPanel);
            model.setPanel(MemberDash);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
            PanelModel model = new PanelModel ();
            model.setLayeredPane(MemberAllPanel);
            model.setPanel(MemberAnnouncements);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
           EventController display = new EventController ();
           display.getDataToVariable();
           lblEvent.setText(display.Title);
           lblType.setText(display.Type);
           lblDate.setText(display.Date);
        
            PanelModel model = new PanelModel ();
            model.setLayeredPane(MemberAllPanel);
            model.setPanel(MemberEvents);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
            ReservationsController Controller = new ReservationsController ();          
            lblTotal.setText(String.valueOf(Controller.getTotalRoom()));
            lblCurrent.setText(String.valueOf(Controller.getCurrentAvailableRoom()));
            lblTotal1.setText(String.valueOf(Controller.getTotalHall()));
            lblCurrent1.setText(String.valueOf(Controller.getCurrentAvailableHall ()));
        
            PanelModel model = new PanelModel ();
            model.setLayeredPane(MemberAllPanel);
            model.setPanel(MemberReservations);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button4MouseClicked

    private void button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseClicked
            NavigationController controller = new NavigationController (this);
            controller.navigateToRegister1(new FrmRegister1());
    }//GEN-LAST:event_button7MouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        PanelModel model = new PanelModel ();
        model.setLayeredPane(ManageAccLayered);
        model.setPanel(BookRoom);

        PanelController Switch = new PanelController (model);
        Switch.switchPanels ();
    }//GEN-LAST:event_btn1MouseClicked

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered
        ButtonHoverController color = new ButtonHoverController ();
        color.setColor(btn1);
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        ButtonHoverController color = new ButtonHoverController ();
        color.ResetColor(btn1);
    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        PanelModel model = new PanelModel ();
        model.setLayeredPane(ManageAccLayered);
        model.setPanel(BookHall);

        PanelController Switch = new PanelController (model);
        Switch.switchPanels ();
    }//GEN-LAST:event_btn2MouseClicked

    private void btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseEntered
        ButtonHoverController color = new ButtonHoverController ();
        color.setColor(btn2);
    }//GEN-LAST:event_btn2MouseEntered

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        ButtonHoverController color = new ButtonHoverController ();
        color.ResetColor(btn2);
    }//GEN-LAST:event_btn2MouseExited

    private void btnWorkLoad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkLoad1ActionPerformed
        AnnouncementController controller = new AnnouncementController () ;
        controller. GetAnnToTable (tblAnnounce) ;
    }//GEN-LAST:event_btnWorkLoad1ActionPerformed

    private void tblAnnounceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnnounceMouseClicked
        AnnouncementController controller = new AnnouncementController () ;        
        txtAnnounce.setText(controller.DataToTextField(tblAnnounce));
    }//GEN-LAST:event_tblAnnounceMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            EventController event = new EventController ();
            event.GetEventResults(tblEvent);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnRoomViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomViewActionPerformed
           ReservationsController RController = new ReservationsController();
           RController.GetRoomResResults(tblMemRes);
    }//GEN-LAST:event_btnRoomViewActionPerformed

    private void btnHallClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHallClearActionPerformed
            txtDate1.setText("");
            txtForHours1.setText("");
            txtTime1.setText("");
            txtHallType.setText("");
    }//GEN-LAST:event_btnHallClearActionPerformed

    private void btnRoomBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomBookActionPerformed
         if ("".equals(txtDate.getText()) || "".equals(txtForHours.getText()) || "".equals(txtTime.getText()) || "".equals(txtRoomType.getText()))   {
               JOptionPane.showMessageDialog(null, "Make sure all the fields are Inserted");
         } else {
               ReservationsModel model = new ReservationsModel ();
               model.setDate(txtDate.getText());
               model.setHours (Integer.parseInt(txtForHours.getText()));
               model.setTime (txtTime.getText());
               model.setRoomType(txtRoomType.getText());
         
               ReservationsController RController = new ReservationsController();
               RController.saveRoomResDetails (model);
               RController.GetRoomResResults(tblMemRes);
         }
         
    }//GEN-LAST:event_btnRoomBookActionPerformed

    private void btnHallBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHallBookActionPerformed
        if ("".equals(txtDate1.getText()) || "".equals(txtForHours1.getText()) || "".equals(txtTime1.getText()) || "".equals(txtHallType.getText()))   {
               JOptionPane.showMessageDialog(null, "Make sure all the fields are Inserted");
         } else {       
                ReservationsModel model = new ReservationsModel ();
                model.setDate(txtDate1.getText());
                model.setHours (Integer.parseInt(txtForHours1.getText()));
                model.setTime (txtTime1.getText());
                model.setHallType(txtHallType.getText());
         
                ReservationsController RController = new ReservationsController();
                RController.saveHallResDetails (model);
        }
    }//GEN-LAST:event_btnHallBookActionPerformed

    private void btnHallViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHallViewActionPerformed
         ReservationsController RController = new ReservationsController();
         RController.GetHallResResults (tblResHall);
    }//GEN-LAST:event_btnHallViewActionPerformed

    private void btnRoomClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomClear1ActionPerformed
            txtDate.setText("");
            txtForHours.setText("");
            txtTime.setText("");
            txtRoomType.setText("");
    }//GEN-LAST:event_btnRoomClear1ActionPerformed

    private void btnHallCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHallCancleActionPerformed
         ReservationsController RController = new ReservationsController();
         RController.CancleHallReservation(tblResHall);
    }//GEN-LAST:event_btnHallCancleActionPerformed

    private void tblResHallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResHallMouseClicked
 
    }//GEN-LAST:event_tblResHallMouseClicked

    private void btnRoomCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomCancleActionPerformed
         ReservationsController RController = new ReservationsController();
         RController.CancleRoomReservation(tblMemRes);
    }//GEN-LAST:event_btnRoomCancleActionPerformed


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
            java.util.logging.Logger.getLogger(FrmMemberDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMemberDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMemberDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMemberDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmMemberDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookHall;
    private javax.swing.JPanel BookRoom;
    private javax.swing.JPanel LeftOptionPanel;
    private javax.swing.JLayeredPane ManageAccLayered;
    private javax.swing.JLayeredPane MemberAllPanel;
    private javax.swing.JPanel MemberAnnouncements;
    private javax.swing.JPanel MemberDash;
    private javax.swing.JPanel MemberEvents;
    private javax.swing.JPanel MemberReservations;
    private javax.swing.JPanel UpperSmallPanel;
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn2;
    private javax.swing.JButton btnHallBook;
    private javax.swing.JButton btnHallCancle;
    private javax.swing.JButton btnHallClear;
    private javax.swing.JButton btnHallView;
    private javax.swing.JButton btnRoomBook;
    private javax.swing.JButton btnRoomCancle;
    private javax.swing.JButton btnRoomClear1;
    private javax.swing.JButton btnRoomView;
    private javax.swing.JButton btnWorkLoad1;
    private javax.swing.JPanel button1;
    private javax.swing.JPanel button2;
    private javax.swing.JPanel button3;
    private javax.swing.JPanel button4;
    private javax.swing.JPanel button7;
    private javax.swing.JButton jButton5;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblCurrent;
    private javax.swing.JLabel lblCurrent1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblType;
    private javax.swing.JTable tblAnnounce;
    private javax.swing.JTable tblEvent;
    private javax.swing.JTable tblMemRes;
    private javax.swing.JTable tblResHall;
    private javax.swing.JTextField txtAnnounce;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtForHours;
    private javax.swing.JTextField txtForHours1;
    private javax.swing.JTextField txtHallType;
    private javax.swing.JTextField txtRoomType;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTime1;
    // End of variables declaration//GEN-END:variables
}
