/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsinurul;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class barangview extends JFrame{
    JLabel lId = new JLabel ("Id");
    JLabel lNama = new JLabel ("Nama");
    JLabel lMassa = new JLabel ("Massa");
    JLabel lHarga = new JLabel ("Harga");
    
    public JTextField tfId = new JTextField();
    public JTextField tfNama = new JTextField();
    public JTextField tfMassa = new JTextField();
    public JTextField tfHarga = new JTextField();
    
    public JButton btnCreate = new JButton ("Create");
    public JButton btnRead = new JButton ("Read");
    public JButton btnUpdate = new JButton ("Update");
    public JButton btnDelete = new JButton ("Delete");
    
    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"Judul", "Id", "Nama", "Massa", "Harga" };
    
    public barangview(){
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Barang");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(700,400);
        
        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 300);
        
         add(lId);
        lId.setBounds(510,20,90,20);
        add(tfId);
        tfId.setBounds (510,40,120,20);
        
        add(lNama);
        lNama.setBounds(510,60,90,20);
        add(tfNama);
        tfNama.setBounds (510, 80, 120, 20);
        
        add(lMassa);
        lMassa.setBounds(510, 100, 90, 20);
        add(tfMassa);
        tfMassa.setBounds(510, 120, 120, 20);
        
        add(lHarga);
        lHarga.setBounds(510, 140, 90, 20);
        add(tfHarga);
        tfHarga.setBounds(510, 160, 120, 20);
        
        add(btnCreate);
        btnCreate.setBounds(510, 190, 90, 20);
        
        add(btnRead);
        btnRead.setBounds(510, 220, 90, 20);
        
        add(btnUpdate);
        btnUpdate.setBounds(510, 250, 90, 20);
        
        add(btnDelete);
        btnDelete.setBounds(510, 280, 90, 20);
        
    }
    
    public String getId(){
        return tfId.getText();
    }
    
    public String getNama(){
        return tfNama.getText();
    }
    
    public String getMassa(){
        return tfMassa.getText();
    }
    
    public String getHarga(){
        return tfHarga.getText();
    }
}
    
    
    
    
 
