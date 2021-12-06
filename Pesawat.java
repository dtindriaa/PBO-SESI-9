/*
 * Nama : Dita Indriawati
 * NIM : 20200040066
 */
package Transportasi;

/**
 *
 * @author Dita Indriawati
 */
public class Pesawat extends Kendaraan {
    private String nama;
    private String jenis;
    
    public Pesawat (String nama)
    {
        super("Pesawat");
        this.nama =nama;
        jenis ="belum terindefintikasi";
    }
    
    public Pesawat (String nama, String jenis )
    {
        super("Pesawat");
        this.nama =nama;
        this.jenis =jenis;
    }     
    
    public void informasi()
    {
        System.out.println ("nama pesawat adalah " +nama);
        System.out.println ("jenis pesawat " +jenis);
    }
}
