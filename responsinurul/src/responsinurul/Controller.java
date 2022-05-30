/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsinurul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author ASUS
 */
public class Controller {
    
    Model model;
    barangview barangview;
    
    public String pilihandata;
    
    public Controller(Model model, barangview barangview){
        this.model = model;
        this.barangview = barangview;
        
        if (model.getBanyakData()!=0){
            String databarang[][] = model.baranglist();
            barangview.tabel.setModel((new JTable(databarang, barangview.namaKolom)).getModel());  
        }
        else{
            JOptionPane.showMessageDialog(null, "Data Tidak  Ada");
            }
        
        barangview.btnCreate.addActionListener(new ActionListener (){
            @Override
               String id = barangview.getId();
                String nama = barangview.getNama();
                String massa = barangview.getMassa();
                String harga = barangview.getHarga();
                Model.insertbarang(id, nama, massa, harga);
         
            String databarang[][] = model.baranglist();
            barangview.tabel.setModel((new JTable(databarang, barangview.namaKolom)).getModel());
            }
        });
        
        barangview.btnUpdate.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
             String id = barangview.getId();
                String nama = barangview.getNama();
                String massa = barangview.getMassa();
                String harga = barangview.getHarga();
                Model.update(id, nama, massa, harga);
                
                String databarang[][] = Model.baranglist();
                barangview.tabel.setModel((new JTable(databarang, barangview, barangview.namaKolom))).getModel());
        }
    });
    
        barangview.table.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                super.mousePressed(e);
                int baris = barangview.tabel.getValueAt(baris, 0).toString();
                System.out.println("pilihandata");
            }
    });
    
         barangview.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int input = JOptionPane.showConfirmDialog(null,
                        "Apa anda ingin menghapus Barang " + pilihandata + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    Model.deleteBarang(pilihandata);
                    String databarang[][] = Model.baranglist();
                    barangview.tabel.setModel((new JTable(databarang, barangview.namaKolom)).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });
}}
