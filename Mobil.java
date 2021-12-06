/*
 * Nama : Dita Indriawati
 * NIM : 20200040066
 */
package Transportasi;

/**
 *
 * @author Dita Indriawati
 */
public class Mobil extends Kendaraan {
    private String nama;
    private String jenis;
    public Mobil (String nama)
    {
        super("Mobil");
        this.nama = nama;
        jenis ="belum terindefintikasi";
    }
    
    public Mobil (String nama, String jenis )
    {
        super("Mobil");
        this.nama =nama;
        this.jenis =jenis;
    }     
    
    public void informasi()
    {
        System.out.println ("nama Mobil adalah "+nama);
        System.out.println ("jenis Mobil "+jenis);
    }
}
