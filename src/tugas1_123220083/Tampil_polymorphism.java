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
public class Tampil_polymorphism {
    public static void main(String[] args) {
        Nasabah N[] = new Nasabah[3];
        N[0] = new Nasabah();
        N[1] = new Prioritas();
        N[2] = new Premium();
        for(int i = 0; i < 3; i++){
            System.out.println("Saldo Nasabah " + i + " : " + N[i].gettotalsaldo() + " dengan Limit : " + N[i].limit);
        }
        for (int i = 0; i < 3; i++) {
            N[i].bunga1tahun();
        }
        System.out.println("Saldo Setelah 1 tahun");
        for (int i = 0; i < 3; i++) {
            System.out.println("Saldo Nasabah " + i + " sekarang adalah " + N[i].gettotalsaldo());
        }
    } 
}
