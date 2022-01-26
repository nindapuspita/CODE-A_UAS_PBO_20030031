/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;
import java.util.Scanner;
/**
 *
 * @author ninda
 */
public class Main {
    public static void main(String[]args){
        //digunkan untuk membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        //membuat objek kubus dan input nilai ss
        BangunRuang bangunruang = new BangunRuang();
        Kubus kubus = new Kubus();
        System.out.println("Masukkan nilai ss: ");
        kubus.ss=input.nextInt();
        
        //digunakan untuk memanggil method luas dan volume
        bangunruang.luas();
        bangunruang.volume();

        //tampilan output
        System.out.println("dik : ss = " + kubus.ss);
        System.out.println("dit : ");
        System.out.println("luas bujursangkar");
        System.out.println("volume kubus");
        System.out.println("penyelesaian :");
        System.out.println("luas bujursangkar = ss x ss");
        System.out.println("= " + kubus.ss + " x " + kubus.ss);
        System.out.println("= " + kubus.luas() + " cm");
        System.out.println("volume kubus = ss x ss x ss");
        System.out.println("= " + kubus.ss + " x " + kubus.ss + " x " + kubus.ss);
        System.out.println("= " + kubus.volume() + " cm");
    }
}
