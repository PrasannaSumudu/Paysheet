/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbits_soft;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NBITS
 */
public class Viewall extends JFrame{
    static Point mouseDownScreenCoords;
        static Point mouseDownCompCoords;
        Vector originalTableModel;
DocumentListener documentListener;
int posX=0,posY=0;
JLabel mi,min,std,std1,label1,label2,anima,anima1,logo2,ad,cp,ei,cp1,ba,adn9,op5,ex1,ex2;
static Vector<Vector<String>> data=new Vector<Vector<String>>();
JTable table2;
JTextArea txa,ta;
 DefaultTableModel model;
    String id1,id2;
JPasswordField t;
JScrollPane scrollPane;
JPanel p4,jp6;
JComboBox religojb,gradjb;        
        
        
    Viewall(){
        
        
               try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }
        
        
        
        
       
        setUndecorated(true);       
        setBackground(new Color(10, 30, 40, 240));
        setLayout(null);
        initComponents();
    
    //backup of original values to check
    originalTableModel = (Vector) ((DefaultTableModel) table.getModel()).getDataVector().clone();
    //add document listener to jtextfield to search contents as soon as something typed on it
    addDocumentListener();
    
         setSize(1040,540);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        
        
        
        
    }
        
     
    private void addDocumentListener() {
    documentListener = new DocumentListener() {
        public void changedUpdate(DocumentEvent documentEvent) {
            search();
        }

        public void insertUpdate(DocumentEvent documentEvent) {
            search();
        }

        public void removeUpdate(DocumentEvent documentEvent) {
            search();
        }

        private void search() {
            
            
           // selectedline();
            searchTableContents(jTextField1.getText());
            //////////////////////
         }
    };
    searchOnType.setSelected(true);
}
    
    
  @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
private void initComponents() {
   
    JLabel setin1 = new JLabel();
//        setin1.setIcon(new ImageIcon(getClass().getResource("images/settingg.png")));
        setin1.setBounds(1090,50,66,61); 
        add(setin1); 
        
        JLabel setin2 = new JLabel();
      //  setin2.setIcon(new ImageIcon(getClass().getResource("images/sort.png")));
        setin2.setBounds(350,490,66,150); 
        add(setin2);
        
    
 JLabel  setin = new JLabel("xxxxxxxxxxxxxx");
 Font ca448 = new Font("Calibri",Font.PLAIN,24);
 setin .setForeground(new Color(255,255,255,250));
 setin.setFont(ca448);
 setin.setBounds(660,50,400,25);  
 add(setin); 
        
  JLabel   exi = new JLabel();
        exi.setIcon(new ImageIcon(getClass().getResource("images/ex.png")));
        exi.setBounds(1015,7,17,17);        
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
       dispose();
        
  }
}); 
    
      
     JPanel jp1 = new JPanel();
 jp1.setLayout(null);
 jp1.setBackground(new Color(37,93,119,250));
 jp1.setBounds(00,0,1185,1);
 add(jp1);
       
         
 JPanel jp3 = new JPanel();
 jp3.setLayout(null);
 jp3.setBackground(new Color(37,93,119,250));
 jp3.setBounds(00,0,1,732);
 add(jp3);
 
 
 
 
 JPanel jp4 = new JPanel();
 jp4.setLayout(null);
 jp4.setBackground(new Color(37,93,119,250));
 jp4.setBounds(1179,0,1,652);
 add(jp4);
 
 JPanel jp8 = new JPanel();
 jp8.setLayout(null);
 jp8.setBackground(new Color(48,74,85,250));
 jp8.setBounds(0,480,1185,10);
 add(jp8);
 
 
 JPanel jp9 = new JPanel();
 jp9.setLayout(null);
 jp9.setBackground(new Color(48,74,85,250));
 jp9.setBounds(400,480,10,200);
 add(jp9);
 
  JPanel jp10 = new JPanel();
 jp10.setLayout(null);
 jp10.setBackground(new Color(48,74,85,250));
 jp10.setBounds(800,480,10,200);
 add(jp10);
 
 JPanel jp5 = new JPanel();
 jp5.setLayout(null);
 jp5.setBackground(new Color(37,93,119,250));
 jp5.setBounds(0,649,1185,1);
 add(jp5);
 
 
 
 
 
   
 
