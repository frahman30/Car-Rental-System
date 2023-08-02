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
public class Driver extends Person
{
    private String licenseNo;
    private boolean Status;
    private int carAlloted;
    private float availableIn;
    
    public Driver(String A, String B, int C, String D, String E, String F, boolean G, int H, float I)
    {
        super(A,B,C,D,E);
        this.licenseNo = F;
        this.Status = G;
        this.carAlloted = H;
        this.availableIn = I;
    }
    public Driver()
    {
        this(null,null,0,null,null,null,true,0,0.0F);
    }
    
    public void registerNewDriver(String A, String B, int C, String D, String E, String F, boolean G, int H, float I)
    {
        super.setName(A);
        super.setNationality(B);
        super.setId(C);
        super.setBloodGroup(D);
        super.setAddress(E);
        
        this.setLicenseNo(F);
        this.setStatus(G);
        this.setCarAlloted(H);
        this.setAvailableIn(I);
    }

    public String getLicenseNo()
    {
        return licenseNo;
    }

    public boolean isStatus()
    {
        return Status;
    }

    public int getCarAlloted()
    {
        return carAlloted;
    }

    public float getAvailableIn()
    {
        return availableIn;
    }

    public void setLicenseNo(String licenseNo)
    {
        this.licenseNo = licenseNo;
    }

    public void setStatus(boolean Status)
    {
        this.Status = Status;
    }

    public void setCarAlloted(int carAlloted)
    {
        this.carAlloted = carAlloted;
    }

    public void setAvailableIn(float availableIn)
    {
        this.availableIn = availableIn;
    }
}
