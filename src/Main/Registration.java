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
public interface Registration
{
    public boolean registerNewUser();
    public boolean registerNewCar();
    public boolean registerNewDriver();
    
    public void registerNewUser(String A, String B, int C, String D, String E, String F, int G, double H, String I, int J, boolean K);
    public void registerNewDriver(String A, String B, int C, String D, String E, String F, boolean G, int H, float I);
    public void registerNewCar(int A, String B, String C, String D, int E, int F, double G, int H, boolean I, int J,int K, int L);
    
    public void deleteUser(int A);
    public void deleteDriver(int B);
    public void deleteCar(int C);
}
