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
public class Person
{
    private String Name;
    private String bloodGroup;
    private int Id;
    private String Nationality;
    private String Address;
    
    protected Person(String A, String B, int C, String D, String E)
    {
        this.Name = A;
        this.bloodGroup = B;
        this.Id = C;
        this.Nationality = D;
        this.Address = E;
    } 
    protected Person()
    {
        this(null,null,0,null,null);
    }

    public String getName()
    {
        return Name;
    }

    public String getBloodGroup()
    {
        return bloodGroup;
    }

    public int getId()
    {
        return Id;
    }

    public String getNationality()
    {
        return Nationality;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void setBloodGroup(String bloodGroup)
    {
        this.bloodGroup = bloodGroup;
    }

    public void setId(int Id)
    {
        this.Id = Id;
    }

    public void setNationality(String Nationality)
    {
        this.Nationality = Nationality;
    }

    public void setAddress(String Address)
    {
        this.Address = Address;
    }
}
