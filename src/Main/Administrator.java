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
public class Administrator extends Person
{
    private int branchCode;
    private String userName;
    private int Password;
    
    public Administrator(String A, String B, int C, String D, String E, int F, String G, int H)
    {
        super(A,B,C,D,E);
        this.branchCode = F;
        this.userName = G;
        this.Password = H;
    }
    public Administrator()
    {
        this(null,null,0,null,null,0,null,0);   
    }

    public int getBranchCode()
    {
        return branchCode;
    }

    public String getUserName()
    {
        return userName;
    }

    public int getPassword()
    {
        return Password;
    }

    public void setBranchCode(int branchCode)
    {
        this.branchCode = branchCode;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setPassword(int Password)
    {
        this.Password = Password;
    }
}
