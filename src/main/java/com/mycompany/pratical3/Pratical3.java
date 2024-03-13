/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratical3;
import javax.swing.JOptionPane;
public class Pratical3 {

    public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("please input your name");
    JOptionPane.showMessageDialog(null, "Good Afternoon " + name);
    
    int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you"));
    JOptionPane.showMessageDialog(null, "Hi " + name + " You are "+ age + " years old ");
    }
}
