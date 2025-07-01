/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbits_soft;

import com.lowagie.text.Chunk;
import com.lowagie.text.Element;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.FontSelector;
import com.lowagie.text.pdf.GrayColor;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.AlphaComposite;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author NBITS
 */
public class Nbits_Soft extends JFrame {

    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    JPanel checkpanel,jp2,adneteacher,startpay,setting,jpo;
    JTextField pagecheck,in_number,tein_amo,te_ins,tein_ac,tein,teinf,lo_no,bnks,insiid,insibi,insib,insi,newteacher,newteacherNAME,startpayt,amoun,acctea,instali,instal,dedu;
    JTextArea are,las_add_te,tearea,inskarea,bankarea,teinfor;
    JLabel  whit,alltetel,pagetotal_print,edit_te,wel_up,wel,tot_te,page_tot,balance,viewall,tot_pa,total_bal,savepay,allte,exceptions,sensab,sensa,start,std2,std3,std,std1,label1,label2,savete,clearte,tot1;
    JComboBox cbe1ch,cbech,pag,cbe,cbe1,cbeb,icbeb,dura,mr;
    JCheckBox cb;
    boolean bool;
     String bnk_id = null;
     String sumid;
    PreparedStatement pstme; 
   JPanel passwordPanel;
    JPasswordField passwordField;
    JLabel statusLabel;
    
   Nbits_Soft(){
       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setUndecorated(true);        
       setLayout(null);
        
        
 JPanel jp1 = new JPanel();
 jp1.setLayout(null);
 jp1.setOpaque(false);              // main panel
 jp1.setBounds(00,40,1000,520);
 add(jp1); 
 
 
  JPanel bo = new JPanel();
 bo.setLayout(null);
 //bo.setBackground(new Color(244, 0, 4, 240));
 bo.setBackground(Color.GRAY);
 bo.setBounds(00,0,1000,1);
 add(bo); 
 
 JPanel bo1 = new JPanel();
 bo1.setLayout(null);
 //bo1.setBackground(new Color(244, 0, 4, 240));
 bo1.setBackground(Color.GRAY);
 bo1.setBounds(00,0,1,700);
 add(bo1);
 
 JPanel bo2 = new JPanel();
 bo2.setLayout(null);
 //bo2.setBackground(new Color(244, 0, 4, 240));
 bo2.setBounds(999,0,1,700);
 bo2.setBackground(Color.GRAY);
 add(bo2);
 
 JPanel bo3 = new JPanel();
 bo3.setLayout(null);
 //bo3.setBackground(new Color(244, 0, 4, 240));
 bo3.setBackground(Color.GRAY);
 bo3.setBounds(0,559,1000,1);
 add(bo3);
 
  JPanel bo4 = new JPanel();
 bo4.setLayout(null);
 //bo4.setBackground(new Color(244, 0, 4, 240));
 bo4.setBackground(Color.GRAY);
 bo4.setBounds(0,39,1000,1);
 add(bo4);
 
 
   JPanel jp3 = new JPanel();
 jp3.setLayout(null);
 //jp3.setBackground(new Color(157, 2, 22, 240));
 jp3.setBackground(Color.GRAY);
 jp3.setBounds(00,430,1000,50);
 jp1.add(jp3);   
        
   
 

        
 std2 = new JLabel();
	std2.setBounds(400,110,160,20);
        std2.setForeground(Color.WHITE);
        Font tr2 = new Font("Ds-digital",Font.ITALIC, 20) ;
        std2.setFont(tr2);
        
        
  exceptions = new JLabel("Information - No errors");
	exceptions.setBounds(50,530,200,20);
        exceptions.setForeground(Color.WHITE);
//        Font tr2 = new Font("Ds-digital",Font.ITALIC, 30) ;
//        exceptions.setFont(tr2);
	add(exceptions);
        
       JLabel exce = new JLabel("S.D.B. Dassanayake 20232188 UOW ID - w2082824");
	exce.setBounds(720,530,300,20);
        exce.setForeground(Color.WHITE);

	add(exce);
        
        
        //password  
        passwordPanel = new JPanel();
        passwordPanel.setLayout(null);
        passwordPanel.setBounds(430, 320, 300, 120);
        passwordPanel.setBackground(new Color(10, 30, 40, 240));
        add(passwordPanel);

        // Label
        JLabel label = new JLabel("Enter Password:");
        label.setBounds(10, 20, 120, 25);
        label.setForeground(Color.WHITE);
        passwordPanel.add(label);

        // Password field
        passwordField = new JPasswordField();
        passwordField.setBounds(130, 20, 150, 25);
        passwordPanel.add(passwordField);

        // Submit button
        JButton submitBtn = new JButton("Login");
        submitBtn.setBounds(100, 60, 100, 30);
        passwordPanel.add(submitBtn);

        // Status label
        statusLabel = new JLabel("");
        statusLabel.setBounds(10, 100, 280, 25);
         statusLabel.setForeground(Color.RED);
        passwordPanel.add(statusLabel);

        // Button click event
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField.getPassword());
                if (checkPassword(password)) {
                    statusLabel.setText("Login successful!");
                    passwordPanel.setVisible(false); // hide the panel
                    jpo.setVisible(false);
                } else {
                    statusLabel.setText("Incorrect password!");
                }
            }

           private boolean checkPassword(String inputPassword) {
                String url = "jdbc:mysql://localhost:3306/paysheet";
        String username = "root";
        String dbPassword = "";

        try (Connection conn = DriverManager.getConnection(url, username, dbPassword)) {
            String sql = "SELECT * FROM users WHERE password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, inputPassword);

            ResultSet rs = stmt.executeQuery();
            return rs.next(); // if a match is found

        } catch (Exception ex) {
            ex.printStackTrace();
            statusLabel.setText("Error connecting to DB");
            return false;
        }
           }
        });
        
        
        
        std3 = new JLabel();
	std3.setBounds(230,10,160,20);
        std3.setForeground(Color.WHITE);
        Font tr3 = new Font("Ds-digital",Font.ITALIC, 20) ;
        std3.setFont(tr3);
	add(std3);
        
        std = new JLabel();
	std.setBounds(180,10,100,20);
        std.setForeground(Color.WHITE);
        Font tr = new Font("Ds-digital",Font.ITALIC, 20) ;
        std.setFont(tr);
	add(std);
        
        std1 = new JLabel();
	std1.setBounds(750,5,90,25);
        std1.setForeground(Color.WHITE);
        Font tr1 = new Font("Calibri",Font.BOLD, 12) ;
        std1.setFont(tr1);
	//add(std1);

                String dayNames[] = new DateFormatSymbols().getWeekdays();
		Calendar da2 = Calendar.getInstance();
		std1.setText(dayNames[da2.get(Calendar.DAY_OF_WEEK)]);
        

	Calendar cac = Calendar.getInstance();
     
        int day1 = cac.get(Calendar.DATE);
        int month1 = cac.get(Calendar.MONTH) + 1;
        int year1 = cac.get(Calendar.YEAR);
        std.setText(String.valueOf(year1)); 
        std3.setText(String.valueOf(month1+" - "+day1)); 
        
        final DateFormat df = new SimpleDateFormat("hh:mm:ss");
        final DateFormat dfd1 = new SimpleDateFormat(" a");
        
	label1 = new JLabel();
        label1.setBounds(340,10,160,22);
        Font f = new Font("Ds-digital",Font.ITALIC,20);
	label1.setFont(f);
        label1.setForeground(Color.WHITE);
	add(label1);
        
        label2 = new JLabel();
	label2.setBounds(870,5,60,10);
        label2.setForeground(Color.WHITE);
	//add(label2);
           
         javax.swing.Timer  timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar now = Calendar.getInstance();

             label1.setText(df.format(now.getTime()));
             label2.setText(dfd1.format(now.getTime()));
          
                              }
            });
          timer.start();           
  ///////////////////////////end date 
 
        
         JLabel   ex = new JLabel();
//        ex.setIcon(new ImageIcon(getClass().getResource("images/bg.jpg")));
        
        ex.setBounds(0,0,1000,480);        
      // jp1.add(ex);  
        
          JLabel   ex1 = new JLabel("Paysheet");
       // ex1.setIcon(new ImageIcon(getClass().getResource("images/log.png")));
          ex1.setForeground(Color.WHITE);
          Font fp = new Font("Ds-digital",Font.ITALIC,20);
	ex1.setFont(fp);
        ex1.setBounds(20,0,300,40);        
       add(ex1); 
        
              
  JLabel   exi = new JLabel();
        exi.setIcon(new ImageIcon(getClass().getResource("images/ex.png")));
        exi.setBounds(970,10,17,17);        
       add(exi); 
        
        exi.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
       exi.setBackground(new Color(100,200,100,150)); 
       exi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
   
   exi.addMouseListener(new MouseAdapter() {
   @Override
       public void mouseExited(MouseEvent e) {
   exi.setBackground(new Color(0,0,0,250));
  
   }
});      
        
  exi.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
       System.exit(0);
        
  }
}); 
        
 jpo = new JPanel();
 jpo.setLayout(null);
 //jpo.setBackground(new Color(157, 2, 22, 240));     // button panel
 jpo.setBackground(Color.ORANGE);
 jpo.setBounds(00,0,1000,50);
 jp1.add(jpo);
  
  jp2 = new JPanel();
 jp2.setLayout(null);
// jp2.setBackground(new Color(157, 2, 22, 240));     // button panel
 jp2.setBackground(Color.GRAY);
 jp2.setBounds(00,0,1000,50);
 jp1.add(jp2);
 
 
  JPanel bo5 = new JPanel();
 bo5.setLayout(null);
 //bo5.setBackground(new Color(244, 0, 4, 240));
 bo5.setBackground(Color.GRAY);
 bo5.setBounds(0,49,1000,1);
 jp2.add(bo5);
 
 
  adneteacher = new JPanel();
 adneteacher.setLayout(null);
 adneteacher.setBackground(new Color(0, 0, 0, 240));     // add new teacher panel
 adneteacher.setBounds(00,-500,1000,480);
 jp1.add(adneteacher);
 
 setting = new JPanel();
 setting.setLayout(null);
 setting.setBackground(new Color(111, 13, 16, 240));     // settings panel
 setting.setBounds(00,-500,1000,480);
 jp1.add(setting); 
 
 checkpanel = new JPanel();
 checkpanel.setLayout(null);
 checkpanel.setBackground(new Color(131, 13, 16, 240));     // check panel
 checkpanel.setBounds(00,-500,1000,480);
 jp1.add(checkpanel);
 
 pagecheck = new JTextField();
 pagecheck.setBounds(100,100,70,20);
 pagecheck.setOpaque(false);
 pagecheck.setCaretColor(Color.WHITE);
 pagecheck.setForeground(Color.WHITE);
 checkpanel.add(pagecheck);
 
 are = new JTextArea();
 are.setBounds(100,150,500,200);
 are.setOpaque(false);
 are.setCaretColor(Color.WHITE);
 are.setForeground(Color.WHITE);
 Font fTc = new Font("Arial",Font.PLAIN,12);
	 are.setFont(fTc);
 checkpanel.add(are);
 
 JLabel monc = new JLabel("Month");
         monc.setBounds(50,60,80,20); 
         monc.setForeground(Color.WHITE);
         checkpanel.add(monc); 
         
