package Database;
import java.util.ArrayList;

import Books.Buku;

public class User 
{
    private String nama;
    private String password;
    private double saldo;

    private ArrayList<Buku> listBuku;
    private ArrayList<Buku> listPinjaman;
    private ArrayList<Integer> masaPinjaman;

    public User(String nama, String password, double saldo)
    {
        this.nama = nama;
        this.password = password;
        this.saldo = saldo; 
        listPinjaman = new ArrayList<>();
        masaPinjaman = new ArrayList<>();
    }

    public void pinjamBuku(Buku buku, int masaPinjaman)
    {
        this.listPinjaman.add(buku);
        this.masaPinjaman.add(masaPinjaman); 
    }

    public void beliBuku(Buku buku)
    {
        if(buku.getHarga() > saldo) 
        {
            System.out.println("Tiak bisa meminjam!");
            System.out.println("Saldo anda kurang!");
        } else 
        {
            listBuku.add(buku);
            saldo = saldo - buku.getHarga();
            System.out.println("Anda telah membeli buku " + buku.getJudul());
            System.out.println("Dengan harga " + buku.getHarga());
            System.out.println("Sisa saldo anda " + saldo);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
