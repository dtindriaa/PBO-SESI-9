/*
 * Nama : Dita Indriawati
 * NIM : 20200040066
 */
package Transportasi;

/**
 *
 * @author Dita Indriawati
 */
public class Transportasi {

    public static void main(String[] args) {
        Kendaraan p;
        Pesawat psw = new Pesawat("Bombardier Global 8000", "Pribadi");
        Mobil mbl1 = new Mobil ("Nissan GT-R", "Sport");
        Mobil mbl2 = new Mobil ("Convertible", "BMW M3");
        Mobil mbl3 = new Mobil ("MPV  ", "Odyssey");
        // TODO code application logic here
          p = psw;
          p.informasi();
          System.out.println();
          
          p = mbl1;
          p.informasi();
          System.out.println();
          
          p = mbl2;
          p.informasi();
          System.out.println();
          
          p = mbl3;
          p.informasi();
          System.out.println();
          
    }
}