cbech = new JComboBox();
cbech.setBounds(100,60,80,20);
cbech.addItem("January");
cbech.addItem("February");
cbech.addItem("March");
cbech.addItem("April");
cbech.addItem("May");
cbech.addItem("June");
cbech.addItem("July");
cbech.addItem("Augest");
cbech.addItem("September");
cbech.addItem("October");
cbech.addItem("November");
cbech.addItem("December");
checkpanel.add(cbech);

         JLabel ye = new JLabel("Year");
         ye.setBounds(250,60,70,20); 
         ye.setForeground(Color.WHITE);
         checkpanel.add(ye);  
         
cbe1ch = new JComboBox();
cbe1ch.setBounds(320,60,50,20);
cbe1ch.addItem("2025");
cbe1ch.addItem("2026");
cbe1ch.addItem("2027");
cbe1ch.addItem("2028");
cbe1ch.addItem("2029");

checkpanel.add(cbe1ch);


  JLabel pageTot = new JLabel("Page Total");
         pageTot.setBounds(100,320,270,20); 
         Font fTct = new Font("Arial",Font.PLAIN,17);
	 pageTot.setFont(fTct);
         pageTot.setForeground(Color.WHITE);
         checkpanel.add(pageTot);  
 
   pagetotal_print = new JLabel("Print for check");
         pagetotal_print.setBounds(100,390,270,20); 
        
         pagetotal_print.setForeground(Color.ORANGE);
         checkpanel.add(pagetotal_print);        
         
         
         
 
 
  DocumentListener documentListener2 = new DocumentListener() {
      public void changedUpdate(DocumentEvent documentEvent) {
        printIt(documentEvent);
      }
      public void insertUpdate(DocumentEvent documentEvent) {
        printIt(documentEvent);
      }
      public void removeUpdate(DocumentEvent documentEvent) {
        printIt(documentEvent);
      }
      private void printIt(DocumentEvent documentEvent) {
        DocumentEvent.EventType type = documentEvent.getType();
    
        pageTot.setText("Page Total"); 
         are.setText("");   
                 try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");     ///'"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
             Statement stt = cont.createStatement();
             ResultSet rst=stt.executeQuery("select p_no,nam,total_pay,page from pay_details WHERE page ="+Integer.parseInt(pagecheck.getText()) +" AND year = '"+cbe1ch.getSelectedItem()+"' AND mont = '"+cbech.getSelectedItem()+"'");
          
             while(rst.next()){
                  String pn = rst.getString(1); 
                 if(pn == null){ 
                    are.append("No pay information");     
                 } 
                 else{ 
                     String pn1 = rst.getString("p_no"); 
                     String na = rst.getString("nam");  
                     String to = rst.getString("total_pay");
                     String pad = rst.getString("page");
                      
                     are.append(pn1+"\t - "+na+"\t - "+to+ "\t - "+pad+"\n");
                 }  
                 // rst.close();
                // stt.close();
               // cont.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
                 
                 
        // page total calculation    ----------------------------------------------     
                 
             try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement st = con.createStatement();
             ResultSet rs=st.executeQuery("select sum(amount) from pay_details where mont = '"+cbech.getSelectedItem()+"' AND year = '"+cbe1ch.getSelectedItem()+"' AND page = '"+pagecheck.getText()+"'");
          
             while(rs.next()){
                 String sum = rs.getString(1);                 
                 if(sum == null){               
                   pageTot.setText("No information");  
                   are.setText("No information"); 
                     
                 }  else{ 
 
                 String sV = (String) String.format("%.2f", Double.parseDouble(sum));
                    Double newV = Double.parseDouble(sV); 
                 
                 pageTot.setText("Page "+pagecheck.getText()+" total is "+String.valueOf(newV));
                 
                   }
                  rs.close();
                 st.close();
                con.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        }     
                 
       // page total finished ---------------------  
       // System.out.println(startpayt.getText());
      }
    };
 
 
 pagecheck.getDocument().addDocumentListener(documentListener2);  
   
 
pagetotal_print.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     pagetotal_print.setText("<html><u>Print for check</u></html>");
     pagetotal_print.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    pagetotal_print.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     pagetotal_print.setText("Print for check");
     
    }
});      
        
  
 
 ///// PRINTING STARTS    
     
     pagetotal_print.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
      //  System.out.println(bnkcombo.getSelectedItem());
        double newValue3 = 0;
        try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement stt = cont.createStatement();
             ResultSet rst=stt.executeQuery("select sum(amount) from pay_details where mont = '"+cbech.getSelectedItem()+"' AND year = '"+cbe1ch.getSelectedItem()+"'");
          
             while(rst.next()){
                 String sum = rst.getString(1);                 
                 
                // System.out.println(sum);
                     
                   String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
                   newValue3 = Double.parseDouble(sValue);  
               //  page_tot.setText("Rs. "+String.valueOf(newValue));
                   
                  rst.close();
                 stt.close();
                cont.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
        
        double newValue4 = 0;
        try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement stt = cont.createStatement();
             ResultSet rst=stt.executeQuery("select sum(total_pay) from pay_details where mont = '"+cbech.getSelectedItem()+"' AND year = '"+cbe1ch.getSelectedItem()+"'");
          
             while(rst.next()){
                 String sum = rst.getString(1);                 
                 
                // System.out.println(sum);
                     
                   String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
                   newValue4 = Double.parseDouble(sValue);  
               //  page_tot.setText("Rs. "+String.valueOf(newValue));
                   
                  rst.close();
                 stt.close();
                cont.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 

        
        double newValue5 = 0;              // welfair Deduction
        try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement stt = cont.createStatement();
             ResultSet rst=stt.executeQuery("select sum(deduction) from pay_details where mont = '"+cbech.getSelectedItem()+"' AND year = '"+cbe1ch.getSelectedItem()+"'");
          
             while(rst.next()){
                 String sum = rst.getString(1);                 
                 
                // System.out.println(sum);
                     
                   String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
                   newValue5 = Double.parseDouble(sValue);  
               //  page_tot.setText("Rs. "+String.valueOf(newValue));
                   
                  rst.close();
                 stt.close();
                cont.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
        
        
        
        
        
///-----------------------------------------------------
try{    
           
    
      /* Create Connection objects */
                Class.forName ("com.mysql.jdbc.Driver"); 
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement stmt = conn.createStatement();
                /* Define the SQL query */
                ResultSet query_set = stmt.executeQuery("SELECT page,p_no,nam,amount,total_pay,deduction FROM pay_details WHERE  year = '"+cbe1ch.getSelectedItem()+"' AND mont = '"+cbech.getSelectedItem()+"'");
                /* Step-2: Initialize PDF documents - logical objects */
                com.lowagie.text.Document my_pdf_report = new com.lowagie.text.Document();
               // PdfWriter.getInstance(my_pdf_report, new FileOutputStream("pdf_report_from_sql_using_java.pdf"));
                
                PdfWriter writer =PdfWriter.getInstance(my_pdf_report, new FileOutputStream("Check List "+cbech.getSelectedItem()+" "+cbe1ch.getSelectedItem()+".pdf"));
                int u =1;
                my_pdf_report.open();            
                //we have four columns in our table
                float[] columnWidths = {1, 1, 5, 2, 2, 1};

                PdfPTable my_report_table = new PdfPTable(columnWidths);
                
                my_report_table.setWidthPercentage(100);
                
                      
     com.lowagie.text.Font ffont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);
               PdfContentByte cb = writer.getDirectContent();
 
              Phrase header = new Phrase("   ", ffont);
        Phrase footer = new Phrase("Paysheet System - St.Joseph's College - System genarated document - 025 2222269", ffont);
        ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                header,
                (my_pdf_report.right() - my_pdf_report.left()) / 2 + my_pdf_report.leftMargin(),
                my_pdf_report.top() + 10, 0);
        ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                footer,
                (my_pdf_report.right() - my_pdf_report.left()) / 2 + my_pdf_report.leftMargin(),
                my_pdf_report.bottom() - 10, 0);
        
        FontSelector selector = new FontSelector();
com.lowagie.text.Font f1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
//f1.setColor(BaseColor.BLUE);
com.lowagie.text.Font f2 = FontFactory.getFont("MSung-Light",
        "UniCNS-UCS2-H", BaseFont.NOT_EMBEDDED);
//f2.setColor(BaseColor.RED);
selector.addFont(f1);
selector.addFont(f2);

    String text = "prasanna";
    //Font ms2 = new Font("Calibri",Font.BOLD,28);
    //Font bf = Font.createFont(BaseFont.TIMES_BOLD,BaseFont.COURIER_BOLDOBLIQUE, BaseFont.NOT_EMBEDDED);
    BaseFont bf = BaseFont.createFont(BaseFont.TIMES_BOLD,BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
    cb.setFontAndSize(bf, 12);
    cb.beginText();
    
        PdfPCell cell = new PdfPCell(new Phrase("This is a header", f1));
        cell.setBackgroundColor(GrayColor.GRAYBLACK);


      
      
        Paragraph da = new Paragraph("                                                                                                                    "+std3.getText()+"."+std.getText());
        my_pdf_report.add(da);
       
       
        
   // String sch_d1 =("_________________________________________________________________________________________________________");
   // cb.setFontAndSize(bf, 10);
   // cb.setTextMatrix(36, 587);
   // cb.showText(sch_d1);
        
        
    String sch_d10 =("Page No.  P.S.No.             Name                                                                     Paysheet pay              Paysheet pay             Welfair");
    cb.setFontAndSize(bf, 10);
    cb.setTextMatrix(40, 740);
    cb.showText(sch_d10);
     
     Chunk underline = new Chunk("Salaries for the Month of - "+cbech.getSelectedItem()+" "+cbe1ch.getSelectedItem()+" " + " Check List");
      underline.setUnderline(0.1f, -2f); 
      // my_pdf_report.add(underline);
       
       com.lowagie.text.Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 14);
       // Font font = new Font(FontFamily.HELVETICA, 12, Font.BOLD);
        Paragraph para = new Paragraph(underline);
        para.setLeading(0, 1);
        PdfPTable table2 = new PdfPTable(1);
        table2.setWidthPercentage(100);
       

        PdfPCell cell1 = new PdfPCell();
         cell1.setBorder(Rectangle.NO_BORDER);
        cell1.setMinimumHeight(20);
        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell1.addElement(para);
        table2.addCell(cell1);
        my_pdf_report.add(table2);
        
       
          my_pdf_report.add(new Phrase("\n")); 
          
             
    
                PdfPCell table_cell;
              
                while (query_set.next()) {  
                    
                                 String id = query_set.getString("page");
                                table_cell=new PdfPCell(new Phrase(id));
                                my_report_table.addCell(table_cell);
                               
                      
                                String dept_id = query_set.getString("p_no");
                                table_cell=new PdfPCell(new Phrase(dept_id));
                                my_report_table.addCell(table_cell);
                                String dept_name=query_set.getString("nam");
                                table_cell=new PdfPCell(new Phrase(dept_name));
                                my_report_table.addCell(table_cell);
                                
                                String manager_id=query_set.getString("amount");
                                table_cell=new PdfPCell(new Phrase(manager_id));
                                my_report_table.addCell(table_cell);
                                
                                String location_id=query_set.getString("total_pay");
                                table_cell=new PdfPCell(new Phrase(location_id));
                               // table_cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                                 my_report_table.addCell(table_cell);
                                
                                String ldedu=query_set.getString("deduction");
                                table_cell=new PdfPCell(new Phrase(ldedu));
                                my_report_table.addCell(table_cell);
                                
                                
                              //  int rows = my_report_table.getRow();
                               // System.out.println();
                              
                                }
                u++;
                
                
                /* Attach report table to PDF */
                my_pdf_report.add(my_report_table); 
                
                
                
                Paragraph tota = new Paragraph("                                                           Total amount    Rs."+newValue3);
        my_pdf_report.add(tota);
        
         Paragraph tota1 = new Paragraph("                                                           Net amount      Rs."+newValue4);
        my_pdf_report.add(tota1);
        
        
        Paragraph tota2 = new Paragraph("                                                         Total deduction      Rs."+newValue5);
        my_pdf_report.add(tota2);
                
                Paragraph total = new Paragraph("System genatared receipt for validate.");
        my_pdf_report.add(total);

          
        Paragraph ps = new Paragraph("Information - 0713250000 ");
        my_pdf_report.add(ps);
        
                my_pdf_report.close();
                
                try {
 
		File pdfFile = new File("Check List "+cbech.getSelectedItem()+" "+cbe1ch.getSelectedItem()+".pdf");
		if (pdfFile.exists()) {
 
			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				System.out.println("Awt Desktop is not supported!");
			}
 
		} else {
                    
			JOptionPane.showMessageDialog(null,"No file found ","No files",javax.swing.JOptionPane.WARNING_MESSAGE);
		}
                
                 
	  } catch (Exception ex) {
	  }
                /* Close all DB related objects */
                query_set.close();
                stmt.close(); 
                conn.close();         
    
    
                }
                catch(Exception ew){
                System.out.println(ew);
                } 

 //-----------------------------------------------------      
       
   }
});       
 ///// PRINT PAGE TESTINGS
 
 
    pagecheck.addKeyListener(new KeyAdapter() {
            @Override
        public void keyPressed(final KeyEvent ke) {
                int keyPad = ke.getKeyCode();
        if (keyPad == KeyEvent.VK_ENTER ){
           // String codei = tric.getText();
         are.setText("");   
                 try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");     ///'"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
             Statement stt = cont.createStatement();
             ResultSet rst=stt.executeQuery("select p_no,nam,total_pay,page from pay_details WHERE page ="+Integer.parseInt(pagecheck.getText()) +" AND year = '"+cbe1ch.getSelectedItem()+"' AND mont = '"+cbech.getSelectedItem()+"'");
          
             while(rst.next()){
                  String pn = rst.getString(1); 
                 if(pn == null){ 
                    are.append("No pay information");     
                 } 
                 else{ 
                     String pn1 = rst.getString("p_no"); 
                     String na = rst.getString("nam");  
                     String to = rst.getString("total_pay");
                     String pad = rst.getString("page");
                      
              //       are.append(pn1+"\t - "+na+"\t - "+to+ "\t - "+pad+"\n");
                 }  
                 // rst.close();
                // stt.close();
               // cont.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
            
         
         }
        }
      // up arrow key finish  
}); 
 
 
 
 
 
 
 
 
 JLabel pac = new JLabel("Page No.");
 pac.setBounds(50,100,100,20); 
 pac.setForeground(Color.WHITE);
 checkpanel.add(pac);  
 
 
 startpay = new JPanel();
 startpay.setLayout(null);
 startpay.setBackground(new Color(0, 0, 0, 240));     // add pay panel
 startpay.setBounds(00,-500,1000,480);
 jp1.add(startpay);
        
 
 startpayt = new JTextField();
 startpayt.setBounds(200,130,100,20);
 startpayt.setOpaque(false);                             //   
 startpayt.setForeground(Color.WHITE);
 startpayt.setCaretColor(Color.orange);
 startpay.add(startpayt);
 
 
  this.addWindowListener(new WindowAdapter(){ 
  public void windowOpened( WindowEvent e){ 
    startpayt.requestFocus();
  } 
});
 
         JLabel payn = new JLabel("Paysheet No.");
         payn.setBounds(100,130,100,20); 
         payn.setForeground(Color.WHITE);
         startpay.add(payn);  
         
         JLabel payna = new JLabel("Name");
         payna.setBounds(100,170,100,20); 
         payna.setForeground(Color.WHITE);
         startpay.add(payna); 
         
         JLabel paynai = new JLabel("Installment");
         paynai.setBounds(100,210,100,20); 
         paynai.setForeground(Color.WHITE);
         startpay.add(paynai); 
         
           JLabel paynaiac = new JLabel("Account No");
         paynaiac.setBounds(100,250,100,20); 
         paynaiac.setForeground(Color.WHITE);
         startpay.add(paynaiac);
         
         JLabel amo = new JLabel("Amount ");
         amo.setBounds(100,290,80,20); 
         amo.setForeground(Color.WHITE);
         startpay.add(amo); 
         
         JLabel ded = new JLabel("Deduction ");
         ded.setBounds(100,330,100,20); 
         ded.setForeground(Color.WHITE);
         startpay.add(ded);          
         
 in_number = new JTextField();
 in_number.setBounds(390,330,160,20);
 in_number.setOpaque(false); 
  in_number.setEditable(false);  //   
 in_number.setForeground(Color.WHITE);
 in_number.setCaretColor(Color.orange);
 startpay.add(in_number);         
         
             JLabel mon = new JLabel("Month");
         mon.setBounds(100,80,100,20); 
         mon.setForeground(Color.WHITE);
         startpay.add(mon); 
         
cbe = new JComboBox();
cbe.setBounds(200,80,80,20);
cbe.addItem("January");
cbe.addItem("February");
cbe.addItem("March");
cbe.addItem("April");
cbe.addItem("May");
cbe.addItem("June");
cbe.addItem("July");
cbe.addItem("Augest");
cbe.addItem("September");
cbe.addItem("October");
cbe.addItem("November");
cbe.addItem("December");
startpay.add(cbe);

         JLabel yech = new JLabel("Year");
         yech.setBounds(330,80,100,20); 
         yech.setForeground(Color.WHITE);
         startpay.add(yech);  
         
cbe1 = new JComboBox();
cbe1.setBounds(370,80,50,20);
cbe1.addItem("2025");
cbe1.addItem("2026");
cbe1.addItem("2027");
cbe1.addItem("2028");
cbe1.addItem("2029");
startpay.add(cbe1);
 
JLabel yep = new JLabel("Page No");
         yep.setBounds(450,80,80,20); 
         yep.setForeground(Color.WHITE);
         startpay.add(yep); 

pag = new JComboBox();
pag.setBounds(500,80,50,20);
pag.addItem("1");
pag.addItem("2");
pag.addItem("3");
pag.addItem("4");
pag.addItem("5");
pag.addItem("6");
pag.addItem("7");
pag.addItem("8");
pag.addItem("9");
pag.addItem("10");
pag.addItem("11");
pag.addItem("12");
pag.addItem("13");
pag.addItem("14");
pag.addItem("15");
pag.addItem("16");
pag.addItem("17");
pag.addItem("18");
pag.addItem("19");
pag.addItem("20");
pag.addItem("21");
pag.addItem("22");
pag.addItem("23");
pag.addItem("24");
pag.addItem("25");
pag.addItem("26");
pag.addItem("27");
pag.addItem("28");
pag.addItem("29");
pag.addItem("30");
startpay.add(pag);




          teinf = new JTextField();
          teinf.setBounds(200,170,348,20);
          teinf.setForeground(Color.WHITE);
          teinf.setCaretColor(Color.orange);
          teinf.setOpaque(false);
          startpay.add(teinf); 
          
          tein = new JTextField();
          tein.setBounds(200,210,100,20);
          tein.setForeground(Color.WHITE);
          tein.setEditable(false);
          tein.setCaretColor(Color.orange);
          tein.setOpaque(false);
          startpay.add(tein); 
          
          te_ins = new JTextField();
          te_ins.setBounds(310,210,240,20);
          te_ins.setForeground(Color.WHITE);
          te_ins.setEditable(false);
          te_ins.setCaretColor(Color.orange);
          te_ins.setOpaque(false);
          startpay.add(te_ins);           
          
          tein_ac = new JTextField();
          tein_ac.setBounds(200,250,150,20);
          tein_ac.setForeground(Color.WHITE);
          tein_ac.setCaretColor(Color.orange);
           tein_ac.setEditable(false);
          tein_ac.setOpaque(false);
          startpay.add(tein_ac); 
          
          tein_amo = new JTextField();
          tein_amo.setBounds(440,250,110,20);
          tein_amo.setForeground(Color.WHITE);
          tein_amo.setCaretColor(Color.orange);
           tein_amo.setEditable(false);
          tein_amo.setOpaque(false);
          startpay.add(tein_amo); 
        
 JTextField tyi = new JTextField();
 tyi.setBounds(200,170,350,100);
 tyi.setOpaque(false);
 tyi.setEditable(false);
 //startpay.add(tyi);                  
         
 amoun = new JTextField();
 amoun.setBounds(200,290,100,20);
 amoun.setOpaque(false);                             //   
 amoun.setForeground(Color.RED);
 amoun.setCaretColor(Color.RED);
 startpay.add(amoun); 
 
 dedu = new JTextField();
 dedu.setBounds(200,330,100,20);
 dedu.setOpaque(false);                             //   
 dedu.setForeground(Color.RED);
 dedu.setCaretColor(Color.RED);
 startpay.add(dedu); 
 
         JLabel tot = new JLabel("Toatal");
         tot.setBounds(700,80,80,20); 
         tot.setForeground(Color.WHITE);
         //startpay.add(tot);
         
         tot1 = new JLabel("Total pay : ");
         tot1.setBounds(620,110,300,20); 
          Font fTptot = new Font("Arial",Font.PLAIN,15);
	 tot1.setFont(fTptot);
         tot1.setForeground(Color.WHITE);
         startpay.add(tot1);     
         
          page_tot = new JLabel("Page total :");
         page_tot.setBounds(620,80,300,20); 
         Font fTptotp = new Font("Arial",Font.PLAIN,15);
	 page_tot.setFont(fTptotp);
         page_tot.setForeground(Color.WHITE);
         startpay.add(page_tot);   
         
         
         total_bal = new JLabel();
         total_bal.setBounds(600,180,300,30); 
         total_bal.setForeground(Color.ORANGE);
         Font fT = new Font("Arial",Font.PLAIN,32);
	 total_bal.setFont(fT);
         startpay.add(total_bal);
         
         tot_pa = new JLabel();
         tot_pa.setBounds(600,220,300,25); 
         tot_pa.setForeground(Color.WHITE);
         Font fTp = new Font("Arial",Font.PLAIN,14);
	 tot_pa.setFont(fTp);
         startpay.add(tot_pa);
         
         
          las_add_te = new JTextArea();
          las_add_te.setBounds(600,255,300,120);
          las_add_te.setForeground(Color.WHITE);
          las_add_te.setCaretColor(Color.orange);
          las_add_te.setFont(fTp);
          las_add_te.setEditable(false);
          las_add_te.setOpaque(false);
          startpay.add(las_add_te); 
          
          
          wel = new JLabel("Welfair");
         wel.setBounds(605,320,300,25); 
         wel.setForeground(Color.YELLOW);
         Font fwel = new Font("Arial",Font.PLAIN,12);
	 wel.setFont(fwel);
         startpay.add(wel);
          
         wel_up = new JLabel();
         wel_up.setBounds(605,340,300,25); 
         wel_up.setForeground(Color.GREEN);
         //Font fwel = new Font("Arial",Font.PLAIN,12);
	 //wel_up.setFont(fwel);
         startpay.add(wel_up);
          
          
         
         bnks = new JTextField();
bnks.setBounds(330,290,220,20);
bnks.setEditable(false);
bnks.setOpaque(false);
 bnks.setForeground(Color.ORANGE);
startpay.add(bnks);
          
          
         balance = new JLabel("Balance");
         balance.setBounds(650,410,80,20); 
         balance.setForeground(Color.WHITE);
         startpay.add(balance);   
         
   balance.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     balance.setText("<html><u>Balance</u></html>");
     balance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    balance.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     balance.setText("Balance");
     
    }
});      
        
     balance.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseClicked(MouseEvent e) {
   
         Balance f = new Balance();
     
    }
});        
         
         
          
         viewall = new JLabel("View added all");
         viewall.setBounds(50,410,100,20); 
         viewall.setForeground(Color.WHITE);
         startpay.add(viewall);  
         
          viewall.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     viewall.setText("<html><u>View added all</u></html>");
     viewall.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    viewall.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     viewall.setText("View added all");
     
    }
});      
        
     viewall.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseClicked(MouseEvent e) {
   
         viewallpays f = new viewallpays();
     
    }
}); 
          
      tot_te = new JLabel("Total teachers");
