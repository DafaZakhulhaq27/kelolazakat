/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Dafa Zakhulhaq
 */
public class Fitrah extends javax.swing.JFrame {

    int nol_jam ;
    int nol_menit ;
    int nol_detik ;
    
        String kolom[] = {"id_fitrah","nama","uang","beras","tanggal","alamat"} ;
        DefaultTableModel dtm = new DefaultTableModel(null, kolom) ;
    /**
     * Creates new form frmMain
     */
    public Fitrah() {
        initComponents();
        
        SetJam() ;
        SetTanggal() ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jm = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tgl3 = new javax.swing.JLabel();
        tgl4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        wr = new javax.swing.JRadioButton();
        pr = new javax.swing.JRadioButton();
        namatv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamattv = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbdata = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        print = new javax.swing.JButton();
        seacrh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setLayout(null);

        jm.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jm.setForeground(new java.awt.Color(255, 255, 255));
        jm.setText("Jam");
        jPanel1.add(jm);
        jm.setBounds(710, 40, 130, 40);

        tgl.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tgl.setForeground(new java.awt.Color(255, 255, 255));
        tgl.setText("Tanggal");
        jPanel1.add(tgl);
        tgl.setBounds(760, 10, 80, 40);

        jButton1.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 10, 150, 60);

        tgl3.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        tgl3.setForeground(new java.awt.Color(255, 255, 255));
        tgl3.setText("Zakat Fitrah");
        jPanel1.add(tgl3);
        tgl3.setBounds(310, 0, 210, 80);

        tgl4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tgl4.setForeground(new java.awt.Color(255, 255, 255));
        tgl4.setText("Tanggal");
        jPanel1.add(tgl4);
        tgl4.setBounds(710, 10, 80, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 80);

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zakat Fitrah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jenis");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 70, 110, 40);

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alamat");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 140, 80, 40);

        buttonGroup1.add(wr);
        wr.setText("Beras 2,5 kg");
        jPanel2.add(wr);
        wr.setBounds(10, 120, 130, 23);

