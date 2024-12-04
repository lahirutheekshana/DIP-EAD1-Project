
package club_view;

import club_controller.AccountController;
import club_controller.AnnouncementController;
import club_controller.ButtonHoverController;
import club_controller.EventController;
import club_controller.NavigationController;
import club_controller.PanelController;
import club_controller.ReservationsController;
import club_controller.SalaryController;
import club_model.AccountModel;
import club_model.AnnouncementModel;
import club_model.EventModel;
import club_model.PanelModel;
import club_model.ReservationsModel;
import club_model.SalaryModel;
import com.google.protobuf.TextFormat.ParseException;
import java.lang.ModuleLayer.Controller;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

public class FrmAdminDash extends javax.swing.JFrame {

    public FrmAdminDash() {
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
        button6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        button4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        button5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        UpperSmallPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        AllPanel = new javax.swing.JLayeredPane();
        AdminDash = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AdminStaffTrack = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtTrackStaffHours = new javax.swing.JTextField();
        txtTrackStaffId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TrackStaffTable = new javax.swing.JTable();
        jButton19 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        AdminAnnouncements = new javax.swing.JPanel();
        txtTitle = new javax.swing.JTextField();
        btnDelivery = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAnnouncements = new javax.swing.JTable();
        txtDescription = new javax.swing.JTextField();
        btnDel = new javax.swing.JButton();
        btnTrackView = new javax.swing.JButton();
        AdminEvents = new javax.swing.JPanel();
        txtDate = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtEventType = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtDes = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblEvents = new javax.swing.JTable();
        txtView = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        txtTitle1 = new javax.swing.JTextField();
        AdminManageAcc = new javax.swing.JPanel();
        ManageAccLayered = new javax.swing.JLayeredPane();
        staffTab = new javax.swing.JPanel();
        txtStaffFirst = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtStaffRole = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtStaffAge = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtStaffPassword = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtStaffEmail = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtStaffLast = new javax.swing.JTextField();
        btnStaffDelete = new javax.swing.JButton();
        btnStaffClear = new javax.swing.JButton();
        btnStaffUpdate = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        btnStaffView = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        memberTab = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        txtMemberFirst = new javax.swing.JTextField();
        txtMemberLast = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtMemberMobile = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtMemberAge = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtMemberEmail = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtMemberPassword = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        btnMemberView = new javax.swing.JButton();
        btnMemberUpdate = new javax.swing.JButton();
        btnMemberDelete = new javax.swing.JButton();
        btnMemberClear = new javax.swing.JButton();
        txtMemberID = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        salaryTab = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtWorkingDate = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtWorkingHours = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtStaffOt = new javax.swing.JTextField();
        txtStaffSalary = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblSalary = new javax.swing.JTable();
        btnSalaryView = new javax.swing.JButton();
        btnSalaryUpdate = new javax.swing.JButton();
        btnSalaryDelete = new javax.swing.JButton();
        btnSalaryClear = new javax.swing.JButton();
        btn1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btn2 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        btn = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        AdminReservations = new javax.swing.JPanel();
        ReservationLayered = new javax.swing.JLayeredPane();
        tab1 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        txtHallReservation = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblHallReservation = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        txtRoomReservation = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblRoomReservation = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        tab2 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        txtHallSize = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtHallType = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtHallNum = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblHall = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHallClear = new javax.swing.JButton();
        btnHallClear1 = new javax.swing.JButton();
        tab3 = new javax.swing.JPanel();
        txtRoomNum = new javax.swing.JTextField();
        btnRoomSave = new javax.swing.JButton();
        btnRoomUpdate = new javax.swing.JButton();
        btnRoomDelete = new javax.swing.JButton();
        btnRoomClear = new javax.swing.JButton();
        txtRoomType = new javax.swing.JTextField();
        txtRoomSize = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblRoom = new javax.swing.JTable();
        btnRoomView = new javax.swing.JButton();
        btnRoom = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        BtnRoomApprove = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        btnMember = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();

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
        jLabel16.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\track.png")); // NOI18N
        jLabel16.setText("TrackStaff");
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
        jLabel19.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\Micrphone.png")); // NOI18N
        jLabel19.setText("Annoucements");
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

        button6.setBackground(new java.awt.Color(33, 33, 33));
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button6MouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(120, 120, 120));
        jLabel20.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\approve.png")); // NOI18N
        jLabel20.setText("Reservations");
        jLabel20.setIconTextGap(15);

        javax.swing.GroupLayout button6Layout = new javax.swing.GroupLayout(button6);
        button6.setLayout(button6Layout);
        button6Layout.setHorizontalGroup(
            button6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button6Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        button6Layout.setVerticalGroup(
            button6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        LeftOptionPanel.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 40));

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
        jLabel21.setText("Events Manager");
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

