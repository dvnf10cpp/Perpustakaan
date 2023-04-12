import java.util.Scanner;

import Database.*;

public class Aplikasi 
{
    final static private Scanner in = new Scanner(System.in);

    public static void appStart() 
    {
        Perpustakaan.tambahBuku();
    }

    public static void appLogin()
    {
        int x = 10;
        switch(x)
        {
            case 1:
                Root.adminLogin();
        }
    }

    public static void appRegister()
    {
        System.out.print("Masukin nama : ");
        String nama = in.nextLine();
        System.out.print("Masukin password : ");
        String password = in.nextLine();
        System.out.print("Masukin saldo : ");
        double saldo = in.nextDouble(); in.nextLine();

        User user = new User(nama, password, saldo);
        

    }

    public static void appTopUp()
    {

    }

    public static void appPinjam()
    {

    }

    public static void appBeli()
    {

    }
}
