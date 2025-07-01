/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbits_soft;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
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
import com.lowagie.text.pdf.PdfPageEventHelper;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
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
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static javax.swing.text.StyleConstants.FontFamily;



/**
 *
 * @author SJC-2017
 */
class Balance extends JFrame{
        static Point mouseDownScreenCoords;
        static Point mouseDownCompCoords;
        private TableRowSorter<TableModel> sorter;
        JTextField bank_bal,textbox;
JLabel welf,std,std1,std3,label1,label2,print_in,print,yeu,exit,tot_te,label;
JButton button;
JPanel panel;
static JTable table;
JComboBox cbe,cbe1,bnkcombo,bnkcombo2;
JFileChooser chooser;
String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost/paysheet";
String userName = "root";
String password = "";
//String[] columnNames = {"p_no", "amount", "mont", "year", "bank"};
JTextArea tarea,banks_tot,ins_tot;
static Vector<Vector<String>> data=new Vector<Vector<String>>();
DefaultTableModel model;
private static final String BASE_FONT = "Trebuchet MS";
    private static final String BASE_FONT_BOLDITALIC = "Trebuchet MS BI";
    private static final String BASE_FONT_BOLD = "Trebuchet MS B";
   double  totalsum = 0;
         double newValue3tot = 0; 
           double newValue3tot_ins = 0; 

    
  Balance(){  
      
      
       setLayout(null);
      
      
      try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }
  
      tarea = new JTextArea();
      tarea.setBounds(100,140,500,230);
     // add(tarea);
        
      
      std3 = new JLabel();
	std3.setBounds(200,5,160,20);
        std3.setForeground(Color.WHITE);
        java.awt.Font tr3 = new java.awt.Font("Ds-digital",java.awt.Font.ITALIC, 20) ;
        std3.setFont(tr3);
	add(std3);
        
        std = new JLabel();
	std.setBounds(150,5,160,20);
        std.setForeground(Color.WHITE);
        java.awt.Font tr = new java.awt.Font("Ds-digital",java.awt.Font.ITALIC, 20) ;
        std.setFont(tr);
	add(std);
        
        
        JLabel  stdi = new JLabel("ටඅඑඇඑඇඑඇඑ");
	stdi.setBounds(150,15,160,20);
        stdi.setForeground(Color.WHITE);
        java.awt.Font tri = new java.awt.Font("iskoolapota",java.awt.Font.PLAIN, 20) ;
        stdi.setFont(tri);
	//add(stdi);
        
        
        
        std1 = new JLabel();
	std1.setBounds(550,5,90,25);
        std1.setForeground(Color.WHITE);
        java.awt.Font tr1 = new java.awt.Font("Calibri",java.awt.Font.BOLD, 12) ;
        std1.setFont(tr1);
	add(std1);

                String dayNames[] = new DateFormatSymbols().getWeekdays();
		Calendar da2 = Calendar.getInstance();
		std1.setText(dayNames[da2.get(Calendar.DAY_OF_WEEK)]);
        

	Calendar cac = Calendar.getInstance();
     
        int day1 = cac.get(Calendar.DATE);
        int month1 = cac.get(Calendar.MONTH) + 1;
        int year1 = cac.get(Calendar.YEAR);
        std.setText(String.valueOf(year1)); 
        std3.setText(String.valueOf(month1+"."+day1)); 
        
        final DateFormat df = new SimpleDateFormat("hh:mm:ss");
        final DateFormat dfd1 = new SimpleDateFormat(" a");
        
	label1 = new JLabel();
        label1.setBounds(405,5,160,22);
        java.awt.Font f = new java.awt.Font("Ds-digital",java.awt.Font.ITALIC,22);
	label1.setFont(f);
        label1.setForeground(Color.WHITE);
	add(label1);
        
        label2 = new JLabel();
	label2.setBounds(670,5,60,10);
        label2.setForeground(Color.WHITE);
	add(label2);
           
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
      
      
 welf = new JLabel("Welfair Account");
welf.setBounds(350,560,200,20);
  welf.setForeground(Color.ORANGE);
add(welf);      
      

welf.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     welf.setText("<html><u>Welfair Account</u></html>");
     welf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    welf.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     welf.setText("Welfair Account");
     
    }
});      

      
      
bnkcombo = new JComboBox();
bnkcombo.setBounds(350,520,200,20);
add(bnkcombo); 

  try{
    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery("select name from ins_inst");
                                
               while(rs.next()){
        bnkcombo.addItem(rs.getString("name"));
        }
                
                }
                catch(Exception ew){
                System.out.println(ew);
                } 
      
  
         JLabel mon = new JLabel("Month");
         mon.setBounds(100,60,80,20); 
         mon.setForeground(Color.WHITE);
         add(mon);  
         
cbe = new JComboBox();
cbe.setBounds(180,60,80,20);
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
add(cbe);

         JLabel ye = new JLabel("Year");
         ye.setBounds(280,60,80,20); 
         ye.setForeground(Color.WHITE);
         add(ye);  
         
cbe1 = new JComboBox();
cbe1.setBounds(370,60,50,20);
cbe1.addItem("2024");
cbe1.addItem("2025");
cbe1.addItem("2026");
cbe1.addItem("2027");
cbe1.addItem("2028");
cbe1.addItem("2029");
add(cbe1);
  
