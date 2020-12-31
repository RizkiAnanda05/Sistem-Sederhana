import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class DataInstruktur extends javax.swing.JFrame {
    /**
     * Creates new form DataInstruktur
     */
    
    
    public DataInstruktur() {
        initComponents();
        tampiltable();
        kosong();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rb_JK = new javax.swing.ButtonGroup();
        txt_alamatI = new javax.swing.JTextField();
        txt_namaI = new javax.swing.JTextField();
        txt_idI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_instruktur = new javax.swing.JTable();
        btn_tambahI = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Rb_LI = new javax.swing.JRadioButton();
        Rb_PI = new javax.swing.JRadioButton();
        Cb_I = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_alamatI.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_alamatI.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_alamatI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatIActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA INSTRUKTUR");

        jLabel2.setText("ID");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jLabel5.setText("Jenis Kelamin");

        table_instruktur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Jenis Kelamin", "Alamat", "Pengajar"
            }
        ));
        table_instruktur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_instrukturMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_instruktur);

        btn_tambahI.setText("Tambah");
        btn_tambahI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahIActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Refresh");

        Rb_JK.add(Rb_LI);
        Rb_LI.setText("Laki-Laki");

        Rb_JK.add(Rb_PI);
        Rb_PI.setText("Perempuan");

        Cb_I.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile Programmer", "Network 1", "Network 2", "Network 3", "Software & Bussines", "Pariwisata", "AC", "Industri 4.0", "Design Grafis 1", "Design Grafis 2", "Motion Grafis" }));

        jLabel6.setText("Keahlian");

        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Hapus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_idI)
                                    .addComponent(txt_namaI)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Rb_LI)
                                        .addGap(2, 2, 2)
                                        .addComponent(Rb_PI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txt_alamatI)
                                    .addComponent(Cb_I, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(btn_tambahI)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton4)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_idI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_namaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rb_LI)
                            .addComponent(Rb_PI))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_alamatI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cb_I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambahI)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_alamatIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatIActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        HalamanUtama a = new HalamanUtama();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_tambahIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahIActionPerformed
        // TODO add your handling code here:
        String rb_select = "";
        if(Rb_LI.isSelected()){
            rb_select = "L";
        }else{
            rb_select = "P";
        };
//        String Cb_set = "";
//        if(Cb_I.getSelectedIndex()== 0){
//            Cb_set = "Mobile Prigramming";
//        }else {
//            
//        }
        try{
            String Sql ="INSERT INTO instruktur VALUES ('"+txt_idI.getText()+"',"
                    + "'"+txt_namaI.getText()+"',"
                    + "'"+rb_select+"',"
                    + "'"+txt_alamatI.getText()+"',"
                    + "'"+Cb_I.getSelectedItem()+"')";
            java.sql.Connection conn =(Connection)konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(Sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan data");
            kosong();
            tampiltable();
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, "Gagal menambahkan");
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_tambahIActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String rb_select = "";
        if(Rb_LI.isSelected()){
            rb_select = "L";
        }else{
            rb_select = "P";
        };
//        String Cb_set = "";
//        if(Cb_I.getSelectedIndex()== 0){
//            Cb_set = "Mobile Prigramming";
//        }else {
//            
//        }
        try{
            String Sql ="UPDATE instruktur SET "
                    + "nama_instrktur = '"+txt_namaI.getText()+"',"
                    + "jenis_kelamin = '"+rb_select+"',"
                    + "alamat = '"+txt_alamatI.getText()+"',"
                    + "keahlian = '"+Cb_I.getSelectedItem()+"' WHERE id = '"+txt_idI.getText()+"', ";
            java.sql.Connection conn =(Connection)konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(Sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan data");
            kosong();
            tampiltable();
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, "Gagal menambahkan");
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
     
    }//GEN-LAST:event_jButton2MouseClicked

    private void table_instrukturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_instrukturMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tb = new DefaultTableModel();
        int i = table_instruktur.rowAtPoint(evt.getPoint());
        txt_idI.setText(table_instruktur.getValueAt(i, 0).toString());
        txt_namaI.setText(table_instruktur.getValueAt(i, 1).toString());
        String JK = table_instruktur.getValueAt(i, 2).toString();
        if(JK.equals("L")){
            Rb_LI.setSelected(true);
        }else{
            Rb_PI.setSelected(true);
        }
        txt_alamatI.setText(table_instruktur.getValueAt(i, 3).toString());
        String Ka = table_instruktur.getValueAt(i, 4).toString();
        Cb_I.setSelectedItem(Ka);
    }//GEN-LAST:event_table_instrukturMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String Sql ="DELETE FROM instruktur WHERE id = '"+txt_idI.getText()+"' ";
            java.sql.Connection conn =(Connection)konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(Sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus data");
            kosong();
            tampiltable();
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, "Gagal menambahkan");
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     * 
     */
    
    public void tampiltable(){
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("ID");
        tb.addColumn("Nama");
        tb.addColumn("Jenis Kelamin");
        tb.addColumn("Alamat");
        tb.addColumn("Keahlian");
        
        
        // memasukan data dari mysql
        try {
            String sql = "select * from instruktur";
            java.sql.Connection conn=(Connection)konfig.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                tb.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
            table_instruktur.setModel(tb);
        } catch (Exception e) {
        
        }
    }
    private void kosong(){
        txt_idI.setText(null);
        txt_namaI.setText(null);
        txt_alamatI.setText(null); 
    }
    public static void main(String args[]) {
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataInstruktur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cb_I;
    private javax.swing.ButtonGroup Rb_JK;
    private javax.swing.JRadioButton Rb_LI;
    private javax.swing.JRadioButton Rb_PI;
    private javax.swing.JButton btn_tambahI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_instruktur;
    private javax.swing.JTextField txt_alamatI;
    private javax.swing.JTextField txt_idI;
    private javax.swing.JTextField txt_namaI;
    // End of variables declaration//GEN-END:variables
}
