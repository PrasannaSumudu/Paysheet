/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbits_soft;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static nbits_soft.Viewall.mouseDownScreenCoords;

/**
 *
 * @author SJC-2017
 */
class Edit_te extends JFrame{
    
    static Point mouseDownScreenCoords;
        static Point mouseDownCompCoords;
        JTextField infor,in_number,tein_amo,tein_ac,teinf,lo_no,bnks,insiid,insibi,insib,insi,newteacher,newteacherNAME,startpayt,acctea,instali,instal,dedu;
    JTextArea las_add_te,tearea,inskarea,bankarea,teinfor;
    JLabel  ye,edit_te,wel_up,wel,tot_te,page_tot,balance,viewall,tot_pa,total_bal,savepay,allte,exceptions,sensab,sensa,start,std2,std3,std,std1,label1,label2,savete,clearte,tot1;
    JComboBox tein,amoun,te_ins,pag,cbe,cbe1,cbeb,icbeb,dura,mr;
    String bnk_id = null;
  
    Edit_te(){
    
    
     try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }
           setLayout(null);
        
        
       JLabel  setin = new JLabel("Edit Teacher's pay information");
 Font ca448 = new Font("Calibri",Font.PLAIN,16);
 setin .setForeground(new Color(255,255,255,250));
 setin.setFont(ca448);
 setin.setBounds(30,05,300,25);  
 add(setin); 
 
 JLabel exi = new JLabel();
        exi.setIcon(new ImageIcon(getClass().getResource("images/ex.png")));
        exi.setBounds(670,10,17,17);        
         add(exi);  
 
 JPanel jp3 = new JPanel();
 jp3.setLayout(null);
 jp3.setBackground(new Color(10, 40, 50, 240));
 jp3.setBounds(00,00,1000,30);
 add(jp3);  
             
 startpayt = new JTextField();
 startpayt.setBounds(200,130,100,20);
 startpayt.setOpaque(false);                             //   
 startpayt.setForeground(Color.WHITE);
 startpayt.setCaretColor(Color.orange);
 add(startpayt);
 
 
  exi.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseEntered(MouseEvent e) {
       
 exi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
       
  }
});      
       
   exi.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseExited(MouseEvent e) {
       
 //ex1.setVisible(false);
       
  }
});         
     
    exi.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
    //model.setRowCount(0);    
   dispose();
       
    //   setVisible(false);
       
    // System.load(id1); 
       
  }
});      
 
 
 
 
  this.addWindowListener(new WindowAdapter(){ 
  public void windowOpened( WindowEvent e){ 
    startpayt.requestFocus();
  } 
});
 
         JLabel payn = new JLabel("Paysheet No.");
         payn.setBounds(100,130,100,20); 
         payn.setForeground(Color.WHITE);
         add(payn);  
         
         JLabel payna = new JLabel("Name");
         payna.setBounds(100,170,100,20); 
         payna.setForeground(Color.WHITE);
         add(payna); 
         
         JLabel paynai = new JLabel("Installements");
         paynai.setBounds(100,290,100,20); 
         paynai.setForeground(Color.WHITE);
         add(paynai); 
         
           JLabel paynaiac = new JLabel("Account No");
         paynaiac.setBounds(100,250,100,20); 
         paynaiac.setForeground(Color.WHITE);
         add(paynaiac);
         
         JLabel amo = new JLabel("Bank ");
         amo.setBounds(100,210,80,20); 
         amo.setForeground(Color.WHITE);
         add(amo); 
         
         JLabel ded = new JLabel("Ins. Duration ");
         ded.setBounds(100,330,100,20); 
         ded.setForeground(Color.WHITE);
         add(ded); 
         
          JLabel inf = new JLabel("Te. Information ");
         inf.setBounds(100,370,100,20); 
         inf.setForeground(Color.WHITE);
         add(inf); 
         
          JLabel ded1 = new JLabel("Loan No.");
         ded1.setBounds(320,330,100,20); 
         ded1.setForeground(Color.WHITE);
         add(ded1); 
         
         in_number = new JTextField();
 in_number.setBounds(390,330,160,20);
 in_number.setOpaque(false); 
 // in_number.setEditable(false);  //   
 in_number.setForeground(Color.WHITE);
 in_number.setCaretColor(Color.orange);
 add(in_number);
         
         
         JLabel edit = new JLabel("Update");
         edit.setBounds(200,420,100,20); 
         edit.setForeground(Color.WHITE);
         add(edit);  

         
         edit.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     edit.setText("<html><u>Update</u></html>");
     edit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
   
   edit.addMouseListener(new MouseAdapter() {
   @Override
       public void mouseExited(MouseEvent e) {  
   edit.setText("Update");
   }
});      
        

         ye = new JLabel();
         ye.setBounds(200,90,100,20); 
         ye.setForeground(Color.WHITE);
         add(ye);  
         

