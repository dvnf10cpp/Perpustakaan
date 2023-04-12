package Books;

public class Gambar 
{
    private String style;
    private String[] warna;
    
    public Gambar(String style, String[] warna)
    {
        this.style = style;
        this.warna = warna;
    }

    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }
    public String[] getWarna() {
        return warna;
    }
    public void setWarna(String[] warna) {
        this.warna = warna;
    }
}
