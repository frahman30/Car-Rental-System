/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author FazalUr
 */
public class User extends Person
{
    private String licenseNo;
    private int branchCode;
    private double moneyInCart;
    private String userName;
    private int Password;
    private boolean billPayed;
    private int carIndex;

    public int getCarIndex()
    {
        return carIndex;
    }

    public void setCarIndex(int carIndex)
    {
        this.carIndex = carIndex;
    }
    
    public User(String A, String B, int C, String D, String E, String F, int G, double H, String I, int J, boolean K)
    {
        super(A,B,C,D,E);
        this.licenseNo = F;
        this.branchCode = G;
        this.moneyInCart = H;
        this.userName = I;
        this.Password = J;
        this.billPayed = K;
        this.carIndex = 0;
    }
    public User()
    {
        this(null,null,0,null,null,null,0,0.0,null,0,false);
        this.carIndex = 0;
    }
    
    public void registerNewUser(String A, String B, int C, String D, String E, String F, int G, double H, String I, int J, boolean K)
    {
        super.setName(A);
        super.setBloodGroup(B);
        super.setId(C);
        super.setName(D);
        super.setNationality(E);
        
        this.licenseNo = F;
        this.branchCode = G;
        this.moneyInCart = H;
        this.userName = I;
        this.Password = J;
        this.billPayed = K;
    }

    public String getLicenseNo()
    {
        return licenseNo;
    }

    public int getBranchCode()
    {
        return branchCode;
    }

    public double getMoneyInCart()
    {
        return moneyInCart;
    }

    public String getUserName()
    {
        return userName;
    }

    public int getPassword()
    {
        return Password;
    }

    public boolean isBillPayed()
    {
        return billPayed;
    }

    public void setLicenseNo(String licenseNo)
    {
        this.licenseNo = licenseNo;
    }

    public void setBranchCode(int branchCode)
    {
        this.branchCode = branchCode;
    }

    public void setMoneyInCart(double moneyInCart)
    {
        this.moneyInCart = moneyInCart;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setPassword(int Password)
    {
        this.Password = Password;
    }

    public void setBillPayed(boolean billPayed)
    {
        this.billPayed = billPayed;
    }
}