tot_te.setBounds(260, 460, 160, 20);
tot_te.setForeground(Color.WHITE);
 startpay.add(tot_te);
         
    cbe.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {       
        try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement st = con.createStatement();
             ResultSet rs=st.executeQuery("select sum(amount) from pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
          
                 while(rs.next()){
                 String sum = rs.getString(1);
                 
                 if(sum == null){               
                   //  JOptionPane.showMessageDialog(null,"No paid information");            
                     tot1.setText("No information"); 
                 }  else{ 
                // System.out.println(sum);
                 
                   String sV = (String) String.format("%.2f", Double.parseDouble(sum));
                    Double newV = Double.parseDouble(sV);    
                 
                 
                 tot1.setText("Total Pay : Rs."+String.valueOf(newV));
                 }
                  rs.close();
                 st.close();
                con.close();  
              }
                }
                catch(Exception ew){
                System.out.println(ew);
                } 
    }
});
    
    cbe1.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {       
        try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement st = con.createStatement();
             ResultSet rs=st.executeQuery("select sum(amount) from pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
          
             while(rs.next()){
                 String sum = rs.getString(1);                 
                 if(sum == null){               
                    tot1.setText("No information");        
                     
                 }  else{ 
                // System.out.println(sum);
                     
                 String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
                    double newValue = Double.parseDouble(sValue);  
                // total_bal.setText("Rs. "+String.valueOf(newValue));    
                     
                     
                 tot1.setText("Total Pay : Rs."+String.valueOf(newValue));
                   }
                  rs.close();
                 st.close();
                con.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
    }
});
    
    pag.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {       
        try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement st = con.createStatement();
             ResultSet rs=st.executeQuery("select sum(amount) from pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"' AND page = '"+pag.getSelectedItem()+"'");
          
             while(rs.next()){
                 String sum = rs.getString(1);                 
                 if(sum == null){               
                    page_tot.setText("No information");        
                     
                 }  else{ 
                // System.out.println(sum);                     
                   String sV = (String) String.format("%.2f", Double.parseDouble(sum));
                    Double newV = Double.parseDouble(sV);   
                    page_tot.setText("Page total : Rs."+String.valueOf(newV)); 
                 
                   }
                  rs.close();
                 st.close();
                con.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
    }
});
    
    
    
        startpayt.addKeyListener(new KeyAdapter() {
            @Override
        public void keyPressed(final KeyEvent ke) {
                int keyPad = ke.getKeyCode();
        if (keyPad == KeyEvent.VK_ENTER || keyPad == KeyEvent.VK_KP_DOWN){
           // String codei = tric.getText();
         if(startpayt.getText().isEmpty()){    
           startpayt.setBackground(Color.RED);
           startpayt.setCaretColor(Color.RED);
           }
         else{
             amoun.requestFocusInWindow();
             startpayt.setCaretColor(Color.WHITE);
             
            ///---------------------------------------------------------
              try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement st = con.createStatement();
             ResultSet rs=st.executeQuery("select sum(amount) from pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
          
             while(rs.next()){
                 String sum = rs.getString(1);                 
                 if(sum == null){               
                    total_bal.setText("No pay information");     
                 }  else{ 
                // System.out.println(sum);
                     
                   String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
                    Double newValue = Double.parseDouble(sValue);  
                 total_bal.setText("Rs. "+String.valueOf(newValue));
                   }
                  rs.close();
                 st.close();
                con.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
             
             ///---------------------------------------------------------
              
             // get raw count  ----- 
               try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           //  ResultSet rs=st.executeQuery("COUNT(*) AS amount FROM pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
          
        ResultSet rs = st.executeQuery("SELECT COUNT(*) AS p_no FROM pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
rs.next();
int count = rs.getInt("p_no") ;
rs.close() ;
//System.out.println("MyTable has " + count + " row(s).");
tot_pa.setText(count + " teacher's pay added");

    rs.close();
    st.close();
    con.close();

               }
                catch(Exception ew){
                System.out.println(ew);
        } 
            ///  raw count ----------------------------------  
              
         }
          }
        }
      // up arrow key finish  
});  
  
   amoun.addKeyListener(new KeyAdapter() {
            @Override
        public void keyPressed(final KeyEvent ke) {
                int keyPad = ke.getKeyCode();
        if (keyPad == KeyEvent.VK_ENTER || keyPad == KeyEvent.VK_KP_DOWN){
           //////////////////////////////////////////////////////////////////////////////////////////                         
               if(!amoun.getText().isEmpty())  {
 /////////////////////////////////////
                   
             boolean recordAdded = false;      
             Double newValue = null;      
        //saving
            //  System.out.println("saved");
             //  JOptionPane.showMessageDialog(null,"Already exists this value ");
                try{
     
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM pay_details WHERE mont = '"+String.valueOf(cbe.getSelectedItem())+"' AND year = '"+String.valueOf(cbe1.getSelectedItem())+"' AND p_no = '"+Integer.parseInt(startpayt.getText())+"'");
     Statement st1 = null;
////////////////////////////////////////           
       
       while(!rs.next()){            
       /// Do your insertion of new records
       if(recordAdded = true){
        
         pstme=con.prepareStatement("INSERT INTO pay_details VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");	
                int i = 0;
		pstme.setInt(1,i);
		pstme.setInt(2,Integer.parseInt(startpayt.getText()));
                pstme.setString(3,amoun.getText());
                pstme.setString(4,String.valueOf(cbe.getSelectedItem()));
                pstme.setString(5,String.valueOf(cbe1.getSelectedItem()));
                pstme.setString(6,dedu.getText());   
                
                pstme.setString(7,bnk_id); 
                pstme.setString(8,teinf.getText()); 
                pstme.setString(9,tein_ac.getText()); 
                pstme.setString(10,te_ins.getText()); 
                pstme.setString(11,tein_amo.getText());
                pstme.setInt(12,Integer.parseInt((String) pag.getSelectedItem()));
                
                if(tein_amo.getText().isEmpty()){
                   double tde =  (Double.parseDouble(amoun.getText())-(Double.parseDouble(dedu.getText())));
                   
                   String sV = (String) String.format("%.2f", tde);
                    Double newV = Double.parseDouble(sV);                   
                     pstme.setString(13,String.valueOf(newV));
                }
                else if(!tein_amo.getText().isEmpty()){
                     double tde =  (Double.parseDouble(amoun.getText())-(Double.parseDouble(dedu.getText())+Double.parseDouble(tein_amo.getText())));
                     String sV = (String) String.format("%.2f", tde);
                    Double newV = Double.parseDouble(sV);                   
                     pstme.setString(13,String.valueOf(newV));
                
                }
                
                else if(!tein_amo.getText().isEmpty()){
                     double tde =  (Double.parseDouble(amoun.getText())-(Double.parseDouble(dedu.getText())+Double.parseDouble(tein_amo.getText())));
                     String sV = (String) String.format("%.2f", tde);
                    Double newV = Double.parseDouble(sV);                   
                     pstme.setString(13,String.valueOf(newV));
                }                
                pstme.setString(14,in_number.getText());
                
               // pstme.setString(13,String.valueOf(tde));
                
                  //tein_amo.setText(tam);
                    //      te_ins.setText(ints);
                
         pstme.executeUpdate(); 
         las_add_te.setText("");
         las_add_te.append("Last added teacher \n"+teinf.getText()+"\n"+amoun.getText());       
       JOptionPane.showMessageDialog(rootPane, "Record added");
       startpayt.setText("");
       amoun.setText("");
        tein_ac.setText("");
         te_ins.setText("");
          tein_amo.setText("");
           tein.setText("");
       startpayt.requestFocusInWindow();
      
       
         ///    total sum according to paysheet   ---------------
     
      
        rs.close();
        st.close();
                con.close();
        ///    total sum according to paysheet   --------------- 
                
                
                
                 try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement stt = cont.createStatement();
             ResultSet rst=stt.executeQuery("select sum(amount) from pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
          
             while(rst.next()){
                 String sum = rst.getString(1);                 
                 if(sum == null){               
                    total_bal.setText("No pay information");     
                 }  else{ 
                // System.out.println(sum);
                     
                   String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
                     newValue = Double.parseDouble(sValue);  
                 total_bal.setText("Rs. "+String.valueOf(newValue));
                   }
                  rst.close();
                 stt.close();
                cont.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
                
            ///////page total calculation     
                 
                 try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement stt = cont.createStatement();
             ResultSet rst=stt.executeQuery("select sum(amount) from pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"' AND page = '"+pag.getSelectedItem()+"'");
          
             while(rst.next()){
                 String sum = rst.getString(1);                 
                 if(sum == null){               
                    total_bal.setText("No pay information");     
                 }  else{ 
                // System.out.println(sum);
                     
                   String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
                     newValue = Double.parseDouble(sValue);  
                 page_tot.setText("Rs. "+String.valueOf(newValue));
                   }
                  rst.close();
                 stt.close();
                cont.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
               //////////////////////  total no teachers
          
    ResultSet rst = null;
                 try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement stt = cont.createStatement();
              rst=stt.executeQuery("select sum(deduction) from pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
          
             while(rst.next()){
                 String sum = rst.getString(1);                 
                 if(sum == null){               
                    wel.setText("No welfair information");     
                 }  else{ 
                // System.out.println(sum);
                     
                   String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
                     newValue = Double.parseDouble(sValue);  
                 wel.setText("Welfair Rs. "+String.valueOf(newValue));                 
                 
                  
                 
                   }
                  rst.close();
                 stt.close();
                cont.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
                 
            //////////////////////////////  update welfair account     
              
               Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String updateTableSQL = "UPDATE welfair SET amount = ?, month = ?, year =?";
				                  

		try {
                    Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
			//dbConnection = getDBConnection();
			preparedStatement = cont.prepareStatement(updateTableSQL);

			preparedStatement.setString(1, String.valueOf(newValue));
                        preparedStatement.setString(2, String.valueOf(cbe.getSelectedItem()));
                        preparedStatement.setString(3, String.valueOf(cbe1.getSelectedItem()));
			//preparedStatement.setInt(2, 1001);

			// execute update SQL stetement
			preparedStatement.executeUpdate();
                        
                        wel_up.setText("Account updated to "+newValue);
			//System.out.println("Record is updated to DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

                                
                ///////////////////////////////////
       }
         
      else{
       JOptionPane.showMessageDialog(rootPane, "Record already exists");
    }                                  
               
         
       }
              }
                catch(Exception ew){
                System.out.println(ew);
                } 
            
 ////////////////////////////////////                
            }
          else{  
            Toolkit.getDefaultToolkit().beep();
           // tnp.requestFocusInWindow(); 
          }  
            //////////////////////////////////////////////////////////////////////////////////////////
         }
        }
      // up arrow key finish  
});
        
 newteacher = new JTextField();
 newteacher.setBounds(200,100,100,20);
 newteacher.setOpaque(false);
 newteacher.setForeground(Color.WHITE);
 newteacher.setCaretColor(Color.orange);
 adneteacher.add(newteacher);
 
 newteacherNAME = new JTextField();
 newteacherNAME.setBounds(250,140,240,20);
 newteacherNAME.setOpaque(false);
 newteacherNAME.setForeground(Color.WHITE);
 newteacherNAME.setCaretColor(Color.orange);
 adneteacher.add(newteacherNAME);
 
mr = new JComboBox();
mr.setBounds(200,140,50,20);
mr.addItem("Mr. ");
mr.addItem("Mrs. ");
mr.addItem("Miss ");
mr.addItem("Rev. ");

adneteacher.add(mr);
 
   JLabel   adte1n = new JLabel("Paysheet No.");
         adte1n.setBounds(100,100,120,20);
          adte1n.setForeground(Color.WHITE);
        adneteacher.add(adte1n);  
 
 JLabel   adte1na = new JLabel("Name");
         adte1na.setBounds(100,140,120,20);
          adte1na.setForeground(Color.WHITE);
        adneteacher.add(adte1na);  
        
        JLabel   adte1nai = new JLabel("Details");
         adte1nai.setBounds(100,180,120,20);
          adte1nai.setForeground(Color.WHITE);
        adneteacher.add(adte1nai); 
        
 teinfor = new JTextArea();
 teinfor.setBounds(201,181,248,58);
          teinfor.setForeground(Color.WHITE);
          teinfor.setCaretColor(Color.orange);
          teinfor.setOpaque(false);
        adneteacher.add(teinfor); 
        
 JTextField ty = new JTextField();
 ty.setBounds(200,180,250,60);
 ty.setOpaque(false);
 ty.setEditable(false);
 adneteacher.add(ty);
 
          JLabel   act = new JLabel("Account No");
          act.setBounds(100,280,120,20);
          act.setForeground(Color.WHITE);
          adneteacher.add(act); 
        
 
 acctea = new JTextField();
 acctea.setBounds(200,280,250,20);
 acctea.setOpaque(false);
 acctea.setForeground(Color.WHITE);
 acctea.setCaretColor(Color.orange);
 adneteacher.add(acctea);
 
          JLabel   bank = new JLabel("Bank");
          bank.setBounds(100,320,120,20);
          bank.setForeground(Color.WHITE);
          adneteacher.add(bank); 
 
         JLabel   actb = new JLabel("Account No");
         actb.setBounds(100,360,120,20);
          actb.setForeground(Color.WHITE);
        //adneteacher.add(actb); 
        
cbeb = new JComboBox();
cbeb.setBounds(200,320,200,20);
adneteacher.add(cbeb);

       try{
    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery("select b_name from banks");
                                
               while(rs.next()){
                cbeb.addItem(rs.getString("b_name"));
        }
                
                }
                catch(Exception ew){
                System.out.println(ew);
                } 

         JLabel   anyd = new JLabel("If any installments");
         anyd.setBounds(600,100,120,20);
         anyd.setForeground(Color.WHITE);
         adneteacher.add(anyd); 
        
        cb = new JCheckBox();
        cb.setBounds(700,100,20,20);
        cb.setForeground(Color.WHITE);          
        cb.setOpaque(false);
        adneteacher.add(cb); 
        
         JLabel   ins = new JLabel("Amount");
         ins.setBounds(600,140,80,20);
         ins.setForeground(Color.WHITE);
         adneteacher.add(ins); 
        
         instal = new JTextField();
 instal.setBounds(700,140,150,20);
 instal.setOpaque(false);
 instal.setForeground(Color.WHITE);
 instal.setCaretColor(Color.orange);
 adneteacher.add(instal);
 
            icbeb = new JComboBox();
icbeb.setBounds(700,180,200,20);
adneteacher.add(icbeb);
 try{
    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery("select name from ins_inst");
                                
               while(rs.next()){
        icbeb.addItem(rs.getString("name"));
        }
                
                }
                catch(Exception ew){
                System.out.println(ew);
                } 


         allte = new JLabel("View all Staaf information");                  // all teachers class calling
         allte.setBounds(30,390,130,20);
         allte.setForeground(Color.WHITE);
         adneteacher.add(allte); 

   allte.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     allte.setText("<html><u>View all Staaf information</u></html>");
     allte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    allte.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     allte.setText("View all Staaf information");
     
    }
});      
        
     allte.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseClicked(MouseEvent e) {
   
         Viewall f = new Viewall();
     
    }
}); 
    
     
     alltetel = new JLabel("Telephone No.");                  // all teachers class calling
         alltetel.setBounds(230,390,190,20);
         alltetel.setForeground(Color.WHITE);
         adneteacher.add(alltetel); 

   alltetel.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     alltetel.setText("<html><u>Telephone No.</u></html>");
     alltetel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    alltetel.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     alltetel.setText("Telephone No.");
     
    }
});      
        
     alltetel.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseClicked(MouseEvent e) {
   
         Telephone f = new Telephone();
     
    }
}); 
     
     
     
    
        

          
          JLabel   insa = new JLabel("Institute");
          insa.setBounds(600,180,120,20);
          insa.setForeground(Color.WHITE);
          adneteacher.add(insa); 
        
          JLabel   dur = new JLabel("Duration");
          dur.setBounds(600,220,120,20);
          dur.setForeground(Color.WHITE);
          adneteacher.add(dur); 
        
        
        dura = new JComboBox();
