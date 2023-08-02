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
public interface Search
{
    public int searchUser(int A);
    public int searchUser(String A);
    
    public boolean isSearchUser(int A);
    public boolean isSearchUser(String A);
    
    public int searchCar(int B);
    public int searchCar(String B);
    
    public boolean isSearchCar(int B);
    public boolean isSearchCar(String B);
    
    public int searchDrivers(int C);
    public int searchDrivers(String C);
    
    public boolean isSearchDrivers(int C);
    public boolean isSearchDrivers(String C);
    
    public boolean isSearchCarByModel(int D);
    public boolean isSearchCarByName(String D);
    public boolean isSearchCarByColor(String D);
}
