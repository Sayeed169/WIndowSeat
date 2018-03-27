/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowseat;

import java.sql.*;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Sayeed
 */
public final class viewSeat extends javax.swing.JFrame {
    char [] seatPlan;
    int counter = 0;
    double price = 0;
    int total = 0;
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    /**
     * Creates new form viewSeat
     */
    public viewSeat() {
        initComponents();
        try{
            con = DB.connect();
            setDetails();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        setColor();
        groupButton();
    }
    
    /**
     * Connect with database and find latest update on seat status
     * @throws SQLException 
     */
    private void setDetails() throws SQLException{
        pst = con.prepareStatement("select * from rideinfo");
        rs = pst.executeQuery();
        
        int a=1;
        while(rs.next()){
            if(Main.id == a){
                counter = a;
                seatPlan = rs.getString("seat").toCharArray();
                price = rs.getDouble("price");
                time.setText("Departure Time: "+rs.getString("time"));
                title.setText(rs.getString("name").toUpperCase());
                pick.setText(rs.getString("start").toUpperCase());
                drop.setText(rs.getString("end").toUpperCase());
                break;
            }
            a++;
        }
        Main.id = -1;
    }
    
    /**
     * Create Group for Radio button
     */
    private void groupButton(){
        ButtonGroup b = new ButtonGroup();
        b.add(male);
        b.add(female);
    }
    
    @Override
    public String toString(){
        String s = "";
        for(int a=0; a<seatPlan.length; a++){
            s = s+seatPlan[a];
        }
        return s;
    }
    
    /**
     * Update changes in database
     * @throws SQLException
     */
    public void update() throws SQLException{
        pst = con.prepareStatement("update rideinfo set seat='"+toString()+"' where id="+counter);
        pst.execute();
        
        total = 0;
        price = 0;
        displayprice.setText("Total Price BDT: 0.0");
    }
    
    /**
     * Sets the color of the seats according to their status
     */
    public void setColor(){
        if(seatPlan[0]=='0')
            A1.setBackground(Color.red);
        if(seatPlan[1]=='0')
            A2.setBackground(Color.red);
        if(seatPlan[2]=='0')
            A3.setBackground(Color.red);
        if(seatPlan[3]=='0')
            A4.setBackground(Color.red);
        if(seatPlan[4]=='0')
            B1.setBackground(Color.red);
        if(seatPlan[5]=='0')
            B2.setBackground(Color.red);
        if(seatPlan[6]=='0')
            B3.setBackground(Color.red);
        if(seatPlan[7]=='0')
            B4.setBackground(Color.red);
        if(seatPlan[8]=='0')
            C1.setBackground(Color.red);
        if(seatPlan[9]=='0')
            C2.setBackground(Color.red);
        if(seatPlan[10]=='0')
            C3.setBackground(Color.red);
        if(seatPlan[11]=='0')
            C4.setBackground(Color.red);
        if(seatPlan[12]=='0')
            D1.setBackground(Color.red);
        if(seatPlan[13]=='0')
            D2.setBackground(Color.red);
        if(seatPlan[14]=='0')
            D3.setBackground(Color.red);
        if(seatPlan[15]=='0')
            D4.setBackground(Color.red);
        if(seatPlan[16]=='0')
            E1.setBackground(Color.red);
        if(seatPlan[17]=='0')
            E2.setBackground(Color.red);
        if(seatPlan[18]=='0')
            E3.setBackground(Color.red);
        if(seatPlan[19]=='0')
            E4.setBackground(Color.red);
        if(seatPlan[20]=='0')
            F1.setBackground(Color.red);
        if(seatPlan[21]=='0')
            F2.setBackground(Color.red);
        if(seatPlan[22]=='0')
            F3.setBackground(Color.red);
        if(seatPlan[23]=='0')
            F4.setBackground(Color.red);
        if(seatPlan[24]=='0')
            G1.setBackground(Color.red);
        if(seatPlan[25]=='0')
            G2.setBackground(Color.red);
        if(seatPlan[26]=='0')
            G3.setBackground(Color.red);
        if(seatPlan[27]=='0')
            G4.setBackground(Color.red);
        if(seatPlan[28]=='0')
            H1.setBackground(Color.red);
        if(seatPlan[29]=='0')
            H2.setBackground(Color.red);
        if(seatPlan[30]=='0')
            H3.setBackground(Color.red);
        if(seatPlan[31]=='0')
            H4.setBackground(Color.red);
        if(seatPlan[32]=='0')
            I1.setBackground(Color.red);
        if(seatPlan[33]=='0')
            I2.setBackground(Color.red);
        if(seatPlan[34]=='0')
            I3.setBackground(Color.red);
        if(seatPlan[35]=='0')
            I4.setBackground(Color.red);
        if(seatPlan[36]=='0')
            J1.setBackground(Color.red);
        if(seatPlan[37]=='0')
            J2.setBackground(Color.red);
        if(seatPlan[38]=='0')
            J3.setBackground(Color.red);
        if(seatPlan[39]=='0')
            J4.setBackground(Color.red);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        driver = new javax.swing.JLabel();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        G4 = new javax.swing.JButton();
        H1 = new javax.swing.JButton();
        H2 = new javax.swing.JButton();
        H3 = new javax.swing.JButton();
        H4 = new javax.swing.JButton();
        I1 = new javax.swing.JButton();
        I2 = new javax.swing.JButton();
        I3 = new javax.swing.JButton();
        I4 = new javax.swing.JButton();
        J1 = new javax.swing.JButton();
        J2 = new javax.swing.JButton();
        J3 = new javax.swing.JButton();
        J4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        cancle = new javax.swing.JButton();
        done = new javax.swing.JButton();
        displayprice = new javax.swing.JLabel();
        pick = new javax.swing.JLabel();
        drop = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Seat");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        driver.setBackground(new java.awt.Color(0, 0, 102));
        driver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        driver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        driver.setText("Driver");
        driver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        driver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                driverMouseClicked(evt);
            }
        });

        A1.setBackground(java.awt.Color.green);
        A1.setText("A1");
        A1.setPreferredSize(new java.awt.Dimension(50, 25));
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setBackground(java.awt.Color.green);
        A2.setText("A2");
        A2.setPreferredSize(new java.awt.Dimension(50, 25));
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setBackground(java.awt.Color.green);
        A3.setText("A3");
        A3.setPreferredSize(new java.awt.Dimension(50, 25));
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A4.setBackground(java.awt.Color.green);
        A4.setText("A4");
        A4.setPreferredSize(new java.awt.Dimension(50, 25));
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        B1.setBackground(java.awt.Color.green);
        B1.setText("B1");
        B1.setPreferredSize(new java.awt.Dimension(50, 25));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(java.awt.Color.green);
        B2.setText("B2");
        B2.setPreferredSize(new java.awt.Dimension(50, 25));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(java.awt.Color.green);
        B3.setText("B3");
        B3.setPreferredSize(new java.awt.Dimension(50, 25));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(java.awt.Color.green);
        B4.setText("B4");
        B4.setPreferredSize(new java.awt.Dimension(50, 25));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        C1.setBackground(java.awt.Color.green);
        C1.setText("C1");
        C1.setPreferredSize(new java.awt.Dimension(50, 25));
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setBackground(java.awt.Color.green);
        C2.setText("C2");
        C2.setPreferredSize(new java.awt.Dimension(50, 25));
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setBackground(java.awt.Color.green);
        C3.setText("C3");
        C3.setPreferredSize(new java.awt.Dimension(50, 25));
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C4.setBackground(java.awt.Color.green);
        C4.setText("C4");
        C4.setPreferredSize(new java.awt.Dimension(50, 25));
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        D1.setBackground(java.awt.Color.green);
        D1.setText("D1");
        D1.setPreferredSize(new java.awt.Dimension(50, 25));
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        D2.setBackground(java.awt.Color.green);
        D2.setText("D2");
        D2.setPreferredSize(new java.awt.Dimension(50, 25));
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        D3.setBackground(java.awt.Color.green);
        D3.setText("D3");
        D3.setPreferredSize(new java.awt.Dimension(50, 25));
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        D4.setBackground(java.awt.Color.green);
        D4.setText("D4");
        D4.setPreferredSize(new java.awt.Dimension(50, 25));
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        E1.setBackground(java.awt.Color.green);
        E1.setText("E1");
        E1.setPreferredSize(new java.awt.Dimension(50, 25));
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        E2.setBackground(java.awt.Color.green);
        E2.setText("E2");
        E2.setPreferredSize(new java.awt.Dimension(50, 25));
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        E3.setBackground(java.awt.Color.green);
        E3.setText("E3");
        E3.setPreferredSize(new java.awt.Dimension(50, 25));
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        E4.setBackground(java.awt.Color.green);
        E4.setText("E4");
        E4.setPreferredSize(new java.awt.Dimension(50, 25));
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        F1.setBackground(java.awt.Color.green);
        F1.setText("F1");
        F1.setPreferredSize(new java.awt.Dimension(50, 25));
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        F2.setBackground(java.awt.Color.green);
        F2.setText("F2");
        F2.setPreferredSize(new java.awt.Dimension(50, 25));
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        F3.setBackground(java.awt.Color.green);
        F3.setText("F3");
        F3.setPreferredSize(new java.awt.Dimension(50, 25));
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        F4.setBackground(java.awt.Color.green);
        F4.setText("F4");
        F4.setPreferredSize(new java.awt.Dimension(50, 25));
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        G1.setBackground(java.awt.Color.green);
        G1.setText("G1");
        G1.setPreferredSize(new java.awt.Dimension(50, 25));
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        G2.setBackground(java.awt.Color.green);
        G2.setText("G2");
        G2.setPreferredSize(new java.awt.Dimension(50, 25));
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        G3.setBackground(java.awt.Color.green);
        G3.setText("G3");
        G3.setPreferredSize(new java.awt.Dimension(50, 25));
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });

        G4.setBackground(java.awt.Color.green);
        G4.setText("G4");
        G4.setPreferredSize(new java.awt.Dimension(50, 25));
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });

        H1.setBackground(java.awt.Color.green);
        H1.setText("H1");
        H1.setPreferredSize(new java.awt.Dimension(50, 25));
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });

        H2.setBackground(java.awt.Color.green);
        H2.setText("H2");
        H2.setPreferredSize(new java.awt.Dimension(50, 25));
        H2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2ActionPerformed(evt);
            }
        });

        H3.setBackground(java.awt.Color.green);
        H3.setText("H3");
        H3.setPreferredSize(new java.awt.Dimension(50, 25));
        H3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H3ActionPerformed(evt);
            }
        });

        H4.setBackground(java.awt.Color.green);
        H4.setText("H4");
        H4.setPreferredSize(new java.awt.Dimension(50, 25));
        H4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H4ActionPerformed(evt);
            }
        });

        I1.setBackground(java.awt.Color.green);
        I1.setText("I1");
        I1.setMaximumSize(new java.awt.Dimension(45, 23));
        I1.setMinimumSize(new java.awt.Dimension(45, 23));
        I1.setPreferredSize(new java.awt.Dimension(50, 25));
        I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I1ActionPerformed(evt);
            }
        });

        I2.setBackground(java.awt.Color.green);
        I2.setText("I2");
        I2.setMaximumSize(new java.awt.Dimension(45, 23));
        I2.setMinimumSize(new java.awt.Dimension(45, 23));
        I2.setPreferredSize(new java.awt.Dimension(50, 25));
        I2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I2ActionPerformed(evt);
            }
        });

        I3.setBackground(java.awt.Color.green);
        I3.setText("I3");
        I3.setMaximumSize(new java.awt.Dimension(45, 23));
        I3.setMinimumSize(new java.awt.Dimension(45, 23));
        I3.setPreferredSize(new java.awt.Dimension(50, 25));
        I3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I3ActionPerformed(evt);
            }
        });

        I4.setBackground(java.awt.Color.green);
        I4.setText("I4");
        I4.setMaximumSize(new java.awt.Dimension(45, 23));
        I4.setMinimumSize(new java.awt.Dimension(45, 23));
        I4.setPreferredSize(new java.awt.Dimension(50, 25));
        I4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I4ActionPerformed(evt);
            }
        });

        J1.setBackground(java.awt.Color.green);
        J1.setText("J1");
        J1.setMaximumSize(new java.awt.Dimension(45, 23));
        J1.setMinimumSize(new java.awt.Dimension(45, 23));
        J1.setPreferredSize(new java.awt.Dimension(50, 25));
        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });

        J2.setBackground(java.awt.Color.green);
        J2.setText("J2");
        J2.setMaximumSize(new java.awt.Dimension(45, 23));
        J2.setMinimumSize(new java.awt.Dimension(45, 23));
        J2.setPreferredSize(new java.awt.Dimension(50, 25));
        J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J2ActionPerformed(evt);
            }
        });

        J3.setBackground(java.awt.Color.green);
        J3.setText("J3");
        J3.setMaximumSize(new java.awt.Dimension(45, 23));
        J3.setMinimumSize(new java.awt.Dimension(45, 23));
        J3.setPreferredSize(new java.awt.Dimension(50, 25));
        J3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J3ActionPerformed(evt);
            }
        });

        J4.setBackground(java.awt.Color.green);
        J4.setText("J4");
        J4.setMaximumSize(new java.awt.Dimension(45, 23));
        J4.setMinimumSize(new java.awt.Dimension(45, 23));
        J4.setPreferredSize(new java.awt.Dimension(50, 25));
        J4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Available");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Booked");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Selected");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Personal Details");

        jLabel5.setText("First Name: ");

        jLabel6.setText("Phone No. : ");

        phone.setText("+880");

        jLabel7.setText("e-mail ID: ");

        mail.setText("example@mail.com");

        jLabel8.setText("Gender: ");

        male.setSelected(true);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setText("Female");

        jLabel9.setText("Address : ");

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        jLabel10.setText("Boarding Point :");

        jLabel11.setText("Dropping Point");

        confirm.setBackground(new java.awt.Color(0, 255, 255));
        confirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel12.setText("Last Name");

        cancle.setBackground(new java.awt.Color(255, 0, 0));
        cancle.setText("Cancel");
        cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleActionPerformed(evt);
            }
        });

        done.setBackground(new java.awt.Color(0, 153, 0));
        done.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        displayprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        displayprice.setText("Total Price BDT: 0.0");

        pick.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        drop.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        time.setText("Time of departure: ");

        title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 204));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("jLabel14");

        error.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(driver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(F2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(G2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(H2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(confirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(done)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancle))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(female)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(drop, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(address))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(time)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(error, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(displayprice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(driver)
                            .addComponent(title))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(male)
                                    .addComponent(female)
                                    .addComponent(jLabel6)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(pick)
                                    .addComponent(drop))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(time)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayprice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cancle)
                                    .addComponent(confirm)
                                    .addComponent(done))
                                .addGap(2, 2, 2))
                            .addComponent(jSeparator1))))
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void driverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_driverMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_driverMouseClicked

    /**
     * Change seat color From yellow to green
     * @param a 
     */
    private void bookSeat(int a){
        seatPlan[a] = '1';
        total--;
        displayprice.setText("Total Price BDT: "+total*price);
    }
    
    /**
     * Change seat color From green to yellow
     * @param a 
     */
    private void unbookSeat(int a){
        seatPlan[a] = '0';
        total++;
        displayprice.setText("Total Price BDT: "+total*price);
    }
    
    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        if(!E4.getBackground().equals(Color.red)){
            if(E4.getBackground().equals(Color.yellow)){
                E4.setBackground(Color.green);
                bookSeat(19);
            }
            else{
                E4.setBackground(Color.yellow);
                unbookSeat(19);
            }
        }
    }//GEN-LAST:event_E4ActionPerformed

    private void I4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I4ActionPerformed
        if(!I4.getBackground().equals(Color.red)){
            if(I4.getBackground().equals(Color.yellow)){
                I4.setBackground(Color.green);
                bookSeat(35);
            }
            else{
                I4.setBackground(Color.yellow);
                unbookSeat(35);
            }
        }
    }//GEN-LAST:event_I4ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        if(total>0){
            if(!(fname.getText().equals("") || lname.getText().equals("") || 
                    mail.getText().equals("example@mail.com") || phone.getText().equals("+880") ||
                    address.getText().equals(""))){
                error.setText("");
                try{
                    update();
                    JOptionPane.showMessageDialog(null, "Ticket was bought successfully");
                    setColor();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Error: "+e);
                }
            }
            else{
                error.setText("Required Information To Confirm Booking");
            }
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        if(!A1.getBackground().equals(Color.red)){
            if(A1.getBackground().equals(Color.yellow)){
                A1.setBackground(Color.green);
                bookSeat(0);
            }
            else{
                A1.setBackground(Color.yellow);
                unbookSeat(0);
            }
        }
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        if(!A2.getBackground().equals(Color.red)){
            if(A2.getBackground().equals(Color.yellow)){
                A2.setBackground(Color.green);
                bookSeat(1);
            }
            else{
                A2.setBackground(Color.yellow);
                unbookSeat(1);
            }
        }
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        if(!A3.getBackground().equals(Color.red)){
            if(A3.getBackground().equals(Color.yellow)){
                A3.setBackground(Color.green);
                bookSeat(2);
            }
            else{
                A3.setBackground(Color.yellow);
                unbookSeat(2);
            }
        }
    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        if(!A4.getBackground().equals(Color.red)){
            if(A4.getBackground().equals(Color.yellow)){
                A4.setBackground(Color.green);
                bookSeat(3);
            }
            else{
                A4.setBackground(Color.yellow);
                unbookSeat(3);
            }
        }
    }//GEN-LAST:event_A4ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if(!B1.getBackground().equals(Color.red)){
            if(B1.getBackground().equals(Color.yellow)){
                B1.setBackground(Color.green);
                bookSeat(4);
            }
            else{
                B1.setBackground(Color.yellow);
                unbookSeat(4);
            }
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if(!B2.getBackground().equals(Color.red)){
            if(B2.getBackground().equals(Color.yellow)){
                B2.setBackground(Color.green);
                bookSeat(5);
            }
            else{
                B2.setBackground(Color.yellow);
                unbookSeat(5);
            }
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if(!B3.getBackground().equals(Color.red)){
            if(B3.getBackground().equals(Color.yellow)){
                B3.setBackground(Color.green);
                bookSeat(6);
            }
            else{
                B3.setBackground(Color.yellow);
                unbookSeat(6);
            }
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if(!B4.getBackground().equals(Color.red)){
            if(B4.getBackground().equals(Color.yellow)){
                B4.setBackground(Color.green);
                bookSeat(7);
            }
            else{
                B4.setBackground(Color.yellow);
                unbookSeat(7);
            }
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        if(!C1.getBackground().equals(Color.red)){
            if(C1.getBackground().equals(Color.yellow)){
                C1.setBackground(Color.green);
                bookSeat(8);
            }
            else{
                C1.setBackground(Color.yellow);
                unbookSeat(8);
            }
        }
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        if(!C2.getBackground().equals(Color.red)){
            if(C2.getBackground().equals(Color.yellow)){
                C2.setBackground(Color.green);
                bookSeat(9);
            }
            else{
                C2.setBackground(Color.yellow);
                unbookSeat(9);
            }
        }
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        if(!C3.getBackground().equals(Color.red)){
            if(C3.getBackground().equals(Color.yellow)){
                C3.setBackground(Color.green);
                bookSeat(10);
            }
            else{
                C3.setBackground(Color.yellow);
                unbookSeat(10);
            }
        }
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        if(!C4.getBackground().equals(Color.red)){
            if(C4.getBackground().equals(Color.yellow)){
                C4.setBackground(Color.green);
                bookSeat(11);
            }
            else{
                C4.setBackground(Color.yellow);
                unbookSeat(11);
            }
        }
    }//GEN-LAST:event_C4ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        if(!D1.getBackground().equals(Color.red)){
            if(D1.getBackground().equals(Color.yellow)){
                D1.setBackground(Color.green);
                bookSeat(12);
            }
            else{
                D1.setBackground(Color.yellow);
                unbookSeat(12);
            }
        }
    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        if(!D2.getBackground().equals(Color.red)){
            if(D2.getBackground().equals(Color.yellow)){
                D2.setBackground(Color.green);
                bookSeat(13);
            }
            else{
                D2.setBackground(Color.yellow);
                unbookSeat(13);
            }
        }
    }//GEN-LAST:event_D2ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        if(!D3.getBackground().equals(Color.red)){
            if(D3.getBackground().equals(Color.yellow)){
                D3.setBackground(Color.green);
                bookSeat(14);
            }
            else{
                D3.setBackground(Color.yellow);
                unbookSeat(14);
            }
        }
    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        if(!D4.getBackground().equals(Color.red)){
            if(D4.getBackground().equals(Color.yellow)){
                D4.setBackground(Color.green);
                bookSeat(15);
            }
            else{
                D4.setBackground(Color.yellow);
                unbookSeat(15);
            }
        }
    }//GEN-LAST:event_D4ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        if(!E1.getBackground().equals(Color.red)){
            if(E1.getBackground().equals(Color.yellow)){
                E1.setBackground(Color.green);
                bookSeat(16);
            }
            else{
                E1.setBackground(Color.yellow);
                unbookSeat(16);
            }
        }
    }//GEN-LAST:event_E1ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        if(!E2.getBackground().equals(Color.red)){
            if(E2.getBackground().equals(Color.yellow)){
                E2.setBackground(Color.green);
                bookSeat(17);
            }
            else{
                E2.setBackground(Color.yellow);
                unbookSeat(17);
            }
        }
    }//GEN-LAST:event_E2ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        if(!E3.getBackground().equals(Color.red)){
            if(E3.getBackground().equals(Color.yellow)){
                E3.setBackground(Color.green);
                bookSeat(18);
            }
            else{
                E3.setBackground(Color.yellow);
                unbookSeat(18);
            }
        }
    }//GEN-LAST:event_E3ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        if(!F1.getBackground().equals(Color.red)){
            if(F1.getBackground().equals(Color.yellow)){
                F1.setBackground(Color.green);
                bookSeat(20);
            }
            else{
                F1.setBackground(Color.yellow);
                unbookSeat(20);
            }
        }
    }//GEN-LAST:event_F1ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        if(!F2.getBackground().equals(Color.red)){
            if(F2.getBackground().equals(Color.yellow)){
                F2.setBackground(Color.green);
                bookSeat(21);
            }
            else{
                F2.setBackground(Color.yellow);
                unbookSeat(21);
            }
        }
    }//GEN-LAST:event_F2ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        if(!F3.getBackground().equals(Color.red)){
            if(F3.getBackground().equals(Color.yellow)){
                F3.setBackground(Color.green);
                bookSeat(22);
            }
            else{
                F3.setBackground(Color.yellow);
                unbookSeat(22);
            }
        }
    }//GEN-LAST:event_F3ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        if(!F4.getBackground().equals(Color.red)){
            if(F4.getBackground().equals(Color.yellow)){
                F4.setBackground(Color.green);
                bookSeat(23);
            }
            else{
                F4.setBackground(Color.yellow);
                unbookSeat(23);
            }
        }
    }//GEN-LAST:event_F4ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        if(!G1.getBackground().equals(Color.red)){
            if(G1.getBackground().equals(Color.yellow)){
                G1.setBackground(Color.green);
                bookSeat(24);
            }
            else{
                G1.setBackground(Color.yellow);
                unbookSeat(24);
            }
        }
    }//GEN-LAST:event_G1ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        if(!G2.getBackground().equals(Color.red)){
            if(G2.getBackground().equals(Color.yellow)){
                G2.setBackground(Color.green);
                bookSeat(25);
            }
            else{
                G2.setBackground(Color.yellow);
                unbookSeat(25);
            }
        }
    }//GEN-LAST:event_G2ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        if(!G3.getBackground().equals(Color.red)){
            if(G3.getBackground().equals(Color.yellow)){
                G3.setBackground(Color.green);
                bookSeat(26);
            }
            else{
                G3.setBackground(Color.yellow);
                unbookSeat(26);
            }
        }
    }//GEN-LAST:event_G3ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        if(!G4.getBackground().equals(Color.red)){
            if(G4.getBackground().equals(Color.yellow)){
                G4.setBackground(Color.green);
                bookSeat(27);
            }
            else{
                G4.setBackground(Color.yellow);
                unbookSeat(27);
            }
        }
    }//GEN-LAST:event_G4ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
        if(!H1.getBackground().equals(Color.red)){
            if(H1.getBackground().equals(Color.yellow)){
                H1.setBackground(Color.green);
                bookSeat(28);
            }
            else{
                H1.setBackground(Color.yellow);
                unbookSeat(28);
            }
        }
    }//GEN-LAST:event_H1ActionPerformed

    private void H2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2ActionPerformed
        if(!H2.getBackground().equals(Color.red)){
            if(H2.getBackground().equals(Color.yellow)){
                H2.setBackground(Color.green);
                bookSeat(29);
            }
            else{
                H2.setBackground(Color.yellow);
                unbookSeat(29);
            }
        }
    }//GEN-LAST:event_H2ActionPerformed

    private void H3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H3ActionPerformed
        if(!H3.getBackground().equals(Color.red)){
            if(H3.getBackground().equals(Color.yellow)){
                H3.setBackground(Color.green);
                bookSeat(30);
            }
            else{
                H3.setBackground(Color.yellow);
                unbookSeat(30);
            }
        }
    }//GEN-LAST:event_H3ActionPerformed

    private void H4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H4ActionPerformed
        if(!H4.getBackground().equals(Color.red)){
            if(H4.getBackground().equals(Color.yellow)){
                H4.setBackground(Color.green);
                bookSeat(31);
            }
            else{
                H4.setBackground(Color.yellow);
                unbookSeat(31);
            }
        }
    }//GEN-LAST:event_H4ActionPerformed

    private void I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I1ActionPerformed
        if(!I1.getBackground().equals(Color.red)){
            if(I1.getBackground().equals(Color.yellow)){
                I1.setBackground(Color.green);
                bookSeat(32);
            }
            else{
                I1.setBackground(Color.yellow);
                unbookSeat(32);
            }
        }
    }//GEN-LAST:event_I1ActionPerformed

    private void I2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I2ActionPerformed
        if(!I2.getBackground().equals(Color.red)){
            if(I2.getBackground().equals(Color.yellow)){
                I2.setBackground(Color.green);
                bookSeat(33);
            }
            else{
                I2.setBackground(Color.yellow);
                unbookSeat(33);
            }
        }
    }//GEN-LAST:event_I2ActionPerformed

    private void I3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I3ActionPerformed
        if(!I3.getBackground().equals(Color.red)){
            if(I3.getBackground().equals(Color.yellow)){
                I3.setBackground(Color.green);
                bookSeat(34);
            }
            else{
                I3.setBackground(Color.yellow);
                unbookSeat(34);
            }
        }
    }//GEN-LAST:event_I3ActionPerformed

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
        if(!J1.getBackground().equals(Color.red)){
            if(J1.getBackground().equals(Color.yellow)){
                J1.setBackground(Color.green);
                bookSeat(36);
            }
            else{
                J1.setBackground(Color.yellow);
                unbookSeat(36);
            }
        }
    }//GEN-LAST:event_J1ActionPerformed

    private void J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J2ActionPerformed
        if(!J2.getBackground().equals(Color.red)){
            if(J2.getBackground().equals(Color.yellow)){
                J2.setBackground(Color.green);
                bookSeat(37);
            }
            else{
                J2.setBackground(Color.yellow);
                unbookSeat(37);
            }
        }
    }//GEN-LAST:event_J2ActionPerformed

    private void J3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J3ActionPerformed
        if(!J3.getBackground().equals(Color.red)){
            if(J3.getBackground().equals(Color.yellow)){
                J3.setBackground(Color.green);
                bookSeat(38);
            }
            else{
                J3.setBackground(Color.yellow);
                unbookSeat(38);
            }
        }
    }//GEN-LAST:event_J3ActionPerformed

    private void J4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J4ActionPerformed
        if(!J4.getBackground().equals(Color.red)){
            if(J4.getBackground().equals(Color.yellow)){
                J4.setBackground(Color.green);
                bookSeat(39);
            }
            else{
                J4.setBackground(Color.yellow);
                unbookSeat(39);
            }
        }
    }//GEN-LAST:event_J4ActionPerformed

    private void cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        this.dispose();
    }//GEN-LAST:event_doneActionPerformed

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
            java.util.logging.Logger.getLogger(viewSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewSeat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton G1;
    private javax.swing.JButton G2;
    private javax.swing.JButton G3;
    private javax.swing.JButton G4;
    private javax.swing.JButton H1;
    private javax.swing.JButton H2;
    private javax.swing.JButton H3;
    private javax.swing.JButton H4;
    private javax.swing.JButton I1;
    private javax.swing.JButton I2;
    private javax.swing.JButton I3;
    private javax.swing.JButton I4;
    private javax.swing.JButton J1;
    private javax.swing.JButton J2;
    private javax.swing.JButton J3;
    private javax.swing.JButton J4;
    private javax.swing.JTextField address;
    private javax.swing.JButton cancle;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel displayprice;
    private javax.swing.JButton done;
    private javax.swing.JLabel driver;
    private javax.swing.JLabel drop;
    private javax.swing.JLabel error;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mail;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel pick;
    private javax.swing.JLabel time;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
