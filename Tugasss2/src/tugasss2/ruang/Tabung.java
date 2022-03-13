/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasss2.ruang;

/**
 *
 * @author ASUS
 */
import tugasss2.Bidang.Lingkaran;

    public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi;

    public Tabung(double tinggi, double jariJari) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return (luas()*tinggi);
       
    }

 
    @Override
    public double luaspermukaan() {
        return (2*luas())+(Math.PI*getJari()*tinggi);   //To change body of generated methods, choose Tools | Templates.
    }
    
}
