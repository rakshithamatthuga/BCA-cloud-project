
import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bala J
 */
public class Main extends javax.swing.JFrame {

    
    NetworkListener nwlisten;
    
    static Main instance;
    
    S3Interfacer s3interface;
    
    Vector<String> keytouser = new Vector<String>();
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        instance = this;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        connectionManager1 = new ConnectionManager();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        startUser = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        listenport = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        keyfile = new javax.swing.JTextField();
        browse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        filename = new javax.swing.JTextField();
        requestFile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logtext = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Portal");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        startUser.setText("START");
        startUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startUserActionPerformed(evt);
            }
        });
        jPanel2.add(startUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 123, 36));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Offline Key File");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 169, 120, 32));
        jPanel2.add(listenport, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 27, 170, 35));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Listen Port");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 28, 120, 32));
        jPanel2.add(keyfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 168, 170, 35));

        browse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        browse.setText("BROWSE");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        jPanel2.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 221, 123, 36));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\network-3396348_960_720.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-132, -84, 820, 580));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Configuration", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("File Name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, 120, 32));
        jPanel3.add(filename, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 28, 170, 35));

        requestFile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        requestFile.setText("REQUEST");
        requestFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestFileActionPerformed(evt);
            }
        });
        jPanel3.add(requestFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, 123, 36));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\network-3396348_960_720.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-42, -94, 1130, 700));

        jTabbedPane1.addTab("File Request", jPanel3);

        jScrollPane1.setViewportView(logtext);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(558, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Log", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startUserActionPerformed
        // TODO add your handling code here:
        if(listenport.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Listen port cannot be blankn");
        }else{
        
        s3interface = new S3Interfacer();
        
        int lp = Integer.parseInt(listenport.getText());
        
        nwlisten = new NetworkListener(lp,this);
        
        nwlisten.start();
        }
        
        
    }//GEN-LAST:event_startUserActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
        
        
       JFileChooser jc = new JFileChooser(".");


        int ret = jc.showOpenDialog(this);

        if(ret == JFileChooser.APPROVE_OPTION)
        {
            File f  = jc.getSelectedFile();

            String fname = f.getAbsolutePath();

            keyfile.setText(fname);
            





        }
        
        
        try
         {
               FileInputStream fstream = new FileInputStream(keyfile.getText());

               DataInputStream in = new DataInputStream(fstream);

               BufferedReader br = new BufferedReader(new InputStreamReader(in));

               String strLine;

               String filcontents = "";
               int count=0;
               //Read File Line By Line
               while ((strLine = br.readLine()) != null) {
                   
                   if (strLine.length()<2)
                   {
                       continue;
                   }
                   
                   keytouser.add(strLine);
                   
                   writetolog("Keys :" + strLine);
                   
               }
               
               br.close();
               in.close();
               fstream.close();
               
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        
        
        
    }//GEN-LAST:event_browseActionPerformed

    public static String readFileAsString(String filePath) {

        try {
            StringBuffer fileData = new StringBuffer(1000);
            BufferedReader reader = new BufferedReader(
                    new FileReader(filePath));
            char[] buf = new char[1024];
            int numRead = 0;
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
                buf = new char[1024];
            }
            reader.close();
            return fileData.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    
    private void requestFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestFileActionPerformed
        // TODO add your handling code here:
        
        String f = filename.getText();
        if(filename.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Filename cannot be empty");
        }else{
        
        try
        {
            
            Connection con=null;
            Statement stmt=null;
            ResultSet rst=null;
            session s =new session();
            String sql="select * from downloadlogs where filename='"+f+"' and user='"+s.getusername()+"'";
            con=ConnectionManager.getConnection();
            stmt=con.createStatement();
            rst=stmt.executeQuery(sql);
            if(rst.next()){
                JOptionPane.showMessageDialog(this,"you have already downloaded a file");
            }else{
            for (int i=0;i<5;i++)
            {
                String exremove = f.split("\\.")[0];
                String cfile = exremove + "-" + i + ".txt";

                writetolog("Downloading file " + cfile + " from cloud"); 

                s3interface.downloadFileFromCloud(cfile, cfile);

                AESUtil.keyValue = keytouser.get(i).getBytes();
                //keyvalue is secret key and keytouser is key that has been given or generated
                
                writetolog("Decrypting with key "  + keytouser.get(i));

               
                String cont=readFileAsString(cfile);
                
                writetolog("encrypted content:" + cont);

               
                
                String dcont = AESUtil.decrypt(cont);
                
                writetolog("decrypted content:" + dcont);
                
                FileAppender.AppendtoFile(f, dcont);
                 //JOptionPane.showMessageDialog(this, "File downloaded and saved in current folder");

            }
             Downloadlog(filename.getText());
            }
            
       
           // JOptionPane.showMessageDialog(this, "File downloaded and saved in current folder");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
        
         
        
    }//GEN-LAST:event_requestFileActionPerformed

    void Downloadlog(String filename){
        
         Connection con=null;
     ResultSet rst=null;
     Statement stmt=null;
     Date d=new Date();
     try{
       con=ConnectionManager.getConnection();
       stmt=con.createStatement();
       JOptionPane.showMessageDialog(this, "filename is :"+filename+"user is:"+session.user);
       int x=stmt.executeUpdate("insert into downloadlogs values('"+filename+"','"+session.user+"','"+d.toString()+"')");
       if(x!=0){
       JOptionPane.showMessageDialog(this, "file downloaded and saved in current folder");
     }
     }catch(Exception e){
        JOptionPane.showMessageDialog(this, e); 
     }
    }

    void writetolog(String content)
    {
        
        System.out.println(content);
       SimpleAttributeSet set = new SimpleAttributeSet();

       StyleConstants.setItalic(set, true);
       StyleConstants.setForeground(set, Color.black);

       Document doc = logtext.getStyledDocument();
        try {

            doc.insertString(doc.getLength(), content + "\n", set);


        } catch (BadLocationException ex) {

            ex.printStackTrace();
        }

    }
    
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browse;
    private ConnectionManager connectionManager1;
    private javax.swing.JTextField filename;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField keyfile;
    private javax.swing.JTextField listenport;
    private javax.swing.JTextPane logtext;
    private javax.swing.JButton requestFile;
    private javax.swing.JButton startUser;
    // End of variables declaration//GEN-END:variables
}
