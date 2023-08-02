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
public abstract class Bookings
{
    public abstract boolean canBookNewCar(int A, int B);
    public abstract void bookNewCar(int A, int B);
    
    public abstract boolean canAllotDriver(int A);
    public abstract void allotDriver(int A, int B);
}