dura.setBounds(700,220,100,20);
dura.addItem("Months");
dura.addItem("12");
dura.addItem("11");
dura.addItem("10");
dura.addItem("09");
dura.addItem("08");
dura.addItem("07");
dura.addItem("06");
dura.addItem("05");
dura.addItem("04");
dura.addItem("03");
dura.addItem("02");
dura.addItem("01");

adneteacher.add(dura);

            instal.setEditable(false);
            dura.setEnabled(false);
            icbeb.setEnabled(false);
            
            
           JLabel   durl = new JLabel("Loan No");
           durl.setBounds(600,260,120,20);
           durl.setForeground(Color.WHITE);
            adneteacher.add(durl); 
        
         lo_no = new JTextField();
 lo_no.setBounds(700,260,150,20);
 lo_no.setOpaque(false);
 lo_no.setForeground(Color.WHITE);
 lo_no.setCaretColor(Color.orange);
 adneteacher.add(lo_no);
            
cb.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {          
     
        if(cb.isSelected() == true){
             instal.setEditable(true);
             dura.setEnabled(true);
             icbeb.setEnabled(true);
        }
        else{
                        instal.setEditable(false);
                        dura.setEnabled(false);
                        icbeb.setEnabled(false);            
        }        
      }
    }); 
 
  savete = new JLabel("Save");
  savete.setBounds(750,390,80,20);
  savete.setForeground(Color.WHITE);
  adneteacher.add(savete); 
        
  savete.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
   savete.setText("<html><u>Save</u></html>");
   savete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
   
   savete.addMouseListener(new MouseAdapter() {
   @Override
       public void mouseExited(MouseEvent e) {
  
  savete.setText("Save");
   }
});            
        
   savete.addMouseListener(new MouseAdapter() {
   @Override
       public void mouseClicked(MouseEvent e) {
  //------------------------------------------------------------
           
           // if(newteacher.getText().contains("[a-zA-Z]+") == false && newteacher.getText().length() > 5){
           //         JOptionPane.showMessageDialog(null,"Invalid Paysheet No");
          //    }
           
          String str = newteacher.getText();
          String str2 = acctea.getText();
          String str3 = instal.getText();
           
           if(str.lastIndexOf("-") == 0 && !str.equals("-0") ? str.replace("-", "").matches("[A-Z]+") : str.matches("[a-z]+")){
                JOptionPane.showMessageDialog(null,"Invalid paysheet No.");
           }
           
           // else if(str2.lastIndexOf("-") == 0 && !str2.equals("-0") ? str2.replace("-", "").matches("[A-Z]+") : str2.matches("[a-z]+")){
            //    JOptionPane.showMessageDialog(null,"Please check your Account Number!");
          // }
           
           else if(newteacher.getText().isEmpty()||newteacherNAME.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please Read the information that you entered. Some errors or empty fields are there..");
           }
           
            else if(cbeb.getSelectedItem() == "Select"){
                JOptionPane.showMessageDialog(null,"You did not select the Your bank");
           }
            
             else if(cb.isSelected() == true){
                 
                 if(str3.lastIndexOf("-") == 0 && !str3.equals("-0") ? str3.replace("-", "").matches("[A-Z]+") : str3.matches("[a-z]+")){
                  JOptionPane.showMessageDialog(null,"Installment amount is not correct...");
           }
                 
                 else if (instal.getText().isEmpty()){
                  JOptionPane.showMessageDialog(null,"Installment amount is not correct...");
           }
                 
                 else{
                     
                     
                  ///////////////////////////////////
                     
                     
                    try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement st = con.createStatement();
             ResultSet rs=st.executeQuery("select b_id from banks where b_name = '"+cbeb.getSelectedItem()+"'");
          
                 while(rs.next()){
                 sumid = rs.getString("b_id");                 
                 
                  rs.close();
                 st.close();
                con.close();  
              }
                }
                catch(Exception ew){
                System.out.println(ew);
                }   
                     
                     
                     
                     
                     
                  ///////////////////////////////////////   
                     
                     
                     try{    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery("select p_no from pays where p_no ="+newteacher.getText());
                                                
                if(rs.next()){
                JOptionPane.showMessageDialog(null,"Already exists this teacher");
                }
                else{
                //ep8.setText("");    
                PreparedStatement pstm;      
              
                pstm=con.prepareStatement("insert into pays values(?,?,?,?,?,?,?,?,?,?,?)");	
int i = 0;
		pstm.setInt(1,i);
		pstm.setString(2,newteacher.getText());
                pstm.setString(3,String.valueOf(mr.getSelectedItem())+newteacherNAME.getText());
                pstm.setString(4,teinfor.getText());
                pstm.setString(5,acctea.getText());
                
                pstm.setString(6,sumid);
               
                
                if(cb.isSelected()){ pstm.setString(7,"yes");                
                } 
                else{    pstm.setString(7,"no"); } 
                
                if(cb.isSelected()){ pstm.setString(8,instal.getText());             
                } 
                else{    pstm.setString(8,""); } 
                
                 if(cb.isSelected()){ pstm.setString(9,String.valueOf(icbeb.getSelectedItem()));           
                } 
                else{    pstm.setString(9,""); } 
                 
                 if(cb.isSelected()){ pstm.setString(10,String.valueOf(dura.getSelectedItem()));         
                } 
                else{    pstm.setString(10,""); } 
                pstm.setString(11,lo_no.getText());
                               
          	pstm.executeUpdate(); 
                JOptionPane.showMessageDialog(null,"Saved  ok");
                 
                  newteacher.setText("");
                newteacherNAME.setText("");
                teinfor.setText("");
                acctea.setText("");
               // cbeb.setSelectedItem("BOC (Super Grade) Anuradhapura");
                instal.setText("");   
                newteacher.requestFocus(true);
                
                st.close();
                con.close();
                }
                }
                catch(Exception ew){
                System.out.println(ew);
                }                             
                 } 
                      
           }           
           else{                          
                  try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement st = con.createStatement();
             ResultSet rs=st.executeQuery("select b_id from banks where b_name = '"+cbeb.getSelectedItem()+"'");
          
                 while(rs.next()){
                 sumid = rs.getString("b_id");                 
                 
                  rs.close();
                 st.close();
                con.close();  
              }
                }
                catch(Exception ew){
                System.out.println(ew);
                }  
                 
           
                 try{    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery("select p_no from pays where p_no ="+newteacher.getText());
                                                
                if(rs.next()){
                JOptionPane.showMessageDialog(null,"Already exists this teacher");
                }
                else{
                //ep8.setText("");    
                PreparedStatement pstm;      
              
                pstm=con.prepareStatement("insert into pays values(?,?,?,?,?,?,?,?,?,?,?)");	
int i = 0;
		pstm.setInt(1,i);
		pstm.setString(2,newteacher.getText());
                pstm.setString(3,String.valueOf(mr.getSelectedItem())+newteacherNAME.getText());
                pstm.setString(4,teinfor.getText());
                pstm.setString(5,acctea.getText());
                
                 pstm.setString(6,sumid);
                
                  
                
                
                if(cb.isSelected()){ pstm.setString(7,"yes");                
                } 
                else{    pstm.setString(7,"no"); } 
                
                if(cb.isSelected()){ pstm.setString(8,instal.getText());             
                } 
                else{    pstm.setString(8,""); } 
                
                 if(cb.isSelected()){ pstm.setString(9,String.valueOf(icbeb.getSelectedItem()));           
                } 
                else{    pstm.setString(9,""); } 
                 
                 if(cb.isSelected()){ pstm.setString(10,String.valueOf(dura.getSelectedItem()));         
                } 
                else{    pstm.setString(10,""); } 
                pstm.setString(11,lo_no.getText());
               
          	pstm.executeUpdate(); 
  
                 JOptionPane.showMessageDialog(null,"Saved  ok yes");
                newteacher.setText("");
                newteacherNAME.setText("");
                teinfor.setText("");
                acctea.setText("");
               // cbeb.setSelectedItem("BOC (Super Grade) Anuradhapura");
                instal.setText(""); 
                newteacher.requestFocus(true);
                        
                st.close();
                con.close();
                }
                }
                catch(Exception ew){
                System.out.println(ew);
                }               
           }
           
  //----------------------------------------------------------
   }
});       
          clearte = new JLabel("Clear");
          clearte.setBounds(850,390,80,20);
          clearte.setForeground(Color.WHITE);
          adneteacher.add(clearte);
        
   clearte.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     clearte.setText("<html><u>Clear</u></html>");
     clearte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
   
   clearte.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseExited(MouseEvent e) {
  // adte.setBackground(Color.black);
   clearte.setText("Clear");
   }
});      
   clearte.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
       
           newteacher.setText("");
           mr.setSelectedItem("Mr. ");
            newteacherNAME.setText("");
           teinfor.setText("");
           acctea.setText("");
           cbeb.setSelectedItem("Select");
          // cb.is
          // instal.setText("");
           icbeb.setSelectedItem("Select");
           dura.setSelectedItem("Months");


   }
});       
          whit = new JLabel();
          whit.setBounds(180,85,331,307);
          whit.setIcon(new ImageIcon(getClass().getResource("images/bgshow.png")));
          whit.setOpaque(false);
          jp1.add(whit);
     /*
     bankarea = new JTextArea();
     bankarea.setBounds(700,70,280,340);
     bankarea.setOpaque(false);
     Font fteb = new Font("Calibri",Font.PLAIN,12);
     bankarea.setFont(fteb);
     bankarea.setForeground(Color.WHITE);
     jp1.add(bankarea);
     
       try {
    			 Class.forName("com.mysql.jdbc.Driver");
     			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paySheet","root", "");
     			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT * FROM banks ");
          			 while (rs.next()) 
	{                int id = rs.getInt("b_id");
                  	 String nam = rs.getString("b_name");
                        
                   
			 bankarea.append(id +" : "+nam+"\n");
 			 
                         }
                         stmt.close();
     			 con.close();
    } catch (Exception event) {
      System.out.println(event);      
      exceptions.setText("Information : Database connection falier");       
    }  
     
       
     inskarea = new JTextArea();
     inskarea.setBounds(350,70,280,340);
     inskarea.setOpaque(false);
     Font fte = new Font("Calibri",Font.PLAIN,12);
     inskarea.setFont(fte);
     inskarea.setForeground(Color.WHITE);
     jp1.add(inskarea);
     
       try {
    			 Class.forName("com.mysql.jdbc.Driver");
     			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paySheet","root", "");
     			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT * FROM ins_inst ");
          			 while (rs.next()) 
	{                int id = rs.getInt("i_id");
                  	 String nam = rs.getString("name");
                        
                   
			 inskarea.append(id +" : "+nam+"\n");
 			 
                         }
                         stmt.close();
     			 con.close();
    } catch (Exception event) {
      System.out.println(event);      
      exceptions.setText("Information : Database connection falier");       
    }  
     
       
       
       
       tearea = new JTextArea();
     tearea.setBounds(30,70,280,340);
     tearea.setOpaque(false);
     Font ft = new Font("Calibri",Font.PLAIN,12);
     tearea.setFont(ft);
     tearea.setForeground(Color.WHITE);
     jp1.add(tearea);
     
       try {
    			 Class.forName("com.mysql.jdbc.Driver");
     			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paySheet","root", "");
     			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT * FROM pays ");
          			 while (rs.next()) 
	{                int id = rs.getInt("p_no");
                  	 String nam = rs.getString("name");
                        
                   
			 tearea.append(id +" : "+nam+"\n");
 			 
                         }
                         stmt.close();
     			 con.close();
    } catch (Exception event) {
      System.out.println(event);      
      exceptions.setText("Information : Database connection falier");       
    }  
     */
   ////------------------------------------------------------------------------------------------    
       
       
       //==========================db=============================================