JLabel yep = new JLabel("Page No");
         yep.setBounds(450,80,80,20); 
         yep.setForeground(Color.WHITE);
       //  add(yep); 



          teinf = new JTextField();
          teinf.setBounds(200,170,348,20);
          teinf.setForeground(Color.WHITE);
          teinf.setCaretColor(Color.orange);
          teinf.setOpaque(false);
          add(teinf); 
          
          tein = new JComboBox();
          tein.setBounds(200,290,100,20);
          tein.addItem("yes");
          tein.addItem("no");
          tein.setOpaque(false);
          add(tein); 
          
        
          
          te_ins = new JComboBox();
          te_ins.setBounds(310,290,240,20);
         // te_ins.setForeground(Color.WHITE);
        //  te_ins.setEditable(false);
         // te_ins.setCaretColor(Color.orange);
          te_ins.setOpaque(false);
          add(te_ins);           
          
          
           try{
    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery("select name from ins_inst");
                                
               while(rs.next()){
        te_ins.addItem(rs.getString("name"));
        }
                
                }
                catch(Exception ew){
                System.out.println(ew);
                } 
          
          
          
          
          tein_ac = new JTextField();
          tein_ac.setBounds(200,250,150,20);
          tein_ac.setForeground(Color.WHITE);
          tein_ac.setCaretColor(Color.orange);
         //  tein_ac.setEditable(false);
          tein_ac.setOpaque(false);
          add(tein_ac); 
          
          tein_amo = new JTextField();
          tein_amo.setBounds(440,250,110,20);
          tein_amo.setForeground(Color.WHITE);
          tein_amo.setCaretColor(Color.orange);
          // tein_amo.setEditable(false);
          tein_amo.setOpaque(false);
          add(tein_amo); 
        
 JTextField tyi = new JTextField();
 tyi.setBounds(200,170,350,100);
 tyi.setOpaque(false);
 tyi.setEditable(false);
 //startpay.add(tyi);                  
         
 amoun = new JComboBox();
 amoun.setBounds(200,210,250,20);
 amoun.setOpaque(false);                             //   
 amoun.setForeground(Color.RED);
 //amoun.setCaretColor(Color.RED);
 add(amoun); 
 
  try{
    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery("select b_name from banks");
                                
               while(rs.next()){
        amoun.addItem(rs.getString("b_name"));
        }
                
                }
                catch(Exception ew){
                System.out.println(ew);
                } 
 
 
 
 dedu = new JTextField();
 dedu.setBounds(200,330,100,20);
 dedu.setOpaque(false);                             //   
 dedu.setForeground(Color.WHITE);
 dedu.setCaretColor(Color.RED);
 add(dedu);  
 
 infor = new JTextField();
 infor.setBounds(200,370,200,20);
 infor.setOpaque(false);                             //   
 infor.setForeground(Color.WHITE);
 infor.setCaretColor(Color.RED);
 add(infor); 
           
           
 edit.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
      
       Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String updateTableSQL = "UPDATE pays SET id=?, p_no = ?, name = ?, te_infor =?, acco=?, bank=?, if_ins=?, institute=?, amount=?, durat=?, loan=? WHERE p_no="+startpayt.getText();
				                  

		try {
                    Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
			//dbConnection = getDBConnection();
			preparedStatement = cont.prepareStatement(updateTableSQL);

			preparedStatement.setInt(1,Integer.parseInt(ye.getText()));
                        preparedStatement.setInt(2, Integer.parseInt(startpayt.getText()));
                        preparedStatement.setString(3, teinf.getText());
                        preparedStatement.setString(4, infor.getText());
                        preparedStatement.setString(5, tein_ac.getText());                        
                         
                String bnm = null;                        
                ResultSet rs2 = preparedStatement.executeQuery("SELECT b_id FROM banks WHERE b_name='" +amoun.getSelectedItem()+"'");
                while (rs2.next()) 
                bnm = rs2.getString("b_id"); 
                         preparedStatement.setString(6, bnm);                         
                         preparedStatement.setString(7, String.valueOf(tein.getSelectedItem()));                         
//                String t_i = null;                        
//                ResultSet rs3 = preparedStatement.executeQuery("select i_id from ins_inst WHERE name='" +te_ins.getSelectedItem()+"'");
//                while (rs3.next()) 
//                t_i = rs3.getString("t_id");         
//                         
                         String ind = null;
                        if( te_ins.getSelectedItem() == "") {
                            //preparedStatement.setString(8, "");
                            ind = "";
                        }
                        else{                        
                           // preparedStatement.setString(8, String.valueOf(te_ins.getSelectedItem()));
                            ind = String.valueOf(te_ins.getSelectedItem());
                        }
                        
                        preparedStatement.setString(8, ind);
                         preparedStatement.setString(9, tein_amo.getText());
                         preparedStatement.setString(10, dedu.getText());
                         preparedStatement.setString(11, in_number.getText());
			//preparedStatement.setInt(2, 1001);

			// execute update SQL stetement
			preparedStatement.executeUpdate();
                        
                         JOptionPane.showMessageDialog(rootPane, "Record Updated - No "+startpayt.getText());
                        
                         
                         

		} catch (SQLException er) {

			System.out.println(er.getMessage());

		} catch (ClassNotFoundException ex) { 
           Logger.getLogger(Edit_te.class.getName()).log(Level.SEVERE, null, ex);
       } 
       
        
  }
}); 
         
 
 
 
           
        
        setSize(700,500);
        setUndecorated(true);       
        setBackground(new Color(10, 30, 40, 240));
        setVisible(true);
        
        setLocationRelativeTo(null);  
        
       
           addMouseListener(new MouseListener(){
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
            addMouseMotionListener(new MouseMotionListener(){
                public void mouseMoved(MouseEvent e) {
                }
                public void mouseDragged(MouseEvent e) {
                     
                    
                    Point currCoords = e.getLocationOnScreen();
                   setLocation(mouseDownScreenCoords.x + (currCoords.x - mouseDownScreenCoords.x) - mouseDownCompCoords.x,mouseDownScreenCoords.y + (currCoords.y - mouseDownScreenCoords.y) - mouseDownCompCoords.y);
               
                
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
      //  bnks.setText("");
        in_number.setText("");
       
                         tein_ac.setText("");
                        // tein.setText("");
 			
                          tein_amo.setText("");
                          ye.setText("");
        
        int id;
         try {
    			 Class.forName("com.mysql.jdbc.Driver");
     			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paySheet","root", "");
     			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT id,p_no,name,bank,acco,if_ins,amount,institute,loan,durat FROM pays WHERE p_no="+Integer.parseInt(startpayt.getText()));
          		
          		
                         
                         while (rs.next()) 
	{                 id = rs.getInt("id");
                  	 int p_id = rs.getInt("p_no");
                         String name = rs.getString("name");
                         bnk_id = rs.getString("bank");
                            String ac = rs.getString("acco");
                            String ins = rs.getString("if_ins");
                            String tam = rs.getString("amount");
                            String ints = rs.getString("institute");
                           String int_ac = rs.getString("loan");
                           String deu = rs.getString("durat");
                           String lo = rs.getString("loan");
                            
                            String bnm = null;
                        
                ResultSet rs2 = stmt.executeQuery("SELECT b_name FROM banks WHERE b_id=" +bnk_id);
                while (rs2.next()) 
                    bnm = rs2.getString("b_name");
                 
                          ye.setText(String.valueOf(id));
			 teinf.setText(name);
                         tein_ac.setText(ac);
                         tein.setSelectedItem(ins);
 			 // bnks.setText(bnm);
                          tein_amo.setText(tam);
                          
                          if(ints.isEmpty()){
                              te_ins.setSelectedItem("");
                          }else{
                          te_ins.setSelectedItem(ints);
                          }
                          
                          in_number.setText(int_ac);
                          amoun.setSelectedItem(bnm);
                          dedu.setText(deu);
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
       
        
    }
    
}