        button5.setBackground(new java.awt.Color(33, 33, 33));
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button5MouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(120, 120, 120));
        jLabel22.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\Settings.png")); // NOI18N
        jLabel22.setText("Manage Accounts");
        jLabel22.setIconTextGap(15);

        javax.swing.GroupLayout button5Layout = new javax.swing.GroupLayout(button5);
        button5.setLayout(button5Layout);
        button5Layout.setHorizontalGroup(
            button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button5Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        button5Layout.setVerticalGroup(
            button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        LeftOptionPanel.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 40));

        jPanel22.setBackground(new java.awt.Color(33, 33, 33));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel23.setText("Manage Accounts");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        LeftOptionPanel.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 40));

        jLabel57.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 102, 102));
        jLabel57.setText("OZZY CLUB");
        LeftOptionPanel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setIcon(new javax.swing.ImageIcon("H:\\NIBM\\NIBM\\Diploma Level\\Semester 2\\Stage 02\\3. ENTERPRICE APPLICATION DEVELOPMENT !\\Icons\\club-50.png")); // NOI18N
        jLabel58.setMaximumSize(new java.awt.Dimension(70, 70));
        jLabel58.setMinimumSize(new java.awt.Dimension(70, 70));
        jLabel58.setPreferredSize(new java.awt.Dimension(70, 70));
        LeftOptionPanel.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 60, 50));

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
        UpperSmallPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 30, 30));

        getContentPane().add(UpperSmallPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 30));

        AllPanel.setLayout(new java.awt.CardLayout());

        AdminDash.setBackground(new java.awt.Color(56, 56, 56));
        AdminDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 45, 45));

        jPanel8.setBackground(new java.awt.Color(36, 36, 36));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("98");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 18, 18));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Events Hold");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        AdminDash.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 230, 130));

        jPanel3.setBackground(new java.awt.Color(45, 45, 45));

        jPanel10.setBackground(new java.awt.Color(36, 36, 36));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("132");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(18, 18, 18));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Announcements");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        AdminDash.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 230, 130));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        AdminDash.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 240, 130));

        jPanel6.setBackground(new java.awt.Color(45, 45, 45));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(36, 36, 36));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("200");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 500, 60));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 18, 18));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Members");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 230, 20));

        jPanel11.setBackground(new java.awt.Color(36, 36, 36));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(18, 18, 18));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Members");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 230, 20));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(18, 18, 18));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Members");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 230, 20));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(18, 18, 18));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Members");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 230, 20));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(18, 18, 18));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Members");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 230, 20));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 18, 18));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Staff Members");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 30));

        AdminDash.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 240, 130));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Hi Admin, Welcome");
        AdminDash.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 500, 50));

        AllPanel.add(AdminDash, "card2");

        AdminStaffTrack.setBackground(new java.awt.Color(56, 56, 56));

        jLabel26.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(160, 160, 160));
        jLabel26.setText("Staff ID :");

        jLabel29.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(160, 160, 160));
        jLabel29.setText("Monthly Worked Hours :");

        txtTrackStaffHours.setBackground(new java.awt.Color(51, 51, 51));
        txtTrackStaffHours.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtTrackStaffHours.setForeground(new java.awt.Color(255, 255, 255));
        txtTrackStaffHours.setCaretColor(new java.awt.Color(255, 255, 255));

        txtTrackStaffId.setBackground(new java.awt.Color(51, 51, 51));
        txtTrackStaffId.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtTrackStaffId.setForeground(new java.awt.Color(255, 255, 255));
        txtTrackStaffId.setCaretColor(new java.awt.Color(255, 255, 255));

        TrackStaffTable.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        TrackStaffTable.setForeground(new java.awt.Color(102, 102, 102));
        TrackStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Working Date", "Working Hours", "Staff Salary", "Staff OT Hours", "admin ID", "Staff ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TrackStaffTable);

        jButton19.setBackground(new java.awt.Color(41, 41, 41));
        jButton19.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(153, 153, 153));
        jButton19.setText("Clear");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(41, 41, 41));
        jButton26.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton26.setForeground(new java.awt.Color(153, 153, 153));
        jButton26.setText("Delete");

        jButton27.setBackground(new java.awt.Color(41, 41, 41));
        jButton27.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(153, 153, 153));
        jButton27.setText("View");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(41, 41, 41));
        jButton28.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(153, 153, 153));
        jButton28.setText("Save");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminStaffTrackLayout = new javax.swing.GroupLayout(AdminStaffTrack);
        AdminStaffTrack.setLayout(AdminStaffTrackLayout);
        AdminStaffTrackLayout.setHorizontalGroup(
            AdminStaffTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminStaffTrackLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(AdminStaffTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminStaffTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTrackStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrackStaffHours, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminStaffTrackLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(AdminStaffTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AdminStaffTrackLayout.createSequentialGroup()
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        AdminStaffTrackLayout.setVerticalGroup(
            AdminStaffTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminStaffTrackLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(AdminStaffTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrackStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdminStaffTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrackStaffHours, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(AdminStaffTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        AllPanel.add(AdminStaffTrack, "card3");

        AdminAnnouncements.setBackground(new java.awt.Color(56, 56, 56));
        AdminAnnouncements.setForeground(new java.awt.Color(255, 255, 255));

        txtTitle.setBackground(new java.awt.Color(51, 51, 51));
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setText("Enter Title Here");

        btnDelivery.setBackground(new java.awt.Color(41, 41, 41));
        btnDelivery.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnDelivery.setForeground(new java.awt.Color(153, 153, 153));
        btnDelivery.setText("Delivery");
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });

        btnClear1.setBackground(new java.awt.Color(41, 41, 41));
        btnClear1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnClear1.setForeground(new java.awt.Color(153, 153, 153));
        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        tblAnnouncements.setBackground(new java.awt.Color(41, 41, 41));
        tblAnnouncements.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblAnnouncements.setForeground(new java.awt.Color(255, 255, 255));
        tblAnnouncements.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblAnnouncements);

        txtDescription.setBackground(new java.awt.Color(51, 51, 51));
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.setText("Enter Announcement Here");

        btnDel.setBackground(new java.awt.Color(41, 41, 41));
        btnDel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnDel.setForeground(new java.awt.Color(153, 153, 153));
        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnTrackView.setBackground(new java.awt.Color(41, 41, 41));
        btnTrackView.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnTrackView.setForeground(new java.awt.Color(153, 153, 153));
        btnTrackView.setText("View");
        btnTrackView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminAnnouncementsLayout = new javax.swing.GroupLayout(AdminAnnouncements);
        AdminAnnouncements.setLayout(AdminAnnouncementsLayout);
        AdminAnnouncementsLayout.setHorizontalGroup(
            AdminAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminAnnouncementsLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(AdminAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminAnnouncementsLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(AdminAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(AdminAnnouncementsLayout.createSequentialGroup()
                        .addComponent(btnTrackView, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        AdminAnnouncementsLayout.setVerticalGroup(
            AdminAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminAnnouncementsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AdminAnnouncementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrackView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        AllPanel.add(AdminAnnouncements, "card4");

        AdminEvents.setBackground(new java.awt.Color(56, 56, 56));

        txtDate.setBackground(new java.awt.Color(51, 51, 51));
        txtDate.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        txtDate.setCaretColor(new java.awt.Color(255, 255, 255));

        txtTime.setBackground(new java.awt.Color(51, 51, 51));
        txtTime.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtTime.setForeground(new java.awt.Color(255, 255, 255));
        txtTime.setCaretColor(new java.awt.Color(255, 255, 255));

        txtEventType.setBackground(new java.awt.Color(51, 51, 51));
        txtEventType.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtEventType.setForeground(new java.awt.Color(255, 255, 255));
        txtEventType.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(160, 160, 160));
        jLabel30.setText("Event Date :");

        jLabel31.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(160, 160, 160));
        jLabel31.setText("Event Time :");

        jLabel32.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(160, 160, 160));
        jLabel32.setText("Event Type :");

        txtDes.setBackground(new java.awt.Color(51, 51, 51));
        txtDes.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtDes.setForeground(new java.awt.Color(255, 255, 255));
        txtDes.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(160, 160, 160));
        jLabel33.setText("Event Description");

        btnCreate.setBackground(new java.awt.Color(41, 41, 41));
        btnCreate.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(153, 153, 153));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(41, 41, 41));
        btnClear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(153, 153, 153));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tblEvents.setBackground(new java.awt.Color(41, 41, 41));
        tblEvents.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblEvents.setForeground(new java.awt.Color(255, 255, 255));
        tblEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Event ID", "Event Date", "Event Time", "Event Type", "Event Description", "post_date", "post_time", "Admin ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblEvents);

        txtView.setBackground(new java.awt.Color(41, 41, 41));
        txtView.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        txtView.setForeground(new java.awt.Color(153, 153, 153));
        txtView.setText("View");
        txtView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(160, 160, 160));
        jLabel48.setText("Event Title :");

        txtTitle1.setBackground(new java.awt.Color(51, 51, 51));
        txtTitle1.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtTitle1.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle1.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout AdminEventsLayout = new javax.swing.GroupLayout(AdminEvents);
        AdminEvents.setLayout(AdminEventsLayout);
        AdminEventsLayout.setHorizontalGroup(
            AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminEventsLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4)
                    .addGroup(AdminEventsLayout.createSequentialGroup()
                        .addGroup(AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AdminEventsLayout.createSequentialGroup()
                                .addGroup(AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEventType, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AdminEventsLayout.createSequentialGroup()
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
            .addGroup(AdminEventsLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(txtView, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AdminEventsLayout.setVerticalGroup(
            AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminEventsLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel33))
                .addGap(5, 5, 5)
                .addGroup(AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminEventsLayout.createSequentialGroup()
                        .addGroup(AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEventType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)))
                    .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AdminEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        AllPanel.add(AdminEvents, "card5");

        AdminManageAcc.setBackground(new java.awt.Color(56, 56, 56));
        AdminManageAcc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageAccLayered.setLayout(new java.awt.CardLayout());

        staffTab.setBackground(new java.awt.Color(56, 56, 56));

        txtStaffFirst.setBackground(new java.awt.Color(51, 51, 51));
        txtStaffFirst.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtStaffFirst.setForeground(new java.awt.Color(255, 255, 255));
        txtStaffFirst.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(160, 160, 160));
        jLabel34.setText("Last :");

        jLabel35.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(160, 160, 160));
        jLabel35.setText("Staff Role :");

        txtStaffRole.setBackground(new java.awt.Color(51, 51, 51));
        txtStaffRole.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtStaffRole.setForeground(new java.awt.Color(255, 255, 255));
        txtStaffRole.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel38.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(160, 160, 160));
        jLabel38.setText("Staff Age :");

        txtStaffAge.setBackground(new java.awt.Color(51, 51, 51));
        txtStaffAge.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtStaffAge.setForeground(new java.awt.Color(255, 255, 255));
        txtStaffAge.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(160, 160, 160));
        jLabel39.setText("Staff Email :");

        txtStaffPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtStaffPassword.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtStaffPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtStaffPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel40.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(160, 160, 160));
        jLabel40.setText("Staff Password :");

        txtStaffEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtStaffEmail.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtStaffEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtStaffEmail.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel41.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(160, 160, 160));
        jLabel41.setText("First :");

        txtStaffLast.setBackground(new java.awt.Color(51, 51, 51));
        txtStaffLast.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtStaffLast.setForeground(new java.awt.Color(255, 255, 255));
        txtStaffLast.setCaretColor(new java.awt.Color(255, 255, 255));

        btnStaffDelete.setBackground(new java.awt.Color(41, 41, 41));
        btnStaffDelete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnStaffDelete.setForeground(new java.awt.Color(153, 153, 153));
        btnStaffDelete.setText("Delete");
        btnStaffDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffDeleteActionPerformed(evt);
            }
        });

        btnStaffClear.setBackground(new java.awt.Color(41, 41, 41));
        btnStaffClear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnStaffClear.setForeground(new java.awt.Color(153, 153, 153));
        btnStaffClear.setText("Clear");
        btnStaffClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffClearActionPerformed(evt);
            }
        });

        btnStaffUpdate.setBackground(new java.awt.Color(41, 41, 41));
        btnStaffUpdate.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnStaffUpdate.setForeground(new java.awt.Color(153, 153, 153));
        btnStaffUpdate.setText("Update");
        btnStaffUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffUpdateActionPerformed(evt);
            }
        });

        tblStaff.setBackground(new java.awt.Color(41, 41, 41));
        tblStaff.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblStaff.setForeground(new java.awt.Color(255, 255, 255));
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Staff ID", "Staff Role", "First Name", "Last Name", "Staff Age", "Staff Email", "Staff Password", "Admin ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tblStaff);

        btnStaffView.setBackground(new java.awt.Color(41, 41, 41));
        btnStaffView.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnStaffView.setForeground(new java.awt.Color(153, 153, 153));
        btnStaffView.setText("View");
        btnStaffView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffViewActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(160, 160, 160));
        jLabel49.setText("Staff ID:");

        txtStaffID.setBackground(new java.awt.Color(51, 51, 51));
        txtStaffID.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtStaffID.setForeground(new java.awt.Color(255, 255, 255));
        txtStaffID.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout staffTabLayout = new javax.swing.GroupLayout(staffTab);
        staffTab.setLayout(staffTabLayout);
        staffTabLayout.setHorizontalGroup(
            staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffTabLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(staffTabLayout.createSequentialGroup()
                        .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(staffTabLayout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStaffEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, staffTabLayout.createSequentialGroup()
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtStaffPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, staffTabLayout.createSequentialGroup()
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtStaffAge, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(staffTabLayout.createSequentialGroup()
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtStaffRole, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(staffTabLayout.createSequentialGroup()
                                    .addComponent(jLabel41)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtStaffFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel34)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtStaffLast, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(staffTabLayout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStaffUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStaffView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStaffDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStaffClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        staffTabLayout.setVerticalGroup(
            staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffTabLayout.createSequentialGroup()
                .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(staffTabLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtStaffFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(txtStaffLast, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(staffTabLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStaffRole, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel38)
                                    .addComponent(txtStaffAge, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel40))
                            .addGroup(staffTabLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(txtStaffPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(staffTabLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStaffView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnStaffUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnStaffDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStaffEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(btnStaffClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        ManageAccLayered.add(staffTab, "card2");

        memberTab.setBackground(new java.awt.Color(56, 56, 56));

        jLabel42.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(160, 160, 160));
        jLabel42.setText("First :");

        txtMemberFirst.setBackground(new java.awt.Color(51, 51, 51));
        txtMemberFirst.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtMemberFirst.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberFirst.setCaretColor(new java.awt.Color(255, 255, 255));

        txtMemberLast.setBackground(new java.awt.Color(51, 51, 51));
        txtMemberLast.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtMemberLast.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberLast.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel43.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(160, 160, 160));
        jLabel43.setText("Last :");

        jLabel44.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(160, 160, 160));
        jLabel44.setText("Member Mobile :");

        txtMemberMobile.setBackground(new java.awt.Color(51, 51, 51));
        txtMemberMobile.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtMemberMobile.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberMobile.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel45.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(160, 160, 160));
        jLabel45.setText("Member Age :");

        txtMemberAge.setBackground(new java.awt.Color(51, 51, 51));
        txtMemberAge.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtMemberAge.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberAge.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel46.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(160, 160, 160));
        jLabel46.setText("Member Email :");

        txtMemberEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtMemberEmail.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtMemberEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberEmail.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel47.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(160, 160, 160));
        jLabel47.setText("Member Password :");

        txtMemberPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtMemberPassword.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtMemberPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        tblMember.setBackground(new java.awt.Color(41, 41, 41));
        tblMember.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblMember.setForeground(new java.awt.Color(255, 255, 255));
        tblMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "M_ ID", "M_First Name", "M_Last Name", "M_ Email", "M_Password", "M_Age", "M_Mobile", "Admin ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblMember);

        btnMemberView.setBackground(new java.awt.Color(41, 41, 41));
        btnMemberView.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnMemberView.setForeground(new java.awt.Color(153, 153, 153));
        btnMemberView.setText("View");
        btnMemberView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberViewActionPerformed(evt);
            }
        });

        btnMemberUpdate.setBackground(new java.awt.Color(41, 41, 41));
        btnMemberUpdate.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnMemberUpdate.setForeground(new java.awt.Color(153, 153, 153));
        btnMemberUpdate.setText("Update");
        btnMemberUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberUpdateActionPerformed(evt);
            }
        });

        btnMemberDelete.setBackground(new java.awt.Color(41, 41, 41));
        btnMemberDelete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnMemberDelete.setForeground(new java.awt.Color(153, 153, 153));
        btnMemberDelete.setText("Delete");
        btnMemberDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberDeleteActionPerformed(evt);
            }
        });

        btnMemberClear.setBackground(new java.awt.Color(41, 41, 41));
        btnMemberClear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnMemberClear.setForeground(new java.awt.Color(153, 153, 153));
        btnMemberClear.setText("Clear");
        btnMemberClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberClearActionPerformed(evt);
            }
        });

        txtMemberID.setBackground(new java.awt.Color(51, 51, 51));
        txtMemberID.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtMemberID.setForeground(new java.awt.Color(255, 255, 255));
        txtMemberID.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel59.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(160, 160, 160));
        jLabel59.setText("Member ID :");

        javax.swing.GroupLayout memberTabLayout = new javax.swing.GroupLayout(memberTab);
        memberTab.setLayout(memberTabLayout);
        memberTabLayout.setHorizontalGroup(
            memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberTabLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(memberTabLayout.createSequentialGroup()
                        .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(memberTabLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMemberPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, memberTabLayout.createSequentialGroup()
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMemberEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, memberTabLayout.createSequentialGroup()
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMemberAge, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(memberTabLayout.createSequentialGroup()
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMemberMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(memberTabLayout.createSequentialGroup()
                                        .addComponent(jLabel59)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberTabLayout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMemberFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMemberLast, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMemberView, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMemberUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMemberDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMemberClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        memberTabLayout.setVerticalGroup(
            memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberTabLayout.createSequentialGroup()
                .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(memberTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMemberFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemberLast, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemberMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemberAge, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemberEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(memberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemberPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)))
                    .addGroup(memberTabLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnMemberView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMemberUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMemberDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMemberClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        ManageAccLayered.add(memberTab, "card3");

        salaryTab.setBackground(new java.awt.Color(56, 56, 56));

        jLabel50.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(160, 160, 160));
        jLabel50.setText("ID :");

        ID.setBackground(new java.awt.Color(51, 51, 51));
        ID.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel51.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(160, 160, 160));
        jLabel51.setText("Working Date :");

        txtWorkingDate.setBackground(new java.awt.Color(51, 51, 51));
        txtWorkingDate.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtWorkingDate.setForeground(new java.awt.Color(255, 255, 255));
        txtWorkingDate.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(160, 160, 160));
        jLabel52.setText("Working Hours");
        jLabel52.setToolTipText("");

        txtWorkingHours.setBackground(new java.awt.Color(51, 51, 51));
        txtWorkingHours.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtWorkingHours.setForeground(new java.awt.Color(255, 255, 255));
        txtWorkingHours.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel53.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(160, 160, 160));
        jLabel53.setText("Staff OT :");

        txtStaffOt.setBackground(new java.awt.Color(51, 51, 51));
        txtStaffOt.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtStaffOt.setForeground(new java.awt.Color(255, 255, 255));
        txtStaffOt.setCaretColor(new java.awt.Color(255, 255, 255));

        txtStaffSalary.setBackground(new java.awt.Color(51, 51, 51));
        txtStaffSalary.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtStaffSalary.setForeground(new java.awt.Color(255, 255, 255));
        txtStaffSalary.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel54.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(160, 160, 160));
        jLabel54.setText("Staff Salary :");

        tblSalary.setBackground(new java.awt.Color(41, 41, 41));
        tblSalary.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblSalary.setForeground(new java.awt.Color(255, 255, 255));
        tblSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Work_Date ", "Work_Time", "Staff_Salary", "Staff_OT", "Admin ID", "Staff ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblSalary);

        btnSalaryView.setBackground(new java.awt.Color(41, 41, 41));
        btnSalaryView.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSalaryView.setForeground(new java.awt.Color(153, 153, 153));
        btnSalaryView.setText("View");
        btnSalaryView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaryViewActionPerformed(evt);
            }
        });

        btnSalaryUpdate.setBackground(new java.awt.Color(41, 41, 41));
        btnSalaryUpdate.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSalaryUpdate.setForeground(new java.awt.Color(153, 153, 153));
        btnSalaryUpdate.setText("Update");
        btnSalaryUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaryUpdateActionPerformed(evt);
            }
        });

        btnSalaryDelete.setBackground(new java.awt.Color(41, 41, 41));
        btnSalaryDelete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSalaryDelete.setForeground(new java.awt.Color(153, 153, 153));
        btnSalaryDelete.setText("Delete");
        btnSalaryDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaryDeleteActionPerformed(evt);
            }
        });

        btnSalaryClear.setBackground(new java.awt.Color(41, 41, 41));
        btnSalaryClear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSalaryClear.setForeground(new java.awt.Color(153, 153, 153));
        btnSalaryClear.setText("Clear");
        btnSalaryClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaryClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout salaryTabLayout = new javax.swing.GroupLayout(salaryTab);
        salaryTab.setLayout(salaryTabLayout);
        salaryTabLayout.setHorizontalGroup(
            salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salaryTabLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salaryTabLayout.createSequentialGroup()
                        .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(salaryTabLayout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStaffSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, salaryTabLayout.createSequentialGroup()
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtStaffOt, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, salaryTabLayout.createSequentialGroup()
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtWorkingHours, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, salaryTabLayout.createSequentialGroup()
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtWorkingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(salaryTabLayout.createSequentialGroup()
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalaryView, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalaryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalaryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalaryClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        salaryTabLayout.setVerticalGroup(
            salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salaryTabLayout.createSequentialGroup()
                .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salaryTabLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)))
                    .addGroup(salaryTabLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnSalaryView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salaryTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWorkingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWorkingHours, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStaffOt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalaryClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtStaffSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel54))))
                    .addGroup(salaryTabLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnSalaryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnSalaryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        ManageAccLayered.add(salaryTab, "card4");

        AdminManageAcc.add(ManageAccLayered, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 390));

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
        jLabel25.setText("STAFF");

        javax.swing.GroupLayout btn1Layout = new javax.swing.GroupLayout(btn1);
        btn1.setLayout(btn1Layout);
        btn1Layout.setHorizontalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btn1Layout.setVerticalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        AdminManageAcc.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 30));

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
        jLabel37.setText("MEMBER");
        jLabel37.setToolTipText("");

        javax.swing.GroupLayout btn2Layout = new javax.swing.GroupLayout(btn2);
        btn2.setLayout(btn2Layout);
        btn2Layout.setHorizontalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(30, 30, 30))
        );
        btn2Layout.setVerticalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        AdminManageAcc.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        btn.setBackground(new java.awt.Color(33, 33, 33));
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMouseExited(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("SALARY");
        jLabel36.setToolTipText("");

        javax.swing.GroupLayout btnLayout = new javax.swing.GroupLayout(btn);
        btn.setLayout(btnLayout);
        btnLayout.setHorizontalGroup(
            btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btnLayout.setVerticalGroup(
            btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        AdminManageAcc.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 30));

        AllPanel.add(AdminManageAcc, "card6");

        AdminReservations.setBackground(new java.awt.Color(56, 56, 56));
        AdminReservations.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReservationLayered.setLayout(new java.awt.CardLayout());

        tab1.setBackground(new java.awt.Color(56, 56, 56));

        jLabel55.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(160, 160, 160));
        jLabel55.setText("Hall Reservation ID :");

        txtHallReservation.setBackground(new java.awt.Color(51, 51, 51));
        txtHallReservation.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtHallReservation.setForeground(new java.awt.Color(255, 255, 255));
        txtHallReservation.setCaretColor(new java.awt.Color(255, 255, 255));

        tblHallReservation.setBackground(new java.awt.Color(41, 41, 41));
        tblHallReservation.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblHallReservation.setForeground(new java.awt.Color(255, 255, 255));
        tblHallReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DateNow", "Date", "Hours", "TimeNow", "Time", "M_ID", "Admin ID", "Hall_Number", "Confirmation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHallReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHallReservationMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblHallReservation);

        jButton17.setBackground(new java.awt.Color(41, 41, 41));
        jButton17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(153, 153, 153));
        jButton17.setText("Decline");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(41, 41, 41));
        jButton20.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(153, 153, 153));
        jButton20.setText("Approve");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        txtRoomReservation.setBackground(new java.awt.Color(51, 51, 51));
        txtRoomReservation.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtRoomReservation.setForeground(new java.awt.Color(255, 255, 255));
        txtRoomReservation.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel56.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(160, 160, 160));
        jLabel56.setText("Room Reservation ID :");

        tblRoomReservation.setBackground(new java.awt.Color(41, 41, 41));
        tblRoomReservation.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblRoomReservation.setForeground(new java.awt.Color(255, 255, 255));
        tblRoomReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DateNow", "Date", "Hours", "TimeNow", "Time", "M_ID", "Admin ID", "Room_Number", "Confirmation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRoomReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomReservationMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblRoomReservation);

        jButton21.setBackground(new java.awt.Color(41, 41, 41));
        jButton21.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(153, 153, 153));
        jButton21.setText("View");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane12)
                            .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(tab1Layout.createSequentialGroup()
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRoomReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane8)
                                    .addGroup(tab1Layout.createSequentialGroup()
                                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHallReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txtHallReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(txtRoomReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        ReservationLayered.add(tab1, "card2");

        tab2.setBackground(new java.awt.Color(56, 56, 56));

        jLabel61.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(160, 160, 160));
        jLabel61.setText("Hall Size :");

        txtHallSize.setBackground(new java.awt.Color(51, 51, 51));
        txtHallSize.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtHallSize.setForeground(new java.awt.Color(255, 255, 255));
        txtHallSize.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel62.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(160, 160, 160));
        jLabel62.setText("Hall Type :");

        txtHallType.setBackground(new java.awt.Color(51, 51, 51));
        txtHallType.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtHallType.setForeground(new java.awt.Color(255, 255, 255));
        txtHallType.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel63.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(160, 160, 160));
        jLabel63.setText("Hall Number :");

        txtHallNum.setBackground(new java.awt.Color(51, 51, 51));
        txtHallNum.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtHallNum.setForeground(new java.awt.Color(255, 255, 255));
        txtHallNum.setCaretColor(new java.awt.Color(255, 255, 255));

        tblHall.setBackground(new java.awt.Color(41, 41, 41));
        tblHall.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblHall.setForeground(new java.awt.Color(255, 255, 255));
        tblHall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hall Number", "Hall Size (m2)", "Hall Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHallMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblHall);

        btnSave.setBackground(new java.awt.Color(41, 41, 41));
        btnSave.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(153, 153, 153));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(41, 41, 41));
        btnUpdate.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(153, 153, 153));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(41, 41, 41));
        btnDelete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 153, 153));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnHallClear.setBackground(new java.awt.Color(41, 41, 41));
        btnHallClear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnHallClear.setForeground(new java.awt.Color(153, 153, 153));
        btnHallClear.setText("Clear");
        btnHallClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHallClearActionPerformed(evt);
            }
        });

        btnHallClear1.setBackground(new java.awt.Color(41, 41, 41));
        btnHallClear1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnHallClear1.setForeground(new java.awt.Color(153, 153, 153));
        btnHallClear1.setText("View");
        btnHallClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHallClear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHallClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHallClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHallSize, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHallType, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHallNum, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHallNum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHallSize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHallType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addGap(18, 18, 18)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHallClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHallClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        ReservationLayered.add(tab2, "card3");

        tab3.setBackground(new java.awt.Color(56, 56, 56));

        txtRoomNum.setBackground(new java.awt.Color(51, 51, 51));
        txtRoomNum.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtRoomNum.setForeground(new java.awt.Color(255, 255, 255));
        txtRoomNum.setCaretColor(new java.awt.Color(255, 255, 255));

        btnRoomSave.setBackground(new java.awt.Color(41, 41, 41));
        btnRoomSave.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRoomSave.setForeground(new java.awt.Color(153, 153, 153));
        btnRoomSave.setText("Save");
        btnRoomSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomSaveActionPerformed(evt);
            }
        });

        btnRoomUpdate.setBackground(new java.awt.Color(41, 41, 41));
        btnRoomUpdate.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRoomUpdate.setForeground(new java.awt.Color(153, 153, 153));
        btnRoomUpdate.setText("Update");
        btnRoomUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRoomUpdateMouseClicked(evt);
            }
        });
        btnRoomUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomUpdateActionPerformed(evt);
            }
        });

        btnRoomDelete.setBackground(new java.awt.Color(41, 41, 41));
        btnRoomDelete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRoomDelete.setForeground(new java.awt.Color(153, 153, 153));
        btnRoomDelete.setText("Delete");
        btnRoomDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomDeleteActionPerformed(evt);
            }
        });

        btnRoomClear.setBackground(new java.awt.Color(41, 41, 41));
        btnRoomClear.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRoomClear.setForeground(new java.awt.Color(153, 153, 153));
        btnRoomClear.setText("Clear");
        btnRoomClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomClearActionPerformed(evt);
            }
        });

        txtRoomType.setBackground(new java.awt.Color(51, 51, 51));
        txtRoomType.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtRoomType.setForeground(new java.awt.Color(255, 255, 255));
        txtRoomType.setCaretColor(new java.awt.Color(255, 255, 255));

        txtRoomSize.setBackground(new java.awt.Color(51, 51, 51));
        txtRoomSize.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        txtRoomSize.setForeground(new java.awt.Color(255, 255, 255));
        txtRoomSize.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel64.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(160, 160, 160));
        jLabel64.setText("Room Size :");

        jLabel73.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(160, 160, 160));
        jLabel73.setText("Room Type :");

        jLabel74.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(160, 160, 160));
        jLabel74.setText("Room Number :");

        tblRoom.setBackground(new java.awt.Color(41, 41, 41));
        tblRoom.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblRoom.setForeground(new java.awt.Color(255, 255, 255));
        tblRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room Number", "Room Size (m2)", "Room Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tblRoom);

        btnRoomView.setBackground(new java.awt.Color(41, 41, 41));
        btnRoomView.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRoomView.setForeground(new java.awt.Color(153, 153, 153));
        btnRoomView.setText("View");
        btnRoomView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tab3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tab3Layout.createSequentialGroup()
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRoomSize, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tab3Layout.createSequentialGroup()
                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tab3Layout.createSequentialGroup()
                                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRoomNum, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(tab3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRoomSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRoomUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRoomDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRoomView, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnRoomClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane13)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoomNum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoomSize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73))
                .addGap(18, 18, 18)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoomClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoomSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoomUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoomDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoomView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ReservationLayered.add(tab3, "card4");

        AdminReservations.add(ReservationLayered, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 600, 390));

        btnRoom.setBackground(new java.awt.Color(33, 33, 33));
        btnRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRoomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRoomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRoomMouseExited(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("ROOM");

        javax.swing.GroupLayout btnRoomLayout = new javax.swing.GroupLayout(btnRoom);
        btnRoom.setLayout(btnRoomLayout);
        btnRoomLayout.setHorizontalGroup(
            btnRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRoomLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel28)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        btnRoomLayout.setVerticalGroup(
            btnRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRoomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AdminReservations.add(btnRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 110, 30));

        BtnRoomApprove.setBackground(new java.awt.Color(33, 33, 33));
        BtnRoomApprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRoomApproveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnRoomApproveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnRoomApproveMouseExited(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(102, 102, 102));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("MANAGE");

        javax.swing.GroupLayout BtnRoomApproveLayout = new javax.swing.GroupLayout(BtnRoomApprove);
        BtnRoomApprove.setLayout(BtnRoomApproveLayout);
        BtnRoomApproveLayout.setHorizontalGroup(
            BtnRoomApproveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnRoomApproveLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        BtnRoomApproveLayout.setVerticalGroup(
            BtnRoomApproveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        AdminReservations.add(BtnRoomApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 30));

        btnMember.setBackground(new java.awt.Color(33, 33, 33));
        btnMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMemberMouseExited(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("HALL");

        javax.swing.GroupLayout btnMemberLayout = new javax.swing.GroupLayout(btnMember);
        btnMember.setLayout(btnMemberLayout);
        btnMemberLayout.setHorizontalGroup(
            btnMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMemberLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel27)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        btnMemberLayout.setVerticalGroup(
            btnMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AdminReservations.add(btnMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 30));

        AllPanel.add(AdminReservations, "card7");

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

    private void button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseEntered
               ButtonHoverController color = new ButtonHoverController ();
               color.setColor(button5);
    }//GEN-LAST:event_button5MouseEntered

    private void button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseExited
               ButtonHoverController color = new ButtonHoverController ();
               color.ResetColor(button5);
    }//GEN-LAST:event_button5MouseExited

    private void button6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseEntered
               ButtonHoverController color = new ButtonHoverController ();
               color.setColor(button6);
    }//GEN-LAST:event_button6MouseEntered

    private void button6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseExited
               ButtonHoverController color = new ButtonHoverController ();
               color.ResetColor(button6);
    }//GEN-LAST:event_button6MouseExited

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
            model.setPanel(AdminDash);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
            PanelModel model = new PanelModel ();
            model.setLayeredPane(AllPanel);
            model.setPanel(AdminStaffTrack);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
            PanelModel model = new PanelModel ();
            model.setLayeredPane(AllPanel);
            model.setPanel(AdminAnnouncements);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
            PanelModel model = new PanelModel ();
            model.setLayeredPane(AllPanel);
            model.setPanel(AdminEvents);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button4MouseClicked

    private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
            PanelModel model = new PanelModel ();
            model.setLayeredPane(AllPanel);
            model.setPanel(AdminManageAcc);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button5MouseClicked

    private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
            PanelModel model = new PanelModel ();
            model.setLayeredPane(AllPanel);
            model.setPanel(AdminReservations);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_button6MouseClicked

    private void button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseClicked
            NavigationController controller = new NavigationController (this);
            controller.navigateToRegister1(new FrmRegister1());
    }//GEN-LAST:event_button7MouseClicked

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered
               ButtonHoverController color = new ButtonHoverController ();
               color.setColor(btn1);
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
               ButtonHoverController color = new ButtonHoverController ();
               color.ResetColor(btn1);
    }//GEN-LAST:event_btn1MouseExited

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
            PanelModel model = new PanelModel ();
            model.setLayeredPane(ManageAccLayered);
            model.setPanel(staffTab);
            
            PanelController Switch = new PanelController (model);
            Switch.switchPanels ();
    }//GEN-LAST:event_btn1MouseClicked

    private void btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseExited
        ButtonHoverController color = new ButtonHoverController ();
        color.ResetColor(btn);
    }//GEN-LAST:event_btnMouseExited

    private void btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseEntered
        ButtonHoverController color = new ButtonHoverController ();
        color.setColor(btn);
    }//GEN-LAST:event_btnMouseEntered

    private void btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseClicked
        PanelModel model = new PanelModel ();
        model.setLayeredPane(ManageAccLayered);
        model.setPanel(salaryTab);

        PanelController Switch = new PanelController (model);
        Switch.switchPanels ();
    }//GEN-LAST:event_btnMouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        PanelModel model = new PanelModel ();
        model.setLayeredPane(ManageAccLayered);
        model.setPanel(memberTab);

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

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        txtTrackStaffId.setText("");
        txtTrackStaffHours.setText("");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
       if("".equals(txtTrackStaffId.getText()) && "".equals(txtTrackStaffHours.getText())) {
           JOptionPane.showMessageDialog(null,"Make sure that all the fields are Filled");
       } else {
             SalaryModel salaryModel = new SalaryModel () ; 
             salaryModel.setStaffID(Integer.parseInt(txtTrackStaffId.getText()));
             salaryModel.setW_hours( Integer.parseInt(txtTrackStaffHours.getText()));
         
             SalaryController salaryCon = new SalaryController (salaryModel) ;
             salaryCon.saveDetails ();
       }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
         if ("".equals(txtTrackStaffId.getText())) {
              JOptionPane.showMessageDialog(null,"Try Again with Relevent Staff ID");
         } else {
             SalaryModel salaryModel = new SalaryModel () ;  
             salaryModel.setStaffID(Integer.parseInt(txtTrackStaffId.getText()));
         
             SalaryController salaryCon = new SalaryController (salaryModel) ;
             salaryCon.GetSalaryResults2 (TrackStaffTable); 
         }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
          txtTitle.setText("");
          txtDescription.setText("");
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
          AnnouncementModel model = new AnnouncementModel ();
          model.setTitle(txtTitle.getText());
          model.setDescription(txtDescription.getText());
          
          AnnouncementController controller = new AnnouncementController () ;
          controller. InsertToAnn(model,tblAnnouncements);
    }//GEN-LAST:event_btnDeliveryActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
          AnnouncementController controller = new AnnouncementController () ;
          controller.DeleteFromAnn(tblAnnouncements);
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
              txtTime.setText("");
              txtEventType.setText("");
              txtDate.setText("");
              txtDes.setText("");
              txtTitle1.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
         if("".equals(txtTitle1.getText()) || "".equals(txtDate.getText()) || "".equals(txtTime.getText()) || "".equals(txtEventType.getText()) || "".equals(txtDes.getText()) ){
             JOptionPane.showMessageDialog(null, "Make sure that All the FIelds are Filled Properly");
         }  else {
        
            EventModel model = new EventModel ();
            model.setTime(txtTime.getText());
            model.setDate( txtDate.getText());
            model.setEventType(txtEventType.getText());              
            model.setDes(txtDes.getText());
            model.setTitle(txtTitle1.getText());
            
            
            EventController event = new EventController ();
            event.inputDetails (model);  
            event.GetEventResults(tblEvents);
         }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewActionPerformed
            EventController event = new EventController ();
            event.GetEventResults(tblEvents);
    }//GEN-LAST:event_txtViewActionPerformed

    private void btnStaffClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffClearActionPerformed
          txtStaffFirst.setText("");
          txtStaffLast.setText("");
          txtStaffRole.setText("");
          txtStaffAge.setText("");
          txtStaffPassword.setText("");
          txtStaffEmail.setText("");
          txtStaffID.setText("");
    }//GEN-LAST:event_btnStaffClearActionPerformed

    private void btnStaffViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffViewActionPerformed
        AccountController controller = new AccountController ();
        controller.GetResultsOfStaff (tblStaff);
    }//GEN-LAST:event_btnStaffViewActionPerformed

    private void btnMemberViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberViewActionPerformed
          AccountController controller = new AccountController ();
          controller.GetResultsOfMember (tblMember);
    }//GEN-LAST:event_btnMemberViewActionPerformed

    private void btnSalaryViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaryViewActionPerformed
          AccountController controller = new AccountController ();
          controller.GetResultsOfSalary (tblSalary);
    }//GEN-LAST:event_btnSalaryViewActionPerformed

    private void btnStaffUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffUpdateActionPerformed
         if ("".equals(txtStaffID.getText()) || "".equals(txtStaffFirst.getText()) || "".equals(txtStaffLast.getText()) || "".equals(txtStaffRole.getText()) || "".equals(txtStaffAge.getText()) || "".equals(txtStaffPassword.getText()) || "".equals(txtStaffEmail.getText())) {
             JOptionPane.showMessageDialog(null, "Make sure All the Fields are FIlled Properly ");
         } else {
               AccountModel model = new AccountModel () ;
               model.setStaffId(Integer.parseInt(txtStaffID.getText()));
               model.setStaffFname(txtStaffFirst.getText());
               model.setStaffLname(txtStaffLast.getText());
               model.setStaffRole(txtStaffRole.getText());
               model.setAge(Integer.parseInt(txtStaffAge.getText()));
               model.setStaffPassword(txtStaffPassword.getText());
               model.setStaffEmail(txtStaffEmail.getText());
        
              AccountController controller = new AccountController ();
              controller.updateStaffAccount(model);
         }
        
    }//GEN-LAST:event_btnStaffUpdateActionPerformed

    private void btnMemberUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberUpdateActionPerformed
         if ("".equals(txtMemberID.getText()) || "".equals(txtMemberFirst.getText()) || "".equals(txtMemberLast.getText()) || "".equals(txtMemberEmail.getText()) || "".equals(txtMemberPassword.getText()) || "".equals(txtMemberAge.getText()) || "".equals(txtMemberMobile.getText())) {
             JOptionPane.showMessageDialog(null,"Make sure all the fields are Inserted");
         } else {
              AccountModel model = new AccountModel () ;
              model.setMemberId(Integer.parseInt(txtMemberID.getText()));
              model.setMemberFname(txtMemberFirst.getText());
              model.setMemberLname(txtMemberLast.getText()); 
              model.setMemberEmail(txtMemberEmail.getText());
              model.setMemberPassword(txtMemberPassword.getText());
              model.setMemberAge(Integer.parseInt(txtMemberAge.getText()));
              model.setMemberMobile(txtMemberMobile.getText());
         
              AccountController controller = new AccountController ();
              controller.updateMemberAccount(model);
         }
    }//GEN-LAST:event_btnMemberUpdateActionPerformed

    private void btnSalaryUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaryUpdateActionPerformed
         if ("".equals(txtWorkingDate.getText()) || "".equals(txtWorkingHours.getText()) || "".equals(txtStaffSalary.getText()) || "".equals(txtStaffOt.getText()) || "".equals(ID.getText()) ) {
                JOptionPane.showMessageDialog(null, "Make sure all the fields are Inserted");
         } else  { 
                 AccountModel model = new AccountModel ();
                 model.setWorkingDate(txtWorkingDate.getText());
                 model.setWorkingHours(Integer.parseInt(txtWorkingHours.getText()));
                 model.setStaffSalary(Double.parseDouble(txtStaffSalary.getText()));
                 model.setStaffOT(Integer.parseInt(txtStaffOt.getText()));
                 model.setStaffId(Integer.parseInt(ID.getText()));
                 
                 AccountController controller = new AccountController ();
                 controller.updateSalaryAccount(model);
         }     
    }//GEN-LAST:event_btnSalaryUpdateActionPerformed

    private void btnStaffDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffDeleteActionPerformed
         if ("".equals(txtStaffID.getText())) {
                 JOptionPane.showMessageDialog(null, "Make sure that Staff ID Inserted Properly");
         } else {
                 AccountModel model = new AccountModel () ;
                 model.setStaffId(Integer.parseInt(txtStaffID.getText()));
             
                AccountController controller = new AccountController ();
                controller.deleteStaffRow(model);
         }
    }//GEN-LAST:event_btnStaffDeleteActionPerformed

    private void btnMemberDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberDeleteActionPerformed
        if ("".equals(txtMemberID.getText())) {
              JOptionPane.showMessageDialog(null,"Make sure Member ID is Insert");
        } else {
              AccountModel model = new AccountModel () ;
              model.setMemberId(Integer.parseInt(txtMemberID.getText()));
         
              AccountController controller = new AccountController ();
              controller.deleteMemberRow(model);
        }          
    }//GEN-LAST:event_btnMemberDeleteActionPerformed

    private void btnSalaryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaryDeleteActionPerformed
         if ("".equals(ID.getText())) {
             JOptionPane.showMessageDialog(null,"Make Sure ID is Inserted");
         } else {
              AccountModel model = new AccountModel () ;
              model.setStaffId(Integer.parseInt(ID.getText()));
         
              AccountController controller = new AccountController ();
              controller.deleteSalaryRow(model);
         }
    }//GEN-LAST:event_btnSalaryDeleteActionPerformed

    private void btnSalaryClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaryClearActionPerformed
          ID.setText("");
          txtWorkingDate.setText("");
          txtWorkingHours.setText("");
          txtStaffOt.setText("");
          txtStaffSalary.setText("");
    }//GEN-LAST:event_btnSalaryClearActionPerformed

    private void btnMemberClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberClearActionPerformed
          txtMemberID.setText("");
          txtMemberFirst.setText("");
          txtMemberLast.setText("");
          txtMemberMobile.setText("");
          txtMemberAge.setText("");
          txtMemberEmail.setText("");
          txtMemberPassword.setText("");
    }//GEN-LAST:event_btnMemberClearActionPerformed

    private void BtnRoomApproveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRoomApproveMouseExited
        ButtonHoverController color = new ButtonHoverController ();
        color.ResetColor(BtnRoomApprove);
    }//GEN-LAST:event_BtnRoomApproveMouseExited

    private void BtnRoomApproveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRoomApproveMouseEntered
        ButtonHoverController color = new ButtonHoverController ();
        color.setColor(BtnRoomApprove);
    }//GEN-LAST:event_BtnRoomApproveMouseEntered

    private void BtnRoomApproveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRoomApproveMouseClicked
        PanelModel model = new PanelModel ();
        model.setLayeredPane(ReservationLayered);
        model.setPanel(tab1);

        PanelController Switch = new PanelController (model);
        Switch.switchPanels ();
    }//GEN-LAST:event_BtnRoomApproveMouseClicked

    private void btnRoomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRoomMouseExited
        ButtonHoverController color = new ButtonHoverController ();
        color.ResetColor(btnRoom);
    }//GEN-LAST:event_btnRoomMouseExited

    private void btnRoomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRoomMouseEntered
        ButtonHoverController color = new ButtonHoverController ();
        color.setColor(btnRoom);
    }//GEN-LAST:event_btnRoomMouseEntered

    private void btnRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRoomMouseClicked
        PanelModel model = new PanelModel ();
        model.setLayeredPane(ReservationLayered);
        model.setPanel(tab3);

        PanelController Switch = new PanelController (model);
        Switch.switchPanels ();
    }//GEN-LAST:event_btnRoomMouseClicked

    private void btnMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMouseExited
        ButtonHoverController color = new ButtonHoverController ();
        color.ResetColor(btnMember);
    }//GEN-LAST:event_btnMemberMouseExited

    private void btnMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMouseEntered
        ButtonHoverController color = new ButtonHoverController ();
        color.setColor(btnMember);
    }//GEN-LAST:event_btnMemberMouseEntered

    private void btnMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMouseClicked
        PanelModel model = new PanelModel ();
        model.setLayeredPane(ReservationLayered);
        model.setPanel(tab2);

        PanelController Switch = new PanelController (model);
        Switch.switchPanels ();
    }//GEN-LAST:event_btnMemberMouseClicked

    private void btnHallClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHallClearActionPerformed
       txtHallType.setText("");
       txtHallSize.setText("");
       txtHallNum.setText("");
    }//GEN-LAST:event_btnHallClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       ReservationsModel model = new ReservationsModel();
       model.setHallType(txtHallType.getText());
       model.setHallSize(Double.parseDouble(txtHallSize.getText()));
       model.setHallNum(Integer.parseInt(txtHallNum.getText()));
       
       ReservationsController RController = new ReservationsController();
       RController.addHalls(model);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRoomSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomSaveActionPerformed
       ReservationsModel model = new ReservationsModel();
       model.setRoomType(txtRoomType.getText());
       model.setRoomSize(Double.parseDouble(txtRoomSize.getText()));
       model.setRoomNum(Integer.parseInt(txtRoomNum.getText()));
       
       ReservationsController RController = new ReservationsController();
       RController.addRooms(model);
    }//GEN-LAST:event_btnRoomSaveActionPerformed

    private void btnRoomClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomClearActionPerformed
        txtRoomSize.setText("");
        txtRoomNum.setText("");
        txtRoomType.setText("");
    }//GEN-LAST:event_btnRoomClearActionPerformed

    private void btnRoomViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomViewActionPerformed
        ReservationsController RController = new ReservationsController();
        RController.ShowRoomInTable(tblRoom);
    }//GEN-LAST:event_btnRoomViewActionPerformed

    private void btnHallClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHallClear1ActionPerformed
        ReservationsController RController = new ReservationsController();
        RController.ShowHallInTable(tblHall);
    }//GEN-LAST:event_btnHallClear1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        ReservationsModel model = new ReservationsModel(); 
        model.setHallType(txtHallType.getText());
        model.setHallSize(Double.parseDouble(txtHallSize.getText()));
        
        ReservationsController controller  = new ReservationsController ();
        controller. UpdateHallDetails (model,controller.GetIdentity(tblHall));
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblHallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHallMouseClicked
         ReservationsController controller  = new ReservationsController ();
         txtHallNum.setText(Integer.toString(controller.GetIdentity(tblHall)));
    }//GEN-LAST:event_tblHallMouseClicked

    private void btnRoomUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRoomUpdateMouseClicked

    }//GEN-LAST:event_btnRoomUpdateMouseClicked

    private void tblRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomMouseClicked
         ReservationsController controller  = new ReservationsController ();
         txtRoomNum.setText(Integer.toString(controller.GetIdentity(tblRoom)));
    }//GEN-LAST:event_tblRoomMouseClicked

    private void btnRoomUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomUpdateActionPerformed
        ReservationsModel model = new ReservationsModel(); 
        model.setRoomType(txtRoomType.getText());
        model.setRoomSize(Double.parseDouble(txtRoomSize.getText()));
        
        ReservationsController controller  = new ReservationsController ();
        controller. UpdateRoomDetails (model,controller.GetIdentity(tblRoom));
    }//GEN-LAST:event_btnRoomUpdateActionPerformed

    private void btnRoomDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomDeleteActionPerformed
            ReservationsController controller  = new ReservationsController ();
            controller.RemoveRoom (controller.GetIdentity(tblRoom));
    }//GEN-LAST:event_btnRoomDeleteActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
            ReservationsController controller  = new ReservationsController ();
            controller.RemoveHall (controller.GetIdentity(tblHall));
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
          ReservationsController RController = new ReservationsController();
          RController.GetHallResResults (tblHallReservation);
          RController.GetRoomResResults (tblRoomReservation);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if("".equals(txtHallReservation.getText()) && "".equals(txtRoomReservation.getText())) {
              JOptionPane.showMessageDialog(null, "Please Select ID");
        } else if ("".equals(txtRoomReservation.getText())) {
             ReservationsController controller = new ReservationsController ();
             controller.UpdateHallConfirmation(Integer.parseInt(txtHallReservation.getText()));
        } else if ("".equals(txtHallReservation.getText())) {
             ReservationsController controller = new ReservationsController ();
             controller.UpdateRoomConfirmation(Integer.parseInt(txtRoomReservation.getText()));
        } else {
             ReservationsController controller = new ReservationsController ();
             controller .UpdateHallConfirmation(Integer.parseInt(txtHallReservation.getText()));
             controller.UpdateRoomConfirmation(Integer.parseInt(txtRoomReservation.getText()));
        } 
    }//GEN-LAST:event_jButton20ActionPerformed

    private void tblHallReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHallReservationMouseClicked
         ReservationsController controller = new ReservationsController ();
         txtHallReservation.setText(String.valueOf(controller.GetIdentity(tblHallReservation)));
    }//GEN-LAST:event_tblHallReservationMouseClicked

    private void tblRoomReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomReservationMouseClicked
        ReservationsController controller = new ReservationsController ();
        txtRoomReservation.setText(String.valueOf(controller.GetIdentity(tblRoomReservation)));
        
    }//GEN-LAST:event_tblRoomReservationMouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if("".equals(txtHallReservation.getText()) && "".equals(txtRoomReservation.getText())) {
              JOptionPane.showMessageDialog(null, "Please Select ID");
        } else if ("".equals(txtRoomReservation.getText())) {
             ReservationsController controller = new ReservationsController ();
             controller.RemoveHallReservation(Integer.parseInt(txtHallReservation.getText()));
        } else if ("".equals(txtHallReservation.getText())) {
             ReservationsController controller = new ReservationsController ();
             controller.RemoveRoomReservation(Integer.parseInt(txtRoomReservation.getText()));
        } else {
             ReservationsController controller = new ReservationsController ();
             controller.RemoveHallReservation(Integer.parseInt(txtHallReservation.getText()));
             controller.RemoveRoomReservation(Integer.parseInt(txtRoomReservation.getText()));
        }         
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        NavigationController controller = new NavigationController (this);
        controller.navigateToFrmAdminMessage(new FrmAdminMessage());
    }//GEN-LAST:event_jLabel24MouseClicked

    private void btnTrackViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackViewActionPerformed
        AnnouncementController controller = new AnnouncementController ();
        controller.GetAnnToTable (tblAnnouncements);
    }//GEN-LAST:event_btnTrackViewActionPerformed

    

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
            java.util.logging.Logger.getLogger(FrmAdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmAdminDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminAnnouncements;
    private javax.swing.JPanel AdminDash;
    private javax.swing.JPanel AdminEvents;
    private javax.swing.JPanel AdminManageAcc;
    private javax.swing.JPanel AdminReservations;
    private javax.swing.JPanel AdminStaffTrack;
    private javax.swing.JLayeredPane AllPanel;
    private javax.swing.JPanel BtnRoomApprove;
    private javax.swing.JTextField ID;
    private javax.swing.JPanel LeftOptionPanel;
    private javax.swing.JLayeredPane ManageAccLayered;
    private javax.swing.JLayeredPane ReservationLayered;
    private javax.swing.JTable TrackStaffTable;
    private javax.swing.JPanel UpperSmallPanel;
    private javax.swing.JPanel btn;
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn2;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnHallClear;
    private javax.swing.JButton btnHallClear1;
    private javax.swing.JPanel btnMember;
    private javax.swing.JButton btnMemberClear;
    private javax.swing.JButton btnMemberDelete;
    private javax.swing.JButton btnMemberUpdate;
    private javax.swing.JButton btnMemberView;
    private javax.swing.JPanel btnRoom;
    private javax.swing.JButton btnRoomClear;
    private javax.swing.JButton btnRoomDelete;
    private javax.swing.JButton btnRoomSave;
    private javax.swing.JButton btnRoomUpdate;
    private javax.swing.JButton btnRoomView;
    private javax.swing.JButton btnSalaryClear;
    private javax.swing.JButton btnSalaryDelete;
    private javax.swing.JButton btnSalaryUpdate;
    private javax.swing.JButton btnSalaryView;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStaffClear;
    private javax.swing.JButton btnStaffDelete;
    private javax.swing.JButton btnStaffUpdate;
    private javax.swing.JButton btnStaffView;
    private javax.swing.JButton btnTrackView;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel button1;
    private javax.swing.JPanel button2;
    private javax.swing.JPanel button3;
    private javax.swing.JPanel button4;
    private javax.swing.JPanel button5;
    private javax.swing.JPanel button6;
    private javax.swing.JPanel button7;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel memberTab;
    private javax.swing.JPanel salaryTab;
    private javax.swing.JPanel staffTab;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JTable tblAnnouncements;
    private javax.swing.JTable tblEvents;
    private javax.swing.JTable tblHall;
    private javax.swing.JTable tblHallReservation;
    private javax.swing.JTable tblMember;
    private javax.swing.JTable tblRoom;
    private javax.swing.JTable tblRoomReservation;
    private javax.swing.JTable tblSalary;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEventType;
    private javax.swing.JTextField txtHallNum;
    private javax.swing.JTextField txtHallReservation;
    private javax.swing.JTextField txtHallSize;
    private javax.swing.JTextField txtHallType;
    private javax.swing.JTextField txtMemberAge;
    private javax.swing.JTextField txtMemberEmail;
    private javax.swing.JTextField txtMemberFirst;
    private javax.swing.JTextField txtMemberID;
    private javax.swing.JTextField txtMemberLast;
    private javax.swing.JTextField txtMemberMobile;
    private javax.swing.JTextField txtMemberPassword;
    private javax.swing.JTextField txtRoomNum;
    private javax.swing.JTextField txtRoomReservation;
    private javax.swing.JTextField txtRoomSize;
    private javax.swing.JTextField txtRoomType;
    private javax.swing.JTextField txtStaffAge;
    private javax.swing.JTextField txtStaffEmail;
    private javax.swing.JTextField txtStaffFirst;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtStaffLast;
    private javax.swing.JTextField txtStaffOt;
    private javax.swing.JTextField txtStaffPassword;
    private javax.swing.JTextField txtStaffRole;
    private javax.swing.JTextField txtStaffSalary;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtTitle1;
    private javax.swing.JTextField txtTrackStaffHours;
    private javax.swing.JTextField txtTrackStaffId;
    private javax.swing.JButton txtView;
    private javax.swing.JTextField txtWorkingDate;
    private javax.swing.JTextField txtWorkingHours;
    // End of variables declaration//GEN-END:variables
}