//--------------------------bd f============================================

Thread snc = new Thread() {
                    @Override                    
               public void run() {                   
             for(int j = 1; j <= 2; j++){            
                        for(int lk = 1; lk <= 300; lk++){                              
                  for (int i = 70; i < 630; i=i+3) {
            		{
                     //   tearea.setBounds(30,i,280,340);                        
                        //an.setIcon(new ImageIcon(getClass().getResource("images/"+lk+".png")));
		     try {
                        sleep(4);
		     } catch (InterruptedException ex) {}
	            }
                   }                  
                  //---------------
   try
  {
  Thread.sleep(3600); 
  }catch (InterruptedException ie)
  {
  System.out.println(ie.getMessage());
  } 
   
   //------------------------
     for (int i = 70; i < 110; i=i+6) {
            		{
                      //  tearea.setBounds(30,i,280,340);                        
                        //an.setIcon(new ImageIcon(getClass().getResource("images/"+lk+".png")));
		     try {
                        sleep(6);
		     } catch (InterruptedException ex) {}
	            }
                   }
     //-------------------------- 
     try
  {
  Thread.sleep(1300); 
    }catch (InterruptedException ie)
  {
  System.out.println(ie.getMessage());
  } 
     
   
      //------------------------
     for (int i = 80; i < -120; i=i-6) {
            		{
                       // tearea.setBounds(30,i,280,340);                        
                        //an.setIcon(new ImageIcon(getClass().getResource("images/"+lk+".png")));
		     try {
                        sleep(6);
		     } catch (InterruptedException ex) {}
	            }
                   }
     //-------------------------- 

     
    }   
      }    
         }        
            };
