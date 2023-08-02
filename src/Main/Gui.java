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

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Gui
{
    private static JFrame Frame1 = new JFrame("- Dollar Rent A Car & Services -");
    private static JPanel Panel1 = new JPanel();
    private static ImageIcon Image1 = new ImageIcon("D:\\NetBeansProjects\\JavaApplication19\\Images\\001.jpg");
    private static JLabel Label1 = new JLabel();
    private static JPanel Panel2 = new JPanel();
    private static ImageIcon Image2 = new ImageIcon("D:\\NetBeansProjects\\JavaApplication19\\Images\\002.jpg");
    private static JLabel Label2 = new JLabel();
    private static JPanel Panel3 = new JPanel();
    private static ImageIcon Image3 = new ImageIcon("D:\\NetBeansProjects\\JavaApplication19\\Images\\003.jpg");
    private static JLabel Label3 = new JLabel();
    private static JTextField Field1 = new JTextField();
    private static JPasswordField Field2 = new JPasswordField();
    private static JButton Button1 = new JButton("Sign In");
    private static JPanel Panel4 = new JPanel();
    private static JLabel Label4 = new JLabel();
    private static ImageIcon Image4 = new ImageIcon("D:\\NetBeansProjects\\JavaApplication19\\Images\\004.jpg");
    private static JLabel Label5 = new JLabel();
    private static JLabel Label6 = new JLabel();
    private static JLabel Label7 = new JLabel();
    private static JLabel Label8 = new JLabel();
    private static JLabel Label9 = new JLabel();
    private static JLabel Label10 = new JLabel();
    private static JLabel Label11 = new JLabel();
    private static JLabel Label12 = new JLabel();
    private static JTextField Field3 = new JTextField();
    private static JButton Button2 = new JButton("Search User");
    private static JTextField Field4 = new JTextField();
    private static JButton Button3 = new JButton("Search Car");
    private static JTextField Field5 = new JTextField();
    private static JButton Button4 = new JButton("Search Driver");
    private static JLabel Label13 = new JLabel("Enter username to search");
    private static JTextField Field6 = new JTextField();
    private static JButton Button5 = new JButton("Search User");
    private static JButton Button6 = new JButton("Search Car");
    private static JButton Button7 = new JButton("Search Driver");
    private static JLabel Label14 = new JLabel("Enter valid id to search: ");
    private static JButton Button8 = new JButton("Add User");
    private static JButton Button9 = new JButton("Edit User");
    private static JButton Button10 = new JButton("Delete User");
    private static JButton Button11 = new JButton("Add Car");
    private static JButton Button12 = new JButton("Edit Car");
    private static JButton Button13 = new JButton("Delete Car");
    private static JButton Button14 = new JButton("Add Driver");
    private static JButton Button15 = new JButton("Edit Driver");
    private static JButton Button16 = new JButton("Delete Driver");
    private static JLabel Label15 = new JLabel("-- Click any button above as specified in the field --");
    private static JButton Button17 = new JButton("Sign out");
    private static JPanel Panel5 = new JPanel();
    private static JLabel Label16 = new JLabel();
    private static JTextField Field7 = new JTextField();
    private static JPasswordField Field8 = new JPasswordField();
    private static JButton Button18 = new JButton("Sign In");
    private static JPanel Panel6 = new JPanel();
    private static JLabel Label17 = new JLabel();
    private static ImageIcon Image5 = new ImageIcon("D:\\NetBeansProjects\\JavaApplication19\\Images\\005.jpg");
    private static JLabel Label18 = new JLabel();
    private static JLabel Label19 = new JLabel();
    private static JLabel Label20 = new JLabel();
    private static JLabel Label21 = new JLabel();
    private static JLabel Label22 = new JLabel();
    private static JLabel Label23 = new JLabel();
    private static JLabel Label24 = new JLabel();
    private static JLabel Label25 = new JLabel();
    private static JTextField Field9 = new JTextField();
    private static JButton Button19 = new JButton("Search Model");
    private static JTextField Field10 = new JTextField();
    private static JButton Button20 = new JButton("Search Name");
    private static JTextField Field11 = new JTextField();
    private static JButton Button21 = new JButton("Search Color");
    private static JLabel Label26 = new JLabel("Input the fields to search cars available.");
    private static JButton Button22 = new JButton("View all cars");
    private static JButton Button23 = new JButton("Book a car");
    private static JButton Button24 = new JButton("Update cart");
    private static JButton Button25 = new JButton("Sign out");
    private static JLabel Label27 = new JLabel("Select any option from above menu.");
    
    public static void main(String[] Args)
    {
        Gui mainGui = new Gui();
        mainGui.initializeGui();
        Main.Branch.setId(135);
        Main.Branch.setAdmin(new Administrator());
        Main.Branch.getAdmin().setUserName("R");
        Main.Branch.getAdmin().setName("Fazal Ur Rahman");
        Main.Branch.setId(1350);
        Main.Branch.getAdmin().setPassword(1);
        Main.Branch.setEarnings(21500.00);
        
        Main.Branch.setUserCounter(Main.Branch.getUserCounter()+1);
        Main.Branch.getUsers()[0].setName("Muhammad Ali");
        Main.Branch.getUsers()[0].setAddress("55, Islamabad");
        Main.Branch.getUsers()[0].setBloodGroup("B+");
        Main.Branch.getUsers()[0].setBranchCode(135);
        Main.Branch.getUsers()[0].setId(001);
        Main.Branch.getUsers()[0].setMoneyInCart(1250.05);
        Main.Branch.getUsers()[0].setUserName("Ali");
        Main.Branch.getUsers()[0].setPassword(12345);
        Main.Branch.getUsers()[0].setLicenseNo("12345-PAK");
        Main.Branch.getUsers()[0].setNationality("Pakistani");
        
        Main.Branch.setDriversCounter(Main.Branch.getDriversCounter()+1);
        Main.Branch.getDrivers()[0].setAddress("Sector Golra More");
        Main.Branch.getDrivers()[0].setBloodGroup("O-");
        Main.Branch.getDrivers()[0].setAvailableIn(0.0F);
        Main.Branch.getDrivers()[0].setCarAlloted(0);
        Main.Branch.getDrivers()[0].setStatus(true);
        Main.Branch.getDrivers()[0].setId(001);
        Main.Branch.getDrivers()[0].setLicenseNo("9910-PKR");
        Main.Branch.getDrivers()[0].setNationality("United Kingdom");
        Main.Branch.getDrivers()[0].setName("Naaif Sharaf");
        
        Main.Branch.setCarsCounter(Main.Branch.getCarsCounter()+1);
        Main.Branch.getCars()[0].setAvailableIn(0);
        Main.Branch.getCars()[0].setColor("Red");
        Main.Branch.getCars()[0].setDriverAlloted(0);
        Main.Branch.getCars()[0].setFair(250);
        Main.Branch.getCars()[0].setId(001);
        Main.Branch.getCars()[0].setMake(2006);
        Main.Branch.getCars()[0].setModel(2010);
        Main.Branch.getCars()[0].setName("Cultus");
        Main.Branch.getCars()[0].setNoOfWheels(4);
        Main.Branch.getCars()[0].setRegistrationNo("SB-135");
        Main.Branch.getCars()[0].setSeatingCapacity(4);
        Main.Branch.getCars()[0].setStatus(true);
        
    }
    
    private void initializeGui()
    {        
        Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame1.setBounds(300, 100, 805, 525);
        Frame1.setResizable(false);
        Frame1.setLayout(null);
        
        Label1.setIcon(Image1);
        Label1.setBounds(0, 0, 800, 500);
        Label1.setFocusable(true);
        Label1.addKeyListener
        (
            new KeyListener()
            {
                @Override
                public void keyTyped(KeyEvent Ke)
                {
                    //Nothing here
                }

                @Override
                public void keyPressed(KeyEvent Ke)
                {
                    if (Ke.getKeyChar() == '1')
                    {
                        Panel1.setVisible(false);
                        Frame1.setSize(300, 425);
                        Frame1.setTitle("User/Admin Panel");
                        Panel2.setVisible(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent Ke)
                {
                    //Nothing here
                }
            }
        );
        
        Panel1.setLayout(null);
        Panel1.setBounds(0, 0, 800, 500);
        Panel1.add(Label1);
        Frame1.add(Panel1);
        
        Panel2.setLayout(null);
        Panel2.setBounds(0, 0, 300, 400);
        Label2.setBounds(0, 0, 300, 400);
        Label2.setIcon(Image2);
        Label2.setFocusable(true);
        Label2.addKeyListener
        (
            new KeyListener()
            {
                @Override
                public void keyTyped(KeyEvent Ke)
                {
                    //Nothing here
                }

                @Override
                public void keyPressed(KeyEvent Ke)
                {
                    if (Ke.getKeyChar() == '1')
                    {
                        Panel2.setVisible(false);
                        Frame1.setSize(300, 425);
                        Panel3.setVisible(true);             
                    }
                    else if (Ke.getKeyChar() == '2')
                    {
                        Panel2.setVisible(false);
                        Panel5.setVisible(true);
                        Frame1.setSize(300, 425);                  
                    }
                }

                @Override
                public void keyReleased(KeyEvent Ke)
                {
                    //Nothing here
                }
            }
        );
        Panel2.add(Label2);
        Frame1.add(Panel2);
        
        Panel3.setLayout(null);
        Panel3.setVisible(false);
        Button1.setBounds(100, 175, 102, 20);
        Button1.setFont(new Font("Century Gothic", Font.BOLD, 12));
        Button1.addActionListener
        (   new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent Ae)
                {
                    if ( Field1.getText().isEmpty() || Field2.getText().isEmpty() )
                    {
                        JOptionPane.showMessageDialog(Panel3, "Please enter valid input values!");
                        Field1.setText(null);
                        Field2.setText(null);                 
                    }
                    else if ( Main.Branch.signInAdmin(Field1.getText(), Integer.parseInt(Field2.getText())) )
                    {
                        JOptionPane.showMessageDialog(Panel3, "Signed In Successsfully");
                        Panel3.setVisible(false);
                        Frame1.setTitle("- Administrator Menu -");
                        Frame1.setBounds(200, 50, 600, 610);
                        Label5.setText("Name: " + Main.Branch.getAdmin().getName());
                        Label6.setText("Branch Id: " + Main.Branch.getId());
                        Label7.setText("Total Earnings: " + Main.Branch.getEarnings());
                        Label8.setText("Total Users: " + Main.Branch.getUserCounter());
                        Label9.setText("Total Drivers: " + Main.Branch.getDriversCounter());
                        Label10.setText("Total Cars: " + Main.Branch.getCarsCounter());
                        Label11.setText("Cars Available: " + Main.Branch.getCarsAvailable());
                        Label12.setText("Drivers available: " + Main.Branch.getDriversAvailable());
                        Panel4.setVisible(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(Panel3, "Invalid Username/Password");
                        Field1.setText(null);
                        Field2.setText(null);
                    }
                }
            }
        );
        Panel3.add(Button1);       
        Label3.setBounds(0, 0, 300, 400);
        Label3.setIcon(Image3);
        Panel3.add(Label3);
        Panel3.setBounds(0, 0, 300, 400);
        Field1.setBounds(100, 60, 102, 20);
        Panel3.add(Field1);
        Field2.setBounds(100, 110, 102, 20);
        Panel3.add(Field2);
        Frame1.add(Panel3);
        
        Panel4.setLayout(null);
        Panel4.setBounds(0, 0, 600, 600);        
        Label4.setBounds(0, 0, 600, 600);
        Label4.setIcon(Image4);
        
        Label5.setBounds(420, 70, 500, 10);
        Label6.setBounds(420, 90, 500, 10);
        Label7.setBounds(420, 110, 500, 10);
        Label8.setBounds(420, 130, 500, 10);
        Label9.setBounds(420, 150, 500, 10);
        Label10.setBounds(420, 170, 500, 10);
        Label11.setBounds(420, 190, 500, 10);
        Label12.setBounds(420, 210, 500, 10);
        Field3.setBounds(420, 280, 150, 25);
        Button2.setBounds(420, 310, 149, 20);
        Field4.setBounds(420, 340, 150, 25);
        Button3.setBounds(420, 370, 149, 20);
        Field5.setBounds(420, 410, 150, 25);
        Button4.setBounds(420, 440, 149, 20);
        Label13.setBounds(420, 470, 500, 10);
        Field6.setBounds(170, 350, 119, 20);
        Button5.setBounds(15, 380, 120, 20);
        Button6.setBounds(130, 380, 120, 20);
        Button7.setBounds(250, 380, 120, 20);
        Label14.setBounds(30, 353, 500, 10);
        Button8.setBounds(20, 70, 120, 30);
        Button9.setBounds(20, 140, 120, 30);
        Button10.setBounds(20, 210, 120, 30);
        Button11.setBounds(135, 70, 120, 30);
        Button12.setBounds(135, 140, 120, 30);
        Button13.setBounds(135, 210, 120, 30);
        Button14.setBounds(250, 70, 120, 30);
        Button15.setBounds(250, 140, 120, 30);
        Button16.setBounds(250, 210, 120, 30);
        Label15.setBounds(50, 250, 300, 20);
        Button17.setBounds(410, 515, 80, 20);
        
        Panel4.add(Label5);
        Panel4.add(Label6);
        Panel4.add(Label7);
        Panel4.add(Label8);
        Panel4.add(Label9);
        Panel4.add(Label10);
        Panel4.add(Label11);
        Panel4.add(Label12);
        Panel4.add(Field3);
        Panel4.add(Button2);
        Panel4.add(Field5);
        Panel4.add(Button4);
        Panel4.add(Label13);
        Panel4.add(Field6);
        Panel4.add(Button5);
        Panel4.add(Button6);
        Panel4.add(Button7);
        Panel4.add(Label14);
        Panel4.add(Button8);
        Panel4.add(Button9);
        Panel4.add(Button10);
        Panel4.add(Button11);
        Panel4.add(Button12);
        Panel4.add(Button13);
        Panel4.add(Button14);
        Panel4.add(Button15);
        Panel4.add(Button16);
        Panel4.add(Label15);
        Panel4.add(Button17);
        
        Button2.addActionListener
        (
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent Ae)
                {
                    if (Field3.getText().isEmpty() || Field3.getText().equals(" "))
                    {
                        JOptionPane.showMessageDialog(Panel4, "Please enter valid search option!");
                        Field3.setText(null);
                    }
                    else
                    {
                        if (Main.Branch.isSearchUser(Field3.getText()))
                        {
                            JOptionPane.showMessageDialog(Panel4, "Found match for the entry");
                            int Index = Main.Branch.searchUser(Field3.getText());
                            JOptionPane.showMessageDialog(Panel4, "Username: " + Main.Branch.getUsers()[Index].getUserName() + "\nBlood group: " + Main.Branch.getUsers()[Index].getBloodGroup() + "\nId: " + Main.Branch.getUsers()[Index].getId() + "\nFull Name: " + Main.Branch.getUsers()[Index].getName() + "\nNationality: " + Main.Branch.getUsers()[Index].getNationality() + "\nLicense no: " + Main.Branch.getUsers()[Index].getLicenseNo() + "\nBranch code: " + Main.Branch.getUsers()[Index].getBranchCode() + "\nMoney In Cart: " + Main.Branch.getUsers()[Index].getMoneyInCart() + "\nAddress: " + Main.Branch.getUsers()[Index].getAddress());      
                            Field3.setText(null);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel4, "No match for the entry");
                            Field3.setText(null);
                        }
                    }
                }
            }
        );
        Button3.addActionListener
        (
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent Ae)
                {
                    if (Field4.getText().isEmpty() || Field4.getText().equals(" "))
                    {
                        JOptionPane.showMessageDialog(Panel4, "Please enter valid search option!");
                        Field4.setText(null);
                    }
                    else
                    {
                        if (Main.Branch.isSearchCar(Field4.getText()))
                        {
                            JOptionPane.showMessageDialog(Panel4, "Found match for the entry");
                            int Index = Main.Branch.searchCar(Field4.getText());
                            JOptionPane.showMessageDialog(Panel4, "Make: " + Main.Branch.getCars()[Index].getMake() + "\nColor: " + Main.Branch.getCars()[Index].getColor() + "\nModel: " + Main.Branch.getCars()[Index].getModel() + "\nRegistration no: " + Main.Branch.getCars()[Index].getRegistrationNo() + "\nNo of wheels: " + Main.Branch.getCars()[Index].getNoOfWheels() + "\nName: " + Main.Branch.getCars()[Index].getName() + "\nFair: " + Main.Branch.getCars()[Index].getFair() + "\nSeating capacity: " + Main.Branch.getCars()[Index].getSeatingCapacity() + "\nStatus: " + Main.Branch.getCars()[Index].isStatus() + "\nId: " + Main.Branch.getCars()[Index].getId() + "\nAvailable in: " + Main.Branch.getCars()[Index].getAvailableIn() + "\nDriver alloted: " + Main.Branch.getDrivers()[Main.Branch.getCars()[Index].getDriverAlloted()].getName());
                            Field4.setText(null);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel4, "No match for the entry");
                            Field4.setText(null);
                        }
                    }
                }
            }
        );
        Button4.addActionListener
        (
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent Ae)
                {
                    if (Field5.getText().isEmpty() || Field5.getText().equals(" "))
                    {
                        JOptionPane.showMessageDialog(Panel4, "Please enter valid search option!");
                        Field5.setText(null);
                    }
                    else
                    {
                        if (Main.Branch.isSearchDrivers(Field5.getText()))
                        {
                            JOptionPane.showMessageDialog(Panel4, "Found match for the entry");
                            int Index = Main.Branch.searchCar(Field5.getText());
                            JOptionPane.showMessageDialog(Panel4, "Name: " + Main.Branch.getDrivers()[Index].getName() + "\nAddress: " + Main.Branch.getDrivers()[Index].getAddress() + "\nLicense no: " + Main.Branch.getDrivers()[Index].getLicenseNo() + "\nStatus: " + Main.Branch.getDrivers()[Index].isStatus() + "\nId: " + Main.Branch.getDrivers()[Index].getId() + "\nAvailable in: " + Main.Branch.getDrivers()[Index].getAvailableIn() + "\nCar alloted: " + Main.Branch.getCars()[Main.Branch.getDrivers()[Index].getCarAlloted()].getId() + "\nBlood group: " + Main.Branch.getDrivers()[Index].getBloodGroup() + "\nNationality: " + Main.Branch.getDrivers()[Index].getNationality());
                            Field5.setText(null);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel4, "No match for the entry");
                            Field5.setText(null);
                        }
                    }
                }
            }
        );
        Button5.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        if (Field6.getText().isEmpty() || Field6.getText().equals(" "))
                        {
                            JOptionPane.showMessageDialog(Panel4, "Please enter valid search option!");
                            Field6.setText(null);
                        }
                        else
                        {
                            if (Main.Branch.isSearchUser(Integer.parseInt(Field6.getText())))
                            {
                                JOptionPane.showMessageDialog(Panel4, "Found match for the entry");
                                int Index = Main.Branch.searchUser(Integer.parseInt(Field6.getText()));
                                JOptionPane.showMessageDialog(Panel4, "Username: " + Main.Branch.getUsers()[Index].getUserName() + "\nBlood group: " + Main.Branch.getUsers()[Index].getBloodGroup() + "\nId: " + Main.Branch.getUsers()[Index].getId() + "\nFull Name: " + Main.Branch.getUsers()[Index].getName() + "\nNationality: " + Main.Branch.getUsers()[Index].getNationality() + "\nLicense no: " + Main.Branch.getUsers()[Index].getLicenseNo() + "\nBranch code: " + Main.Branch.getUsers()[Index].getBranchCode() + "\nMoney In Cart: " + Main.Branch.getUsers()[Index].getMoneyInCart() + "\nAddress: " + Main.Branch.getUsers()[Index].getAddress());      
                                Field6.setText(null);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(Panel4, "No match for the entry");
                                Field6.setText(null);
                            }
                        }                    
                    }
                }
        );
        Button6.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        if (Field6.getText().isEmpty() || Field6.getText().equals(" "))
                        {
                            JOptionPane.showMessageDialog(Panel4, "Please enter valid search option!");
                            Field6.setText(null);
                        }
                        else
                        {
                            if (Main.Branch.isSearchCar(Integer.parseInt(Field6.getText())))
                            {
                                JOptionPane.showMessageDialog(Panel4, "Found match for the entry");
                                int Index = Main.Branch.searchCar(Integer.parseInt(Field6.getText()));
                                JOptionPane.showMessageDialog(Panel4, "Make: " + Main.Branch.getCars()[Index].getMake() + "\nColor: " + Main.Branch.getCars()[Index].getColor() + "\nModel: " + Main.Branch.getCars()[Index].getModel() + "\nRegistration no: " + Main.Branch.getCars()[Index].getRegistrationNo() + "\nNo of wheels: " + Main.Branch.getCars()[Index].getNoOfWheels() + "\nName: " + Main.Branch.getCars()[Index].getName() + "\nFair: " + Main.Branch.getCars()[Index].getFair() + "\nSeating capacity: " + Main.Branch.getCars()[Index].getSeatingCapacity() + "\nStatus: " + Main.Branch.getCars()[Index].isStatus() + "\nId: " + Main.Branch.getCars()[Index].getId() + "\nAvailable in: " + Main.Branch.getCars()[Index].getAvailableIn() + "\nDriver alloted: " + Main.Branch.getDrivers()[Main.Branch.getCars()[Index].getDriverAlloted()].getName());
                                Field6.setText(null);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(Panel4, "No match for the entry");
                                Field6.setText(null);
                            }
                        }               
                    }
                }
        );
        Button7.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        if (Field6.getText().isEmpty() || Field6.getText().equals(" "))
                        {
                            JOptionPane.showMessageDialog(Panel4, "Please enter valid search option!");
                            Field6.setText(null);
                        }
                        else
                        {
                            if (Main.Branch.isSearchDrivers(Integer.parseInt(Field6.getText())))
                            {
                                JOptionPane.showMessageDialog(Panel4, "Found match for the entry");
                                int Index = Main.Branch.searchDrivers(Integer.parseInt(Field6.getText()));
                                JOptionPane.showMessageDialog(Panel4, "Name: " + Main.Branch.getDrivers()[Index].getName() + "\nAddress: " + Main.Branch.getDrivers()[Index].getAddress() + "\nLicense no: " + Main.Branch.getDrivers()[Index].getLicenseNo() + "\nStatus: " + Main.Branch.getDrivers()[Index].isStatus() + "\nId: " + Main.Branch.getDrivers()[Index].getId() + "\nAvailable in: " + Main.Branch.getDrivers()[Index].getAvailableIn() + "\nCar alloted: " + Main.Branch.getCars()[Main.Branch.getDrivers()[Index].getCarAlloted()].getId() + "\nBlood group: " + Main.Branch.getDrivers()[Index].getBloodGroup() + "\nNationality: " + Main.Branch.getDrivers()[Index].getNationality());
                                Field6.setText(null);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(Panel4, "No match for the entry");
                                Field6.setText(null);
                            }
                        }               
                    }
                }
        );
        Button8.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setUserName(JOptionPane.showInputDialog(Panel4,"Enter username of new user:"));
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setAddress(JOptionPane.showInputDialog(Panel4,"Enter address of user:"));
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setBillPayed(true);
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setBloodGroup(JOptionPane.showInputDialog(Panel4,"Enter blood group of user:"));
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setId(Main.Branch.getUserCounter()+1);
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setBranchCode(135);
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setCarIndex(0);
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setLicenseNo(JOptionPane.showInputDialog(Panel4,"Enter license no. of user:"));
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setMoneyInCart(Double.parseDouble(JOptionPane.showInputDialog(Panel4,"Add money to your cart:")));
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setName(JOptionPane.showInputDialog(Panel4,"Enter full name of new user:"));
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setNationality(JOptionPane.showInputDialog(Panel4,"Enter nationality of new user:"));
                        Main.Branch.getUsers()[Main.Branch.getUserCounter()].setPassword(Integer.parseInt(JOptionPane.showInputDialog(Panel4,"Enter password of new user:")));
                        Main.Branch.setUserCounter(Main.Branch.getUserCounter()+1);
                        JOptionPane.showMessageDialog(Panel4, "New user created successfully.");
                    }
                }
        );
        Button9.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        String A = null;
                        A = JOptionPane.showInputDialog(Panel4,"Enter username to edit: ");
                        if (Main.Branch.isSearchUser(A))
                        {
                            {
                                JOptionPane.showConfirmDialog(Panel4, "Do you want to edit: ");
                                int Index = Main.Branch.searchUser(A);
                                
                                Main.Branch.getUsers()[Index].setUserName(JOptionPane.showInputDialog(Panel4,"Enter username to update:"));
                                Main.Branch.getUsers()[Index].setAddress(JOptionPane.showInputDialog(Panel4,"Enter address to update:"));
                                Main.Branch.getUsers()[Index].setBillPayed(true);
                                Main.Branch.getUsers()[Index].setBloodGroup(JOptionPane.showInputDialog(Panel4,"Enter blood group to update::"));
                                Main.Branch.getUsers()[Index].setBranchCode(135);
                                Main.Branch.getUsers()[Index].setCarIndex(0);
                                Main.Branch.getUsers()[Index].setLicenseNo(JOptionPane.showInputDialog(Panel4,"Enter license no. to update:"));
                                Main.Branch.getUsers()[Index].setMoneyInCart(Double.parseDouble(JOptionPane.showInputDialog(Panel4,"Update money in cart:")));
                                Main.Branch.getUsers()[Index].setName(JOptionPane.showInputDialog(Panel4,"Enter full name to update:"));
                                Main.Branch.getUsers()[Index].setNationality(JOptionPane.showInputDialog(Panel4,"Enter nationality to update:"));
                                Main.Branch.getUsers()[Index].setPassword(Integer.parseInt(JOptionPane.showInputDialog(Panel4,"Enter password to update:")));
                                JOptionPane.showMessageDialog(Panel4, "User updated successfully.");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel4, "Sorry! No user found.");                            
                        }
                    }
                }
        );
        Button10.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        String A = null;
                        A = JOptionPane.showInputDialog(Panel4,"Enter username to edit: ");
                        if (Main.Branch.isSearchUser(A))
                        {
                            {
                                JOptionPane.showConfirmDialog(Panel4, "Do you want to delete: ");
                                int Index = Main.Branch.searchUser(A);
                                Main.Branch.getUsers()[Index].equals(null);
                                Main.Branch.setUserCounter(Main.Branch.getUserCounter()-1);
                                JOptionPane.showMessageDialog(Panel4, "User deleted successfully.");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel4, "Sorry! No user found.");                            
                        }
                    }
                }
        );
        Button11.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setAvailableIn(0);
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setColor(JOptionPane.showInputDialog(Panel4,"Enter color of car: "));
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setDriverAlloted(0);
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setFair(Double.parseDouble(JOptionPane.showInputDialog(Panel4,"Enter fair for car: ")));
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setId(Main.Branch.getCarsCounter()+1);
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setMake(Integer.parseInt(JOptionPane.showInputDialog(Panel4,"Enter make of the car: ")));
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setModel(Integer.parseInt(JOptionPane.showInputDialog(Panel4,"Enter model of the car: ")));
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setName(JOptionPane.showInputDialog(Panel4,"Enter name of the car: "));
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setNoOfWheels(Integer.parseInt(JOptionPane.showInputDialog(Panel4,"Enter no. of wheels: ")));
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setRegistrationNo(JOptionPane.showInputDialog(Panel4,"Enter registration no. of the car: "));
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setSeatingCapacity(Integer.parseInt(JOptionPane.showInputDialog(Panel4,"Enter seating capasity of car: ")));
                        Main.Branch.getCars()[Main.Branch.getCarsCounter()].setStatus(true);
                        Main.Branch.setCarsCounter(Main.Branch.getCarsCounter()+1);
                        JOptionPane.showMessageDialog(Panel4, "New car created successfully.");
                    }
                }
        );
        Button12.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        String A = null;
                        A = JOptionPane.showInputDialog(Panel4,"Enter car name to edit: ");
                        if (Main.Branch.isSearchCar(A))
                        {
                            {
                                JOptionPane.showConfirmDialog(Panel4, "Do you want to edit: ");
                                int Index = Main.Branch.searchCar(A);
                                
                                Main.Branch.getCars()[Index].setAvailableIn(0);
                                Main.Branch.getCars()[Index].setColor(JOptionPane.showInputDialog(Panel4,"Enter color of car: "));
                                Main.Branch.getCars()[Index].setDriverAlloted(0);
                                Main.Branch.getCars()[Index].setFair(Double.parseDouble(JOptionPane.showInputDialog(Panel4,"Enter fair for car: ")));
                                Main.Branch.getCars()[Index].setMake(Integer.parseInt(JOptionPane.showInputDialog(Panel4,"Enter make of the car: ")));
                                Main.Branch.getCars()[Index].setModel(Integer.parseInt(JOptionPane.showInputDialog(Panel4,"Enter model of the car: ")));
                                Main.Branch.getCars()[Index].setName(JOptionPane.showInputDialog(Panel4,"Enter name of the car: "));
                                Main.Branch.getCars()[Index].setNoOfWheels(Integer.parseInt(JOptionPane.showInputDialog(Panel4,"Enter no. of wheels: ")));
                                Main.Branch.getCars()[Index].setRegistrationNo(JOptionPane.showInputDialog(Panel4,"Enter registration no. of the car: "));
                                Main.Branch.getCars()[Index].setSeatingCapacity(Integer.parseInt(JOptionPane.showInputDialog(Panel4,"Enter seating capasity of car: ")));
                                Main.Branch.getCars()[Index].setStatus(true);
                                JOptionPane.showMessageDialog(Panel4, "Car updated successfully.");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel4, "Sorry! No car found.");                            
                        }
                    }
                }
        );
        Button13.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        String A = null;
                        A = JOptionPane.showInputDialog(Panel4,"Enter name to delete: ");
                        if (Main.Branch.isSearchCar(A))
                        {
                            {
                                JOptionPane.showConfirmDialog(Panel4, "Do you want to delete: ");
                                int Index = Main.Branch.searchCar(A);
                                Main.Branch.getCars()[Index].equals(null);
                                Main.Branch.setCarsCounter(Main.Branch.getCarsCounter()-1);
                                JOptionPane.showMessageDialog(Panel4, "Car deleted successfully.");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel4, "Sorry! No car found.");                       
                        }
                    }
                }
        );
        Button14.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setAddress(JOptionPane.showInputDialog(Panel4, "Enter address of driver: "));
                        Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setAvailableIn(0.0F);
                        Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setBloodGroup(JOptionPane.showInputDialog(Panel4, "Enter blood group of driver: "));
                        Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setCarAlloted(0);
                        Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setId(Main.Branch.getDriversCounter()+1);
                        Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setLicenseNo(JOptionPane.showInputDialog(Panel4, "Enter license no. of driver: "));
                        Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setName(JOptionPane.showInputDialog(Panel4, "Enter name of driver: "));
                        Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setNationality(JOptionPane.showInputDialog(Panel4, "Enter nationality of driver: "));
                        Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setStatus(true);                      
                        Main.Branch.setDriversCounter(Main.Branch.getDriversCounter()+1);
                        JOptionPane.showMessageDialog(Panel4, "New driver created successfully.");
                    }
                }
        );
        Button15.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        String A = null;
                        A = JOptionPane.showInputDialog(Panel4,"Enter driver name to edit: ");
                        if (Main.Branch.isSearchCar(A))
                        {
                            {
                                JOptionPane.showConfirmDialog(Panel4, "Do you want to edit: ");
                                int Index = Main.Branch.searchDrivers(A);
                                
                                Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setAddress(JOptionPane.showInputDialog(Panel4, "Enter address of driver: "));
                                Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setAvailableIn(0.0F);
                                Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setBloodGroup(JOptionPane.showInputDialog(Panel4, "Enter blood group of driver: "));
                                Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setCarAlloted(0);
                                Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setLicenseNo(JOptionPane.showInputDialog(Panel4, "Enter license no. of driver: "));
                                Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setName(JOptionPane.showInputDialog(Panel4, "Enter name of driver: "));
                                Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setNationality(JOptionPane.showInputDialog(Panel4, "Enter nationality of driver: "));
                                Main.Branch.getDrivers()[Main.Branch.getDriversCounter()].setStatus(true);                                
                                JOptionPane.showMessageDialog(Panel4, "Driver updated successfully.");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel4, "Sorry! No driver found.");                            
                        }
                    }
                }
        );
        Button16.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        String A = null;
                        A = JOptionPane.showInputDialog(Panel4,"Enter name to delete: ");
                        if (Main.Branch.isSearchDrivers(A))
                        {
                            {
                                JOptionPane.showConfirmDialog(Panel4, "Do you want to delete: ");
                                int Index = Main.Branch.searchDrivers(A);
                                Main.Branch.getDrivers()[Index].equals(null);
                                Main.Branch.setDriversCounter(Main.Branch.getDriversCounter()-1);
                                JOptionPane.showMessageDialog(Panel4, "Driver deleted successfully.");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel4, "Sorry! No driver found.");                       
                        }
                    }
                }
        );
        Button17.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        Panel2.setVisible(true);
                        Panel4.setVisible(false);
                        Panel3.setVisible(false);
                        Panel1.setVisible(false);
                        Panel5.setVisible(false);
                        Frame1.setSize(300, 425);
                    }
                }
        );
        Panel4.add(Field4);
        Panel4.add(Button3);        
        Panel4.add(Label4);
        
        Panel4.setVisible(false);
        Frame1.add(Panel4);
        
        Panel5.setLayout(null);
        Panel5.setBounds(0, 0, 300, 400);
        Label16.setBounds(0, 0, 300, 400);
        Label16.setIcon(Image3);
        Field7.setBounds(100, 60, 102, 20);
        Field8.setBounds(100, 110, 102, 20);
        Button18.setBounds(100, 175, 102, 20);
        Button18.setFont(new Font("Century Gothic", Font.BOLD, 12));
        
        Button18.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        {
                            if ( Field7.getText().isEmpty() || Field8.getText().isEmpty() )
                            {
                                JOptionPane.showMessageDialog(Panel5, "Please enter valid input values!");
                                Field7.setText(null);
                                Field8.setText(null);                 
                            }
                            else if ( Main.Branch.signInUser(Field7.getText(), Integer.parseInt(Field8.getText())) )
                            {
                                JOptionPane.showMessageDialog(Panel5, "Signed In Successsfully");
                                Panel5.setVisible(false);
                                int Index = 0;
                                Index = Main.Branch.userIndex(Integer.parseInt(Field8.getText()), Field7.getText());
                                
                                Label18.setText("Name: " + Main.Branch.getUsers()[Index].getName());
                                Label19.setText("Branch Id: " + Main.Branch.getUsers()[Index].getId());
                                Label20.setText("Cart amount: " + Main.Branch.getUsers()[Index].getMoneyInCart());
                                Label20.setText("License no: " + Main.Branch.getUsers()[Index].getLicenseNo());
                                Label21.setText("Branch code: " + Main.Branch.getUsers()[Index].getBranchCode());
                                Label22.setText("Blood group: " + Main.Branch.getUsers()[Index].getBloodGroup());
                                Label23.setText("Nationality: " + Main.Branch.getUsers()[Index].getNationality());
                                Label24.setText("Username: " + Main.Branch.getUsers()[Index].getUserName());
                                Label25.setText("Address: " + Main.Branch.getUsers()[Index].getAddress());
                                
                                Frame1.setTitle("- User Menu -");
                                Frame1.setBounds(200, 50, 600, 400);
                                Panel6.setVisible(true);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(Panel5, "Invalid Username/Password");
                                Field7.setText(null);
                                Field8.setText(null);
                            }
                        }                        
                    }
                }
        );
        Button19.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        if (Main.Branch.isSearchCarByModel(Integer.parseInt(Field9.getText())))
                        {
                            for (int i=0;i<Main.Branch.getCarsCounter();i++)
                            {
                                if (Main.Branch.getCars()[i].getModel() == Integer.parseInt(Field9.getText()))
                                {
                                    JOptionPane.showMessageDialog(Panel6, "Make: " + Main.Branch.getCars()[i].getMake() + "\nColor: " + Main.Branch.getCars()[i].getColor() + "\nModel: " + Main.Branch.getCars()[i].getModel() + "\nRegistration no: " + Main.Branch.getCars()[i].getRegistrationNo() + "\nNo of wheels: " + Main.Branch.getCars()[i].getNoOfWheels() + "\nName: " + Main.Branch.getCars()[i].getName() + "\nFair: " + Main.Branch.getCars()[i].getFair() + "\nSeating capacity: " + Main.Branch.getCars()[i].getSeatingCapacity() + "\nStatus: " + Main.Branch.getCars()[i].isStatus() + "\nId: " + Main.Branch.getCars()[i].getId() + "\nAvailable in: " + Main.Branch.getCars()[i].getAvailableIn() + "\nDriver alloted: " + Main.Branch.getDrivers()[Main.Branch.getCars()[i].getDriverAlloted()].getName());
                                    Field9.setText(null);
                                }
                            }                            
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel5, "Sorry no car found.");
                            Field9.setText(null);
                        }
                    }
                }
        );
        
        Button20.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        if (Main.Branch.isSearchCarByName(Field10.getText()))
                        {
                            for (int i=0;i<Main.Branch.getCarsCounter();i++)
                            {
                                if (Main.Branch.getCars()[i].getName() == null ? Field10.getText() == null : Main.Branch.getCars()[i].getName().equals(Field10.getText()))
                                {
                                    JOptionPane.showMessageDialog(Panel6, "Make: " + Main.Branch.getCars()[i].getMake() + "\nColor: " + Main.Branch.getCars()[i].getColor() + "\nModel: " + Main.Branch.getCars()[i].getModel() + "\nRegistration no: " + Main.Branch.getCars()[i].getRegistrationNo() + "\nNo of wheels: " + Main.Branch.getCars()[i].getNoOfWheels() + "\nName: " + Main.Branch.getCars()[i].getName() + "\nFair: " + Main.Branch.getCars()[i].getFair() + "\nSeating capacity: " + Main.Branch.getCars()[i].getSeatingCapacity() + "\nStatus: " + Main.Branch.getCars()[i].isStatus() + "\nId: " + Main.Branch.getCars()[i].getId() + "\nAvailable in: " + Main.Branch.getCars()[i].getAvailableIn() + "\nDriver alloted: " + Main.Branch.getDrivers()[Main.Branch.getCars()[i].getDriverAlloted()].getName());
                                    Field10.setText(null);
                                }
                            }                            
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel6, "Sorry no car found.");
                            Field10.setText(null);
                        }                        
                    }
                }
        );
        
        Button21.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        if (Main.Branch.isSearchCarByColor(Field11.getText()))
                        {
                            for (int i=0;i<Main.Branch.getCarsCounter();i++)
                            {
                                if (Main.Branch.getCars()[i].getColor() == null ? Field11.getText() == null : Main.Branch.getCars()[i].getName().equals(Field10.getText()))
                                {
                                    JOptionPane.showMessageDialog(Panel6, "Make: " + Main.Branch.getCars()[i].getMake() + "\nColor: " + Main.Branch.getCars()[i].getColor() + "\nModel: " + Main.Branch.getCars()[i].getModel() + "\nRegistration no: " + Main.Branch.getCars()[i].getRegistrationNo() + "\nNo of wheels: " + Main.Branch.getCars()[i].getNoOfWheels() + "\nName: " + Main.Branch.getCars()[i].getName() + "\nFair: " + Main.Branch.getCars()[i].getFair() + "\nSeating capacity: " + Main.Branch.getCars()[i].getSeatingCapacity() + "\nStatus: " + Main.Branch.getCars()[i].isStatus() + "\nId: " + Main.Branch.getCars()[i].getId() + "\nAvailable in: " + Main.Branch.getCars()[i].getAvailableIn() + "\nDriver alloted: " + Main.Branch.getDrivers()[Main.Branch.getCars()[i].getDriverAlloted()].getName());
                                    Field11.setText(null);
                                }
                            }                            
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel6, "Sorry no car found.");
                            Field11.setText(null);
                        }  
                    }
                }
        );
        
        Button22.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        for (int i=0;i<Main.Branch.getCarsCounter();i++)
                        {
                            JOptionPane.showMessageDialog(Panel6, "Make: " + Main.Branch.getCars()[i].getMake() + "\nColor: " + Main.Branch.getCars()[i].getColor() + "\nModel: " + Main.Branch.getCars()[i].getModel() + "\nRegistration no: " + Main.Branch.getCars()[i].getRegistrationNo() + "\nNo of wheels: " + Main.Branch.getCars()[i].getNoOfWheels() + "\nName: " + Main.Branch.getCars()[i].getName() + "\nFair: " + Main.Branch.getCars()[i].getFair() + "\nSeating capacity: " + Main.Branch.getCars()[i].getSeatingCapacity() + "\nStatus: " + Main.Branch.getCars()[i].isStatus() + "\nId: " + Main.Branch.getCars()[i].getId() + "\nAvailable in: " + Main.Branch.getCars()[i].getAvailableIn() + "\nDriver alloted: " + Main.Branch.getDrivers()[Main.Branch.getCars()[i].getDriverAlloted()].getName());
                        }
                    }
                }
        );
        Label18.setBounds(420, 70, 500, 10);
        Label19.setBounds(420, 90, 500, 10);
        Label20.setBounds(420, 110, 500, 10);
        Label21.setBounds(420, 130, 500, 10);
        Label22.setBounds(420, 150, 500, 10);
        Label23.setBounds(420, 170, 500, 10);
        Label24.setBounds(420, 190, 500, 10);
        Label25.setBounds(420, 210, 500, 10);
        Field9.setBounds(360, 290, 120, 20);
        Button19.setBounds(360, 310, 119, 20);
        Field10.setBounds(235, 290, 120, 20);
        Button20.setBounds(235, 310, 119, 20);
        Field11.setBounds(110, 290, 120, 20);
        Button21.setBounds(110, 310, 119, 20);
        Label26.setBounds(180, 335, 320, 20);
        Button22.setBounds(80, 120, 120, 25);
        Button23.setBounds(230, 120, 120, 25);
        Button24.setBounds(80, 170, 120, 25);
        Button25.setBounds(230, 170, 120, 25);
        Label27.setBounds(120, 200, 300, 25);
        
        Panel6.add(Label18);
        Panel6.add(Label19);
        Panel6.add(Label20);
        Panel6.add(Label21);
        Panel6.add(Label22);
        Panel6.add(Label23);
        Panel6.add(Label24);
        Panel6.add(Label25);
        Panel6.add(Field9);
        Panel6.add(Button19);
        Panel6.add(Field10);
        Panel6.add(Button20);
        Panel6.add(Field11);
        Panel6.add(Button21);
        Panel6.add(Label26);
        Panel6.add(Button22);
        Panel6.add(Button23);
        Panel6.add(Button24);
        Panel6.add(Button25);
        Panel6.add(Label27);
        
        Button22.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        //View All Cars
                    }
                }
        );
        
        Button23.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        int Id = Integer.parseInt(JOptionPane.showInputDialog(Panel6,"Enter Id of the car to book: "));
                        if (Main.Branch.isSearchCar(Id))
                        {
                            int carIndex = 0;
                            int userIndex = 0;
                            carIndex = Main.Branch.searchCar(Id);
                            userIndex = Main.Branch.userIndex(Integer.parseInt(Field8.getText()), Field7.getText());
                            if (Main.Branch.getCars()[carIndex].isStatus())
                            {
                                Main.Branch.getUsers()[userIndex].setCarIndex(carIndex);
                                Main.Branch.getCars()[carIndex].setStatus(false);
                                Main.Branch.setEarnings(Main.Branch.getEarnings() + Main.Branch.getCars()[carIndex].getFair());
                                JOptionPane.showMessageDialog(Panel6, "Car booked successfully");
                                JOptionPane.showMessageDialog(Panel6, "Car booked successfully\n     Bill ----- Sale Invoice      \n----- Car details -----" + "\nName: " + Main.Branch.getCars()[carIndex].getName() + "\nModel: " + Main.Branch.getCars()[carIndex].getModel() + "\nMake: " + Main.Branch.getCars()[carIndex].getMake() + "\nColor: " + Main.Branch.getCars()[carIndex].getColor() + "\nRegistration no: " + Main.Branch.getCars()[carIndex].getRegistrationNo() + "\nCharges: " + Main.Branch.getCars()[carIndex].getFair() + "\n----- Customer details -----" + "\nName: " + Main.Branch.getUsers()[userIndex].getName() + "\nNationality: " + Main.Branch.getUsers()[userIndex].getNationality() + "\nTotal balance: " + Main.Branch.getCars()[carIndex].getFair() + "\nBranch code: " + Main.Branch.getUsers()[userIndex].getBranchCode());                                 
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(Panel6, "Car not available right now!");                                
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Panel6, "Wrong input car id!");                         
                        }
                    }
                }
        );
        
        Button24.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        int Amount = Integer.parseInt(JOptionPane.showInputDialog(Panel6,"Enter amount to top up your cart: "));
                        int userIndex = 0;
                        userIndex = Main.Branch.userIndex(Integer.parseInt(Field8.getText()), Field7.getText());
                        Main.Branch.getUsers()[userIndex].setMoneyInCart(Main.Branch.getUsers()[userIndex].getMoneyInCart() + Amount);
                        JOptionPane.showMessageDialog(Panel6, "Cart topped up successfully");
                    }
                }
        );
        
        Button25.addActionListener
        (
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent Ae)
                    {
                        JOptionPane.showMessageDialog(Panel6, "Successfully logged out!");
                        Field7.setText(null);
                        Field8.setText(null);
                        Frame1.setSize(300, 425);
                        Panel2.setVisible(true);
                        Panel6.setVisible(false);
                    }
                }
        );
        
        Panel5.add(Button18);        
        Panel5.add(Label16);
        Panel5.add(Field7);
        Panel5.add(Field8);
        
        Panel5.setVisible(false);        
        Frame1.add(Panel5);
        
        Panel6.setLayout(null);
        Panel6.setBounds(0, 0, 600, 400);
        Label17.setBounds(0, 0, 600, 400);
        Label17.setIcon(Image5);
        
        Panel6.add(Label17);
        
        Panel6.setVisible(false);        
        Frame1.add(Panel6);
        
        Frame1.setVisible(true);
    }
}
