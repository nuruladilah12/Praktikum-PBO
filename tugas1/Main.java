/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author ASUS
 */


import java.util.Scanner;
import tugas1.konversi;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih;
         int celcius, fahreinheit, reamur, kelvin ;    
        Scanner input = new Scanner (System.in);
        
        System.out.println("...........................");
        System.out.println(" PROGRAM KONVERSI SUHU AIR ");
        System.out.println("...........................");
        System.out.println("========Input data========");
        System.out.println ("suhu dalam celcius : ");
        celcius = input.nextInt(); 
        konversi versi = new konversi(celcius);
        System.out.println("");
        System.out.println("");
        do{
         System.out.println("");
            System.out.println("=======Opsi=======");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. exit");
            System.out.print("Pilih : ");pilih= input.nextInt();

            if (pilih==1) {  
                versi.simpan();
             }
            else if (pilih==2) {
            input = new Scanner (System.in);
            System.out.println ("suhu dalam celcius : ");pilih=input.nextInt();
                
            }
            else if (pilih==3) {
            System.exit(0);
            }
        }while(pilih!=3);
    }
    
}
