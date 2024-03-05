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
public class Premium extends Nasabah{
    Premium(){
        limit += 4000000;
        suku_bunga += 0.6f;
        saldo += 300000;
    }
    void bunga1tahun(){
        saldo = gettotalsaldo();
        bunga = saldo * suku_bunga;
    }
}
