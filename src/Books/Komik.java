package Books;

public class Komik extends Buku
{
    private Gambar gambar;

    public Komik(String judul, String penulis, double harga, Gambar gambar)
    {
        super(judul, penulis, harga);
        this.gambar = gambar;
    }
        
    public Gambar getGambar() {
        return gambar;
    }

    public void setGambar(Gambar gambar) {
        this.gambar = gambar;
    }
}
