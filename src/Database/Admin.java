package Database;

public class Admin extends User
{
    private boolean adminAccess;

    public Admin(String nama, String password, double saldo)
    {
        super(nama,password,saldo);
        adminAccess = true;
    }

    public boolean isAdmin()
    {
        return adminAccess;   
    }
}