bnkcombo2 = new JComboBox();
bnkcombo2.setBounds(50,520,200,20);
//bnkcombo2.addItemListener((ItemListener) this);
add(bnkcombo2); 

  try{
    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery("select b_id from banks");
                                
               while(rs.next()){
               bnkcombo2.addItem(rs.getString("b_id"));
        }
                }
                catch(Exception ew){
                System.out.println(ew);
                }   
  
 bank_bal = new JTextField();
 bank_bal.setBounds(360,460,200,20);
 bank_bal.setOpaque(false);                             //   
 bank_bal.setForeground(Color.RED);
 bank_bal.setCaretColor(Color.RED);
 add(bank_bal); 
  //this is the model which contain actual body of JTable

 Vector<String> headers=new Vector<String>();
   headers.add("Index");
   headers.add("Pay No.");
   headers.add("Name");
   headers.add("Account No.");
   headers.add("Amount");

 
 
 
 model = new DefaultTableModel(data, headers);
  
  table=new JTable(model);
  table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
  
  
  
  
  JScrollPane scroll = new JScrollPane(table);
  
  scroll.setHorizontalScrollBarPolicy(
    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
  scroll.setVerticalScrollBarPolicy(
    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
  header_size();
  
  table.getColumnModel().getColumn(0).setPreferredWidth(40);
table.getColumnModel().getColumn(1).setPreferredWidth(80);
table.getColumnModel().getColumn(2).setPreferredWidth(180);
table.getColumnModel().getColumn(3).setPreferredWidth(130);
table.getColumnModel().getColumn(4).setPreferredWidth(90);

  
  
 
 scroll.setBounds(50,100,530,350);
 add(scroll);
 
 

bnkcombo2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                Object item = event.getItem();
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    ///------------------------------------------------------------------------------
                    
                model.setRowCount(0);     
String str="SELECT p_no,nam,amount,ac_no,deduction,amou,total_pay FROM pay_details WHERE bank= '"+bnkcombo2.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"' AND mont = '"+cbe.getSelectedItem()+"'";

  Connection cn;
  ResultSet rs;
  Statement st;
  try {              //n("jdbc:mysql://localhost/paysheet", "root", "");
   cn=DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");

   st=cn.createStatement();
   rs=st.executeQuery(str);
   
   int r=1;
   
   while(rs.next())
   {//int in = 0;
       
        String de = rs.getString("deduction");
        String deam = rs.getString("amou");
        String det = rs.getString("amount");
//      int tde =  (Integer.parseInt(det)-(Integer.parseInt(de)+Integer.parseInt(deam)));
         
       
    Vector <String> d=new Vector<String>();
    
    d.add(String.valueOf(r)); 
    d.add(rs.getString("p_no"));
    d.add(rs.getString("nam"));
     d.add(rs.getString("ac_no"));
    d.add(rs.getString("total_pay"));
    d.add("\n\n\n\n\n\n\n");
  
    data.add(d);
r++;
   }
  } catch (SQLException em) {
   em.printStackTrace();

  }
  
  model.fireTableDataChanged();
  
                  ////----------------------------------------------------------------------------- 
                }
                if (event.getStateChange() == ItemEvent.DESELECTED) {
                    //tarea.setText(item.toString() + " deselected.");
                }
                
                
                
                Connection con = null;
        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
            try {
                Statement st = con.createStatement();
                BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
                //System.out.println("Enter table name:");
                //String table = bf.readLine();
                ResultSet res = st.executeQuery("SELECT COUNT(*) FROM pay_details WHERE bank= '"+bnkcombo2.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"' AND mont = '"+cbe.getSelectedItem()+"'");
                while (res.next()){
                    count = res.getInt(1);
                }
                //System.out.println("Number of row:"+count);
                tot_te.setText("Total Teachers "+count);
            }
            catch (SQLException s){
                System.out.println("SQL statement is not executed!");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            }

            
        ////  total teachers  ---------------------------    
            
           
 
            
            
            
            
            
            
            
            
            
        // -----------------------------------------------    
            
            

 
});
        
 print = new JLabel("Print");
          print.setBounds(270,520,80,20);
          print.setForeground(Color.WHITE);
          add(print);
          
          
          print.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     print.setText("<html><u>Print</u></html>");
     print.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    print.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     print.setText("Print");
     
    }
});      
        
 
     print.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
      //  System.out.println(bnkcombo.getSelectedItem());
         String idt = String.valueOf(bnkcombo2.getSelectedItem());
       String bnk_name = null;
try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement st = con.createStatement();
             ResultSet rs=st.executeQuery("select b_name from banks where b_id = '"+(idt)+"'");
          
                 while(rs.next()){
                 bnk_name = rs.getString("b_name");
            
           //      System.out.println(bnk_name);
                 
                 
                  rs.close();
                 st.close();
                con.close();  
              }
                }
                catch(Exception ew){
                System.out.println(ew);
                }   
       

