package Books;
public class Buku 
{
    private String judul;
    private String penulis;
    private double harga;    

    public Buku(String judul, String penulis, double harga)
    {
        this.judul = judul;
        this.penulis = penulis;   
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }


    public void setJudul(String judul) {
        this.judul = judul;
    }


    public String getPenulis() {
        return penulis;
    }


    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }


    public double getHarga() {
        return harga;
    }


    public void setHarga(double harga) {
        this.harga = harga;
    }

}
