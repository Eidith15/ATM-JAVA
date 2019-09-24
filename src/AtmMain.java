
import kplbo.atm.tubes.Transaksi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eidith
 */
public class AtmMain {
    public static void main(String[] args) {
        System.out.println("Selamat datang di ATM ");
        Transaksi Transaksi = new Transaksi();
        Transaksi.penyocokanPin();
    }
}
