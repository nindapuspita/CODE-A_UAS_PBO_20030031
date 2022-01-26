/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
import java.util.Scanner;
/**
 *
 * @author ninda
 */
public class Main {
    public static void main(String[] args){
        //untuk membuat objek bangun ruang
        BangunRuang bangunruang = new BangunRuang();
        
        //membuat scanner untuk membuat scanner yang baru
        Scanner keyboard = new Scanner(System.in);
        
        //membuat objek kubus dan input nilai ss
        kubus Kubus = new kubus();
        System.out.println("Masukkan nilai ss: ");
        Kubus.ss=keyboard.nextFloat();
        
        //dgunakan untuk memanggil method luas dan volume
        bangunruang.luas();
        bangunruang.volume();
        
        Kubus.luas();
        Kubus.volume();
        
        System.out.println("dik : ss = " + Kubus.ss);
        System.out.println("dit : ");
        System.out.println("luas bujursangkar");
        System.out.println("volume kubus");
        System.out.println("penyelesaian :");
        System.out.println("luas bujursangkar = ss x ss");
        System.out.println("= " + Kubus.ss + " x " + Kubus.ss);
        System.out.println("= " + Kubus.luas() + " cm");
        System.out.println("volume kubus = ss x ss x ss");
        System.out.println("= " + Kubus.ss + " x " + Kubus.ss + " x " + Kubus.ss);
        System.out.println("= " + Kubus.volume() + " cm");
    }
}
