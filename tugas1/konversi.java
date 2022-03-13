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
public class konversi {
    int celcius;
    public konversi(int celcius){
        this.celcius = celcius;
    }
    
void simpan(){
    System.out.println("Suhu Dalam Celcius  : "+ celcius +".0° C");
    System.out.println("Dalam Fahrenheit    : "+ fahrenheit()+" F");
    System.out.println("Dalam Reamur        : "+ reamur()+"° R");
    System.out.println("Dalam Kelvin        : "+ kelvin()+"° K");
        if (celcius<=0){
            System.out.println("Kondisi Air Beku");
        }
        else if(celcius>0 && celcius<100){
            System.out.println("Kondisi Air Normal");
        }
        else if(celcius>=100){
            System.out.println("Kondisi Air Mendidih");
        }
}
    float fahrenheit(){
        return((9*celcius)/5)+32;
    }
    float reamur(){
        return (4*celcius)/5;
    }
    double kelvin(){
        return celcius+273.15;
    }
}
    

