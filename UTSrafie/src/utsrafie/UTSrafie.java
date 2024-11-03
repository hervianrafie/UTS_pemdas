/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsrafie;

/**
 *
 * @author ASUS
 */
public class UTSrafie {

    int BeratB;
    int TinggiB; 
    
    public UTSrafie(int TinggiB, int BeratB) {
    this.BeratB = BeratB;
    this.TinggiB = TinggiB;  
}
    
public void prosesBMI(){   
    
    double tinggiMeter = TinggiB / 100.0; // Konversi cm ke meter
    double hasil = BeratB / (tinggiMeter * tinggiMeter);
    System.out.println("Hasil kalkulasi anda adalah "+ hasil);
    if (hasil < 18){
        System.out.println ("Berat Badan Kurang");    
    } else if (hasil >=18 && hasil<= 23){
        System.out.println ("Berat Badan Ideal");    
    } else if (hasil >=23 && hasil <=25) {
        System.out.println ("Kelebihan Berat Badan");    
    } else {
        System.out.println ("Kategori Obesitas");
    }   
}
    
}