        buttonGroup1.add(pr);
        pr.setText("Uang Rp. 10.000");
        pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prActionPerformed(evt);
            }
        });
        jPanel2.add(pr);
        pr.setBounds(10, 100, 130, 23);

        namatv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namatvActionPerformed(evt);
            }
        });
        jPanel2.add(namatv);
        namatv.setBounds(10, 50, 170, 30);

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NAMA");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 20, 80, 40);

        alamattv.setColumns(20);
        alamattv.setRows(5);
        jScrollPane1.setViewportView(alamattv);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 166, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 190, 460);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        delete.setBackground(new java.awt.Color(0, 153, 51));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete);
        delete.setBounds(340, 90, 80, 40);

        save.setBackground(new java.awt.Color(0, 153, 51));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save);
        save.setBounds(210, 90, 80, 40);

        edit.setBackground(new java.awt.Color(0, 153, 51));
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel3.add(edit);
        edit.setBounds(750, 90, 80, 40);

        refresh.setBackground(new java.awt.Color(0, 153, 51));
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel3.add(refresh);
        refresh.setBounds(610, 90, 80, 40);

        tbdata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Fitrah", "Nama", "Uang", "Beras", "Tanggal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbdata);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(210, 140, 630, 290);

        clear.setBackground(new java.awt.Color(0, 153, 51));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear);
        clear.setBounds(480, 90, 80, 40);

        print.setBackground(new java.awt.Color(0, 153, 51));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel3.add(print);
        print.setBounds(220, 470, 130, 60);

        seacrh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seacrhKeyReleased(evt);
            }
        });
        jPanel3.add(seacrh);
        seacrh.setBounds(420, 500, 230, 30);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Search");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(480, 450, 130, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 850, 550);

        setBounds(0, 0, 861, 586);
    }// </editor-fold>//GEN-END:initComponents

    private void namatvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namatvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namatvActionPerformed

    private void prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Beranda().show();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void seacrhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seacrhKeyReleased
        // TODO add your handling code here:

        String q = seacrh.getText().toLowerCase() ;
        filter(q) ;

    }//GEN-LAST:event_seacrhKeyReleased

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:

        MessageFormat header = new MessageFormat("Biodata Telkom") ;
        MessageFormat footer = new MessageFormat("Page (0,number,integer)") ;

        try{
            tbdata.print(JTable.PrintMode.FIT_WIDTH, header, footer,true, null, true, null) ;

        }catch(java.awt.print.PrinterException e)
        {
            System.err.format("Cannot print", e.getMessage()) ;

        }

    }//GEN-LAST:event_printActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:

        namatv.setText("");
        alamattv.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_clearActionPerformed

    private void tbdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdataMouseClicked
        // TODO add your handling code here:
        int baris = tbdata.getSelectedRow() ;
        if(baris != -1){

            namatv.setText(tbdata.getValueAt(baris, 1).toString()) ;
            if ("10000".equals(tbdata.getValueAt(baris, 2).toString()))
            {
                pr.setSelected(true);
            }
            if ("2.5".equals(tbdata.getValueAt(baris, 3).toString()))
            {
                pr.setSelected(true);
            }
            alamattv.setText(tbdata.getValueAt(baris, 5).toString()) ;

        }

    }//GEN-LAST:event_tbdataMouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        selectdata();
    }//GEN-LAST:event_refreshActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        int baris = tbdata.getSelectedRow() ;

        if("".equals(namatv.getText()) || "".equals(alamattv.getText())){
            JOptionPane.showMessageDialog(this, "Harap lengkapi Data","Error", JOptionPane.WARNING_MESSAGE);

        }else{
            int iJN ;
            String JN = "" ;
            if(pr.isSelected()){
                JN = "10000" ;
                iJN = Integer.parseInt(JN) ;
                String SQL = "UPDATE tb_fitrah SET nama='"+namatv.getText()+"',uang='"+iJN+"',beras="+null+",Alamat='"+alamattv.getText()+"' WHERE id_fitrah='"+tbdata.getValueAt(baris, 0).toString()+"' " ;
                int status = KoneksiDB.execute(SQL) ;
                if(status == 1){

                    JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan","sukses",JOptionPane.INFORMATION_MESSAGE);
                    selectdata();
                }else{

                    JOptionPane.showMessageDialog(this, "Gagal Ditambahkan","gagal",JOptionPane.WARNING_MESSAGE);

                }
            }else if(wr.isSelected()){
                JN = "2.5" ;
                iJN = Integer.parseInt(JN) ;
                String SQL = "UPDATE tb_fitrah SET nama='"+namatv.getText()+"',uang="+null+",beras="+iJN+",Alamat='"+alamattv.getText()+"' WHERE id_fitrah='"+tbdata.getValueAt(baris, 0).toString()+"' " ;
                int status = KoneksiDB.execute(SQL) ;
                if(status == 1){

                    JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan","sukses",JOptionPane.INFORMATION_MESSAGE);
                    selectdata();
                }else{

                    JOptionPane.showMessageDialog(this, "Gagal Ditambahkan","gagal",JOptionPane.WARNING_MESSAGE);

                }
            }else{

                JN = "Belum Diisi" ;
            }

        }
    }//GEN-LAST:event_editActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        java.util.Date skrg = new java.util.Date() ;
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd/MM/yyyy") ;
        if("".equals(alamattv.getText())|| "".equals(namatv.getText()) ){
            JOptionPane.showMessageDialog(this, "Harap lengkapi Data","Error", JOptionPane.WARNING_MESSAGE);

        }else{
            double iJN ;
            String JN = "" ;
            if(pr.isSelected()){
                JN = "10000" ;
                iJN = Double.parseDouble(JN) ;
                String SQL = "Insert Into tb_fitrah(id_fitrah,nama,uang,beras,tanggal,alamat)"+"Values("+null+",'"+namatv.getText()+"','"+iJN+"',"+null+",'"+kal.format(skrg)+"','"+alamattv.getText()+"') ;" ;
                int status = KoneksiDB.execute(SQL) ;
                if(status == 1){

                    JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan","sukses",JOptionPane.INFORMATION_MESSAGE);
                    selectdata();
                }else{

                    JOptionPane.showMessageDialog(this, "Gagal Ditambahkan","gagal",JOptionPane.WARNING_MESSAGE);

                }

            }else if(wr.isSelected()){
                JN = "2.5" ;
                iJN = Double.parseDouble(JN) ;
                String SQL = "Insert Into tb_fitrah(id_fitrah,nama,uang,beras,tanggal,alamat)"+"Values("+null+",'"+namatv.getText()+"',"+null+","+iJN+",'"+kal.format(skrg)+"','"+alamattv.getText()+"') ;" ;
                int status = KoneksiDB.execute(SQL) ;
                if(status == 1){

                    JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan","sukses",JOptionPane.INFORMATION_MESSAGE);
                    selectdata();
                }else{

                    JOptionPane.showMessageDialog(this, "Gagal Ditambahkan","gagal",JOptionPane.WARNING_MESSAGE);

                }

            }else{

                JN = "Belum Diisi" ;
            }

        }

    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:

        int baris = tbdata.getSelectedRow() ;
        if(baris != -1){
            String NIS = tbdata.getValueAt(baris, 0).toString() ;
            String SQL = "Delete From tb_fitrah Where id_fitrah='"+tbdata.getValueAt(baris, 0).toString()+"'" ;
            int status = KoneksiDB.execute(SQL) ;
            if(status == 1){

                JOptionPane.showMessageDialog(this, "Berhasil Dihapus","sukses",JOptionPane.INFORMATION_MESSAGE);
                selectdata();
            }else{

                JOptionPane.showMessageDialog(this, "Gagal Dihapus","gagal",JOptionPane.WARNING_MESSAGE);

            }
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fitrah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamattv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jm;
    private javax.swing.JTextField namatv;
    private javax.swing.JRadioButton pr;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JTextField seacrh;
    private javax.swing.JTable tbdata;
    private javax.swing.JLabel tgl;
    private javax.swing.JLabel tgl3;
    private javax.swing.JLabel tgl4;
    private javax.swing.JRadioButton wr;
    // End of variables declaration//GEN-END:variables

    public void SetTanggal(){
        java.util.Date skrg = new java.util.Date() ;
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd/MM/yyyy") ;
        tgl.setText(kal.format(skrg));
    }
    public void SetJam() {
        ActionListener taskPerformer = new ActionListener() {
          @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date() ;
                int nilai_jam = dt.getHours() ;
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
            
                
                String jam = Integer.toString(nilai_jam) ;                
                String menit = Integer.toString(nilai_menit) ;
                String detik = Integer.toString(nilai_detik) ;
                jm.setText("Jam "+jam+" : "+ menit+" : "+detik);
                
                
            }
            
        };
        
            new Timer(100, taskPerformer).start() ;
            
    }
    
    private void selectdata() {
    
        String SQL = "Select * From tb_fitrah " ;
        ResultSet rs = KoneksiDB.executeQuery(SQL) ;
        
         dtm.getDataVector().removeAllElements();      
        try {
            
            while(rs.next()){
                String id_fitrah = rs.getString(1) ;
                String nama = rs.getString(2) ;
                String uang = "" ;
                if("10000".equals(rs.getString(3))){
                    uang = "10000" ;
                    
                }
                String beras = "" ;
                if("2.5".equals(rs.getString(4))){
                    beras = "2.5" ;
                    
                }
                String tanggal = rs.getString(5) ;
                String alamat = rs.getString(6) ;
                String data[] = {id_fitrah,nama,uang,beras,tanggal,alamat} ;
                dtm.addRow(data);
            }
            
        }catch(SQLException ex){
            
            Logger.getLogger(Fitrah.class.getName()).log(Level.SEVERE, null, ex) ;
        }
        tbdata.setModel(dtm);
        
    }
    public void filter(String q)
    {
        TableRowSorter<DefaultTableModel> ts=new TableRowSorter<DefaultTableModel>(dtm) ;
        tbdata.setRowSorter(ts);
        
        ts.setRowFilter(RowFilter.regexFilter(q));
        
    }
}