snc.start();
       
       
       
       
       
       
       
   ///////////////////////////////////////////////////////////////////////////////////////////////////  
        
       JLabel   labte = new JLabel("Add new teacher to paysheet");
         labte.setBounds(50,10,150,20); 
         labte.setForeground(Color.RED);
        adneteacher.add(labte);  
        
        JLabel   labte1 = new JLabel("Please verify about all informations in this form");
         labte1.setBounds(50,25,300,20); 
         labte1.setForeground(Color.RED);
        adneteacher.add(labte1);
 
  JLabel   newteback = new JLabel("Back");
         newteback.setBounds(930,15,100,20); 
         newteback.setForeground(Color.black);
        adneteacher.add(newteback);  
 newteback.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
       newteback.setBackground(new Color(100,200,100,150)); 
       newteback.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
   
   exi.addMouseListener(new MouseAdapter() {
   @Override
       public void mouseExited(MouseEvent e) {
   newteback.setBackground(new Color(0,0,0,250));
  
   }
});      
        
  newteback.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
       Thread t3 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -50; i > -500; i=i-8) {
            		{ 
                         adneteacher.setBounds(0,i,1000,480);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(1);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };  
  t3.start(); 
  
      Thread t2 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -60; i < 0; i=i+3) {
            		{ 
                         jp2.setBounds(0,i,1000,50);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(3);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };
  
  t2.start(); 
            
  }
}); 
  
  JLabel stp = new JLabel();
        stp.setIcon(new ImageIcon(getClass().getResource("images/stpay.png")));
        stp.setBounds(200,5,39,38);        
         jp2.add(stp); 
         
         JLabel stpa = new JLabel();
        stpa.setIcon(new ImageIcon(getClass().getResource("images/adte.png")));
        stpa.setBounds(800,5,39,38);        
         jp2.add(stpa); 
         
         JLabel stpat = new JLabel();
        stpat.setIcon(new ImageIcon(getClass().getResource("images/sett.png")));
        stpat.setBounds(600,5,43,41);        
         jp2.add(stpat); 
 
         
          JLabel stpatp = new JLabel();
        stpatp.setIcon(new ImageIcon(getClass().getResource("images/ph.png")));
        stpatp.setBounds(400,5,43,41);        
         jp2.add(stpatp); 
         
         JLabel stpatpc = new JLabel();
        stpatpc.setIcon(new ImageIcon(getClass().getResource("images/cl2.png")));
        stpatpc.setBounds(300,5,34,31);        
         add(stpatpc); 
 
  
  
         start = new JLabel("Start pay");
         start.setBounds(250,15,100,20);
         start.setForeground(Color.WHITE);
        jp2.add(start);  
 
  start.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     start.setText("<html><u>Start pay</u></html>");
       start.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
   
   start.addMouseListener(new MouseAdapter() {
   @Override
       public void mouseExited(MouseEvent e) {
  // adte.setBackground(Color.black);
   start.setText("Start pay");
   }
});      
        
  start.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
      
          Thread t2 = new Thread() {
                    @Override
               public void run() {
                  for (int i = 0; i > -60; i=i-3) {
            		{ 
                         jp2.setBounds(0,i,1000,50);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(3);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };
  
  t2.start();   
    
  Thread t3 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -500; i < 0; i=i+8) {
            		{ 
                         startpay.setBounds(0,i,1000,480);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(1);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };  
  t3.start(); 
  
  
  }
});        
     JLabel   payback = new JLabel("Back");
         payback.setBounds(930,15,100,20); 
         payback.setForeground(Color.WHITE);
        startpay.add(payback);  
 payback.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
       payback.setBackground(new Color(100,200,100,150)); 
       payback.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
   
   payback.addMouseListener(new MouseAdapter() {
   @Override
       public void mouseExited(MouseEvent e) {
   payback.setBackground(new Color(0,0,0,250));
  
   }
});      
        
  payback.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
       Thread t3 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -50; i > -500; i=i-8) {
            		{ 
                         startpay.setBounds(0,i,1000,480);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(1);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };  
  t3.start(); 
  
      Thread t2 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -60; i < 0; i=i+3) {
            		{ 
                         jp2.setBounds(0,i,1000,50);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(3);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };
  
  t2.start(); 
  }
}); 
    
  
 // setting panal objects ----------------------------------------- -----------------------------------------------
         JLabel se = new JLabel("Installement Plan");
         se.setBounds(60,65,120,20);
         se.setForeground(Color.WHITE);
         setting.add(se); 
         
         JLabel se1 = new JLabel("Add Institute or Shop");
         se1.setBounds(100,95,120,20);
         se1.setForeground(Color.WHITE);
         setting.add(se1); 
         
         JLabel senid = new JLabel("Institute id");
         senid.setBounds(130,135,100,20);
         senid.setForeground(Color.WHITE);
         setting.add(senid);  
         
 insiid = new JTextField();
 insiid.setBounds(220,135,60,20);
 insiid.setEditable(false);
 insiid.setOpaque(false);
 insiid.setForeground(Color.WHITE);
 insiid.setCaretColor(Color.orange);
 setting.add(insiid);
 
 
 try
        {
            Connection con;  Statement st;  ResultSet rs;

            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
            st=con.createStatement();
            rs=st.executeQuery("select max(i_id) from ins_inst");
            int i=100;
            while (rs.next())
            {
                i=rs.getInt(1);
            }
            insiid.setText(String.valueOf(1+i)); 
            con.close();
            st.close();
            rs.close();
        }
        catch (Exception e)
        {
        e.printStackTrace();
         exceptions.setText("Information : Database connection falier");  
        }    
 
 
 
         
         JLabel sen = new JLabel("Institute name");
         sen.setBounds(130,165,100,20);
         sen.setForeground(Color.WHITE);
         setting.add(sen);  
         
 insi = new JTextField();
 insi.setBounds(220,165,200,20);
 insi.setOpaque(false);
 insi.setForeground(Color.WHITE);
 insi.setCaretColor(Color.orange);
 setting.add(insi);
  
         sensa = new JLabel("save");
         sensa.setBounds(250,195,70,20);
         sensa.setForeground(Color.WHITE);
         setting.add(sensa); 
         
     
         JLabel seb = new JLabel("Bank Deposits");
         seb.setBounds(460,65,120,20);
         seb.setForeground(Color.WHITE);
         setting.add(seb); 
         
         JLabel se1b = new JLabel("Add Bank");
         se1b.setBounds(500,95,120,20);
         se1b.setForeground(Color.WHITE);
         setting.add(se1b); 
         
         
          JLabel senbi = new JLabel("Bank id");
         senbi.setBounds(530,135,100,20);
         senbi.setForeground(Color.WHITE);
         setting.add(senbi);  
         
 insibi = new JTextField();
 insibi.setBounds(620,135,60,20);
 insibi.setOpaque(false);
 insibi.setEditable(false);
 insibi.setForeground(Color.WHITE);
 insibi.setCaretColor(Color.orange);
 setting.add(insibi);
             
         
         edit_te = new JLabel("Edit Teacher Information");
         edit_te.setBounds(60,365,150,20);
         edit_te.setForeground(Color.WHITE);
         setting.add(edit_te);       
         
    edit_te.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     edit_te.setText("<html><u>Edit Teacher Information</u></html>");
     edit_te.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    edit_te.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     edit_te.setText("Edit Teacher Information");
     
    }
});      
        
     edit_te.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseClicked(MouseEvent e) {
   
         Edit_te f = new Edit_te();
     
    }
});             
 
 
   sensa.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     sensa.setText("<html><u>save</u></html>");
     sensa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    sensa.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     sensa.setText("save");
     
    }
});     
        
      sensa.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseClicked(MouseEvent e) {
   
     if(insi.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"No Name of the institute");
     }   
     else{     
        
  try{    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery("select name from ins_inst where name ='"+insi.getText()+"'");
                                                
                if(rs.next()){
                JOptionPane.showMessageDialog(null,"Already exists this institute");
                }
                else{
                //ep8.setText("");    
                PreparedStatement pstm;      
              
                pstm=con.prepareStatement("insert into ins_inst values(?,?)");	
                
		pstm.setInt(1,Integer.parseInt(insiid.getText()));
		pstm.setString(2,insi.getText());
                              
               
          	pstm.executeUpdate(); 
  
                 JOptionPane.showMessageDialog(null,"Institue is Saved");                            /// company saving
                 insi.setText("");
                insiid.setText(String.valueOf(Integer.parseInt(insiid.getText())+1));
                 
                 
                 
                st.close();
                con.close();
                }
                
               
                }
                catch(Exception ew){
                System.out.println(ew);
                }
  inskarea.setText("");
   try {
    			 Class.forName("com.mysql.jdbc.Driver");
     			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paySheet","root", "");
     			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT * FROM ins_inst ");
          			 while (rs.next()) 
	{                int id = rs.getInt("i_id");
                  	 String nam = rs.getString("name");
                        
                   
			 inskarea.append(id +" : "+nam+"\n");
 			 
                         }
                         stmt.close();
     			 con.close();
    } catch (Exception event) {
      System.out.println(event);      
      exceptions.setText("Information : Database connection falier");       
    }  
  
  
  
  
     }
     
    }
});    
          
         
         
 // setting panel objects ------------------------------------------   ---------------------------------------------
        //add bank to system --------------------------------------------------------------------------------------
      
   
 
   try
        {
            Connection con;  Statement st;  ResultSet rs;

            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
            st=con.createStatement();
            rs=st.executeQuery("select max(b_id) from banks");
            int i=100;
            while (rs.next())
            {
                i=rs.getInt(1);
            }
            insibi.setText(String.valueOf(1+i)); 
            con.close();
            st.close();
            rs.close();
        }
        catch (Exception e)
        {
        e.printStackTrace();
         exceptions.setText("Information : Database connection falier");  
        }    
          
    
         
         JLabel senb = new JLabel("Bank name");
         senb.setBounds(530,165,100,20);
         senb.setForeground(Color.WHITE);
         setting.add(senb);  
         
 insib = new JTextField();
 insib.setBounds(620,165,200,20);
 insib.setOpaque(false);
 insib.setForeground(Color.WHITE);
 insib.setCaretColor(Color.orange);
 setting.add(insib);
  
         sensab = new JLabel("save");
         sensab.setBounds(650,195,70,20);
         sensab.setForeground(Color.WHITE);
         setting.add(sensab); 
 
       sensab.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     sensab.setText("<html><u>save</u></html>");
     sensab.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    sensab.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     sensab.setText("save");
     
    }
});     
        
      sensab.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseClicked(MouseEvent e) {
   
     if(insib.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"No Name of the Bank");
     }   
     else{     
        
  try{    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement st = con.createStatement();
                 Statement ste = con.createStatement();
                ResultSet rs=st.executeQuery("select b_name from banks where b_name ='"+insib.getText()+"'");
                                                
                if(rs.next()){
                JOptionPane.showMessageDialog(null,"Already exists this Bank");
                }
                else{
                //ep8.setText("");
                int b_id=0;
                PreparedStatement pstm;      
           
                pstm=con.prepareStatement("insert into banks values(?,?)");	
                int i = b_id+1;
		pstm.setInt(1,Integer.parseInt(insibi.getText()));
		pstm.setString(2,insib.getText());
                              
               
          	pstm.executeUpdate(); 
        
                 JOptionPane.showMessageDialog(null,"Bank is Saved");
                insib.setText("");
                insibi.setText(String.valueOf(Integer.parseInt(insibi.getText())+1));
                        
                st.close();
                con.close();
        
                }
                }
                catch(Exception ew){
                System.out.println(ew);
                } 
  
  ////////////////////////////////////////////////////////////////////////////////////////
  bankarea.setText("");
  
  try {
    			 Class.forName("com.mysql.jdbc.Driver");
     			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paySheet","root", "");
     			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT * FROM banks ");
          			 while (rs.next()) 
	{                int id = rs.getInt("b_id");
                  	 String nam = rs.getString("b_name");
                                           
			 bankarea.append(id +" : "+nam+"\n");
 			                          }
                         stmt.close();
     			 con.close();
    } catch (Exception event) {
      System.out.println(event);      
      exceptions.setText("Information : Database connection falier");       
    } 
    /////////////////////////////////////////////////////////////////////////////////////////
     }
     
    }
});    
          
      
      // add banks -------------------------------------------------------------------------------------------------
  
  JLabel   adte1 = new JLabel("Check pays");
         adte1.setBounds(450,15,120,20);
         adte1.setForeground(Color.WHITE);
        jp2.add(adte1);  
        
    adte1.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     adte1.setText("<html><u>Check pays</u></html>");
     adte1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    adte1.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
     adte1.setText("Check pays");
    }
});     
        
      adte1.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseClicked(MouseEvent e) {
     Thread t2 = new Thread() {
                    @Override
               public void run() {
                  for (int i = 0; i > -60; i=i-3) {
            		{ 
                         jp2.setBounds(0,i,1000,50);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(3);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };
  t2.start();  
      Thread t3 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -500; i < 0; i=i+8) {
            		{ 
                        checkpanel.setBounds(0,i,1000,480);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(1);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };  
  t3.start();  
    }
});        
        
        
         JLabel   adteT = new JLabel("PAYSHEET");
         adteT.setBounds(480,225,320,50);  
         Font trT = new Font("Calibri",Font.BOLD, 55) ;
        adteT.setFont(trT);
          adteT.setForeground(Color.GRAY);
        jp1.add(adteT);  
        
        
        
  JLabel   adte2 = new JLabel("Settings");
         adte2.setBounds(650,15,120,20);  
          adte2.setForeground(Color.WHITE);
        jp2.add(adte2);  
 
 adte2.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     adte2.setText("<html><u>Settings</u></html>");
     adte2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    adte2.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
     adte2.setText("Settings");
    }
});     
        
      adte2.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseClicked(MouseEvent e) {
     Thread t2 = new Thread() {
                    @Override
               public void run() {
                  for (int i = 0; i > -60; i=i-3) {
            		{ 
                         jp2.setBounds(0,i,1000,50);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(3);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };
  t2.start();  
      Thread t3 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -500; i < 0; i=i+8) {
            		{ 
                         setting.setBounds(0,i,1000,480);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(1);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };  
  t3.start();  
    }
});    
    
       JLabel   sebackc = new JLabel("Back");
         sebackc.setBounds(930,15,100,20); 
         sebackc.setForeground(Color.WHITE);
         checkpanel.add(sebackc);  
                  sebackc.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     sebackc.setText("<html><u>Back</u></html>");
     sebackc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
   
   sebackc.addMouseListener(new MouseAdapter() {
   @Override
       public void mouseExited(MouseEvent e) {
  // adte.setBackground(Color.black);
   sebackc.setText("Back");
   }
});      
         
      sebackc.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
       Thread t3 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -50; i > -500; i=i-8) {
            		{ 
                         checkpanel.setBounds(0,i,1000,480);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(1);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };  
  t3.start();   
      Thread t2 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -60; i < 0; i=i+3) {
            		{ 
                         jp2.setBounds(0,i,1000,50);//jpan.setBounds(580,191,580,330);                        
		     try {
                        sleep(3);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };  
  t2.start(); 
  }
}); 
      
      
      
      
      
      
    JLabel   seback = new JLabel("Back");
         seback.setBounds(930,15,100,20); 
         seback.setForeground(Color.WHITE);
         setting.add(seback);  
                  seback.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     seback.setText("<html><u>Back</u></html>");
     seback.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
   
   seback.addMouseListener(new MouseAdapter() {
   @Override
       public void mouseExited(MouseEvent e) {
  // adte.setBackground(Color.black);
   seback.setText("Back");
   }
});      
         
      seback.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
       Thread t3 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -50; i > -500; i=i-8) {
            		{ 
                         setting.setBounds(0,i,1000,480);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(1);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };  
  t3.start();   
      Thread t2 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -60; i < 0; i=i+3) {
            		{ 
                         jp2.setBounds(0,i,1000,50);//jpan.setBounds(580,191,580,330);                        
		     try {
                        sleep(3);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };  
  t2.start(); 
  }
}); 
        
 JPanel tep = new JPanel();
 tep.setLayout(null);
 tep.setBackground(Color.WHITE);     // small up panet add to teachers panel
 tep.setBounds(00,0,1000,50);
 adneteacher.add(tep); 
         
 
 JPanel addp = new JPanel();
 addp.setLayout(null);
 addp.setBackground(Color.GRAY);     // small up panet add to teachers panel
 addp.setBounds(00,0,1000,50);
 startpay.add(addp); 
         
 
         savepay = new JLabel("Save");
         savepay.setBounds(200,370,60,20); 
         savepay.setForeground(Color.WHITE);
         startpay.add(savepay);  
 
 
         savepay.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     savepay.setText("<html><u>Save</u></html>");
     savepay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    savepay.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     savepay.setText("Save");
     
    }
});     
         
    
     savepay.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseClicked(MouseEvent e) {
   
    
     
    }
});
         
         
        
        JLabel   adte = new JLabel("Add new Teacher");
         adte.setBounds(850,15,120,20);    
          adte.setForeground(Color.WHITE);
          jp2.add(adte);   
        
               adte.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     adte.setText("<html><u>Add new Teacher</u></html>");
     adte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
   
   adte.addMouseListener(new MouseAdapter() {
   @Override
       public void mouseExited(MouseEvent e) {
  // adte.setBackground(Color.black);
   adte.setText("Add new Teacher");
   }
});      
        
  adte.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
      
          Thread t2 = new Thread() {
                    @Override
               public void run() {
                  for (int i = 0; i > -60; i=i-3) {
            		{ 
                         jp2.setBounds(0,i,1000,50);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(3);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };
  
  t2.start();   
    
  Thread t3 = new Thread() {
                    @Override
               public void run() {
                  for (int i = -500; i < 0; i=i+8) {
            		{ 
                         adneteacher.setBounds(0,i,1000,480);//jpan.setBounds(580,191,580,330);
                        
		     try {
                        sleep(1);
		     } catch (InterruptedException ex) {}
	     }
               }
                 }
            };  
  t3.start(); 
  
  
  }
});  
        
  DocumentListener documentListener = new DocumentListener() {
      public void changedUpdate(DocumentEvent documentEvent) {
        printIt(documentEvent);
      }
      public void insertUpdate(DocumentEvent documentEvent) {
        printIt(documentEvent);
      }
      public void removeUpdate(DocumentEvent documentEvent) {
        printIt(documentEvent);
      }
      private void printIt(DocumentEvent documentEvent) {
        DocumentEvent.EventType type = documentEvent.getType();
       teinf.setText("");
        bnks.setText("");
        in_number.setText("");
       
                         tein_ac.setText("");
                         tein.setText("");
 			
                          tein_amo.setText("");
                          te_ins.setText("");
        
        
         try {
    			 Class.forName("com.mysql.jdbc.Driver");
     			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paySheet","root", "");
     			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT id,p_no,name,bank,acco,if_ins,amount,institute,loan FROM pays WHERE p_no="+Integer.parseInt(startpayt.getText()));
          		
          		
                         
                         while (rs.next()) 
	{                int id = rs.getInt("id");
                  	 int p_id = rs.getInt("p_no");
                         String name = rs.getString("name");
                         bnk_id = rs.getString("bank");
                            String ac = rs.getString("acco");
                            String ins = rs.getString("if_ins");
                            String tam = rs.getString("amount");
                            String ints = rs.getString("institute");
                           String int_ac = rs.getString("loan");
                            
                            String bnm = null;
                        
                ResultSet rs2 = stmt.executeQuery("SELECT b_name FROM banks WHERE b_id=" +bnk_id);
                while (rs2.next()) 
                    bnm = rs2.getString("b_name");
                 
                    
			 teinf.setText(name);
                         tein_ac.setText(ac);
                         tein.setText(ins);
 			  bnks.setText(bnm);
                          tein_amo.setText(tam);
                          te_ins.setText(ints);
                          in_number.setText(int_ac);
                         }
                          rs.close();        
                         stmt.close();
     			 con.close();
    } catch (Exception event) {
      System.out.println(event);
    }        
         
       // System.out.println(startpayt.getText());
      }
    };
    startpayt.getDocument().addDocumentListener(documentListener);  
  
     JLabel   ba = new JLabel();
        ba.setIcon(new ImageIcon(getClass().getResource("images/bacs.png")));
        ba.setBounds(0,0,1000,480);        
     // add(ba);  
        
    
        
        
            
        setSize(1000,560);
        setBackground(new Color(10, 30, 40, 240));
        setLocationRelativeTo(null);
        setVisible(true);
       
     }
    public static void main(String[] args) {
        
        try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }
        
        
        
        Nbits_Soft frame = new Nbits_Soft();
       
         frame.addMouseListener(new MouseListener(){
                public void mouseReleased(MouseEvent e) {
                  
                }
                public void mousePressed(MouseEvent e) {
                    mouseDownScreenCoords = e.getLocationOnScreen();
                    mouseDownCompCoords = e.getPoint();
                }
                public void mouseExited(MouseEvent e) {
                }
                public void mouseEntered(MouseEvent e) {
                }
                public void mouseClicked(MouseEvent e) {
                }
            });
            frame.addMouseMotionListener(new MouseMotionListener(){
                public void mouseMoved(MouseEvent e) {
                }
                public void mouseDragged(MouseEvent e) {
                     
                    
                    Point currCoords = e.getLocationOnScreen();
                   frame.setLocation(mouseDownScreenCoords.x + (currCoords.x - mouseDownScreenCoords.x) - mouseDownCompCoords.x,mouseDownScreenCoords.y + (currCoords.y - mouseDownScreenCoords.y) - mouseDownCompCoords.y);
               
                
                }
            });        
        
        
    }
  

    
}