JLabel religo = new JLabel("Religin");
 religo.setBounds(50,560,80,20);
 Font relfon = new Font("Calibri",Font.PLAIN,12);
 religo.setFont(relfon);
 religo.setForeground(new Color(93,139,153,250));
 add(religo); 
 
 
 
  
 religojb = new JComboBox();             
       religojb.addItem("Catholic");             
       religojb.addItem("Budhism");    
       religojb.addItem("Cristean");
       religojb.addItem("Islam");
       religojb.addItem("Hindu");
       religojb.setOpaque(false);
       religojb.setBounds(100,560,80,20);
      // add(religojb);
 
 
 jp6 = new JPanel();
 jp6.setLayout(null);
 jp6.setBackground(new Color(48,74,85,250));
 jp6.setBounds(0,0,1185,28);
 add(jp6); 
 
     
 
  JLabel ex = new JLabel();
//        ex.setIcon(new ImageIcon(getClass().getResource("images/exitb.png")));
        ex.setBounds(1142,7,18,17);        
       jp6.add(ex); 

 
       ex1 = new JLabel();
     //   ex1.setIcon(new ImageIcon(getClass().getResource("images/exred.png")));
        ex1.setBounds(1130,5,42,21);  
        ex1.setVisible(false);
       jp6.add(ex1); 

       ///////////////////////////////////////////////////////////////////
       
    
    
 
 
        min = new JLabel();
//        min.setIcon(new ImageIcon(getClass().getResource("images/ben/minimise.png")));
        min.setBounds(1100,6,34,20);  
       jp6.add(min); 
    
    
        mi = new JLabel();
     //   mi.setIcon(new ImageIcon(getClass().getResource("images/ben/minimi.png")));
        mi.setBounds(1090,6,40,20); 
        mi.setVisible(false);
       jp6.add(mi); 

     min.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseEntered(MouseEvent e) {
       
 mi.setVisible(true);
       
  }
});      
       
      min.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseExited(MouseEvent e) {
       
 mi.setVisible(false);
       
  }
});         
     
    min.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
       
  // setState(TestingFrame.ICONIFIED);
       
  }
});      
 
 
      
  JLabel set = new JLabel("Paysheet");
 //set.setIcon(new ImageIcon(getClass().getResource("images/ben/logo.png")));
 Font ca44 = new Font("Calibri",Font.PLAIN,20);
 set .setForeground(Color.LIGHT_GRAY);
 set.setFont(ca44);
        set.setBounds(10,6,450,25);  
        jp6.add(set);     
      
      
      
      
      

    jScrollPane1 = new javax.swing.JScrollPane();
    jScrollPane1.setBounds(10,50,1000,350);
    
     jScrollPane1.setHorizontalScrollBarPolicy(
    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
  jScrollPane1.setVerticalScrollBarPolicy(
    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
  
    
    
    Vector<String> headers=new Vector<String>();
    headers.add("pno");
   headers.add("name");
   headers.add("te_infor");
   headers.add("acco");
   headers.add("bank");
   headers.add("if_ins");
   headers.add("amount");
   headers.add("institute");
     headers.add("durat");
  
    model = new DefaultTableModel(data, headers);
//  table=new JTable(model);
    table = new javax.swing.JTable(model);
    
  // Color ivory = new Color(10, 30, 40, 200);
//table.setOpaque(true);
table.setFillsViewportHeight(true);
//table.setBackground(ivory);
//table.setForeground(Color.WHITE);
table.getColumn("pno").setMaxWidth(40);
table.getColumn("name").setMaxWidth(260);
table.getColumn("te_infor").setMaxWidth(60);
table.getColumn("acco").setMaxWidth(120);
table.getColumn("bank").setMaxWidth(200);
table.getColumn("if_ins").setMaxWidth(60);
table.getColumn("amount").setMaxWidth(100);
table.getColumn("institute").setMaxWidth(100);
table.getColumn("durat").setMaxWidth(60);
//table.getColumn("Father/Mother").setMaxWidth(60);
//table.getColumn("Unit rate").setMaxWidth(80);

    //ListSelectionModel selectionModel = table.getSelectionModel();
	//	selectionModel.addListSelectionListener( this );
   
    
    jpl = new javax.swing.JPanel();
    jpl.setBounds(10,80,1150,510);
    jpl.setOpaque(false);
    jpl.setLayout(null);
    jpl.setBackground(Color.WHITE);
    
   // add(jpl);
    
   ////     clear all data in table and exit
    
     ex.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseEntered(MouseEvent e) {
       
 ex1.setVisible(true);
       
  }
});      
       
      ex.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseExited(MouseEvent e) {
       
 ex1.setVisible(false);
       
  }
});         
     
    ex.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
    model.setRowCount(0);    
   dispose();
       
    //   setVisible(false);
       
    // System.load(id1); 
       
  }
});      
    
    
    ///// -------------------------------------
    
         
      ta = new JTextArea(10, 80);
      ta.setEditable(false);
      ta.setBackground( new Color(1,1,100,0) );
      ta.setForeground(Color.CYAN);
      Font fa1 = new Font("Calibri",Font.PLAIN,12);
      ta.setFont(fa1);
      
      
      scrollPane = new JScrollPane(ta);