//-------------------------------------------------------
 Double newValue = null;
        try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement stt = cont.createStatement();
             ResultSet rst=stt.executeQuery("select sum(total_pay) from pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"' AND bank = '"+bnkcombo2.getSelectedItem()+"'");
          
             while(rst.next()){
                 String sum = rst.getString(1);                 
                 
                // System.out.println(sum);
                     
                   String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
                   newValue = Double.parseDouble(sValue);  
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
                ResultSet query_set = stmt.executeQuery("SELECT p_no,nam,ac_no,total_pay FROM pay_details WHERE bank ="+idt+" AND mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
                /* Step-2: Initialize PDF documents - logical objects */
                Document my_pdf_report = new Document();
               // PdfWriter.getInstance(my_pdf_report, new FileOutputStream("pdf_report_from_sql_using_java.pdf"));
                
                PdfWriter writer =PdfWriter.getInstance(my_pdf_report, new FileOutputStream(cbe1.getSelectedItem()+"-"+cbe.getSelectedItem()+"-"+bnk_name+".pdf"));
                int u =1;
                my_pdf_report.open();            
                //we have four columns in our table
                float[] columnWidths = {1, 2, 10, 7, 5};

                PdfPTable my_report_table = new PdfPTable(columnWidths);
                
                my_report_table.setWidthPercentage(100);
                
                      
     Font ffont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);
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
Font f1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
//f1.setColor(BaseColor.BLUE);
Font f2 = FontFactory.getFont("MSung-Light",
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


        Paragraph paragraph1 = new Paragraph("                                                                                                                    Principal,");
        my_pdf_report.add(paragraph1);
        Paragraph paragraph2 = new Paragraph("                                                                                                                    St.Joseph's College,");
        my_pdf_report.add(paragraph2);
        Paragraph paragraph3 = new Paragraph("                                                                                                                    Anuradhapura,");
        my_pdf_report.add(paragraph3);
        Paragraph da = new Paragraph("                                                                                                                    "+std3.getText()+"."+std.getText());
        my_pdf_report.add(da);
        Paragraph paragraph4 = new Paragraph("The Manager,");
        my_pdf_report.add(paragraph4);
        Paragraph paragraph5 = new Paragraph(bnk_name+",");
        my_pdf_report.add(paragraph5);
        Paragraph paragraph6 = new Paragraph("Dear Sir,");
        my_pdf_report.add(paragraph6);
        
        
        String sch_d1 =("_________________________________________________________________________________________________________");
     cb.setFontAndSize(bf, 10);
    cb.setTextMatrix(36, 587);
    cb.showText(sch_d1);
        
        
           String sch_d10 =("Pay No.                          Name                                                        Account No.                                               Amount");
     cb.setFontAndSize(bf, 10);
    cb.setTextMatrix(60, 575);
    cb.showText(sch_d10);
     
     Chunk underline = new Chunk("Salaries for the Month of - "+cbe.getSelectedItem()+" "+cbe1.getSelectedItem()+"");
      underline.setUnderline(0.1f, -2f); 
      // my_pdf_report.add(underline);
       
       Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 14);
       // Font font = new Font(FontFamily.HELVETICA, 12, Font.BOLD);
        Paragraph para = new Paragraph(underline);
        para.setLeading(0, 1);
        PdfPTable table2 = new PdfPTable(1);
        table2.setWidthPercentage(50);
       

        PdfPCell cell1 = new PdfPCell();
         cell1.setBorder(Rectangle.NO_BORDER);
        cell1.setMinimumHeight(20);
        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell1.addElement(para);
        table2.addCell(cell1);
        my_pdf_report.add(table2);
        
       
         my_pdf_report.add(new Phrase("\n")); 
       Paragraph cn = new Paragraph("Cheque No : .................................. of Rs.......................................... is sent here with to be credited following account/s.");
        my_pdf_report.add(cn);
       
          my_pdf_report.add(new Phrase("\n")); 
          
             
     String scn =("Pay No.                      Name                              Account No.                             Amount");
     cb.setFontAndSize(bf, 12);
     cb.setTextMatrix(160, 740);
     //cb.showText(scn);
                //create a cell object
                PdfPCell table_cell;
              
                while (query_set.next()) {  
                    
                           // String id = query_set.getString(u);
                                table_cell=new PdfPCell(new Phrase(u));
                                my_report_table.addCell(table_cell);
                      
                                String dept_id = query_set.getString("p_no");
                                table_cell=new PdfPCell(new Phrase(dept_id));
                                my_report_table.addCell(table_cell);
                                String dept_name=query_set.getString("nam");
                                table_cell=new PdfPCell(new Phrase(dept_name));
                                my_report_table.addCell(table_cell);
                                String manager_id=query_set.getString("ac_no");
                                table_cell=new PdfPCell(new Phrase(manager_id));
                                my_report_table.addCell(table_cell);
                                String location_id=query_set.getString("total_pay");
                                table_cell=new PdfPCell(new Phrase(location_id));
                                table_cell.setHorizontalAlignment(Element.ALIGN_RIGHT);


                                my_report_table.addCell(table_cell);
                                
                              
                                }
                u++;
                
                
                /* Attach report table to PDF */
                my_pdf_report.add(my_report_table); 
                
                
                
                Paragraph tota = new Paragraph("                                                                                                    Total amount    Rs." +newValue);
        my_pdf_report.add(tota);
                
                Paragraph total = new Paragraph("Please acknowledge the receipt.");
        my_pdf_report.add(total);

           Paragraph pr = new Paragraph("Thank you.");
        my_pdf_report.add(pr);
        Paragraph pr1 = new Paragraph("Yours faithfully,");
        my_pdf_report.add(pr1); 
        
        my_pdf_report.add(new Phrase("\n")); 
        
         Paragraph prc = new Paragraph(".....................................");
        my_pdf_report.add(prc);
        Paragraph pr1c = new Paragraph("M.W.A. Amarajeewa");
        my_pdf_report.add(pr1c);   
        Paragraph ps = new Paragraph("Principal");
        my_pdf_report.add(ps);
        
                my_pdf_report.close();
                
                try {
 
		File pdfFile = new File(cbe1.getSelectedItem()+"-"+cbe.getSelectedItem()+"-"+bnk_name+".pdf");
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
     
  print_in = new JLabel("Print");
          print_in.setBounds(600,520,80,20);
          print_in.setForeground(Color.WHITE);
          add(print_in);   
     
    print_in.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     print_in.setText("<html><u>Print</u></html>");
     print_in.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
    print_in.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseExited(MouseEvent e) {
   
     print_in.setText("Print");
     
    }
});      
        
    print_in.addMouseListener(new MouseAdapter() {                    //DAMOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
   @Override
    public void mouseClicked(MouseEvent e) {
   
  
         //  System.out.println(bnkcombo.getSelectedItem());
         String idt = String.valueOf(bnkcombo.getSelectedItem());
       String bnk_name = String.valueOf(bnkcombo.getSelectedItem());
/*try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement st = con.createStatement();
             ResultSet rs=st.executeQuery("select isnt from banks where isnt = '"+(idt)+"'");
          
                 while(rs.next()){
            //     bnk_name = rs.getString("b_name");
           // System.out.println(bnk_name);
           //      System.out.println(bnk_name);
                 
                 
                  rs.close();
                 st.close();
                con.close();  //DAMOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
              }
                }
                catch(Exception ew){
                System.out.println(ew);
                }   
       */

//-------------------------------------------------------
 Double newValue = null;
        try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement stt = cont.createStatement();
             ResultSet rst=stt.executeQuery("select sum(amou) from pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"' AND isnt = '"+bnkcombo.getSelectedItem()+"'");
          
             while(rst.next()){
                 String sum = rst.getString(1);                 //DAMOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
                 
                // System.out.println(sum);
                     
                   String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
                   newValue = Double.parseDouble(sValue);  
               //  page_tot.setText("Rs. "+String.valueOf(newValue));
                   
                  rst.close();
                 stt.close();
                cont.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
        
///-----------------------------------------------------//DAMOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
try{    
           
    
      /* Create Connection objects */
                Class.forName ("com.mysql.jdbc.Driver"); 
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
                Statement stmt = conn.createStatement();                                                              //WHERE bank ="+idt+" AND mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
                /* Define the SQL query */
                ResultSet query_set = stmt.executeQuery("SELECT p_no,nam,ac_no,amou,lo_ac FROM pay_details WHERE isnt ="+"'"+idt+"'"+" AND mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
                /* Step-2: Initialize PDF documents - logical objects */
                Document my_pdf_report = new Document();
               // PdfWriter.getInstance(my_pdf_report, new FileOutputStream("pdf_report_from_sql_using_java.pdf"));
                
                PdfWriter writer =PdfWriter.getInstance(my_pdf_report, new FileOutputStream(cbe1.getSelectedItem()+"-"+cbe.getSelectedItem()+"-"+bnk_name+".pdf"));
      //document.open();
                
                //DAMOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
                
                my_pdf_report.open();            
                //we have four columns in our table
                float[] columnWidths = {1, 2, 10, 7, 5};

                PdfPTable my_report_table = new PdfPTable(columnWidths);
                
                my_report_table.setWidthPercentage(100);
                
                
     Font ffont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);
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

             //   cb.setFontAndSize(bf, 12);
    // cb.setTextMatrix(160, 670);
    //cb.showText(sch_d10);
                
                //DAMOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
                
                
        FontSelector selector = new FontSelector();
Font f1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
//f1.setColor(BaseColor.BLUE);
Font f2 = FontFactory.getFont("MSung-Light",
        "UniCNS-UCS2-H", BaseFont.NOT_EMBEDDED);//DAMOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
//f2.setColor(BaseColor.RED);
selector.addFont(f1);
selector.addFont(f2);
//Phrase ph = selector.process(TEXT);
//PdfWriter writer =PdfWriter.getInstance(document, new FileOutputStream("Teachers Details/"+ip2td.getText()+".pdf"));
     // document.open();


//PdfContentByte cb = writer.getDirectContent();
    String text = "prasanna";
    //Font ms2 = new Font("Calibri",Font.BOLD,28);
    //Font bf = Font.createFont(BaseFont.TIMES_BOLD,BaseFont.COURIER_BOLDOBLIQUE, BaseFont.NOT_EMBEDDED);
    BaseFont bf = BaseFont.createFont(BaseFont.TIMES_BOLD,BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
    cb.setFontAndSize(bf, 12);
    cb.beginText();
    
        PdfPCell cell = new PdfPCell(new Phrase("This is a header", f1));
        cell.setBackgroundColor(GrayColor.GRAYBLACK);


        Paragraph paragraph1 = new Paragraph("                                                                                                                    Principal,");
        my_pdf_report.add(paragraph1);
        Paragraph paragraph2 = new Paragraph("                                                                                                                    St.Joseph's College,");
        my_pdf_report.add(paragraph2);
        Paragraph paragraph3 = new Paragraph("                                                                                                                    Anuradhapura,");
        my_pdf_report.add(paragraph3);
        Paragraph da = new Paragraph("                                                                                                                    "+std3.getText()+"."+std.getText());
        my_pdf_report.add(da);
        Paragraph paragraph4 = new Paragraph("The Manager,");
        my_pdf_report.add(paragraph4);
        Paragraph paragraph5 = new Paragraph(bnk_name+",");
        my_pdf_report.add(paragraph5);
        Paragraph paragraph6 = new Paragraph("Dear Sir,");
        my_pdf_report.add(paragraph6);
        
     
        
         String sch_ =("_________________________________________________________________________________________________________");
     cb.setFontAndSize(bf, 10);
    cb.setTextMatrix(36, 587);
    cb.showText(sch_);
        
        
           String sch_d1 =("Pay No.                          Name                                                        Loan No.                                               Amount");
     cb.setFontAndSize(bf, 10);
    cb.setTextMatrix(60, 575);
    cb.showText(sch_d1);

        
        
        
        
        
     
     Chunk underline = new Chunk("Recoveries for the Month of - "+cbe.getSelectedItem()+" "+cbe1.getSelectedItem()+"");
      underline.setUnderline(0.1f, -2f); 
      // my_pdf_report.add(underline);
       
       Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 14);
       // Font font = new Font(FontFamily.HELVETICA, 12, Font.BOLD);
        Paragraph para = new Paragraph(underline);
        para.setLeading(0, 1);
        PdfPTable table2 = new PdfPTable(1);
        table2.setWidthPercentage(50);
       

        PdfPCell cell1 = new PdfPCell();
         cell1.setBorder(Rectangle.NO_BORDER);
        cell1.setMinimumHeight(20);
        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell1.addElement(para);
        table2.addCell(cell1);
        my_pdf_report.add(table2);

       
       
       
       
       
       
         my_pdf_report.add(new Phrase("\n")); 
       Paragraph cn = new Paragraph("Cheque No : .................................. of Rs.......................................... is sent here with to be credited following account/s.");
        my_pdf_report.add(cn);
       
          my_pdf_report.add(new Phrase("\n")); 
   
        
    
             
                 int u =1;
                //create a cell object
                PdfPCell table_cell;
              
                while (query_set.next()) {  
                    
                           // String id = query_set.getString(u);
                                table_cell=new PdfPCell(new Phrase(u));
                                my_report_table.addCell(table_cell);
                      u++;
                                String dept_id = query_set.getString("p_no");
                                table_cell=new PdfPCell(new Phrase(dept_id));
                                my_report_table.addCell(table_cell);
                                String dept_name=query_set.getString("nam");
                                table_cell=new PdfPCell(new Phrase(dept_name));
                                my_report_table.addCell(table_cell);
                                String manager_id=query_set.getString("lo_ac");
                                table_cell=new PdfPCell(new Phrase(manager_id));
                                my_report_table.addCell(table_cell);
                                String location_id=query_set.getString("amou");
                                table_cell=new PdfPCell(new Phrase(location_id));
                                table_cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                                my_report_table.addCell(table_cell);
                                
                              
                                }
                /* Attach report table to PDF */
                my_pdf_report.add(my_report_table); 
                
                
                
                Paragraph tota = new Paragraph("                                                                                                    Total amount    Rs." +newValue);
        my_pdf_report.add(tota);
                
                Paragraph total = new Paragraph("Please acknowledge the receipt.");
        my_pdf_report.add(total);

           Paragraph pr = new Paragraph("Thank you.");
        my_pdf_report.add(pr);
        Paragraph pr1 = new Paragraph("Yours faithfully,");
        my_pdf_report.add(pr1); 
        
        my_pdf_report.add(new Phrase("\n")); 
        
         Paragraph prc = new Paragraph(".....................................");
        my_pdf_report.add(prc);
        Paragraph pr1c = new Paragraph("M.W.A. Amarajeewa");
        my_pdf_report.add(pr1c);   
        Paragraph ps = new Paragraph("Principal");
        my_pdf_report.add(ps);
                
                
                
                
                my_pdf_report.close();
                
                
                try {
 
		File pdfFile = new File(cbe1.getSelectedItem()+"-"+cbe.getSelectedItem()+"-"+bnk_name+".pdf");
		if (pdfFile.exists()) {
 
			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				System.out.println("Awt Desktop is not supported!");
			}
 
		} else {
                    
			JOptionPane.showMessageDialog(null,"No file found ","No files",javax.swing.JOptionPane.WARNING_MESSAGE);
		}
 
		//System.out.println("Done");
 
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
    
    
     
    // welfair account   ---------------             wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
    
    welf.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
      //  System.out.println(bnkcombo.getSelectedItem());
        // String idt = String.valueOf(bnkcombo2.getSelectedItem());
         String bnk_name = null;
try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement st = con.createStatement();
             ResultSet rs=st.executeQuery("select b_name from banks where b_id = '"+3+"'");
          
                 while(rs.next()){
                 bnk_name = rs.getString("b_name");
            
           //      System.out.println(bnk_name);
                 
                 
                  rs.close();
                 st.close();
                con.close();  
              }
                }
                catch(Exception ew){
                System.out.println(ew);
                }   
       

//-------------------------------------------------------
 Double newValue = null;
        try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement stt = cont.createStatement();
             ResultSet rst=stt.executeQuery("select sum(deduction) from pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
          
             while(rst.next()){
                 String sum = rst.getString(1);                 
                 
                // System.out.println(sum);
                     
                   String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
                   newValue = Double.parseDouble(sValue);  
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
                ResultSet query_set = stmt.executeQuery("SELECT id,name,ac_no,amount FROM welfair WHERE month = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
                /* Step-2: Initialize PDF documents - logical objects */
                Document my_pdf_report = new Document();
               // PdfWriter.getInstance(my_pdf_report, new FileOutputStream("pdf_report_from_sql_using_java.pdf"));
                
                PdfWriter writer =PdfWriter.getInstance(my_pdf_report, new FileOutputStream(cbe1.getSelectedItem()+"-"+cbe.getSelectedItem()+"-"+bnk_name+".pdf"));
      //document.open();
              
                
                
                
                
                
                my_pdf_report.open();            
                //we have four columns in our table
                float[] columnWidths = {1, 2, 10, 7, 5};

                PdfPTable my_report_table = new PdfPTable(columnWidths);
                
                my_report_table.setWidthPercentage(100);
                
                
                
                
                
                
                
     Font ffont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);
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

             //   cb.setFontAndSize(bf, 12);
    // cb.setTextMatrix(160, 670);
    //cb.showText(sch_d10);
                
                
                
                
                
                
                
                
                
                
                
      //  my_report_table.getDefaultCell().setUseAscender(true);
     //   my_report_table.getDefaultCell().setUseDescender(true);
       // Font f;
  //  f = new Font(FontFamily.HELVETICA, 13, Font.NORMAL, GrayColor.GRAYWHITE);
        
        FontSelector selector = new FontSelector();
Font f1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
//f1.setColor(BaseColor.BLUE);
Font f2 = FontFactory.getFont("MSung-Light",
        "UniCNS-UCS2-H", BaseFont.NOT_EMBEDDED);
//f2.setColor(BaseColor.RED);
selector.addFont(f1);
selector.addFont(f2);
//Phrase ph = selector.process(TEXT);
//PdfWriter writer =PdfWriter.getInstance(document, new FileOutputStream("Teachers Details/"+ip2td.getText()+".pdf"));
     // document.open();


//PdfContentByte cb = writer.getDirectContent();
    String text = "prasanna";
    //Font ms2 = new Font("Calibri",Font.BOLD,28);
    //Font bf = Font.createFont(BaseFont.TIMES_BOLD,BaseFont.COURIER_BOLDOBLIQUE, BaseFont.NOT_EMBEDDED);
    BaseFont bf = BaseFont.createFont(BaseFont.TIMES_BOLD,BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
    cb.setFontAndSize(bf, 14);
    cb.beginText();
    
        PdfPCell cell = new PdfPCell(new Phrase("This is a header", f1));
        cell.setBackgroundColor(GrayColor.GRAYBLACK);


        Paragraph paragraph1 = new Paragraph("                                                                                                                    Principal,");
        my_pdf_report.add(paragraph1);
        Paragraph paragraph2 = new Paragraph("                                                                                                                    St.Joseph's College,");
        my_pdf_report.add(paragraph2);
        Paragraph paragraph3 = new Paragraph("                                                                                                                    Anuradhapura,");
        my_pdf_report.add(paragraph3);
        Paragraph da = new Paragraph("                                                                                                                    "+std3.getText()+"."+std.getText());
        my_pdf_report.add(da);
        Paragraph paragraph4 = new Paragraph("The Manager,");
        my_pdf_report.add(paragraph4);
        Paragraph paragraph5 = new Paragraph(bnk_name+",");
        my_pdf_report.add(paragraph5);
        Paragraph paragraph6 = new Paragraph("Dear Sir,");
        my_pdf_report.add(paragraph6);
        
    String sch_ =("_________________________________________________________________________________________________________");
     cb.setFontAndSize(bf, 10);
    cb.setTextMatrix(36, 587);
    cb.showText(sch_);
        
        
    String sch_d1 =("Pay No.                          Name                                                        Account No.                                               Amount");
     cb.setFontAndSize(bf, 10);
    cb.setTextMatrix(60, 575);
    cb.showText(sch_d1);
        
    String sch_d10 =("Salaries for the Month of - "+cbe.getSelectedItem()+" "+cbe1.getSelectedItem());
     //cb.setFontAndSize(bf, 12);
    // cb.setTextMatrix(160, 670);
    //cb.showText(sch_d10);
     
     Chunk underline = new Chunk("Salaries for the Month of - "+cbe.getSelectedItem()+" "+cbe1.getSelectedItem()+"");
      underline.setUnderline(0.1f, -2f); 
      // my_pdf_report.add(underline);
       
       Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 14);
       // Font font = new Font(FontFamily.HELVETICA, 12, Font.BOLD);
        Paragraph para = new Paragraph(underline);
        para.setLeading(0, 1);
        PdfPTable table2 = new PdfPTable(1);
        table2.setWidthPercentage(50);
       

        PdfPCell cell1 = new PdfPCell();
         cell1.setBorder(Rectangle.NO_BORDER);
        cell1.setMinimumHeight(20);
        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell1.addElement(para);
        table2.addCell(cell1);
        my_pdf_report.add(table2);

       
       
       
       
       
       
         my_pdf_report.add(new Phrase("\n")); 
       Paragraph cn = new Paragraph("Cheque No : .................................. of Rs.......................................... is sent here with to be credited following account/s.");
        my_pdf_report.add(cn);
       
          my_pdf_report.add(new Phrase("\n")); 
     
    // String sch_d11 =("09 .  Tel Number : - "+print.getText());
    // cb.setFontAndSize(bf, 9);
   //  cb.setTextMatrix(110, 425);
    // cb.showText(sch_d11);
        
        

             
                 int u =1;
                //create a cell object
                PdfPCell table_cell;
              
                while (query_set.next()) {  
                    
                           // String id = query_set.getString(u);
                                table_cell=new PdfPCell(new Phrase(u));
                                my_report_table.addCell(table_cell);
                      u++;
                                String dept_id = query_set.getString("id");
                                table_cell=new PdfPCell(new Phrase(dept_id));
                                my_report_table.addCell(table_cell);
                                String dept_name=query_set.getString("name");
                                table_cell=new PdfPCell(new Phrase(dept_name));
                                my_report_table.addCell(table_cell);
                                String manager_id=query_set.getString("ac_no");
                                table_cell=new PdfPCell(new Phrase(manager_id));
                                my_report_table.addCell(table_cell);
                                String location_id=query_set.getString("amount");
                                table_cell=new PdfPCell(new Phrase(location_id));
                                table_cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                                my_report_table.addCell(table_cell);
                                
                              
                                }
                /* Attach report table to PDF */
                my_pdf_report.add(my_report_table); 
                
                
                
                Paragraph tota = new Paragraph("                                                                                                       Total amount    Rs." +newValue);
        my_pdf_report.add(tota);
                
                Paragraph total = new Paragraph("Please acknowledge the receipt.");
        my_pdf_report.add(total);

           Paragraph pr = new Paragraph("Thank you.");
        my_pdf_report.add(pr);
        Paragraph pr1 = new Paragraph("Yours faithfully,");
        my_pdf_report.add(pr1); 
        
        my_pdf_report.add(new Phrase("\n")); 
        
         Paragraph prc = new Paragraph(".....................................");
        my_pdf_report.add(prc);
        Paragraph pr1c = new Paragraph("M.W.A. Amarajeewa");
        my_pdf_report.add(pr1c);   
        Paragraph ps = new Paragraph("Principal");
        my_pdf_report.add(ps);
                
                
                
                
                my_pdf_report.close();
                
                
                try {
 
		File pdfFile = new File(cbe1.getSelectedItem()+"-"+cbe.getSelectedItem()+"-"+bnk_name+".pdf");
		if (pdfFile.exists()) {
 
			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				System.out.println("Awt Desktop is not supported!");
			}
 
		} else {
                    
			JOptionPane.showMessageDialog(null,"No file found ","No files",javax.swing.JOptionPane.WARNING_MESSAGE);
		}
 
		//System.out.println("Done");
 
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

    
    
    

      
textbox = new JTextField();
textbox.setBounds(120,30,150,20); 
//label = new JLabel("Enter your roll no");
//label.setBounds(10, 30, 100, 20);

tot_te = new JLabel("Total teachers");
tot_te.setBounds(60, 460, 160, 20);
tot_te.setForeground(Color.WHITE);

//button = new JButton("search");
//button.setBounds(120,20,150,20);
//button.addActionListener(this);

/*
exit = new JLabel("Exit");
exit.setBounds(650, 30, 70, 20);
exit.setForeground(Color.WHITE);

   exit.addMouseListener(new MouseAdapter() {
   @Override
    public void mouseEntered(MouseEvent e) {
   
     exit.setText("<html><u>Exit</u></html>");
     exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
  }
}); 
   
   exit.addMouseListener(new MouseAdapter() {
   @Override
       public void mouseExited(MouseEvent e) {  
   exit.setText("Exit");
   }
});      
        
  exit.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
       dispose();
        
  }
}); */

JLabel   exi = new JLabel();
        exi.setIcon(new ImageIcon(getClass().getResource("images/ex.png")));
        exi.setBounds(1075,10,17,17);        
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
     


//add(textbox);
//add(label);
//add(button);
add(tot_te);
//add(exit);




         yeu = new JLabel("update");
         yeu.setBounds(730,280,100,20); 
         yeu.setForeground(Color.WHITE);
        // add(yeu);  


         yeu.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
    
       
      try
    {
      // create a java mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/paysheet";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
    
      // create the java mysql update preparedstatement
      String query = "update pays set bank = ? where bank = 'People'"+"'"+"'s Bank - Anuradhapura'";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
     // preparedStmt.setInt   (1, 6000);
      preparedStmt.setString(1, "2");

      // execute the java preparedstatement
      preparedStmt.executeUpdate();
      
      conn.close();
    }
    catch (Exception ei)
    {
      System.err.println("Got an exception! ");
      System.err.println(ei.getMessage());
    }
 ////////////////////////
      
      
      
       
        
  }
}); 
         
         
         banks_tot = new JTextArea();
         banks_tot.setBounds(700,100,350,250);
         banks_tot.setForeground(Color.WHITE);
         banks_tot.setOpaque(false);
         add(banks_tot);
         
          ins_tot = new JTextArea();
         ins_tot.setBounds(700,360,350,150);
         ins_tot.setForeground(Color.WHITE);
         ins_tot.setOpaque(false);
         add(ins_tot);
         
         
    
       
       ///// 
        
      
        //////////////////// 
      
        cbe.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {       
      double newValues = 0;
          banks_tot.setText("");
         
        try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement stt = cont.createStatement();
             
              int dx; 
             for( dx=1; dx<11; dx=dx+1){                                                              
                 try (ResultSet rst = stt.executeQuery("select bank ,sum(total_pay) as tot_tot from pay_details WHERE mont='"+cbe.getSelectedItem()+"' AND year='"+cbe1.getSelectedItem()+"' GROUP BY bank ")) {
                     while(rst.next()){
                   String sum1;        
                         String sum = rst.getString("bank");
                         
                         sum1 = rst.getString("tot_tot");
                         String sValue = (String) String.format("%.2f", Double.parseDouble(sum1));
                         newValue3tot = Double.parseDouble(sValue);
                         
                         
                         banks_tot.append(sum+" : "+String.valueOf(newValue3tot)+"\n");
                         // System.out.println(sum1+" : "+sum1+"\n");
                         
                         
                         totalsum =newValue3tot + totalsum;
                         
                     }
                     
                     
                     String sValue = (String) String.format("%.2f", (totalsum));
                      newValues = Double.parseDouble(sValue);
                     
                     // System.out.println(newValues);
                     
                     banks_tot.setText( banks_tot.getText()+"Total is "+newValues);
                     
                     //  page_tot.setText("Rs. "+String.valueOf(newValue));
                 }
                 stt.close();
                cont.close();  
                 
                 } 
             dx=dx+1;
            
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
        
        double newValuesi = 0;
         ////------------------------------------------------------------------------
        
        double  totalsumin = 0;
         double newValue3in = 0;
         int dxi;
        try{    
             Class.forName("com.mysql.jdbc.Driver");
                 try (Connection contt = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","")) {           // //    WHERE mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
                     //   for( dxi=1; dxi<11; dxi=dxi+1){
                     try (Statement sttt = contt.createStatement();ResultSet rstt = sttt.executeQuery("select isnt ,sum(amou) as tot_ins from pay_details WHERE mont='"+cbe.getSelectedItem()+"' AND year='"+cbe1.getSelectedItem()+"' GROUP BY isnt ")) {
                         while(rstt.next()){
                             
                             String sumi = rstt.getString("isnt");
                             
                             String sum12 = rstt.getString("tot_ins");
                             String sValuet = (String) String.format("%.2f", Double.parseDouble(sum12));
                             newValue3tot_ins = Double.parseDouble(sValuet);
                             
                             ins_tot.append(sumi+" : "+String.valueOf(newValue3tot_ins)+"\n");
                             // System.out.println(sum1+" : "+sum1+"\n");
                             
                             totalsumin =newValue3tot_ins + totalsumin;
                             
                         }
                         
                         String sValuei = (String) String.format("%.2f", (totalsumin));
                          newValuesi = Double.parseDouble(sValuei);
                         
                         // System.out.println(newValues);
                         
                         ins_tot.setText( ins_tot.getText()+"Total is "+String.valueOf(newValuesi));
                         
                         //  page_tot.setText("Rs. "+String.valueOf(newValue));
                     }
                     contt.close();
                     
                     // } 
            // dxi=dxi+1;
                 }
            
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
        
       
        ////------------------------------------------------------------------------- 
        
        //-------------------------------------------------------
 Double newValuev = null;
        try{    
             Class.forName("com.mysql.jdbc.Driver");
             Connection cont = DriverManager.getConnection("jdbc:mysql://localhost/paysheet","root","");
             Statement stt = cont.createStatement();
             ResultSet rst=stt.executeQuery("select sum(deduction) from pay_details where mont = '"+cbe.getSelectedItem()+"' AND year = '"+cbe1.getSelectedItem()+"'");
          
             while(rst.next()){
                 String sum = rst.getString(1);                 
                 
                // System.out.println(sum);
                     
                   String sValuev = (String) String.format("%.2f", Double.parseDouble(sum));
                   newValuev = Double.parseDouble(sValuev);  
               //  page_tot.setText("Rs. "+String.valueOf(newValue));
                    ins_tot.setText( ins_tot.getText()+"\n\nWelfair Total is "+String.valueOf(newValuev));
                   
                   
                    double total_grand = newValuev+newValuesi+newValues;
                    
                    
                    ins_tot.setText( ins_tot.getText()+"\n\nGrand Total is "+String.valueOf(total_grand));
                    
                   
                   
                  rst.close();
                 stt.close();
                cont.close();  
                 
                 }
               }
                catch(Exception ew){
                System.out.println(ew);
        } 
       
///-----------------------------------------------------
        
        
       
        
        
        
        
    }
});
        
        
        
        
        
       
    
       
       
        setUndecorated(true);
        setSize(1100,600);
        setBackground(new Color(10, 30, 40, 240));
        setLocationRelativeTo(null);  
        setVisible(true);
        
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

    private void header_size() {
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(100);
        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth(350);
    
    
    }
}

