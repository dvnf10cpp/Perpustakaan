package Database;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import Books.*;

public class Perpustakaan 
{
    private static ArrayList<User> dataUser = new ArrayList<>();
    public static ArrayList<Buku> dataBuku = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);

    public static void tambahBuku()
    {
        System.out.print("Masukkan judul : ");
        String judul = in.nextLine();
        System.out.print("Masukkan penulis : ");
        String penulis = in.nextLine();
        System.out.print("Masukkan harga : ");
        double harga = in.nextDouble(); in.nextLine();

        Buku buku = new Buku(judul, penulis, harga);
        dataBuku.add(buku);
        try {
            addDataBuku(buku, "./src/Database/Data/listBuku.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
            System.exit(0);
        }
        System.out.println("Buku telah ditambahkan!");
    }

    private static void initializeDataBuku(String pathFile)
    {
        String[] dataBuku; 
        double tempHarga;
        String tempJudul, tempPenulis, tempData;
        Scanner in;

        File data = new File(pathFile);
        try {
            in = new Scanner(System.in);
            while(in.hasNextLine()) {
                tempData = in.nextLine();
                dataBuku = tempData.split(";");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void addDataBuku(Buku buku, String pathFile) throws Exception
    {
        FileWriter data = new FileWriter(pathFile, true);
        String dataBuku = buku.getJudul() + ";" +
        buku.getPenulis() + ";" + buku.getHarga();
        try {
            BufferedWriter writer = new BufferedWriter(data);
            writer.write(dataBuku);
            writer.newLine();
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }


} 