scrollPane.setBounds(620,-10,400,660);
scrollPane.setOpaque(false);
      // scrollPane.getVerticalScrollBar().setBackground(new Color(192, 192, 128));      
jpl.add( scrollPane );
  // scrollPane.getViewport().setBackground(new Color(1,1,100,0));    
      
      
   
    
    
    
    // ------------------------------------------           login   
    
    jPanel1 = new javax.swing.JPanel();
    jPanel1.setBounds(10,80,1180,480);
    jPanel1.setOpaque(false);
    jPanel1.setLayout(null);
    //jPanel1.setVisible(false);
   // jPanel1.setBackground(Color.red);
    
       JLabel adn3 = new JLabel("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	adn3.setBounds(20,60,380,20);
        adn3.setForeground(Color.LIGHT_GRAY);
        Font fa11 = new Font("calibri",Font.PLAIN,16);
      adn3.setFont(fa11);
	add(adn3);
        
    
    searchOnType = new javax.swing.JCheckBox();
    searchOnType.setBounds(10,10,80,20);
    searchOnType.setOpaque(false);
    searchOnType.setVisible(false);
    searchOnType.setForeground(Color.WHITE);
    jPanel1.add(searchOnType);
    
     txa = new JTextArea();
     txa.setBounds(720,50,255,150);
     txa.setForeground(Color.WHITE);
     txa.setLineWrap(true);
     txa.setOpaque(false);
     Font fa8 = new Font("Calibri",Font.PLAIN,12);
     txa.setFont(fa8);
     //jPanel1.add(txa);
    
    jTextField1 = new javax.swing.JTextField();
    jTextField1.setBounds(10,10,380,25);
    jTextField1.requestFocus(true);
    jTextField1.setOpaque(false);
    jTextField1.setForeground(Color.WHITE);
    jTextField1.setCaretColor(Color.ORANGE);
    jPanel1.add(jTextField1);
    
    JTextField jTextField2 = new JTextField();
    jTextField2.setBounds(8,8,384,29);
    jTextField2.setOpaque(false);
    jTextField2.setEditable(false);
    jTextField2.setCaretColor(Color.ORANGE);
    jPanel1.add(jTextField2);
    
    
    searchButton = new javax.swing.JButton();
    searchButton.setBounds(500,50,80,20);
    //jPanel1.add(searchButton);
    
   
    
    
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


    jScrollPane1.setViewportView(table);
     jScrollPane1.getViewport().setOpaque(false);
jScrollPane1.getViewport().setBackground(Color.blue);
   jPanel1.add(jScrollPane1);

    searchOnType.setText("Search");
    searchOnType.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            searchOnTypeItemStateChanged(evt);
        }
    });

    searchButton.setText("Search");
    searchButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           // searchButtonActionPerformed(evt);
        }
    });

   // javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);

   add(jPanel1);
   
      
   
   
   
    pack();
    
    
    
  
