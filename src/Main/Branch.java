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
public class Branch extends Bookings implements SignIn, Search, Registration, Availability
{
    private Administrator Admin = new Administrator();
    private User[] Users = new User[5];
    private Driver[] Drivers  = new Driver[5];
    private Car[] Cars = new Car[10];
    private int Id;
    private double Earnings;
    private int userCounter;
    private int carsCounter;
    private int driversCounter;

    public Administrator getAdmin()
    {
        return Admin;
    }

    public int getUserCounter()
    {
        return userCounter;
    }

    public int getCarsCounter()
    {
        return carsCounter;
    }

    public int getDriversCounter()
    {
        return driversCounter;
    }

    public void setAdmin(Administrator Admin)
    {
        this.Admin = Admin;
    }

    public void setUserCounter(int userCounter)
    {
        this.userCounter = userCounter;
    }

    public void setCarsCounter(int carsCounter)
    {
        this.carsCounter = carsCounter;
    }

    public void setDriversCounter(int driversCounter)
    {
        this.driversCounter = driversCounter;
    }
    
    public Branch()
    {
        Id = 0;
        Earnings = 0.0;
        userCounter = 0;
        carsCounter = 0;
        driversCounter = 0;
        initializeUsers();
        initializeDrivers();
        initializeCars();
    }
    
    public void initializeUsers()
    {
        for(int i=0;i<5;i++)
        {
            Users[i] = new User();
        }
    }
    
    public void initializeDrivers()
    {
        for(int i=0;i<5;i++)
        {
            Drivers[i] = new Driver();
        }
    }
    
    public void initializeCars()
    {
        for(int i=0;i<10;i++)
        {
            Cars[i] = new Car();
        }
    }

    public User[] getUsers()
    {
        return this.Users;
    }

    public Driver[] getDrivers()
    {
        return this.Drivers;
    }

    public Car[] getCars()
    {
        return this.Cars;
    }

    public void setUsers(User[] Users)
    {
        this.Users = Users;
    }

    public void setDrivers(Driver[] Drivers)
    {
        this.Drivers = Drivers;
    }

    public void setCars(Car[] Cars)
    {
        this.Cars = Cars;
    }
    
    public void setId(int Id)
    {
        this.Id = Id;
    }

    public void setEarnings(double Earnings)
    {
        this.Earnings = Earnings;
    }
    
    public int getId()
    {
        return this.Id;
    }

    public double getEarnings()
    {
        return this.Earnings;
    }
    
    public boolean signInUser(String A, int B)
    {
        boolean Status = false;
        for (int i=0;i<userCounter;i++)
        {
            if (Users[i].getUserName() == null ? A == null : Users[i].getUserName().equals(A))
            {
                if (Users[i].getPassword() == B)
                {
                    Status = true;
                    break;
                }
            }
        }
        return Status;
    }
    
    public boolean signInAdmin(String A, int B)
    {
        boolean Status = false;
        if (Admin.getUserName() == null ? A == null : Admin.getUserName().equals(A))
        {
            if (Admin.getPassword() == B)
            {
                Status = true;
            }
        }
        return Status;
    }
    
    public int userIndex(int A, String B)
    {
        int Index = 0;
        for (int i=0;i<userCounter;i++)
        {
            if (Users[i].getUserName() == null ? B == null : Users[i].getUserName().equals(B))
            {
                if (Users[i].getPassword() == A)
                {
                    Index = i;
                    break;
                }
            }
        }
        return Index;
    }
    
    public int searchUser(int A)
    {
        int Index = 0;
        for (int i=0;i<userCounter;i++)
        {
            if (Users[i].getId() == A)
            {
                Index = i;
                break;
            }
        }
        return Index;
    }
    
    public int searchUser(String A)
    {
        int Index = 0;
        for (int i=0;i<userCounter;i++)
        {
            if (Users[i].getUserName() == null ? A == null : Users[i].getUserName().equals(A))
            {
                Index = i;
                break;
            }
        }
        return Index;
    }
    
    public int searchCar(int B)
    {
        int Index = 0;
        for (int i=0;i<carsCounter;i++)
        {
            if (Cars[i].getId() == B)
            {
                Index = i;
                break;
            }
        }
        return Index;
    }
    
    public int searchCar(String B)
    {
        int Index = 0;
        for (int i=0;i<carsCounter;i++)
        {
            if (Cars[i].getName() == null ? B == null : Cars[i].getName().equals(B))
            {
                Index = i;
                break;
            }
        }
        return Index;
    }
    
    public int searchDrivers(int C)
    {
        int Index = 0;
        for (int i=0;i<driversCounter;i++)
        {
            if (Drivers[i].getId() == C)
            {
                Index = i;
                break;
            }
        }
        return Index;
    }
    
