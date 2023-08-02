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
public interface SignIn
{
    public boolean signInUser(String A, int B);
    public boolean signInAdmin(String A, int B);
    
    public int userIndex(int A, String B);
}
