/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_123220083;

/**
 *
 * @author JOSUA
 */
public class Nasabah {
    //limit transaksi
    double limit;
    //suku bunga per tahun
    float suku_bunga;
    double bunga;
    double saldo;
    Nasabah (){
        limit = 2000000;
        suku_bunga = 0.1f;
        saldo = 100000;
        System.out.println("Limit nasabah reguler : " + limit);
    }
    private double hitungsaldo (double saldo, double bunga){
        return saldo + bunga;
    }
    void bunga1tahun(){
        saldo = gettotalsaldo();
        bunga = saldo * suku_bunga;
    }
    double gettotalsaldo(){
        return hitungsaldo(saldo, bunga);
    }
}
