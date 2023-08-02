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
public class Car
{
    private int Make;
    private String Name;
    private String Color;
    private String registrationNo;
    private int noOfWheels;
    private int Model;
    private double Fair;
    private int seatingCapacity;
    private boolean Status;
    private int Id;
    private int availableIn;
    private int driverAlloted;
    
    public Car(int A, String B, String C, String D, int E, int F, double G, int H, boolean I, int J,int K, int L)
    {
        this.Make = A;
        this.Name = B;
        this.Color = C;
        this.registrationNo = D;
        this.noOfWheels = E;
        this.Model = F;
        this.Fair = G;
        this.seatingCapacity = H;
        this.Status = I;
        this.Id = J;
        this.availableIn = K;
        this.driverAlloted = L;
    }
    
    public void registerNewCar(int A, String B, String C, String D, int E, int F, double G, int H, boolean I, int J,int K, int L)
    {
        this.Make = A;
        this.Name = B;
        this.Color = C;
        this.registrationNo = D;
        this.noOfWheels = E;
        this.Model = F;
        this.Fair = G;
        this.seatingCapacity = H;
        this.Status = I;
        this.Id = J;
        this.availableIn = K;
        this.driverAlloted = L;   
    }
    
    public Car()
    {
        this(0,null,null,null,0,0,0.0,0,true,0,0,0);
    }

    public int getMake()
    {
        return Make;
    }

    public String getName()
    {
        return Name;
    }

    public String getColor()
    {
        return Color;
    }

    public String getRegistrationNo()
    {
        return registrationNo;
    }

    public int getNoOfWheels()
    {
        return noOfWheels;
    }

    public int getModel()
    {
        return Model;
    }

    public double getFair()
    {
        return Fair;
    }

    public int getSeatingCapacity()
    {
        return seatingCapacity;
    }

    public boolean isStatus()
    {
        return Status;
    }

    public int getId()
    {
        return Id;
    }

    public int getAvailableIn()
    {
        return availableIn;
    }

    public int getDriverAlloted()
    {
        return driverAlloted;
    }

    public void setMake(int Make)
    {
        this.Make = Make;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void setColor(String Color)
    {
        this.Color = Color;
    }

    public void setRegistrationNo(String registrationNo)
    {
        this.registrationNo = registrationNo;
    }

    public void setNoOfWheels(int noOfWheels)
    {
        this.noOfWheels = noOfWheels;
    }

    public void setModel(int Model)
    {
        this.Model = Model;
    }

    public void setFair(double Fair)
    {
        this.Fair = Fair;
    }

    public void setSeatingCapacity(int seatingCapacity)
    {
        this.seatingCapacity = seatingCapacity;
    }

    public void setStatus(boolean Status)
    {
        this.Status = Status;
    }

    public void setId(int Id)
    {
        this.Id = Id;
    }

    public void setAvailableIn(int availableIn)
    {
        this.availableIn = availableIn;
    }

    public void setDriverAlloted(int driverAlloted)
    {
        this.driverAlloted = driverAlloted;
    }
}