//--------------------------------------------
        adn9 = new JLabel();
	adn9.setBounds(10,400,450,20);
        adn9.setForeground(Color.WHITE);
	jPanel1.add(adn9);



  //------------------------------------------------------------  
    
  String str="select * from pays";
  Connection cn;
  ResultSet rs;
  Statement st;
  
  try {
   // Change the database name, hosty name, 
   // port and password as per MySQL installed in your PC.
   cn=DriverManager.getConnection("jdbc:mysql://localhost/pay", "root", "");
   st=cn.createStatement();
   
   rs=st.executeQuery(str);
   
   while(rs.next())
   {
    Vector <String> d=new Vector<String>();
    d.add(rs.getString("p_no"));
    d.add(rs.getString("name"));
    d.add(rs.getString("te_infor"));
    d.add(rs.getString("acco"));

   d.add(rs.getString("bank"));      
  //  }
    d.add(rs.getString("if_ins"));
       d.add(rs.getString("amount"));
    d.add(rs.getString("institute"));
     d.add(rs.getString("durat"));
   // d.add(rs.getString("privesschool"));
  ////   d.add(rs.getString("addmitgrad"));
  //  d.add(rs.getString("notes"));
    
    d.add("\n\n\n\n\n\n\n");
    data.add(d);
   }
   
  } catch (SQLException e) {
   
   e.printStackTrace();
  }


    
  //-------------------------------------------------------------------------  
    
    
    
    
     jTextField1.addKeyListener(new KeyAdapter() {
            @Override
    public void keyPressed(final KeyEvent ke) {
                int keyPad = ke.getKeyCode();
        if (keyPad == KeyEvent.VK_DOWN){
               
      		 table.getSelectionModel().setSelectionInterval( 0, 0);
                 table.requestFocus();
                     //DefaultTableModel model = (DefaultTableModel)table.getModel();
                 
                 
          
      
        }
        else{
           //  logo2.setVisible(true);
        }
     }
});
     
  
  /*  */
        
      
        // get the model from the jtable
   
     
     JLabel adn2 = new JLabel("ttcc deed cwwd");
	adn2.setBounds(50,440,200,20);
        adn2.setForeground(Color.WHITE);
	jpl.add(adn2);
     
     
    JLabel adn1 = new JLabel("cccc dddd ccdd");
	adn1.setBounds(50,460,200,20);
        adn1.setForeground(Color.WHITE);
	jpl.add(adn1);
        
        JLabel adn = new JLabel();
	adn.setBounds(660,100,200,20);
        adn.setForeground(new Color(93,139,153,250));
	add(adn);
        
        
    int cccc = table.getRowCount();
    //int cols = table.getColumnCount();
    
   adn.setText("Total Teachers - "+ String.valueOf(cccc));
   // System.out.println(cols);
        
        
        
   // table selection     
        
            table.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent ke) {
                int keyPad = ke.getKeyCode();
        if (keyPad == KeyEvent.VK_ENTER){
      		// model.fireTableDataChanged(); 
     
                 
                // reloadData();
                // model.fireTableDataChanged();
                 
                 
                 
                 
   //   System.out.println("hi");
    //   model.setRowCount(0);
    jTextField1.setText("");
    jTextField1.requestFocus();
     txa.setText("");
         
      
        }
        else{
           //  logo2.setVisible(true);
        }
     }

   
    });  
        
        
 
 
    
}  
    
    
    
    
    
    
    
    
    
    
    
    private void searchOnTypeItemStateChanged(java.awt.event.ItemEvent evt) {                                              
    if (searchOnType.isSelected()) {
        jTextField1.getDocument().addDocumentListener(documentListener);
    } else {
        jTextField1.getDocument().addDocumentListener(null);
    }
}                                             

public void searchTableContents(String searchString) {
    DefaultTableModel currtableModel = (DefaultTableModel) table.getModel();
    //To empty the table before search
    currtableModel.setRowCount(0);
    //To search for contents from original table content
    for (Object rows : originalTableModel) {
        Vector rowVector = (Vector) rows;
        for (Object column : rowVector) {
            if (column.toString().contains(searchString)) {
                //content found so adding to table
                currtableModel.addRow(rowVector);
                break;
            }
        }

    }
}
public static void main(String[] args) {
         try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (UnsupportedLookAndFeelException ex) {
        }
        
        
        Viewall Frame = new Viewall();
    }
    
    
    
    
    
    
    
    
    private javax.swing.JPanel jPanel1,jpl;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTextField jTextField1;
private javax.swing.JButton searchButton;
private javax.swing.JCheckBox searchOnType;
private javax.swing.JTable table;
    
    
}