    public int searchDrivers(String C)
    {
        int Index = 0;
        for (int i=0;i<driversCounter;i++)
        {
            if (Drivers[i].getName() == null ? C == null : Drivers[i].getName().equals(C))
            {
                Index = i;
                break;                
            }
        }
        return Index;
    }
    
    public boolean registerNewUser()
    {
        if (userCounter<4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean registerNewCar()
    {
        if (carsCounter<9)
        {
            return true;
        }
        else
        {
            return false;
        }       
    }
    
    public boolean registerNewDriver()
    {
        if (driversCounter<4)
        {
            return true;
        }
        else
        {
            return false;
        }        
    }
    
    public void registerNewUser(String A, String B, int C, String D, String E, String F, int G, double H, String I, int J, boolean K)
    {
        Users[userCounter].registerNewUser(A, B, C, D, E, F, G, H, I, J, K);
        userCounter++;
    }
    
    public void registerNewDriver(String A, String B, int C, String D, String E, String F, boolean G, int H, float I)
    {
        Drivers[driversCounter].registerNewDriver(A, B, C, D, E, F, G, H, I);
        driversCounter++;
    }
    
    public void registerNewCar(int A, String B, String C, String D, int E, int F, double G, int H, boolean I, int J,int K, int L)
    {
        Cars[carsCounter].registerNewCar(A, B, C, D, E, F, G, H, I, J, K, L);
        carsCounter++;
    }
    
    public void deleteUser(int A)
    {
        userCounter--;
        Users[A].equals(null);
    }
    
    public void deleteDriver(int B)
    {
        driversCounter--;
        Drivers[B].equals(null);
    }
    
    public void deleteCar(int C)
    {
        carsCounter--;
        Cars[C].equals(null);
    }
    
    public boolean canBookNewCar(int A, int B)
    {
        boolean Status = false;
        if ( Users[A].getMoneyInCart() >= Cars[B].getFair() )
        {
            Status = true;
        }
        return Status;
    }
    
    public void bookNewCar(int A, int B)
    {
        Users[A].setCarIndex(Cars[B].getId());
    }
    
    public boolean canAllotDriver(int A)
    {
        boolean Status = false;        
        if ( Drivers[A].isStatus() )
        {
            Status = true;
        }
        return Status;
    }
    
    public void allotDriver(int A, int B)
    {
        Drivers[A].setCarAlloted(Cars[B].getId());
    }
    
    public int getCarsAvailable()
    {
        int Value = 0;
        for (int i=0;i<carsCounter;i++)
        {
            if (Cars[i].isStatus() == true)
            {
                Value++;
            }
        }
        return Value;
    }
    
    public int getDriversAvailable()
    {
        int Value = 0;
        for (int i=0;i<driversCounter;i++)
        {
            if (Drivers[i].isStatus() == true)
            {
                Value++;
            }
        }
        return Value;     
    }
    
    public boolean isSearchUser(int A)
    {
        boolean Status = false;
        for (int i=0;i<userCounter;i++)
        {
            if (Users[i].getId() == A)
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchUser(String A)
    {
        boolean Status = false;
        for (int i=0;i<userCounter;i++)
        {
            if (Users[i].getUserName() == null ? A == null : Users[i].getUserName().equals(A))
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchCar(int B)
    {
        boolean Status = false;
        for (int i=0;i<carsCounter;i++)
        {
            if (Cars[i].getId() == B)
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchCar(String B)
    {
        boolean Status = false;
        for (int i=0;i<carsCounter;i++)
        {
            if (Cars[i].getName() == null ? B == null : Cars[i].getName().equals(B))
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchDrivers(int C)
    {
        boolean Status = false;
        for (int i=0;i<driversCounter;i++)
        {
            if (Drivers[i].getId() == C)
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchDrivers(String C)
    {
        boolean Status = false;
        for (int i=0;i<driversCounter;i++)
        {
            if (Drivers[i].getName() == null ? C == null : Drivers[i].getName().equals(C))
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchCarByModel(int D)
    {
        boolean Status = false;
        for (int i=0;i<carsCounter;i++)
        {
            if (Cars[i].getModel() == D)
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchCarByName(String D)
    {
        boolean Status = false;
        for (int i=0;i<carsCounter;i++)
        {
            if (Cars[i].getName() == null ? D == null : Cars[i].getName().equals(D))
            {
                Status = true;
                break;
            }
        }
        return Status;     
    }
    
    public boolean isSearchCarByColor(String D)
    {
        boolean Status = false;
        for (int i=0;i<carsCounter;i++)
        {
            if (Cars[i].getColor() == null ? D == null : Cars[i].getName().equals(D))
            {
                Status = true;
                break;
            }
        }
        return Status;     
    }
}