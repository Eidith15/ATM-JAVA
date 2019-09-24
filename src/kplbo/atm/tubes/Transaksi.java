/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kplbo.atm.tubes;

import java.util.Scanner;

/**
 *
 * @author Eidith
 */
public class Transaksi {
    
    Scanner sc = new Scanner(System.in);
    Rekening Rekening1 = new Rekening(1, "Adhit", 1000000, 1234);
    Rekening Rekening2 = new Rekening(2, "Herdi", 2000000, 4321);
    Rekening Rekening3 = new Rekening(3, "Ahmad", 3000000, 3421);
    int masukPin;
    
    public void listTransaksi(){
        int menu = 3;
            System.out.println("=======================");
            System.out.println("List Transaksi");
            System.out.println("1. Penarikan");
            System.out.println("2. Deposit");
            System.out.println("3. Cek Saldo");
            System.out.println("0. Exit");
            System.out.println("========================");
            System.out.println("Pilih Menu : ");menu = sc.nextInt();
            
            switch(menu){
                case 0 : 
                    break;
                case 1 : 
                    int penarikan;
                    System.out.println("Masukan Jumlah Penarikan : ");
                    penarikan=sc.nextInt(); 
                    if(Rekening1.getPin() == masukPin && Rekening1.getSaldo() > penarikan){
                        Rekening1.setSaldo(Rekening1.getSaldo() - penarikan);
                        System.out.println("Penarikan Berhasil");
                        System.out.println("Sisa Saldo : "+Rekening1.getSaldo());
                    }else if (Rekening2.getPin() == masukPin && Rekening2.getSaldo() > penarikan){
                        Rekening2.setSaldo(Rekening2.getSaldo() - penarikan);
                        System.out.println("Penarikan Berhasil");
                        System.out.println("Sisa Saldo : "+Rekening2.getSaldo());
                    }else if (Rekening3.getPin() == masukPin && Rekening3.getSaldo() > penarikan){
                        Rekening3.setSaldo(Rekening3.getSaldo() - penarikan);
                        System.out.println("Penarikan Berhasil");
                        System.out.println("Sisa Saldo : "+Rekening3.getSaldo());
                    }else{
                        System.out.println("Saldo Tidak Mencukupi");
                    }
                    break;
                case 2 : 
                    int deposit;
                    System.out.println("Masukan Jumlah Penarikan : ");
                    deposit=sc.nextInt(); 
                    if(Rekening1.getPin() == masukPin){
                        Rekening1.setSaldo(Rekening1.getSaldo() + deposit);
                        System.out.println("Penambahan Saldo Berhasil");
                        System.out.println("Saldo : "+Rekening1.getSaldo());
                    }else if (Rekening2.getPin() == masukPin){
                        Rekening2.setSaldo(Rekening2.getSaldo() + deposit);
                        System.out.println("Penambahan Saldo Berhasil");
                        System.out.println("Saldo : "+Rekening2.getSaldo());
                    }else if (Rekening3.getPin() == masukPin){
                        Rekening3.setSaldo(Rekening3.getSaldo() + deposit);
                        System.out.println("Penambahan Saldo Berhasil");
                        System.out.println("Saldo : "+Rekening3.getSaldo());
                    }else{
                        System.out.println("Error");
                    }
                    break;
                    
                case 3 : 
                    if(Rekening1.getPin() == masukPin){
                        System.out.println("Saldo : "+Rekening1.getSaldo());
                    }else if (Rekening2.getPin() == masukPin){
                        System.out.println("Saldo : "+Rekening2.getSaldo());
                    }else if (Rekening3.getPin() == masukPin){
                        System.out.println("Saldo : "+Rekening3.getSaldo());
                    }else{
                        System.out.println("Error");
                    }
                    break;
            }
    }
    
    public void penyocokanPin (){
        System.out.println("Masukan PIN : ");masukPin=sc.nextInt();
        if (Rekening1.getPin() == masukPin || Rekening2.getPin() == masukPin || Rekening3.getPin() == masukPin) {
            listTransaksi();
        }else{
            System.out.println("PIN Salah!!!");
        }
    }
    
}
